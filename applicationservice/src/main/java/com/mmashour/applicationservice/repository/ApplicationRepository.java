package com.mmashour.applicationservice.repository;

import com.mmashour.applicationservice.model.TrainingApplication;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Mahmoud
 */
public interface ApplicationRepository extends JpaRepository<TrainingApplication, Long> {

}
