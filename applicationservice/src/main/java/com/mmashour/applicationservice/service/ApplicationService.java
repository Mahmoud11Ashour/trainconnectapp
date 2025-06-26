package com.mmashour.applicationservice.service;

import com.mmashour.applicationservice.model.TrainingApplication;

import java.util.List;

/**
 *
 * @author Mahmoud
 */
public interface ApplicationService {

    TrainingApplication save(TrainingApplication application);

    List<TrainingApplication> getAll();
}
