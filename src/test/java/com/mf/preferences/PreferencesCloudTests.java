package com.mf.preferences;

import junit.framework.Assert;
import junit.framework.TestSuite;

import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class PreferencesCloudTests extends TestSuite {
	
	private final static String ROOT_URL ="http://preferences.paasnp.uk.fid-intl.com/preference"; 
	RestTemplate restTemplate;

	@Test
	public void testGetValidPreferences() {
		String parameters="?partyReference=12345678";
		StringBuffer myURL = new StringBuffer(ROOT_URL);
		myURL.append(parameters);
		TestPreferences retVal = restTemplate.getForObject(myURL.toString(), TestPreferences.class);
		assert(retVal.getPartyReference().equalsIgnoreCase("12345678"));
		assert(retVal.getPreferences().get("email.address") != null);
		assert(retVal.getPreferences().get("email.permission") != null);
		
	}
	
	@Test
	public void testGetEmptyPreferences() {
		String parameters="?partyReference=12345";
		StringBuffer myURL = new StringBuffer(ROOT_URL);
		myURL.append(parameters);
		TestPreferences retVal = restTemplate.getForObject(myURL.toString(), TestPreferences.class);
		assert(retVal.getPartyReference() == null);
		assert(retVal.getPreferences().get("email.address") == null);
		assert(retVal.getPreferences().get("email.permission") == null);
	}

	@Test
	public void testGetMetrics() {
		String parameters="/manage/metrics";
		StringBuffer myURL = new StringBuffer(ROOT_URL);
		myURL.append(parameters);
		Metrics retVal=restTemplate.getForObject(myURL.toString(), Metrics.class);
		System.out.println(retVal.getCounterPreferencesControllerGetPreferencesStarted().intValue());
		System.out.println(retVal.getCounterPreferencesControllerGetPreferencesCompleted().intValue());
		System.out.println(retVal.getMem().intValue());
		System.out.println(retVal.getMemFree().intValue());
		System.out.println(retVal.getHeap().intValue());
		System.out.println(retVal.getHeapCommitted().intValue());
	}
	
	@Test
	public void testCallPreferenceService() {
		for (int i=0; i<50; i++) {
			long beforeTime = System.currentTimeMillis();
			testGetValidPreferences();
			long afterTime = System.currentTimeMillis();
			Long timeTaken=new Long(afterTime-beforeTime);
			System.out.println("*** Call " + i + " took " + timeTaken.toString() + " milliseconds");
		}
	}
	
	@Before
	public void setUp() {
		restTemplate = new RestTemplate();
	}
}
