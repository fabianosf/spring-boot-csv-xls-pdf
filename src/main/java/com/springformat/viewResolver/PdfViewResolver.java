package com.springformat.viewResolver;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import com.springformat.view.PdfView;

import java.util.Locale;

/**
 * 
 */
public class PdfViewResolver implements ViewResolver {

    /**
     * 
     *
     * @param s 
     * @param locale 
     * @return 
     * @throws Exception 
     */
    @Override
    public View resolveViewName(String s, Locale locale) throws Exception {

        return new PdfView();
    }
}
