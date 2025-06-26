package com.mmashour.opportunityservice.service;

import com.mmashour.opportunityservice.model.Opportunity;

import java.util.List;

/**
 *
 * @author Mahmoud
 */
public interface OpportunityService {

    Opportunity save(Opportunity opportunity);

    List<Opportunity> getAll();
}
