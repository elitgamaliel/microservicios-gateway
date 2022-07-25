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
public class Ticket {

    private String typeTicket;
    private String numberTicket;
    private String client;
    private String documentNumber1;
    private String documentNumber2;
    private String reason;
    private String date;
    private String time;
    private String cashier;
    private List<TicketDetail> ticketDetail;
    private Double total;
    private String typeBox;
    private String appointmentTime;

}
