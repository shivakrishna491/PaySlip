package com.payslip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.payslip.entity.EmployeeNetPay;
import com.payslip.response.NetPayResponse;
import com.payslip.service.EmployeeNetPayService;

/**
 * This Is Controller To Handle Net Pay Data
 * @author nshiva
 *
 */
@RestController
@RequestMapping("/netpay")
public class EmployeeNetPayController {

	// Wiring  Employee Net Pay Service
	@Autowired
	private EmployeeNetPayService employeeNetPayService;
	
	/**
	 * To save Employee Net Pay For Every Month
	 * @param netPay
	 * @return String
	 */
	@RequestMapping(value="/saveEmployeeNetPay",method=RequestMethod.POST)
	public String saveEmployeeNetPay(@RequestBody EmployeeNetPay netPay) {
		
		employeeNetPayService.saveEmployeeNetPay(netPay);
		return "Employee Net Pay data was Stored Sucessfully";
	}
	
	/**
	 * Delete All Net Pay data Of All Employee for Particular month
	 * @param monthAndYear
	 * @return String
	 */
	@RequestMapping(value="/deleteEmployeeNetPay",method=RequestMethod.DELETE)
	public String deleteEmployeeNetPay(@RequestParam String monthAndYear) {
		employeeNetPayService.deleteEmployeeNetPay(monthAndYear);
		return "Employee Net Pay data was Deleted Sucessfully";
	}
	
	/**
	 * Delete All One Employee Net Pay Records
	 * @param employeeId
	 * @return String
	 */
	@RequestMapping(value="/deleteEmployeeNetPay/{employeeId}",method=RequestMethod.DELETE)
	public String deleteEmployeeNetPay(@PathVariable Long employeeId) {
		employeeNetPayService.deleteEmployeeNetPay(employeeId);
		return "Records Of Employee Id:"+employeeId+ "Net Pay data was Deleted Sucessfully";
	}
	
	/**
	 * List All Employees, All Months Net Pay Data
	 * @return List<EmployeeNetPay>
	 */
	@RequestMapping(value="/allEmployeeNetPay",method=RequestMethod.GET)
	public List<EmployeeNetPay> allEmployeeNetPay() {
		return employeeNetPayService.allEmployeeNetPay();
	}
	
	/**
	 * Get One Employee All Net Pay Records
	 * @param employeeId
	 * @return List<EmployeeNetPay>
	 */
	@RequestMapping(value="/oneEmployeeNetPay/{employeeId}",method=RequestMethod.GET)
	public List<EmployeeNetPay> oneAllEmployeeNetPay(@PathVariable Long employeeId) {
		return employeeNetPayService.oneAllEmployeeNetPay(employeeId);
	}
	
	/**
	 * Get One Employee All Net Pay Records
	 * @param employeeId
	 * @return List<EmployeeNetPay>
	 */
	@RequestMapping(value="/oneEmployeeNetPayMonthWise",method=RequestMethod.GET)
	public EmployeeNetPay oneEmployeeNetPayMonthWise(@RequestParam  Long employeeId, @RequestParam  String monthAndYear) {
		return employeeNetPayService.oneEmployeeNetPayMonthWise(employeeId,monthAndYear);
	}
	
	/**
	 * Update Employee Netpay Based on Primary Keys(Employee Id, MonthAndYear)
	 * @param netPay
	 * @return String
	 */
	@RequestMapping(value="/updateEmployeeNetPay",method=RequestMethod.PUT)
	public String updateEmployeeNetPay(@RequestBody EmployeeNetPay netPay) {
		employeeNetPayService.updateEmployeeNetPay(netPay);
		return "Employee Net Pay data was Updaetd Sucessfully";
	}
	
	
	/**
	 * Get One Employee All Net Pay Records
	 * @param employeeId
	 * @return List<EmployeeNetPay>
	 */
	@RequestMapping(value="/netPayResponse",method=RequestMethod.GET)
	public NetPayResponse netPayResponse(@RequestParam Long employeeId,@RequestParam String monthAndYear) {
		return employeeNetPayService.netPayResponse(employeeId,monthAndYear);
	}
	
}
