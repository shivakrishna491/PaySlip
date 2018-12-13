package com.payslip.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.payslip.entity.EmployeeDeductions;
import com.payslip.response.DeductionsResponse;

/**
 * This Interface to manipulate Employee Deductions
 * @author nshiva
 *
 */

@Service
public interface EmployeeDeductionService {

	/**
	 * To Save Employee Deductions
	 * @param deductions
	 */
	void saveEmployeeDeductions(EmployeeDeductions deductions);

	/**
	 *  To Delete One Employee All Records
	 * @param employeeId
	 */
	void deleteEmployeeDeductions(Long employeeId);

	/**
	 * To Retrieve All Employees All Records
	 * @return List<EmployeeDeductions>
	 */
	List<EmployeeDeductions> allEmployeeDeductions();

	/**
	 * To Retrieve One Employee All Records
	 * @param employeeId
	 * @return List<EmployeeDeductions>
	 */
	List<EmployeeDeductions> oneEmployeeAllDeductions(Long employeeId);

	/**
	 * To Calculate Total Deductions and Sending all the deductions information through Deductions Response Object
	 * @param employeeId
	 * @return
	 */
	DeductionsResponse totalDeductions(Long employeeId, String monthAndYear);

	/**
	 * To get one Employee Deductions For Particular Month
	 * @param employeeId
	 * @param monthAndYear
	 * @return EmployeeDeductions
	 */
	EmployeeDeductions oneEmployeeDeductionsForMonth(Long employeeId, String monthAndYear);

}
