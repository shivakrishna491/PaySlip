package com.payslip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.payslip.entity.EmployeePersonal;
import com.payslip.response.PersonalResponse;
import com.payslip.service.EmployeePersonalService;

/**
 * Controller to manage Employee Personal data
 * 
 * @author nshiva
 * 
 */
@RestController
@RequestMapping("/personal")
public class EmployeePersonalController {
	// Wiring Employee Personal Service Interface
	@Autowired
	private EmployeePersonalService employeePersonalService;

	/**
	 * To Persist Employee personal data
	 * 
	 * @param personal
	 * @return String
	 */
	@RequestMapping(value = "/saveEmployeePersonal", method = RequestMethod.POST)
	public String saveEmployeePersonal(@RequestBody EmployeePersonal personal) {
		System.out.println(personal.getPermanentAddress());
		employeePersonalService.saveEmployeePersonal(personal);
		return "Employee Data Inserted Sucessfully";
	}

	/**
	 * deleting Complete Employee personal data
	 * 
	 * @param employeeId
	 * @return String
	 */
	@RequestMapping(value = "/deleteEmployeePersonal", method = RequestMethod.DELETE)
	public String deleteEmployeePersonal(@RequestParam Long employeeId) {
		employeePersonalService.deleteEmployeePersonal(employeeId);
		return "Employee Data Deleted Sucessfully";

	}

	/**
	 * To Get All Employee Personal data
	 * 
	 * @return List<EmployeePersonal>
	 */
	@RequestMapping(value = "/allEmployeePersonal", method = RequestMethod.GET)
	public List<EmployeePersonal> allEmployeePersonal() {
		return employeePersonalService.allEmployeePersonal();

	}

	/**
	 * To Get One Particular Employee Data based on Employee Id
	 * 
	 * @param employeeId
	 * @return EmployeePersonal
	 */
	@RequestMapping(value = "/particularEmployeePersonal", method = RequestMethod.GET)
	public EmployeePersonal particularEmployeePersonal(@RequestParam Long employeeId) {
		return employeePersonalService.particularEmployeePersonal(employeeId);
	}

	/**
	 * To Update Employee Personal data based on employee Id
	 * @param personal
	 * @param employeeId
	 * @return String
	 */
	@RequestMapping(value = "/updateEmployeePersonal", method = RequestMethod.PUT)
	public String updateEmployeePersonal(@RequestBody EmployeePersonal personal, @RequestParam Long employeeId) {
		employeePersonalService.updateEmployeePersonal(personal, employeeId);
		return "Employee Data Updated Sucessfully";

	}

	/**
	 * To Update Only One Coulmn Of Employee personal data 
	 * @param billing
	 * @param employeeId
	 * @return String
	 */
	@RequestMapping(value = "/updateBilling", method = RequestMethod.PUT)
	public String updateEmployeePersonal(@RequestParam String billing, @RequestParam Long employeeId) {
		employeePersonalService.updateBilling(billing, employeeId);
		return "Employee Data Updated Sucessfully";
	}

	/**
	 * To Get Employee Personal data to Personal Response
	 * 
	 * @param employeeId
	 * @return EmployeePersonal
	 */
	@RequestMapping(value = "/personInformationForMonth", method = RequestMethod.GET)
	public PersonalResponse personInformation(@RequestParam Long employeeId,@RequestParam String monthAndYear) {
		return employeePersonalService.personInformation(employeeId, monthAndYear);
	}
	
}
