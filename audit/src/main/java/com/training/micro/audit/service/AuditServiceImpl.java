package com.training.micro.audit.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.micro.audit.document.Audit;
import com.training.micro.audit.document.AuditPer;
import com.training.micro.audit.exception.AuditException;
import com.training.micro.audit.helper.Customer;
import com.training.micro.audit.repository.AuditRepo;
/**
 * @author tuhindas
 *
 */
@Service
public class AuditServiceImpl implements AuditService {

	@Autowired
	AuditRepo auditRepo;

	/**
	 * implementation of audit service
	 * creating a new audit
	 */
	@Override
	public AuditPer createAudit(Audit audit) {
		
		Customer newCustomer=audit.getNewValue();
		Customer oldCustomer=audit.getOldValue();
		AuditPer auditPer=new AuditPer();
		auditPer.setEventName(audit.getEventName());
		auditPer.setEventDate(audit.getEventDate());
		auditPer.setEventId(audit.getEventId());
		auditPer.setEventType(audit.getEventType());
		HashMap< String,String> oldCustomerPer = new HashMap< String,String>();
		HashMap< String,String> newCustomerPer = new HashMap< String,String>();
		oldCustomerPer.put("customerId",oldCustomer.getCustomerId().toString());
		oldCustomerPer.put("name",oldCustomer.getName());
		oldCustomerPer.put("pin",oldCustomer.getPin().toString());
		oldCustomerPer.put("BankId",oldCustomer.getBankId().toString());
		auditPer.setOldValue(oldCustomerPer);
		newCustomerPer.put("customerId",newCustomer.getCustomerId().toString());
		newCustomerPer.put("name",newCustomer.getName());
		newCustomerPer.put("pin",newCustomer.getPin().toString());
		newCustomerPer.put("BankId",newCustomer.getBankId().toString());
		auditPer.setNewValue(newCustomerPer);
		
		if(audit.getEventName()==null || audit.getEventType()==null)
		{
			throw new AuditException("can not accept without event name or event type");
		}
		else
		{
			return auditRepo.save(auditPer);
		}
	}
	/**
	 * List of all audit
	 */
	/*@Override
	public List<Audit> viewAudit() {
		
		return auditRepo.findAll();
	}*/
	/**
	 * All audit of a particular eventName
	 */
	/*@Override
	public List<Audit> viewOneByEvent(final String eventName) {
		if(eventName==null)
		{
			throw new AuditException("pass a event name");
		}
		else
		{
			return  auditRepo.findByEventName(eventName);
	}
	}
	*//**
	 * updating a audit List of a particular event Name
	 *//*
	@Override
	public String updateAudit(final String eventName) {
		final List<Audit> auditOption= auditRepo.findByEventName(eventName);
		for(Audit list:auditOption)
		{
			list.setEventType("new created");
			 auditRepo.save(list);
			
					}
		return "updated";
	}*/
}
