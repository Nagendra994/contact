package com.nage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nage.entity.Contact;
import com.nage.respository.ContactRepository;

public class ContactServiceImpl implements ContactSservice {
	@Autowired
	private ContactRepository repo;

	@Override
	public boolean saveContact() {
		
		return false;
	}

	@Override
	public List<Contact> getAllContacts() {

		return repo.findAll();
	}

	@Override
	public Contact getContactByID(Integer contactId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact deleteContacById(Integer contactId) {
		// TODO Auto-generated method stub
		return null;
	}

}
