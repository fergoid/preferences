package com.mf.preferences.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.Cloud;
import org.springframework.cloud.CloudFactory;
import org.springframework.cloud.app.ApplicationInstanceInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@ComponentScan(basePackages = "com.mf.preferences")
@Profile({"cloud"})
public class PreferencesCloudConfiguration {

	@Autowired
	Cloud cloud;
	
	@Bean 
	String instanceInfo() {
		ApplicationInstanceInfo aai=cloud.getApplicationInstanceInfo();
		return "** Instance " + aai.getInstanceId();
	}

    @Bean
    public Cloud cloud() {
        return new CloudFactory().getCloud();
    }
    
}
