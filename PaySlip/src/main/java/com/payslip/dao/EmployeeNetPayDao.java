package com.payslip.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.payslip.entity.EmployeeNetPay;

/**
 * To Manipulate Employee Net Pay
 * 
 * @author nshiva
 *
 */
@Transactional
@Repository
public interface EmployeeNetPayDao extends CrudRepository<EmployeeNetPay, Long> {

	/**
	 * Delete All Net Pay Records Based On MOnthAndYear(All Employees)
	 * 
	 * @param monthAndYear
	 */
	@Modifying
	@Query(nativeQuery = true, value = "delete from employee_net_pay where month_and_year=:monthAndYear")
	void deleteByMonthAndYear(@Param(value = "monthAndYear") String monthAndYear);

	/**
	 * Getting All Net Pay Records Of One Employee
	 * 
	 * @param employeeId
	 * @return List<EmployeeNetPay>
	 */
	@Query(nativeQuery = true, value = "select * from employee_net_pay netpay where netpay.employee_id=:employeeId")
	List<EmployeeNetPay> findByEmployeeId(@Param(value = "employeeId") Long employeeId);

	/**
	 * Delete Employees Records Based on Employee Id
	 * 
	 * @param employeeId
	 */
	void deleteByEmployeeId(Long employeeId);

	/**
	 * Service To One Employee NetPay For Particular Month
	 * @param employeeId
	 * @param monthAndYear
	 * @return EmployeeNetPay
	 */
	@Query(nativeQuery=true,value="select * from employee_net_pay net where net.employee_id=:employeeId and net.month_and_year=:monthAndYear")
	EmployeeNetPay oneEmployeeNetPayMonthWise(@Param(value = "employeeId") Long employeeId, @Param(value = "monthAndYear") String monthAndYear);

}
