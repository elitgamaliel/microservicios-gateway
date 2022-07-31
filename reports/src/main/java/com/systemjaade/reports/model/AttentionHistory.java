package com.systemjaade.reports.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AttentionHistory {

    private String historyNumber;
    private String documentNumber;
    private String patient;
    private String birthDate;
    private String professional;
    private String sex;
    private String attentionId;
    private String date;
    private String hour;
    private String arterialPressure;
    private String heartRate;
    private String weight;
    private String size;
    private String oxygenSaturation;
    private String temperature;
    private String respiratoryFrequency;
    private String companion;
    private String patientType;
    private String exam;
    private String history;
    private String physical;
}
