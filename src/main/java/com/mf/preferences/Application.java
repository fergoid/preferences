package com.mf.preferences;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mf.preferences")
@EnableAutoConfiguration
public class Application implements ExitCodeGenerator {
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    public void startApplication() {
    	LOGGER.info("*** Application STARTUP Request ***");
    }
    
    @PreDestroy
    public void shutdownApplication() {
    	LOGGER.info("*** Application SHUTDOWN Request ***");
    }

	@Override
	public int getExitCode() {
		return 0;
	}
}
