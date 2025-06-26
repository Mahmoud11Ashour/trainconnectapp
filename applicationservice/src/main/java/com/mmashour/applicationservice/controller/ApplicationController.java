package com.mmashour.applicationservice.controller;

import com.mmashour.applicationservice.model.TrainingApplication;
import com.mmashour.applicationservice.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author Mahmoud
 */
@RestController
@RequestMapping("/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @PostMapping
    public TrainingApplication create(@RequestBody TrainingApplication application) {
        return applicationService.save(application);
    }

    @GetMapping
    public List<TrainingApplication> getAll() {
        return applicationService.getAll();
    }
}
