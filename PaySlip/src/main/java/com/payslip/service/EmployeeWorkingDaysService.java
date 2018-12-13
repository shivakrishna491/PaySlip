package com.payslip.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.payslip.entity.EmployeeWorkingDays;

/**
 * This Interface To manipulate Employee Working Days
 * @author nshiva
 *
 */
@Service
public interface EmployeeWorkingDaysService {

	/**
	 * Persisting Working Days Of The Month
	 * 
	 * @param employeeWorkingDays
	 */
	void saveWorkingDaysOfMonth(EmployeeWorkingDays employeeWorkingDays);

	/**
	 * Deleting Working Days Records Of The Employee(Each Record for Month)
	 * 
	 * @param employeeId
	 */
	void deleteWorkingDaysOfTheEmployee(Long employeeId);

	/**
	 * Deleting All Working Days Records Based On Month
	 * 
	 * @param monthAndYear
	 */
	void deleteWorkingDaysOfTheMonth(String monthAndYear);

	/**
	 * Deleting Working Days Record Of Particular Employee Of Particular Month
	 * 
	 * @param employeeId
	 * @param monthAndYear
	 */
	void deleteWorkingDaysOfOneEmployeeForMonth(Long employeeId, String monthAndYear);

	/**
	 * Retrieving All Working Days Records Of One Employee For All Months
	 * 
	 * @param employeeId
	 * @return List<EmployeeWorkingDays>
	 */
	List<EmployeeWorkingDays> allWorkingDaysOfOneEmployeeMonthWise(Long employeeId);

	/**
	 * Retrieving One Record Of Particular Employee and For Particular Month
	 * 
	 * @param employeeId
	 * @param monthAndYear
	 * @return EmployeeWorkingDays
	 */
	EmployeeWorkingDays workingDaysOfOneEmployeeAndMonthWise(Long employeeId, String monthAndYear);

	/**
	 * Retrieving All Employee All Working days Records For All Months.
	 * 
	 * @param monthAndYear
	 * @return List<EmployeeWorkingDays>
	 */
	List<EmployeeWorkingDays> allWorkingDaysOfAllEmployeeMonthWise(String monthAndYear);

	/**
	 * Update One Employee Working Days for Particular Month
	 * @param employeeId
	 * @param monthAndYear
	 *//*
	void updateWorkingDaysOfEmployeeAndMonthWise(Long employeeId, String monthAndYear, EmployeeWorkingDays days);
*/
}
