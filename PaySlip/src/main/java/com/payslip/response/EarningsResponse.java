package com.payslip.response;

/**
 * Earnings Response Object
 * @author nshiva
 *
 */
public class EarningsResponse {

	/**
	 * Fields Of Earnings Response Object
	 */
	private Double basic;
	private Double houseRentAllowance;
	private Double specialAllowance;
	private Double projectAllowance;
	private Double foddieCard;
	private Double locationAllowance;
	private Double bonus;
	private Integer totalEarnings;
	
		
	/**
	 * Constructor to create Earnings Response Object
	 * @param basic
	 * @param houseRentAllowance
	 * @param specialAllowance
	 * @param projectAllowance
	 * @param foddieCard
	 * @param locationAllowance
	 * @param bonus
	 * @param totalEarnings
	 */
	public EarningsResponse(Double basic, Double houseRentAllowance, Double specialAllowance, Double projectAllowance,
			Double foddieCard, Double locationAllowance, Double bonus, Integer totalEarnings) {
		super();
		this.basic = basic;
		this.houseRentAllowance = houseRentAllowance;
		this.specialAllowance = specialAllowance;
		this.projectAllowance = projectAllowance;
		this.foddieCard = foddieCard;
		this.locationAllowance = locationAllowance;
		this.bonus = bonus;
		this.totalEarnings = totalEarnings;
	}
	
	/**
	 * Setters And Getters Of All The Fields
	 * @return
	 */
	public Integer getTotalEarnings() {
		return totalEarnings;
	}
	public void setTotalEarnings(Integer totalEarnings) {
		this.totalEarnings = totalEarnings;
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
		
}
