package com.systemjaade.reports.util;

import com.lowagie.text.DocumentException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.IWebContext;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.context.webflux.SpringWebFluxContext;
import org.xhtmlrenderer.pdf.ITextRenderer;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

@Service
public class PDFGenerator {

    @Resource
    private TemplateEngine templateEngine;

    @Resource
    ServletContext servletContext;

    public ByteArrayOutputStream createPdf(final String templateName, final Map map, final HttpServletRequest request, final HttpServletResponse response)
            throws DocumentException {

        Assert.notNull(templateName, "The templateName can not be null");

        IWebContext ctx = new WebContext(request, response, servletContext, LocaleContextHolder.getLocale(), map);

        String processedHtml = templateEngine.process(templateName, ctx);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try {

            ITextRenderer renderer = new ITextRenderer();
            renderer.setDocumentFromString(processedHtml);

            renderer.layout();
            renderer.createPDF(bos, false);
            renderer.finishPDF();

        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                }
            }
        }
        return bos;
    }
}
