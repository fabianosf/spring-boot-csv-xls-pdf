package com.springformat.view;

import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import com.springformat.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * 
 */
public class CsvView extends AbstractCsvView {


    /**
     * 
     *
     * @param model 
     * @param request 
     * @param response 
     * @throws Exception 
     */
    @Override
    protected void buildCsvDocument(Map<String, Object> model, HttpServletRequest request, HttpServletResponse
            response) throws Exception {

        response.setHeader("Content-Disposition", "attachment; filename=\"file.csv\"");

        @SuppressWarnings("unchecked")
		List<User> users = (List<User>) model.get("users");
        String[] header = {"FirstName", "LastName", "LastName", "JobTitle", "Company", "Address", "City", "Country",
                "PhoneNumber"};
        ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(),
                CsvPreference.STANDARD_PREFERENCE);

        csvWriter.writeHeader(header);

        for (User user : users) {
            csvWriter.write(user, header);
        }
        csvWriter.close();

    }
}
