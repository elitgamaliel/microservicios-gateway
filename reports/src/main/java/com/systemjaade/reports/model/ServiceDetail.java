package com.systemjaade.reports.model;
import lombok.*;
/**
 *
 * @author Marcela Paredes
 */
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
@ToString
public class ServiceDetail {
    private String code;
    private String date;
    private String description;
    private String patient;
    private String service;
    private Integer quantity;
    private Double amount;
    private String paymentType;
    private String reason;
    private String historyNumber;

    private String name;
}
