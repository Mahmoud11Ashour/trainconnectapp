package com.mmashour.companyservice.service;

import com.mmashour.companyservice.model.Company;

import java.util.List;

/**
 *
 * @author Mahmoud
 */
public interface CompanyService {

    Company save(Company company);

    List<Company> getAll();
}
