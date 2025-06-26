package com.mmashour.notificationservice.controller;

import com.mmashour.notificationservice.client.StudentClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Mahmoud
 */
@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private StudentClient studentClient;

    @GetMapping("/students")
    public List<Map<String, Object>> notifyStudents() {
        return studentClient.getAllStudents();
    }
}
