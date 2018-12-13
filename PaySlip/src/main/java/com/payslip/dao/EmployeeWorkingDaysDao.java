package com.payslip.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.payslip.entity.EmployeeWorkingDays;

@Transactional
@Repository
public interface EmployeeWorkingDaysDao extends CrudRepository<EmployeeWorkingDays, Long> {

	/**
	 * Deletes All Records Of One Employee
	 * @param employeeId
	 */
	void deleteByEmployeeId(Long employeeId);

	/**
	 * Deletes All Records Of Particular Month And Year
	 * @param monthAndYear
	 */
	@Modifying
	@Query(nativeQuery=true,value="delete from employee_working_days where month_and_year=:monthAndYear")
	void deleteMonth(@Param(value = "monthAndYear") String monthAndYear);

	/**
	 * Retrieve All Records Of One Employee
	 * @param employeeId
	 * @return List<EmployeeWorkingDays>
	 */
	@Query(nativeQuery=true,value="select * from employee_working_days days where days.employee_id=:employeeId")
	List<EmployeeWorkingDays> findOneEmployeeWorkingDaysMonthWise(@Param(value = "employeeId") Long employeeId);

	/**
	 * Retrive One Record Of Particular Employee Of Particular Month
	 * @param employeeId
	 * @param monthAndYear
	 * @return EmployeeWorkingDays
	 */
	@Query(nativeQuery=true,value="select * from employee_working_days days where days.employee_id=:employeeId and days.month_and_year=:monthAndYear")
	EmployeeWorkingDays workingDaysOfOneEmployeeAndMonthWise(@Param(value = "employeeId") Long employeeId, @Param(value = "monthAndYear") String monthAndYear);

	/**
	 * delete One Record Of Particular Employee Of Particular Month
	 * @param employeeId
	 * @param monthAndYear
	 */
	@Modifying
	@Query(nativeQuery=true,value="delete from employee_working_days where employee_id=:employeeId and month_and_year=:monthAndYear")
	void deleteWorkingDaysOfOneEmployeeForMonth(@Param(value = "employeeId") Long employeeId, @Param(value = "monthAndYear") String monthAndYear);

	/**
	 * Retrieve All Records Of Particular Month(Applicable to All Employees)
	 * @param monthAndYear
	 * @return List<EmployeeWorkingDays>
	 */
	@Query(nativeQuery=true,value="select * from employee_working_days days where days.month_and_year=:monthAndYear")
	List<EmployeeWorkingDays> findbyMonthAndYear(@Param(value = "monthAndYear") String monthAndYear);

	

}
