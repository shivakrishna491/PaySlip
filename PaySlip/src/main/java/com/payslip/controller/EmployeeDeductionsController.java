package com.payslip.controller;

import java.util.List;
import com.payslip.response.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.payslip.entity.EmployeeDeductions;
import com.payslip.service.EmployeeDeductionService;

/**
 * This Controller To Manage Deductions Of Employee
 * 
 * @author nshiva
 *
 */
@RestController
@RequestMapping("/deductions")
public class EmployeeDeductionsController {

	// Wiring Employee Deduction Service
	@Autowired
	private EmployeeDeductionService employeeDeductionService;

	/**
	 * saving Employee Deductions for Particular Employee For Particular Month
	 * 
	 * @param deductions
	 * @return String
	 */
	@RequestMapping(value = "/saveEmployeeDeductions", method = RequestMethod.POST)
	public String saveEmployeeDeductions(@RequestBody EmployeeDeductions deductions) {
		employeeDeductionService.saveEmployeeDeductions(deductions);
		return "Employee Deductions was Stored Sucessfully";
	}

	/**
	 * Deleting All Employee Deduction Records
	 * 
	 * @param employeeId
	 * @return String
	 */
	@RequestMapping(value = "/deleteEmployeeDeductions", method = RequestMethod.DELETE)
	public String deleteEmployeeDeductions(@RequestParam Long employeeId) {
		employeeDeductionService.deleteEmployeeDeductions(employeeId);
		return "Employee Deductions Deleted Sucessfully";
	}

	/**
	 * Retrieving All Employee Deductions
	 * 
	 * @return List<EmployeeDeductions>
	 */
	@RequestMapping(value = "/allEmployeeDeductions", method = RequestMethod.GET)
	public List<EmployeeDeductions> allEmployeeDeductions() {
		return employeeDeductionService.allEmployeeDeductions();
	}

	/**
	 * Getting One Employee All Deductions Data
	 * 
	 * @param employeeId
	 * @return List<EmployeeDeductions>
	 */
	@RequestMapping(value = "/oneEmployeeAllDeductions", method = RequestMethod.GET)
	public List<EmployeeDeductions> oneEmployeeAllDeductions(@RequestParam Long employeeId) {
		return employeeDeductionService.oneEmployeeAllDeductions(employeeId);
	}

	/**
	 * Getting One Employee Deductions For Particular Month
	 * 
	 * @param employeeId
	 * @return List<EmployeeDeductions>
	 */
	@RequestMapping(value = "/oneEmployeeDeductionsForMonth", method = RequestMethod.GET)
	public EmployeeDeductions oneEmployeeDeductionsForMonth(@RequestParam Long employeeId, @RequestParam String monthAndYear) {
		return employeeDeductionService.oneEmployeeDeductionsForMonth(employeeId,monthAndYear);
	}
	
	/**
	 * Getting Total Deductions with all the data in Response Object
	 * 
	 * @param employeeId
	 * @return List<EmployeeDeductions>
	 */
	@RequestMapping(value = "/totalDeductions", method = RequestMethod.GET)
	public DeductionsResponse totalDeductions(@RequestParam Long employeeId,@RequestParam String monthAndYear) {
		return employeeDeductionService.totalDeductions(employeeId,monthAndYear);
	}
}
