package com.payslip.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeWorkingDays implements Serializable {

	/**
	 * Default Serialization Version Id
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long RecordNo;

	/**
	 * This To Represent Id Of The Employee
	 */
	@Column
	private Long employeeId;

	/**
	 * This To Represent Loss Of Pay Days Of The Employee
	 */
	@Column
	private Double lossOfPayDays;

	/**
	 * This To Represent Working Days Of The Employee
	 */
	@Column
	private Double workingdays;

	/**
	 * This Is To Represent Month And Year of the Employee
	 */
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

	public Double getLossOfPayDays() {
		return lossOfPayDays;
	}

	public void setLossOfPayDays(Double lossOfPayDays) {
		this.lossOfPayDays = lossOfPayDays;
	}

	public Double getWorkingdays() {
		return workingdays;
	}

	public void setWorkingdays(Double workingdays) {
		this.workingdays = workingdays;
	}

	public String getMonthAndYear() {
		return monthAndYear;
	}

	public void setMonthAndYear(String monthAndYear) {
		this.monthAndYear = monthAndYear;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getRecordNo() {
		return RecordNo;
	}

	public void setRecordNo(Long recordNo) {
		RecordNo = recordNo;
	}
}
