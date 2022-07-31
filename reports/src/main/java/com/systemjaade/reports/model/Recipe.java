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
public class Recipe {
    private String center;
    private String reference;
    private String historyNumber;
    private String name;
    private String recipeNumber;
    private List<RecipeDetail> recipeDetail;
    private String date;
    private String hour;
    private String expirationDate;
    private String doctor;
    private String schoolNumber;

}
