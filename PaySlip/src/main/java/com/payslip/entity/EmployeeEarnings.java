package com.payslip.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Model and Entity to Employee Earnings
 * 
 * @author nshiva
 *
 */
@Entity
public class EmployeeEarnings implements Serializable {

	/**
	 * Default seralized number
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * primary key column. This may used to manipulate another fields data
	 */
	@Id
	@Column
	private Long earningsId;

	/**
	 * This Represents Basic Salary of Employee
	 */
	@Column
	private Double basic;

	/**
	 * This Represents House Rent Allowance of Employee
	 */
	@Column
	private Double houseRentAllowance;

	/**
	 * This Represents Special Allowance of Employee
	 */
	@Column
	private Double specialAllowance;

	/**
	 * This Represents project Allowance of Employee
	 */
	@Column
	private Double projectAllowance;

	/**
	 * This Represents Foodie Card Amount of The Employee
	 */
	@Column
	private Double foddieCard;

	/**
	 * This Represents Location Allowance of The Employee
	 */
	@Column
	private Double locationAllowance;

	/**
	 * This Represents Bonus of The Employee
	 */
	@Column
	private Double bonus;

	/**
	 * This Represents Structure Start Date of The Employee
	 */
	@Column
	private String structureStartDate;

	/**
	 * This Represents Structure End Date of The Employee
	 */
	@Column
	private String structureEndDate;
	
	/**
	 * Mode of payment For the Structure
	 */
	@Column
	private String modeOfPayment;

	/**
	 * All Setters And Getters
	 * @return
	 */
	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public Long getEarningsId() {
		return earningsId;
	}

	public void setEarningsId(Long earningsId) {
		this.earningsId = earningsId;
	}

	public Double getBasic() {
		return basic;
	}

	public void setBasic(Double basic) {
		this.basic = basic;
	}

	public Double getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(Double houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	public Double getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(Double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public Double getProjectAllowance() {
		return projectAllowance;
	}

	public void setProjectAllowance(Double projectAllowance) {
		this.projectAllowance = projectAllowance;
	}

	public Double getFoddieCard() {
		return foddieCard;
	}

	public void setFoddieCard(Double foddieCard) {
		this.foddieCard = foddieCard;
	}

	public Double getLocationAllowance() {
		return locationAllowance;
	}

	public void setLocationAllowance(Double locationAllowance) {
		this.locationAllowance = locationAllowance;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	public String getStructureStartDate() {
		return structureStartDate;
	}

	public void setStructureStartDate(String structureStartDate) {
		this.structureStartDate = structureStartDate;
	}

	public String getStructureEndDate() {
		return structureEndDate;
	}

	public void setStructureEndDate(String structureEndDate) {
		this.structureEndDate = structureEndDate;
	}

}
