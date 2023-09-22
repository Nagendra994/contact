package com.nage.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nage.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact ,Integer>{

}
