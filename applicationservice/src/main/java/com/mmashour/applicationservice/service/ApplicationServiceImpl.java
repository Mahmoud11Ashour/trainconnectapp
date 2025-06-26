package com.mmashour.applicationservice.service;

import com.mmashour.applicationservice.model.TrainingApplication;
import com.mmashour.applicationservice.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Mahmoud
 */
@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationRepository repository;

    @Override
    public TrainingApplication save(TrainingApplication application) {
        return repository.save(application);
    }

    @Override
    public List<TrainingApplication> getAll() {
        return repository.findAll();
    }
}
