package com.mmashour.reportservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Mahmoud
 */
@FeignClient(name = "applicationservice")
public interface ApplicationClient {

    @GetMapping("/applications")
    List<Map<String, Object>> getAllApplications();
}
