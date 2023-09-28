package com.nage.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Table(name = "Contact_details")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer contactId;
	private String contactEmail;
	private Integer contactNumber;
	private String createDate;
	private String updateDate;
	private String activeSw;

	/*
	 * contactId contactName contactEmail contactNumber createDate updateDate
	 * activeSw
	 */

}
