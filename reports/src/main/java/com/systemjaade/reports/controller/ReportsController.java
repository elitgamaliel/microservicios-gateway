package com.systemjaade.reports.controller;

import com.lowagie.text.DocumentException;
import com.systemjaade.reports.model.*;
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

    @PostMapping("/clinicHistory")
    public ResponseEntity<ByteArrayResource> constanciaPDFClinicHistory(@RequestBody ClinicHistory clinicHistory, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("clinicHistory", clinicHistory);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("HistorialClinico.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "ClinicHistory.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/atencion")
    public ResponseEntity<ByteArrayResource> constanciaPDFAtencion(@RequestBody Attention attention, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("attention", attention);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("Atencion.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "Atencion.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/atencionDetalle")
    public ResponseEntity<ByteArrayResource> constanciaPDFAtencionDetalle(@RequestBody AttentionHistory attentionHistory, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("attentionHistory", attentionHistory);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("AtencionDetalle.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "AtencionDetalle.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/cajaEntreFechasConceptos")
    public ResponseEntity<ByteArrayResource> constanciaPDFCajaEntreFechasConceptos(@RequestBody Service service, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("service", service);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("CajaEntreFechasConceptos.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "CajaEntreFechasConceptos.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/comprobanteCaja")
    public ResponseEntity<ByteArrayResource> constanciaPDFComprobanteCaja(@RequestBody Service service, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("service", service);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("ComprobanteCaja.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "ComprobanteCaja.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/comprobanteEgresoCaja")
    public ResponseEntity<ByteArrayResource> constanciaPDFComprobanteEgresoCaja(@RequestBody Service service, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("service", service);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("ComprobanteEgresosCaja.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "ComprobanteEgresoCaja.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/comprobanteEgresoCajaPor")
    public ResponseEntity<ByteArrayResource> constanciaPDFComprobanteEgresoCajaPor(@RequestBody Service service, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("service", service);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("ComprobanteEgresosCajaPor.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "ComprobanteEgresoCajaPor.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/comprobanteEgresoFarmacia")
    public ResponseEntity<ByteArrayResource> constanciaPDFComprobanteEgresoFarmacia(@RequestBody Service service, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("service", service);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("ComprobanteEgresosFarmacia.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "ComprobanteEgresoFarmacia.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/comprobanteEgresoFarmaciaPor")
    public ResponseEntity<ByteArrayResource> constanciaPDFComprobanteEgresoFarmaciaPor(@RequestBody Service service, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("service", service);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("ComprobanteEgresosFarmaciaPor.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "ComprobanteEgresosFarmaciaPor.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/comprobanteFarmacia")
    public ResponseEntity<ByteArrayResource> constanciaPDFComprobanteFarmacia(@RequestBody Service service, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("service", service);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("ComprobanteFarmacia.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "ComprobanteFarmacia.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/comprobanteIngresoCaja")
    public ResponseEntity<ByteArrayResource> constanciaPDFComprobanteIngresoCaja(@RequestBody Service service, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("service", service);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("ComprobanteIngresosCaja.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "ComprobanteIngresosCaja.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/comprobanteIngresoFarmacia")
    public ResponseEntity<ByteArrayResource> constanciaPDFComprobanteIngresoFarmacia(@RequestBody Service service, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("service", service);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("ComprobanteIngresosFarmacia.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "ComprobanteIngresosFarmacia.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/constanciaAsistenciaPaciente")
    public ResponseEntity<ByteArrayResource> constanciaPDFConstanciaAsistenciaPaciente(@RequestBody Constancy constancy, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("constancy", constancy);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("ConstanciaAsistenciaPaciente.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "ConstanciaAsistenciaPaciente.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/egresosProveedorCaja")
    public ResponseEntity<ByteArrayResource> constanciaPDFEgresosProveedorCaja(@RequestBody Expense expense, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("expense", expense);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("EgresosProveedorCaja.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "EgresosProveedorCaja.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/egresosProveedorFarmacia")
    public ResponseEntity<ByteArrayResource> constanciaPDFEgresosProveedorFarmacia(@RequestBody Expense expense, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("expense", expense);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("EgresosProveedorFarmacia.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "EgresosProveedorFarmacia.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/farmaciaEntreFechasConcepto")
    public ResponseEntity<ByteArrayResource> constanciaPDFFarmaciaEntreFechasConceptos(@RequestBody Service service, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("service", service);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("FarmaciaEntreFechasConcepto.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "FarmaciaEntreFechasConceptos.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/masVendidos1Mes")
    public ResponseEntity<ByteArrayResource> constanciaPDFmasVendidos1Mes(@RequestBody Sales sales, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("sales", sales);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("MasVendidos1Mes.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "MasVendidos1Mes.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/masVendidos3Meses")
    public ResponseEntity<ByteArrayResource> constanciaPDFmasVendidos3Meses(@RequestBody Sales sales, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("sales", sales);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("MasVendidos3Meses.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "MasVendidos3Meses.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/menosVendidos1Mes")
    public ResponseEntity<ByteArrayResource> constanciaPDFmenosVendidos1Mes(@RequestBody Sales sales, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("sales", sales);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("MenosVendidos1Mes.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "MenosVendidos1Mes.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/menosVendidos3Meses")
    public ResponseEntity<ByteArrayResource> constanciaPDFmenosVendidos3Meses(@RequestBody Sales sales, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("sales", sales);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("MenosVendidos3Meses.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "MenosVendidos3Meses.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/produccionMensual")
    public ResponseEntity<ByteArrayResource> constanciaPDFproduccionMensual(@RequestBody Production production, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("production", production);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("ProduccionMensual.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "ProduccionMensual.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/produccionMensualPersonal")
    public ResponseEntity<ByteArrayResource> constanciaPDFproduccionMensualPersonal(@RequestBody Service service, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("service", service);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("ProduccionMensualPersonal.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "ProduccionMensualPersonal.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/receta")
    public ResponseEntity<ByteArrayResource> constanciaPDFrecipe(@RequestBody Recipe recipe, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("recipe", recipe);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("Receta.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "Receta.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/recetaHistorial")
    public ResponseEntity<ByteArrayResource> constanciaPDFRecetaHistorial(@RequestBody Recipe recipe, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("recipe", recipe);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("RecetaHistorial.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "RecetaHistorial.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/servicioCaja")
    public ResponseEntity<ByteArrayResource> constanciaPDFServicioCaja(@RequestBody Service service, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("service", service);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("ServicioCaja.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "ServicioCaja.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }

    @PostMapping("/stockProductos")
    public ResponseEntity<ByteArrayResource> constanciaPDFStockProductos(@RequestBody Stock stock, HttpServletRequest request, final HttpServletResponse response) throws DocumentException {

        Map<String, Object> mapParameter = new HashMap<String, Object>();
        mapParameter.put("stock", stock);
        ByteArrayOutputStream byteArrayOutputStreamPDF = pdfGenarator.createPdf("StockProductos.html", mapParameter, request, response);
        ByteArrayResource inputStreamResourcePDF = new ByteArrayResource(byteArrayOutputStreamPDF.toByteArray());

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "StockProductos.pdf").contentType(MediaType.APPLICATION_PDF)
                .contentLength(inputStreamResourcePDF.contentLength()).body(inputStreamResourcePDF);

    }
}
