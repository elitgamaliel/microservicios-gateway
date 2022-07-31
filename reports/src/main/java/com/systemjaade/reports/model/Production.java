package com.systemjaade.reports.model;
import java.util.List;
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
public class Production {
    private String user;
    private String date;
    List<ProductionDetail> productionDetail;
}
