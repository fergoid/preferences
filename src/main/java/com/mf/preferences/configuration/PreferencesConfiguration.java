package com.mf.preferences.configuration;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "com.mf.preferences")
@PropertySource("/application.properties")

public class PreferencesConfiguration {

	@Autowired
	Environment env;

	private CounterService counterService;

	@Autowired
	public void MyService(CounterService counterService) {
		this.counterService = counterService;
	}

	@Bean 
	String instanceInfo() {
		return UUID.randomUUID().toString();
	}

}
