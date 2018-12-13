package com.payslip.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.payslip.entity.EmployeePersonal;

/**
 * DAO Class To Manipulate Employee Personal Data
 * 
 * @author nshiva
 *
 */
@Transactional
@Repository
public interface EmployeePersonalDao extends CrudRepository<EmployeePersonal, Long> {

	/**
	 * To Billing Column Data of The Employee Personal
	 * 
	 * @param billing
	 * @param employeeId
	 */
	@Modifying
	@Query(nativeQuery = true, value = "UPDATE employee_personal personal set personal.billing=:billing where personal.employee_id=:employeeId")
	void updateBilling(@Param(value = "billing") String billing, @Param(value = "employeeId") Long employeeId);

}
