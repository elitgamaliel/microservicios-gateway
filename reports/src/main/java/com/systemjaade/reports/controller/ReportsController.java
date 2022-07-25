package com.systemjaade.reports.controller;

import com.lowagie.text.DocumentException;
import com.systemjaade.reports.model.Ticket;
import com.systemjaade.reports.util.PDFGenerator;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;

@RestController
@RequestMapping("/reports")
public class ReportsController {

    @Resource
    private PDFGenerator pdfGenarator;

    @PostMapping("/ticket-ingreso")
    public ResponseEntity<ByteArrayResource> constanciaPDF(@RequestBody Ticket ticket, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("ticket", ticket);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("TicketIngreso.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "Ticket.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/ticket-egreso")
    public ResponseEntity<ByteArrayResource> constanciaPDFE(@RequestBody Ticket ticket, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("ticket", ticket);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("TicketEgreso.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "Ticket.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

}
