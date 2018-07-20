package com.training.micro.audit.helper;

/**
 * Entity class for Customer
 */

public class Customer{

    private Integer customerId;
	private String name;
	private Integer pin;
	private Integer bankId;

	
	/**
	 * parameterized constructor
	 */
	public Customer(final String name, final Integer pin,final Integer bankId) {
		super();
		this.name = name;
		this.pin = pin;
		this.bankId = bankId;
	}
	/**
	 * no parameter constructor
	 */
	public Customer() {
		super();
	}
	/**
	 * @return the customerId
	 */
	public Integer getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(final Integer customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}
	/**
	 * @return the pin
	 */
	public Integer getPin() {
		return pin;
	}
	/**
	 * @param pin the pin to set
	 */
	public void setPin(final Integer pin) {
		this.pin = pin;
	}
	/**
	 * @return the bankId
	 */
	public Integer getBankId() {
		return bankId;
	}
	/**
	 * @param bankId the bankId to set
	 */
	public void setBankId(final Integer bankId) {
		this.bankId = bankId;
	}

	}

