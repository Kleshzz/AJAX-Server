package com.example.server;

import com.example.server.dto.AjaxRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class AjaxController {

    private static final Logger logger = LoggerFactory.getLogger(AjaxController.class);

    @PostMapping("/process")
    public Map<String, String> handleRequest(@RequestBody AjaxRequest request) {
        logger.info("Received action: {}", request.getAction());

        if (request.getAction() == null) {
            throw new IllegalArgumentException("Action is required!");
        }

        return Map.of(
                "status", "success",
                "processedAction", request.getAction()
        );
    }
}