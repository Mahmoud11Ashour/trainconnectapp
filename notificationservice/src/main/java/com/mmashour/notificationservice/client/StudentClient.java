package com.mmashour.notificationservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Mahmoud
 */
@FeignClient(name = "studentservice")
public interface StudentClient {

    @GetMapping("/students")
    List<Map<String, Object>> getAllStudents();
}
