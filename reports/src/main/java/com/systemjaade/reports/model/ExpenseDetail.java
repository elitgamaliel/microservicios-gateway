package com.systemjaade.reports.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExpenseDetail {
    private String ruc;
    private String name;
    private String reason;
    private String date;
    private String hour;
    private String amount;
}
