package com.rahul.BankWebApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rahul.BankWebApp.model.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
	
	
}
