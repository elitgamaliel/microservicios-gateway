package com.systemjaade.reports.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Expense {
    private String user;
    private String historyNumber;
    List<ExpenseDetail> expenseDetail;
}
