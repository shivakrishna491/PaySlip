package com.payslip.controller;

import java.io.ByteArrayInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itextpdf.text.DocumentException;
import com.payslip.entity.EmployeeEarnings;
import com.payslip.entity.EmployeeNetPay;
import com.payslip.pdf.GeneratePaySlipPdf;
import com.payslip.response.DeductionsResponse;
import com.payslip.response.EarningsResponse;
import com.payslip.response.NetPayResponse;
import com.payslip.response.PaySlipResponse;
import com.payslip.response.PersonalResponse;
import com.payslip.service.EmployeeDeductionService;
import com.payslip.service.EmployeeEarningsService;
import com.payslip.service.EmployeeNetPayService;
import com.payslip.service.GenerateService;

@RestController
@RequestMapping("/generate")
public class GenerateController {

	@Autowired
	private GenerateService generateService;

	@Autowired
	private EmployeeEarningsService employeeEarningsService;

	@Autowired
	private EmployeeDeductionService employeeDeductionService;

	@Autowired
	private EmployeeNetPayService employeeNetPayService;

	@Autowired
	private EmployeeDeductionsController employeeDeductionsController;

	@Autowired
	private EmployeeEarningsController employeeEarningsController;

	@Autowired
	private EmployeeNetPayController employeeNetPayController;

	@Autowired
	private EmployeePersonalController employeePersonalController;

	/**
	 * To Calulate NetPay And Store Net Pay data in Database
	 * @param earningsId
	 * @param employeeId
	 * @param monthAndYear
	 * @return String
	 */
	@RequestMapping(value = "/calculateNetpayAndSave", method = RequestMethod.POST)
	public String calculateNetpayAndSave(@RequestParam Long earningsId, @RequestParam Long employeeId,
			@RequestParam String monthAndYear) {

		EarningsResponse earningsResponse = employeeEarningsService.employeeEarningsResponse(earningsId);
		Integer totalEarnings = earningsResponse.getTotalEarnings();
		EmployeeEarnings employeeEarnings = employeeEarningsService.EmployeeEaringsStrucutre(earningsId);

		String modeOfPayment = employeeEarnings.getModeOfPayment();

		DeductionsResponse deductionsResponse = employeeDeductionService.totalDeductions(employeeId, monthAndYear);
		Integer totalDeductions = deductionsResponse.getTotalDeductions();

		Integer netpay = (totalEarnings - totalDeductions);
		String amountInWords =generateService.convertNetPayIntoWords(netpay);
		Integer totalNetPayable = netpay;

		EmployeeNetPay netPay = new EmployeeNetPay();
		netPay.setEmployeeId(employeeId);
		netPay.setAmountInWords(amountInWords);
		netPay.setModeOfPayment(modeOfPayment);
		netPay.setMonthAndYear(monthAndYear);
		netPay.setNetpay(netpay);
		netPay.setTotalNetPayable(totalNetPayable);

		employeeNetPayService.saveEmployeeNetPay(netPay);

		return "NetPay Calculated And Data Saved Sucessfully";

	}

	/**
	 * It Generate Complete data needed For PaySlip and prints PaySlip
	 * @param earningsId
	 * @param employeeId
	 * @param monthAndYear
	 * @return PaySlipResponse
	 * @throws DocumentException 
	 */
	@RequestMapping(method=RequestMethod.GET,value="/generatePaySlip",produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<InputStreamResource> generatePaySlip(@RequestParam Long earningsId, @RequestParam Long employeeId, @RequestParam String monthAndYear) throws DocumentException {

		
		PersonalResponse personalResponse=employeePersonalController.personInformation(employeeId, monthAndYear);
		EarningsResponse earningsResponse=employeeEarningsController.employeeEarningsResponse(earningsId);
		DeductionsResponse deductionsResponse=employeeDeductionsController.totalDeductions(employeeId, monthAndYear);
		NetPayResponse netPayResponse=	employeeNetPayController.netPayResponse(employeeId,monthAndYear);
		
		PaySlipResponse paySlipResponse=new PaySlipResponse(deductionsResponse, earningsResponse, netPayResponse, personalResponse);
		
		 HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "inline; filename=paySlip.pdf");
		ByteArrayInputStream bis=GeneratePaySlipPdf.generatePaySlipPdf(paySlipResponse);
		return ResponseEntity
			    .ok()
			    .headers(headers)
			    .contentType(MediaType.APPLICATION_PDF)
			    .body(new InputStreamResource(bis));
	}
}



