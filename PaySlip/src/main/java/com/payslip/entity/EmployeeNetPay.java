package com.payslip.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Model and Entity For Employee Net Pay
 * 
 * @author nshiva
 *
 */
@Entity
public class EmployeeNetPay implements Serializable {

	/**
	 * Default Serialized Version Id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This represents employee Id
	 */
	@Column
	private Long employeeId;

	/**
	 * This is To Represent Net Pay of the Employee
	 */
	@Column
	private Integer netpay;

	/**
	 * This is To Represent Amount In Words of the Employee
	 */
	@Column
	private String amountInWords;

	/**
	 * This is To Represent Mode Of Payment of the Employee
	 */
	@Column
	private String modeOfPayment;

	/**
	 * This is To Represent Total Net Payable of the Employee
	 */
	@Column
	private Integer totalNetPayable;

	/**
	 * This Is To Represent Month And Year of the Employee
	 */
	@Id
	@Column
	private String monthAndYear;

	/**
	 * All Setters And Getters
	 * @return
	 */
	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public Integer getNetpay() {
		return netpay;
	}

	public void setNetpay(Integer netpay) {
		this.netpay = netpay;
	}

	public String getAmountInWords() {
		return amountInWords;
	}

	public void setAmountInWords(String amountInWords) {
		this.amountInWords = amountInWords;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public Integer getTotalNetPayable() {
		return totalNetPayable;
	}

	public void setTotalNetPayable(Integer totalNetPayable) {
		this.totalNetPayable = totalNetPayable;
	}

	public String getMonthAndYear() {
		return monthAndYear;
	}

	public void setMonthAndYear(String monthAndYear) {
		this.monthAndYear = monthAndYear;
	}

}
