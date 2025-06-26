package com.mmashour.opportunityservice.repository;

/**
 *
 * @author Mahmoud
 */
import com.mmashour.opportunityservice.model.Opportunity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpportunityRepository extends JpaRepository<Opportunity, Long> {
}
