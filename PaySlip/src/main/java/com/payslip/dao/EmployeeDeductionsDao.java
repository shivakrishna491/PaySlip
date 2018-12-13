package com.payslip.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.payslip.entity.EmployeeDeductions;

/**
 * To Manipulate Employee Deductions
 * @author nshiva
 *
 */
@Transactional
@Repository
public interface EmployeeDeductionsDao extends CrudRepository<EmployeeDeductions, Long> {

	/**
	 * Getting One Employee All Deductions
	 * @param employeeId
	 * @return List<EmployeeDeductions>
	 */
	@Query(nativeQuery=true,value="select * from employee_deductions deductions where deductions.employee_id=:employeeId")
	List<EmployeeDeductions> findByEmployeeId(@Param(value = "employeeId") Long employeeId);

	void deleteByEmployeeId(Long employeeId);

	@Query(nativeQuery=true,value="select * from employee_deductions deductions where deductions.employee_id=:employeeId and deductions.month_and_year=:monthAndYear")
	EmployeeDeductions oneEmployeeDeductionsForMonth(@Param(value = "employeeId") Long employeeId, @Param(value = "monthAndYear") String monthAndYear);
  
}
 

