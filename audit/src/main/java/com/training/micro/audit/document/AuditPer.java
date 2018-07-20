package com.training.micro.audit.document;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;
@Table
public class AuditPer {

	@PrimaryKey
	private UUID eventId=UUID.randomUUID();
	private String eventName;

	private String eventType;
	private Date eventDate;
	private String userId;
	private Map<String, String> oldValue;
	private Map<String, String> newValue;
	public UUID getEventId() {
		return eventId;
	}
	public void setEventId(UUID eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Map<String, String> getOldValue() {
		return oldValue;
	}
	public void setOldValue(Map<String, String> oldValue) {
		this.oldValue = oldValue;
	}
	public Map<String, String> getNewValue() {
		return newValue;
	}
	public void setNewValue(Map<String, String> newValue) {
		this.newValue = newValue;
	}
	public AuditPer(UUID eventId, String eventName, String eventType, Date eventDate, String userId,
			Map<String, String> oldValue, Map<String, String> newValue) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventType = eventType;
		this.eventDate = eventDate;
		this.userId = userId;
		this.oldValue = oldValue;
		this.newValue = newValue;
	}
	public AuditPer() {
		super();
	}
	
}
