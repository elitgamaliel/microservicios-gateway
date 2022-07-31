package com.systemjaade.reports.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
 *
 * @author Marcela Paredes
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Constancy {
    private Integer id;
    private String year;
    private String namePatient;
    private String sex;
    private String age;
    private String birthDate;
    private String historyNumber;
    private String date;
    private String reference;
    private String professional;
    private String applicant;
    private String dateNow;
}
