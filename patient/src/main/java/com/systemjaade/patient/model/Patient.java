package com.systemjaade.patient.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@Builder
@NoArgsConstructor
@ToString
@Entity
@Table(name = "patients")
public class Patient {
	@Id
	@Column(name = "history_number")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer historyNumber;
	
	@Column(name = "users_id")
    private Integer usersId;
	
	@Column(name = "lastname")
    private String lastname;
	
	@Column(name = "mothers_lastname")
    private String mothersLastname;
	
	@Column(name = "first_name")
    private String firstName;
	
	@Column(name = "second_name")
    private String secondName;
	
	@Column(name = "master_table_id_document_type")
    private String masterTableIdDocumentType;
	
	@Column(name = "dni")
    private String documentNumber;
	
	@Column(name = "sex")
    private Integer sex;
	
	@Column(name = "birth_date")
    private String birthDate;
	
	@Column(name = "master_table_id_ethnicity")
    private String masterTableIdEthnicity;
	
	@Column(name = "master_table_id_marital_status")
    private String masterTableIdMaritalStatus;
	
	@Column(name = "master_table_id_religion")
    private String masterTableIdReligion;
	
	@Column(name = "master_table_id_level_study")
    private String masterTableIdLevelStudy;
	
	@Column(name = "master_table_id_profession")
    private String masterTableIdProfession;
	
	@Column(name = "master_table_id_occupation")
    private String masterTableIdOccupation;
	
	@Column(name = "cell_phone")
    private String cellphone;
	
	@Column(name = "landline_phone")
    private String landlinePhone;
	
	@Column(name = "birth_place_id")
    private int birthPlaceId;
	
	@Column(name = "address_id")
    private int addressId;
	
	@Column(name = "parents_id")
    private int parentsId;
	
	@Column(name = "companion_id")
    private int companionId;
	
	@Column(name = "created_at")
    private String createdAt;


}

