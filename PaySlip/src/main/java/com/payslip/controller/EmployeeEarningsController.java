package com.payslip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.payslip.entity.EmployeeEarnings;
import com.payslip.response.EarningsResponse;
import com.payslip.service.EmployeeEarningsService;

/**
 * Controller to manage Employees Earnings data, This is common data to all employees
 * @author nshiva
 *
 */
@RestController
@RequestMapping("/earnings")
public class EmployeeEarningsController {

	// Wiring EmployeeSerivce
	@Autowired
	private EmployeeEarningsService employeeEarnigsService;

	/**
	 * To Save Employee Earnings Data
	 * @param earnings
	 * @return String
	 */
	@RequestMapping(value = "/saveEmployeeEarnings", method = RequestMethod.POST)
	public String saveEarnings(@RequestBody EmployeeEarnings earnings) {
		employeeEarnigsService.saveEmployeeEarings(earnings);
		return "Earings data was stored Sucessfully";
	}
	
	/**
	 * To delete particular Employee Earnings record
	 * @param empId
	 * @return String
	 */
	@RequestMapping(value = "/deleteEmployeeEarnings", method = RequestMethod.DELETE)
	public String deleteEmployeeEarnings(@RequestParam Long earningsId) {
		employeeEarnigsService.deleteEmployeeEarings(earningsId);
		return "Earings Id : "+earningsId+ " data Structure was Deleted";
	}
	
	/**
	 * 
	 * @return List<EmployeeEarnings> It returns all Employee Earnings records
	 */
	@RequestMapping(value = "/allEmployeeEarnings", method = RequestMethod.GET)
	public List<EmployeeEarnings> allEmployeeEarnings() {
			return employeeEarnigsService.allEmployeeEarings();
	}
	
	/**
	 * Returns ParticularEmployee Earnings Structure
	 * @param earningsId
	 * @return EmployeeEarnings
	 */
	@RequestMapping(value = "/employeeEarningsStructure", method = RequestMethod.GET)
	public EmployeeEarnings employeeEarningsStructure(@RequestParam Long earningsId) {
			return employeeEarnigsService.EmployeeEaringsStrucutre(earningsId);
	}
	
	/**
	 * To update particular Employee Earnings Struture based on primary key of the table
	 * @param earnings
	 * @return String
	 */
	@RequestMapping(value = "/updateEmployeeEarnings", method = RequestMethod.PUT)
	public String updateEmployeeEarnings(@RequestBody EmployeeEarnings earnings) {
		employeeEarnigsService.updateEmployeeEarings(earnings);
		return "Earings data updated sucessfully";
	}
	
	/**
	 * Returns Employee Earnings Response
	 * @param earningsId
	 * @return EmployeeEarnings
	 */
	@RequestMapping(value = "/employeeEarningsResponse", method = RequestMethod.GET)
	public EarningsResponse employeeEarningsResponse(@RequestParam Long earningsId) {
			return employeeEarnigsService.employeeEarningsResponse(earningsId);
	}
		
	/**
	 * Method to update only one coulmn at a time(Any coulmn you may update).
	 * @param earnings
	 * @return String
	 *//*
	@RequestMapping(value = "/updateEmployeeEarnings", method = RequestMethod.PUT)
	public String updateEmployeeEarningsCoulmn(@RequestParam String columnToUpdate) {
		employeeEarnigsService.updateEmployeeEaringsCoulmn(columnToUpdate);
		return "Earings data updated sucessfully";
	}*/
}
