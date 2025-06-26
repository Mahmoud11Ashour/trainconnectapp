package com.mmashour.companyservice.controller;

import com.mmashour.companyservice.model.Company;
import com.mmashour.companyservice.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author Mahmoud
 */
@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping
    public Company create(@RequestBody Company company) {
        return companyService.save(company);
    }

    @GetMapping
    public List<Company> getAll() {
        return companyService.getAll();
    }
}
