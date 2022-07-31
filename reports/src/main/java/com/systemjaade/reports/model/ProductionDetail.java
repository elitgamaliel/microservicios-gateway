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
public class ProductionDetail {
    private String name;
    private String consultingRoom;
    private String quantity;
    private String amount;
}
