package com.mf.preferences.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mf.preferences.domain.Preferences;
import com.mf.preferences.exception.PreferencesExceptionMessage;
import com.mf.preferences.service.PreferenceService;

@RestController
public class PreferencesController {

	private static final Logger LOGGER = LoggerFactory.getLogger(PreferencesController.class);

	@Autowired
	PreferenceService preferenceService;

	@Autowired
	private CounterService counterService;

	private ArrayList<String> strings = new ArrayList<String>(999);

	@RequestMapping(value = "/preference/{partyReference}", method = RequestMethod.GET)
	public ResponseEntity<Preferences> getPreferences(@PathVariable String partyReference) {
		HttpStatus returnCode = HttpStatus.OK;
		Preferences prefs = new Preferences();
		Map<String, String> entries = preferenceService.getPreferences(partyReference);
		prefs.setPartyReference(partyReference);
		prefs.setPreferences(entries);
		LOGGER.info("returning " + prefs.toString());
		counterService.increment("preference-count");
		returnCode = HttpStatus.OK;
		return new ResponseEntity<Preferences>(prefs, returnCode);
	}

	@RequestMapping(value = "/preference-slow/{partyReference}", method = RequestMethod.GET)
	public ResponseEntity<Preferences> getPreferencesSlow(@PathVariable String partyReference) {
		HttpStatus returnCode = HttpStatus.OK;
		PreferencesExceptionMessage except = new PreferencesExceptionMessage();
		Preferences prefs = new Preferences();
		try {
			int waitTime = new Random().nextInt(15000);
			LOGGER.info("Waiting for " + waitTime);
			Thread.sleep(waitTime); // Random wait up to 15 seconds
			HashMap<String, String> entries = preferenceService.getPreferencesSlow(partyReference);
			prefs.setPartyReference(partyReference);
			prefs.setPreferences(entries);
			LOGGER.info("returning " + prefs.toString());
			counterService.increment("preference-slow-count");
			returnCode = HttpStatus.OK;
		} catch (Exception e) {
			except.logException("Unable To Process Request for Party " + partyReference);
			returnCode = HttpStatus.NOT_FOUND;
			// throw e;
		}

		return new ResponseEntity<Preferences>(prefs, returnCode);
	}

	@RequestMapping(value = "/preference-notfound/{partyReference}", method = RequestMethod.GET)
	public ResponseEntity<Preferences> getPreferencesNotFound(@PathVariable String partyReference) {
		HttpStatus returnCode = HttpStatus.OK;
		PreferencesExceptionMessage except = new PreferencesExceptionMessage();
		Preferences prefs = new Preferences();
		except.logException("Party " + partyReference + " Not Found");
		counterService.increment("preference-notfound-count");
		returnCode = HttpStatus.NOT_FOUND;
		return new ResponseEntity<Preferences>(prefs, returnCode);
	}

	@RequestMapping(value = "/preference-memory/{partyReference}", method = RequestMethod.GET)
	public ResponseEntity<Preferences> getPreferencesMemory(@PathVariable String partyReference) {
		HttpStatus returnCode = HttpStatus.OK;
		Preferences prefs = new Preferences();
		if (partyReference.equalsIgnoreCase("999")) { // MEMORY USAGE
			StringBuffer sb1 = new StringBuffer();
			for (int i = 0; i < 255; i++) {
				StringBuffer sb = new StringBuffer(i);
				sb1.append(sb);
			}
			int[] i = new int[Integer.MAX_VALUE];
			counterService.increment("preference-memory-count");
			returnCode = HttpStatus.OK;
		}

		return new ResponseEntity<Preferences>(prefs, returnCode);
	}

}
