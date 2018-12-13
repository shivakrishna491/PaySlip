package com.payslip.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.payslip.dao.EmployeeNetPayDao;
import com.payslip.entity.EmployeeNetPay;
import com.payslip.response.NetPayResponse;

/**
 * Implementation Class Of Employee Net Pay Service
 * 
 * @author nshiva
 *
 */
@Service("EmployeeNetPayService")
public class EmployeeNetPayServiceImpl implements EmployeeNetPayService {

	// Wiring Employee Net Pay Dao
	@Autowired
	@Qualifier("employeeNetPayDao")
	private EmployeeNetPayDao employeeNetPayDao;

	/**
	 * To Save Employee Net Pay Records
	 * 
	 * @param netPay
	 */
	@Override
	public void saveEmployeeNetPay(EmployeeNetPay netPay) {
		employeeNetPayDao.save(netPay);
	}

	/**
	 * To Delete All Employee Net Pay Records Based on MonthAndYear
	 * 
	 * @param monthAndYear
	 */
	@Override
	public void deleteEmployeeNetPay(String monthAndYear) {
		employeeNetPayDao.deleteByMonthAndYear(monthAndYear);

	}

	/**
	 * To Delete All One Employee Net Pay Records Based on Employee Id
	 * 
	 * @param employeeId
	 */
	@Override
	public void deleteEmployeeNetPay(Long employeeId) {
		employeeNetPayDao.deleteByEmployeeId(employeeId);
	}

	/**
	 * To Retrieve All Employee Net Pay Records
	 * 
	 * @return List<EmployeeNetPay>
	 */
	@Override
	public List<EmployeeNetPay> allEmployeeNetPay() {
		List<EmployeeNetPay> list = new ArrayList<>();
		for (EmployeeNetPay netPay : employeeNetPayDao.findAll()) {
			list.add(netPay);
		}
		return list;
	}

	/**
	 * To Retrieve All One Employee Net Pay Records
	 * 
	 * @param employeeId
	 * @return List<EmployeeNetPay>
	 */
	@Override
	public List<EmployeeNetPay> oneAllEmployeeNetPay(Long employeeId) {
		return employeeNetPayDao.findByEmployeeId(employeeId);
	}

	/**
	 * Update Employee Net Pay Record Based on Primary Key
	 * 
	 * @param netPay
	 */
	@Override
	public void updateEmployeeNetPay(EmployeeNetPay netPay) {
		employeeNetPayDao.save(netPay);

	}

	@Override
	public NetPayResponse netPayResponse(Long employeeId,String monthAndYear) {
		EmployeeNetPay netPay=oneEmployeeNetPayMonthWise(employeeId,monthAndYear);
		return new NetPayResponse(netPay.getNetpay(), netPay.getAmountInWords(), netPay.getModeOfPayment(), netPay.getTotalNetPayable());
	}

	/**
	 * Service To One Employee NetPay For Particular Month 
	 */
	@Override
	public EmployeeNetPay oneEmployeeNetPayMonthWise(Long employeeId, String monthAndYear) {
		return employeeNetPayDao.oneEmployeeNetPayMonthWise(employeeId,monthAndYear);
	}

}
