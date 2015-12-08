package com.mf.preferences;

import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mf.preferences.Application;
import com.mf.preferences.domain.Preferences;
import com.mf.preferences.service.PreferenceService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ApplicationTests {


	@Autowired
	PreferenceService preferenceService;
	
	@Test
	public void testSavePrefs(){
		Preferences prefs = new Preferences();
		prefs.setPartyReference("12345678");
		prefs.setPreference("email", "yes");
		prefs.setPreference("email.address", "mr12345678@fil.com");
		prefs.setPreference("mobile", "no");
		prefs.setPreference("mobile phone", "012345 7891234");
		//preferenceService.savePreferences(prefs);
		System.out.println(prefs.toString());
		HashMap<String, String> read = preferenceService.getPreferences("12345678");
		
	}

}
