package com.payslip.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.payslip.entity.EmployeeEarnings;
import com.payslip.response.EarningsResponse;

/**
 * This Interface to manipulate Employee Earnings
 * 
 * @author nshiva
 *
 */
@Service
public interface EmployeeEarningsService {

	/**
	 * To Employee Earnings
	 * 
	 * @param earnings
	 */
	void saveEmployeeEarings(EmployeeEarnings earnings);

	/**
	 * To Delete Employee Earnings Data
	 * 
	 * @param empId
	 */
	void deleteEmployeeEarings(Long earningsId);

	/**
	 * To Return all Employee Earnings Structures over period
	 * 
	 * @return
	 */
	List<EmployeeEarnings> allEmployeeEarings();

	/**
	 * To Update Employee Earnings Data
	 * @param earnings
	 */
	void updateEmployeeEarings(EmployeeEarnings earnings);

	/**
	 * To Get particular Employee Earning Structure based on Earnings Id
	 * @param earningsId
	 * @return EmployeeEarnings
	 */
	EmployeeEarnings EmployeeEaringsStrucutre(Long earningsId);

	/**
	 * Return Earnings Response
	 * @param earningsId
	 * @return EarningsResponse
	 */
	EarningsResponse employeeEarningsResponse(Long earningsId);

}
