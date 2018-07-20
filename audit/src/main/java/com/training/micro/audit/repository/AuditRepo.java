package com.training.micro.audit.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.training.micro.audit.document.Audit;
import com.training.micro.audit.document.AuditPer;

public interface AuditRepo extends  CassandraRepository<AuditPer>/*MongoRepository<Audit,UUID>*/ {

	/**
	 * will find all the audit of a particular event name
	 * @param eventName
	 * @return
	 */
	List<Audit> findByEventName(String eventName);
	
}
