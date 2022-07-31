package com.systemjaade.reports.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ClinicHistory {
    private Integer historyNumber;
    private String documentType;
    private String documentNumber;
    private String positionName;
    private String fullName;
    private String nationality;
    private String place;
    private String birthDate;
    private String age;
    private String sex;
    private String civilStatus;
    private String studyLevel;
    private String profession;
    private String occupation;
    private String religion;
    private String ethnicity;
    private Integer cellPhone;
    private Integer landlinePhone;
    private String address;

    private boolean dh_family;
    private boolean hta_family;
    private boolean deslipidemia_family;
    private boolean tbc_family;
    private boolean diabetes_family;
    private boolean otros_family;
    private String otros_texto_family;
    private boolean dh_personales;
    private boolean hta_personales;
    private boolean deslipidemia_personales;
    private boolean tbc_personales;
    private boolean tabacolismo_personales;
    private boolean alcohol_personales;
    private boolean otros_personales;
    private String otros_texto_personales;


}
