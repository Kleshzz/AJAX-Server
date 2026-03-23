package com.example.server;

import com.example.server.dto.AjaxRequest;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Allows AJAX from any frontend origin
public class AjaxController {

    private static final Logger logger = LoggerFactory.getLogger(AjaxController.class);

    @PostMapping("/process")
    public ResponseEntity<Map<String, Object>> handleAjaxRequest(@Valid @RequestBody AjaxRequest request) {
        logger.info("New valid request received. Action: {}", request.getAction());
        logger.debug("Full payload: {}", request);

        Map<String, Object> response = new LinkedHashMap<>();

        response.put("status", "success");
        response.put("message", "Request processed by Java Server");
        response.put("timestamp", LocalDateTime.now().toString());
        response.put("echo", Map.of(
                "receivedAction", request.getAction(),
                "receivedData", request.getData()
        ));

        logger.info("Successfully responded to action: {}", request.getAction());

        return ResponseEntity.ok(response);
    }

    @GetMapping("/status")
    public String checkStatus() {
        logger.info("Health check triggered");
        return "Server is up and running. Ready for AJAX requests!";
    }
}