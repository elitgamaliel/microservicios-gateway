package com.systemjaade.reports.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
/**
 *
 * @author Marcela Paredes
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Service {
    private String description;
    private String user;
    private double price;
    private String date1;
    private String date2;
    private String time;
    private String professional;
    private String total;
    private List<ServiceDetail> serviceDetail;
}
