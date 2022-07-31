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
public class Attention {

    private String historyNumber;
    private String documentNumber;
    List<AttentionDetail> attentionDetail;
}
