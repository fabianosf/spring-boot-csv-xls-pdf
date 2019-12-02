package com.springformat.viewResolver;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import com.springformat.view.ExcelView;

import java.util.Locale;

/**
 * 
 */
public class ExcelViewResolver implements ViewResolver {

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

        return new ExcelView();
    }
}
