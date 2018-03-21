package firsttest.controllers;

import firsttest.main.Company;
import firsttest.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/company", method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class CompanyController {

    @Autowired
    private CompanyService service;

    @RequestMapping(value = "/all")
    public @ResponseBody List<Company> getAllCompanies() {
       return service.findAll();
    }
}
