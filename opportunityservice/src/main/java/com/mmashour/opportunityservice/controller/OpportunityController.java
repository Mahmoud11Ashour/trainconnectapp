package com.mmashour.opportunityservice.controller;

import com.mmashour.opportunityservice.model.Opportunity;
import com.mmashour.opportunityservice.service.OpportunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author Mahmoud
 */
@RestController
@RequestMapping("/opportunities")
public class OpportunityController {

    @Autowired
    private OpportunityService opportunityService;

    @PostMapping
    public Opportunity create(@RequestBody Opportunity opportunity) {
        return opportunityService.save(opportunity);
    }

    @GetMapping
    public List<Opportunity> getAll() {
        return opportunityService.getAll();
    }
}
