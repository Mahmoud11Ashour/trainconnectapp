package com.mmashour.companyservice.service;

import com.mmashour.companyservice.model.Company;
import com.mmashour.companyservice.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Mahmoud
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository repository;

    @Override
    public Company save(Company company) {
        return repository.save(company);
    }

    @Override
    public List<Company> getAll() {
        return repository.findAll();
    }
}
