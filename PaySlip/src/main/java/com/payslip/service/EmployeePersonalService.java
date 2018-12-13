package com.payslip.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.payslip.entity.EmployeePersonal;
import com.payslip.response.PersonalResponse;

/**
 * Service Interface For Employee Personal Data Management
 * 
 * @author nshiva
 *
 */
@Service
public interface EmployeePersonalService {

	/**
	 * To Save Employee Personal Data, Taking Input Param EmployeePersonal
	 * 
	 * @param personal
	 */
	void saveEmployeePersonal(EmployeePersonal personal);

	/**
	 * To Delete Employee Personal Object Based On Employee Id
	 * 
	 * @param employeeId
	 */
	void deleteEmployeePersonal(Long employeeId);

	/**
	 * To Get all All Employees Personal Data
	 * 
	 * @return List<EmployeePersonal>
	 */
	List<EmployeePersonal> allEmployeePersonal();

	/**
	 * To Update Employee Personal Object Data Based On Employee Id
	 * @param personal
	 * @param employeeId
	 */
	void updateEmployeePersonal(EmployeePersonal personal, Long employeeId);
	
	/**
	 * To Get particular Employee Personal Data
	 * @param employeeId
	 * @return EmployeePersonal
	 */
	EmployeePersonal particularEmployeePersonal(Long employeeId);
	
	/**
	 * To Update Billing Column Based On Employee Id
	 */
	void updateBilling(String billing, Long employeeId);

	/**
	 * To Get Person Response
	 * @param employeeId
	 * @param monthAndYear 
	 * @return PersonalResponse
	 */
	PersonalResponse personInformation(Long employeeId, String monthAndYear);

}
