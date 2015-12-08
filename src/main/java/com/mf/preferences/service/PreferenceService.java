package com.mf.preferences.service;

import java.util.HashMap;

import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.stereotype.Service;

import com.mf.preferences.domain.Preferences;

@Service
public class PreferenceService {
	
	private String[][] prefData = {{"mark@mf.com","no"},
			{"fergie@mf.com","yes"},
			{"xander@mf.com","yes"},
			{"speedy.gonzals@mf.com","no"}
			};
	
	public PreferenceService() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(PreferenceService.class);
	
	@Autowired
	private CounterService counterService;
	
	//@Trace(metricName="Getting Preferences",dispatcher=true)
	public HashMap<String, String> getPreferences(String partyReference) {
		int index =0;
		if (partyReference.startsWith("1"))
			index=0;
		else if (partyReference.startsWith("2"))
			index=1;
		else
			index=2;

		
		Preferences prefs = new Preferences();
		prefs.setPartyReference(partyReference);
		prefs.setPreference("email.address", prefData[index][0]);
		prefs.setPreference("email.permission", prefData[index][1]);
		return prefs.getPreferences();
	}
	
	//@Trace(metricName="Getting Preferences (Slow)",dispatcher=true)
	public HashMap<String, String> getPreferencesSlow(String partyReference) {
		Preferences prefs = new Preferences();
		prefs.setPartyReference(partyReference);
		prefs.setPreference("email.address", prefData[3][0]);
		prefs.setPreference("email.permission", prefData[3][1]);
		return prefs.getPreferences();
	}

	@PreDestroy
	public void cleanUp() {
		LOGGER.info("*** PreferenceService - SHUTDOWN ***");
	}
}
