/*
 * @author Fabiano Freitas
 */
package com.springformat.view;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.util.Map;

/**
 * 
 */
public abstract class AbstractPdfView extends AbstractView {

    /**
     * 
     */
    public AbstractPdfView() {
        setContentType("application/pdf");
    }

    /**
     * 
     *
     * @return 
     */
    @Override
    protected boolean generatesDownloadContent() {
        return true;
    }

    /**
     * 
     *
     * @param model 
     * @param request 
     * @param response 
     * @throws Exception 
     */
    @Override
    protected final void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception  {

        // IE workaround: write into byte array first.
        ByteArrayOutputStream baos = createTemporaryOutputStream();

        // Apply preferences and build metadata.
        Document document = new Document(PageSize.A4.rotate(), 36, 36, 54, 36);
        PdfWriter writer = PdfWriter.getInstance(document, baos);
        prepareWriter(model, writer, request);
        buildPdfMetadata(model, document, request);

        // Build PDF document.
        document.open();
        buildPdfDocument(model, document, writer, request, response);
        document.close();

        // Flush to HTTP response.
        writeToResponse(response, baos);
    }

    /**
     * 
     *
     * @param model 
     * @param writer 
     * @param request 
     * @throws DocumentException 
     */
    protected void prepareWriter(Map<String, Object> model, PdfWriter writer, HttpServletRequest request) throws DocumentException {
        writer.setViewerPreferences(getViewerPreferences());
    }

    /**
     * 
     *
     * @return 
     */
    protected int getViewerPreferences() {
        return PdfWriter.ALLOW_PRINTING | PdfWriter.PageLayoutSinglePage;
    }

    /**
     * 
     *
     * @param model 
     * @param document 
     * @param request 
     */
    protected void buildPdfMetadata(Map<String, Object> model, Document document, HttpServletRequest request) {
    }

    /**
     * 
     *
     * @param model 
     * @param document 
     * @param writer 
     * @param request 
     * @param response 
     * @throws Exception 
     */
    protected abstract void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
                                             HttpServletRequest request, HttpServletResponse response) throws Exception;
}

