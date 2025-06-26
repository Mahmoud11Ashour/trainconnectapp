package com.mmashour.companyservice.repository;

import com.mmashour.companyservice.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Mahmoud
 */
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
