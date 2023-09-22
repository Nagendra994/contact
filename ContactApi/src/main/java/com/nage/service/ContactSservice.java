package com.nage.service;

import java.util.List;

import com.nage.entity.Contact;

public interface ContactSservice {


//savecontact
//getallcontacts
//findbyid
//delete the contact
//update the contact

	
public boolean saveContact();
public List<Contact> getAllContacts();
public Contact getContactByID(Integer contactId);
public Contact deleteContacById(Integer contactId);
}