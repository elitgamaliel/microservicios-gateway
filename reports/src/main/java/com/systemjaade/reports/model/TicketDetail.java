package com.systemjaade.reports.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketDetail {

    private String code;
    private String description;
    private Double unitPrice;
    private Integer quantity;
    private Double amount;

}
