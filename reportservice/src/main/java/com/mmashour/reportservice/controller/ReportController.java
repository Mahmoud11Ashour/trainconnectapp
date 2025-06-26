package com.mmashour.reportservice.controller;

import com.mmashour.reportservice.client.ApplicationClient;
import com.mmashour.reportservice.client.StudentClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 *
 * @author Mahmoud
 */
@RestController
@RequestMapping("/reports")
public class ReportController {

    @Autowired
    private StudentClient studentClient;

    @Autowired
    private ApplicationClient applicationClient;

    @GetMapping("/summary")
    public Map<String, Object> generateReport() {
        List<Map<String, Object>> students = studentClient.getAllStudents();
        List<Map<String, Object>> applications = applicationClient.getAllApplications();

        Map<String, Object> report = new HashMap<>();
        report.put("total_students", students.size());
        report.put("total_applications", applications.size());
        report.put("students", students);
        report.put("applications", applications);

        return report;
    }
}
