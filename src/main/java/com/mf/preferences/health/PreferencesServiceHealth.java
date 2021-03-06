package com.mf.preferences.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class PreferencesServiceHealth implements HealthIndicator {
	
    @Override
    public Health health() {
        int errorCode = 0; 
        // Check whether anything has been in error
        if (errorCode != 0) {
            return Health.down().withDetail("Error Code", errorCode).build();
        }
        return Health.up().build();
    }
}
