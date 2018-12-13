package com.payslip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.payslip.dao.EmployeeWorkingDaysDao;
import com.payslip.entity.EmployeeWorkingDays;

/**
 * Implementation Class Of Employee Working Days Service
 * @author nshiva
 *
 */
@Service("EmployeeWorkingDaysService")

public class EmployeeWorkingDaysServiceImpl implements EmployeeWorkingDaysService {

	// Wiring Employee Working Days Dao
	@Autowired
	@Qualifier("employeeWorkingDaysDao")
	private EmployeeWorkingDaysDao employeeWorkingDaysDao;

	/**
	 * Persisting Working Days Of The Month
	 * 
	 * @param employeeWorkingDays
	 */
	@Override
	public void saveWorkingDaysOfMonth(EmployeeWorkingDays employeeWorkingDays) {
		employeeWorkingDaysDao.save(employeeWorkingDays);
	}

	/**
	 * Deleting Working Days Records Of The Employee(Each Record for Month)
	 * 
	 * @param employeeId
	 */
	@Override
	public void deleteWorkingDaysOfTheEmployee(Long employeeId) {
		employeeWorkingDaysDao.deleteByEmployeeId(employeeId);

	}

	/**
	 * Deleting All Working Days Records Based On Month
	 * 
	 * @param monthAndYear
	 */
	@Override
	public void deleteWorkingDaysOfTheMonth(String monthAndYear) {
		employeeWorkingDaysDao.deleteMonth(monthAndYear);
	}

	/**
	 * Deleting Working Days Record Of Particular Employee Of Particular Month
	 * 
	 * @param employeeId
	 * @param monthAndYear
	 */
	@Override
	public void deleteWorkingDaysOfOneEmployeeForMonth(Long employeeId, String monthAndYear) {
		employeeWorkingDaysDao.deleteWorkingDaysOfOneEmployeeForMonth(employeeId, monthAndYear);
	}

	/**
	 * Retrieving All Working Days Records Of One Employee For All Months
	 * 
	 * @param employeeId
	 * @return List<EmployeeWorkingDays>
	 */
	@Override
	public List<EmployeeWorkingDays> allWorkingDaysOfOneEmployeeMonthWise(Long employeeId) {

		return employeeWorkingDaysDao.findOneEmployeeWorkingDaysMonthWise(employeeId);
	}

	/**
	 * Retrieving One Record Of Particular Employee and For Particular Month
	 * 
	 * @param employeeId
	 * @param monthAndYear
	 * @return EmployeeWorkingDays
	 */
	@Override
	public EmployeeWorkingDays workingDaysOfOneEmployeeAndMonthWise(Long employeeId, String monthAndYear) {
		return employeeWorkingDaysDao.workingDaysOfOneEmployeeAndMonthWise(employeeId, monthAndYear);
	}

	/**
	 * Retrieving All Employee All Working days Records For All Months.
	 * 
	 * @param monthAndYear
	 * @return List<EmployeeWorkingDays>
	 */
	@Override
	public List<EmployeeWorkingDays> allWorkingDaysOfAllEmployeeMonthWise(String monthAndYear) {
		return employeeWorkingDaysDao.findbyMonthAndYear(monthAndYear);
	}

	/**
	 * Update One Employee Working Days for Particular Month
	 * 
	 * @param employeeId
	 * @param monthAndYear
	 */
	/*@Override
	public void updateWorkingDaysOfEmployeeAndMonthWise(Long employeeId, String monthAndYear,EmployeeWorkingDays days) {
		EmployeeWorkingDays day = workingDaysOfOneEmployeeAndMonthWise(employeeId, monthAndYear);
		day.setEmployeeId(employeeId);
		day.setWorkingdays(days.getWorkingdays());
		day.setMonthAndYear(monthAndYear);
		day.setLossOfPayDays(days.getLossOfPayDays());
		day.setRecordNo(day.getRecordNo());
		employeeWorkingDaysDao.save(day);

	}*/

}
