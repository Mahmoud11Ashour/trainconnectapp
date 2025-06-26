package com.mmashour.opportunityservice.service;

import com.mmashour.opportunityservice.model.Opportunity;
import com.mmashour.opportunityservice.repository.OpportunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Mahmoud
 */
@Service
public class OpportunityServiceImpl implements OpportunityService {

    @Autowired
    private OpportunityRepository repository;

    @Override
    public Opportunity save(Opportunity opportunity) {
        return repository.save(opportunity);
    }

    @Override
    public List<Opportunity> getAll() {
        return repository.findAll();
    }
}
