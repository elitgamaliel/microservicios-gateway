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
public class Stock {
    private String user;
    private String date;
    private String historyNumber;
    List<StockDetail> stockDetail;

}
