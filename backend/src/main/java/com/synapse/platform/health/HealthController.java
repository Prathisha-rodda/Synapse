package com.synapse.platform.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/health")
class HealthController {

    @GetMapping
    HealthResponse getHealth() {
        return new HealthResponse("UP", "synapse-platform");
    }
}

