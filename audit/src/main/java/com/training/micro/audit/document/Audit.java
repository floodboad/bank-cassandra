package com.training.micro.audit.document;

import java.util.Date;
import java.util.UUID;

import javax.validation.constraints.NotNull;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import com.training.micro.audit.helper.Customer;

/**
 * @author tuhindas
 *
 * @param <T>
 */
//@Document
@Table
public class Audit<T> {
	
	

	//@Id
	@PrimaryKey
	private UUID eventId=UUID.randomUUID();
	private String eventName;
	@NotNull
	private String eventType;
	private Date eventDate;
	private String userId;
	private Customer oldValue;
	private Customer newValue;

	/**
	 * @return the eventId
	 */
	public UUID getEventId() {
		return eventId;
	}
	/**
	 * @param eventId the eventId to set
	 */
	public void setEventId(UUID eventId) {
		this.eventId =eventId ;
	}
	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}
	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	/**
	 * @return the eventType
	 */
	public String getEventType() {
		return eventType;
	}
	/**
	 * @param eventType the eventType to set
	 */
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	/**
	 * @return the eventDate
	 */
	public Date getEventDate() {
		return eventDate;
	}
	/**
	 * @param eventDate the eventDate to set
	 */
	public void setEventDate(Date eventDate) {
		this.eventDate = new Date();
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the oldValue
	 */
	public Customer getOldValue() {
		return oldValue;
	}
	/**
	 * @param oldValue the oldValue to set
	 */
	public void setOldValue(Customer oldValue) {
		this.oldValue = oldValue;
	}
	/**
	 * @return the newValue
	 */
	public Customer getNewValue() {
		return newValue;
	}
	
	
	
	
	/**
	 * @param newValue the newValue to set
	 */
	public void setNewValue(Customer newValue) {
		this.newValue = newValue;
	}
	public Audit( String eventName, String eventType, Date eventDate, String userId,
			Customer oldValue, Customer newValue) {
		
		this.eventName = eventName;
		this.eventType = eventType;
		this.eventDate = new Date();
		this.userId = userId;
		this.oldValue = oldValue;
		this.newValue = newValue;
	}
	public Audit() {
		super();
	}

}
