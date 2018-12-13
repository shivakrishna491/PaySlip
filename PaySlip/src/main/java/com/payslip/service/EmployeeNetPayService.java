package com.payslip.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.payslip.entity.EmployeeNetPay;
import com.payslip.response.NetPayResponse;

/**
 * This Interface To Manage Employee Net Pay
 * @author nshiva
 *
 */
@Service
public interface EmployeeNetPayService {

	/**
	 * To Save Employee Net Pay Records
	 * @param netPay
	 */
	void saveEmployeeNetPay(EmployeeNetPay netPay);

	/**
	 * To Delete All Employee Net Pay Records Based on MonthAndYear
	 * @param monthAndYear
	 */
	void deleteEmployeeNetPay(String monthAndYear);

	/**
	 * To Delete All One Employee Net Pay Records Based on Employee Id
	 * @param employeeId
	 */
	void deleteEmployeeNetPay(Long employeeId);

	/**
	 * To Retrieve All Employee Net Pay Records
	 * @return List<EmployeeNetPay>
	 */
	List<EmployeeNetPay> allEmployeeNetPay();

	/**
	 * To Retrieve All One Employee Net Pay Records
	 * @param employeeId
	 * @return List<EmployeeNetPay>
	 */
	List<EmployeeNetPay> oneAllEmployeeNetPay(Long employeeId);

	/**
	 * Update Employee Net Pay Record Based on Primary Key
	 * @param netPay
	 */
	void updateEmployeeNetPay(EmployeeNetPay netPay);

	/**
	 * Return NetPay Response
	 * @param employeeId
	 * @param monthAndYear
	 * @return NetPayResponse
	 */
	NetPayResponse netPayResponse(Long employeeId,String monthAndYear);

	/**
	 * To Get One Employee Net Pay Of Particular Month
	 * @param employeeId
	 * @param monthAndYear
	 * @return EmployeeNetPay
	 */
	EmployeeNetPay oneEmployeeNetPayMonthWise(Long employeeId, String monthAndYear);
	

}
