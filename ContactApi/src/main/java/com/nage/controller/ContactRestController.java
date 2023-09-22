package com.nage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.nage.entity.Contact;
import com.nage.service.ContactSservice;

public class ContactRestController {
@Autowired
private ContactSservice contactService;
@GetMapping("/save")
public String  saveContact(Contact contact) {
	return "contact has been saved";
	
	
}




}
