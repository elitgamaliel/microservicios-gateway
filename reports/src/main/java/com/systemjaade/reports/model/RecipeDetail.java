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
public class RecipeDetail {
    private String code;
    private String product;
    private String concentration;
    private String quantity;
    private String indication;


}
