package com.payslip.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payslip.controller.EmployeeWorkingDaysController;
import com.payslip.dao.EmployeeDeductionsDao;
import com.payslip.entity.EmployeeDeductions;
import com.payslip.entity.EmployeeWorkingDays;
import com.payslip.response.DeductionsResponse;

/**
 * Implementation Class Of Employee Deduction Service
 * 
 * @author nshiva
 *
 */

@Service(value = "EmployeeDeductionService")
public class EmployeeDeductionsServiceImpl implements EmployeeDeductionService {

	@Autowired
	private EmployeeDeductionsDao employeeDeductionsDao;

	@Autowired
	private EmployeeWorkingDaysController employeeWorkingDaysController;
 
	/**
	 * To Save Employee Deductions
	 * 
	 * @param deductions
	 */
	@Override
	public void saveEmployeeDeductions(EmployeeDeductions deductions) {
		employeeDeductionsDao.save(deductions);

	}

	/**
	 * To Delete One Employee All Records
	 * 
	 * @param employeeId
	 */
	@Override
	public void deleteEmployeeDeductions(Long employeeId) {
		employeeDeductionsDao.deleteByEmployeeId(employeeId);
	}

	/**
	 * To Retrieve All Employees All Records
	 * 
	 * @return List<EmployeeDeductions>
	 */
	@Override
	public List<EmployeeDeductions> allEmployeeDeductions() {
		List<EmployeeDeductions> list = new ArrayList<>();
		for (EmployeeDeductions deductions : employeeDeductionsDao.findAll()) {
			list.add(deductions);
		}
		return list;
	}

	/**
	 * To Retrieve One Employee All Records
	 * 
	 * @param employeeId
	 * @return List<EmployeeDeductions>
	 */
	@Override
	public List<EmployeeDeductions> oneEmployeeAllDeductions(Long employeeId) {
		return employeeDeductionsDao.findByEmployeeId(employeeId);
	}

	/**
	 * Calculating All Deductions data and sending to the controller
	 */
	@Override
	public DeductionsResponse totalDeductions(Long employeeId, String monthAndYear) {

		EmployeeWorkingDays workingDays = employeeWorkingDaysController
				.allWorkingDaysOfOneEmployeeAndMonthWise(employeeId, monthAndYear);
		EmployeeDeductions deductions = oneEmployeeDeductionsForMonth(employeeId, monthAndYear);

		Integer days = 30;
		Double workedDays = workingDays.getWorkingdays();
		Double foodieCard1 = (deductions.getFoodieCard1() / days) * workedDays;
		foodieCard1=BigDecimal.valueOf(foodieCard1)
			    .setScale(2, RoundingMode.HALF_UP)
			    .doubleValue();
		Double locationAllowance1 = deductions.getLocationAllowance1();
		Double professionalTax = deductions.getProfessionalTax();
		Double projectAllowance1 = deductions.getProjectAllowance1();
		Double providentFund = (deductions.getProvidentFund() / days) * workedDays;
		providentFund=BigDecimal.valueOf(providentFund)
			    .setScale(2, RoundingMode.HALF_UP)
			    .doubleValue();
		Double medicalInsurance = deductions.getMedicalInsurance();

		Integer totalDeductions = (int)(foodieCard1 + locationAllowance1 + professionalTax + projectAllowance1
				+ providentFund + medicalInsurance);
		DeductionsResponse res = new DeductionsResponse(employeeId, professionalTax, projectAllowance1, foodieCard1,
				locationAllowance1, providentFund, medicalInsurance, monthAndYear, totalDeductions);
		System.out.println(res);
		return res;
	}

	@Override
	public EmployeeDeductions oneEmployeeDeductionsForMonth(Long employeeId, String monthAndYear) {
		return employeeDeductionsDao.oneEmployeeDeductionsForMonth(employeeId, monthAndYear);
	}

}
