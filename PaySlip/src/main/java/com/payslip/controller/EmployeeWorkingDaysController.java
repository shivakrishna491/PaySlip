package com.payslip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.payslip.entity.EmployeeWorkingDays;
import com.payslip.service.EmployeeWorkingDaysService;

@RestController
@RequestMapping("/workingdays")
public class EmployeeWorkingDaysController {

	// Wiring Service layer
	@Autowired
	private EmployeeWorkingDaysService employeeWorkingDaysService;

	/**
	 * Saving Working Days Object Of Particular Month
	 * @param employeeWorkingDays
	 * @return String
	 */ 
	@RequestMapping(value = "/saveWorkingDaysOfMOnth", method = RequestMethod.POST)
	public String saveWorkingDaysOfMonth(@RequestBody EmployeeWorkingDays employeeWorkingDays) {
		employeeWorkingDaysService.saveWorkingDaysOfMonth(employeeWorkingDays);
		return "Working Days Of the particular months data saved sucessfully";

	}

	/**
	 * Delete all Working Days Records of particular Employee
	 * @param employeeId
	 * @return String
	 */
	@RequestMapping(value = "/deleteWorkingDaysOfTheEmployee", method = RequestMethod.DELETE)
	public String deleteWorkingDaysOfMonth(@RequestParam Long employeeId) {
		employeeWorkingDaysService.deleteWorkingDaysOfTheEmployee(employeeId);
		return "Working Days Of the particular Employee data Deleted sucessfully";

	}

	/**
	 * Delete All Employee Working Days Records of particular Month.
	 * @param monthAndYear
	 * @return String
	 */
	@RequestMapping(value = "/deleteWorkingDaysOfMonth", method = RequestMethod.DELETE)
	public String deleteWorkingDaysOfMonth(@RequestParam String monthAndYear) {
		employeeWorkingDaysService.deleteWorkingDaysOfTheMonth(monthAndYear);
		return "Working Days Of the particular months data Deleted sucessfully";

	}
	
	/**
	 * Delete One Employee Working Days Record of particular Month.
	 * @param monthAndYear
	 * @return String
	 */
	@RequestMapping(value = "/deleteWorkingDaysOfOneEmployeeForMonth", method = RequestMethod.DELETE)
	public String deleteWorkingDaysOfOneEmployeeForMonth(@RequestParam Long employeeId,@RequestParam String monthAndYear) {
		employeeWorkingDaysService.deleteWorkingDaysOfOneEmployeeForMonth(employeeId,monthAndYear);
		return "Working Days Of the particular month of Particular Employee data Deleted sucessfully";

	}

	/**
	 * Get one One Employee All Working Days Object Month Wise.
	 * @param employeeId
	 * @return List<EmployeeWorkingDays>
	 */
	@RequestMapping(value = "/allWorkingDaysOfOneEmployeeMonthWise", method = RequestMethod.GET)
	public List<EmployeeWorkingDays> allWorkingDaysOfOneEmployeeMonthWise(@RequestParam Long employeeId) {
		return employeeWorkingDaysService.allWorkingDaysOfOneEmployeeMonthWise(employeeId);

	}

	/**
	 * Get Working Days Object of Particular employee for Particular Month
	 * @param employeeId
	 * @param monthAndYear
	 * @return  List<EmployeeWorkingDays>
	 */
	@RequestMapping(value = "/allWorkingDaysOfEmployeeAndMonthWise", method = RequestMethod.GET)
	public EmployeeWorkingDays allWorkingDaysOfOneEmployeeAndMonthWise(@RequestParam Long employeeId,
			@RequestParam String monthAndYear) {
		return employeeWorkingDaysService.workingDaysOfOneEmployeeAndMonthWise(employeeId, monthAndYear);

	}
	
	/**
	 * Get one One Employee All Working Days Object Month Wise.
	 * @param employeeId
	 * @return List<EmployeeWorkingDays>
	 */
	@RequestMapping(value = "/allWorkingDaysOfAllEmployeeMonthWise", method = RequestMethod.GET)
	public List<EmployeeWorkingDays> allWorkingDaysOfallEmployeeMonthWise(@RequestParam String monthAndYear) {
		return employeeWorkingDaysService.allWorkingDaysOfAllEmployeeMonthWise(monthAndYear);

	}

	/**
	 * Update Working Days Object of Particular employee for Particular Month
	 * @param employeeId
	 * @param monthAndYear
	 * @return  List<EmployeeWorkingDays>
	 *//*
	@RequestMapping(value = "/updateWorkingDaysOfEmployeeAndMonthWise", method = RequestMethod.POST)
	public String updateWorkingDaysOfEmployeeAndMonthWise( @RequestBody EmployeeWorkingDays days,@RequestParam Long employeeId,
			@RequestParam String monthAndYear) {
		employeeWorkingDaysService.updateWorkingDaysOfEmployeeAndMonthWise(employeeId, monthAndYear,days);
		return "Working Days Object of Particular Employee Month wise updated Sucessfully";

	}*/
	
}
