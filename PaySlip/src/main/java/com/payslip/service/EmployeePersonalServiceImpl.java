package com.payslip.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payslip.dao.EmployeePersonalDao;
import com.payslip.entity.EmployeePersonal;
import com.payslip.entity.EmployeeWorkingDays;
import com.payslip.response.PersonalResponse;

/**
 * Service Implementation Class To Employee Personal Service Interface
 * @author nshiva
 *
 */
@Service("EmployeePersonalService")
public class EmployeePersonalServiceImpl implements EmployeePersonalService {

	// Wiring Employee Personal Dao
	@Autowired
	private EmployeePersonalDao employeePersonalDao;
	
	@Autowired
	private EmployeeWorkingDaysService employeeWorkingDaysService;

	/**
	 * To Save Employee Personal Data, Taking Input Param EmployeePersonal
	 * 
	 * @param personal
	 */
	@Override
	public void saveEmployeePersonal(EmployeePersonal personal) {
		employeePersonalDao.save(personal);
	}

	/**
	 * To Delete Employee Personal Object Based On Employee Id
	 * 
	 * @param employeeId
	 */
	@Override
	public void deleteEmployeePersonal(Long employeeId) {
		employeePersonalDao.deleteById(employeeId);

	}

	/**
	 * To Get all All Employees Personal Data
	 * 
	 * @return List<EmployeePersonal>
	 */
	@Override
	public List<EmployeePersonal> allEmployeePersonal() {
		List<EmployeePersonal> list = new ArrayList<>();
		for (EmployeePersonal emp : employeePersonalDao.findAll()) {
			list.add(emp);
		}
		return list;
	}

	/**
	 * To Update Employee Personal Object Data Based On Employee Id
	 * @param personal
	 * @param employeeId
	 */
	@Override
	public void updateEmployeePersonal(EmployeePersonal personal, Long employeeId) {
		if (personal.getEmployeeId().equals(employeeId))
			employeePersonalDao.save(personal);
	}

	/**
	 * To Get particular Employee Personal Data
	 * @param employeeId
	 * @return EmployeePersonal
	 */
	@Override
	public EmployeePersonal particularEmployeePersonal(Long employeeId) {
		EmployeePersonal emp = employeePersonalDao.findById(employeeId).get();
		return emp;
	}

	/**
	 * To Update Billing Column Based On Employee Id
	 */
	@Override
	public void updateBilling(String billing, Long employeeId) {
		employeePersonalDao.updateBilling(billing,employeeId);
		
	}

	/**
	 * To Get Person Response
	 */
	@Override
	public PersonalResponse personInformation(Long employeeId,String monthAndYear) {
		
		EmployeePersonal person=particularEmployeePersonal(employeeId);
		
		Long bankAccountNo=person.getBankAccountNo();
		String department=person.getDepartment();
		String designation=person.getDesignation();
		String employeeName=	person.getEmployeeName();
		String numberESI=person.getNumberESI();
		String numberPAN=person.getNumberPAN();
		String numberPF=person.getNumberPF();
		Long numberUAN=person.getNumberUAN();
		String dateOfJoining=person.getDateOfJoining();
		String workLocation=person.getWorkLocation();
		
		EmployeeWorkingDays workedDays=employeeWorkingDaysService.workingDaysOfOneEmployeeAndMonthWise(employeeId,monthAndYear);
		
		Double workingdays=workedDays.getWorkingdays();
		Double lossOfPayDays=workedDays.getLossOfPayDays();
		return new PersonalResponse(employeeId, employeeName, designation, department, numberESI, numberPF, numberUAN, numberPAN, bankAccountNo, lossOfPayDays, workingdays, dateOfJoining, workLocation);
	}


}
