package com.example.springdeployment;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;

@Endpoint(id = "liveness")
public class Liveness {

    @ReadOperation
    public String liveness() {
        // Implement readiness check logic here
        // Return a response indicating readiness or not
        return "Live";
    }
}