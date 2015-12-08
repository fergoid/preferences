package com.mf.preferences.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

public class Preferences implements Serializable {

	public Preferences() {
		preferences = new HashMap<String, String>();
	}

	@NotNull
	private String PartyReference;

	private HashMap<String, String> preferences;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4106812037829934515L;

	public String getPartyReference() {
		return PartyReference;
	}

	public void setPartyReference(String partyReference) {
		PartyReference = partyReference;
	}

	public HashMap<String, String> getPreferences() {
		return preferences;
	}

	public void setPreference(String key, String value) {
		preferences.put(key, value);
	}
	
	public void setPreferences(Map<String, String> prefs) {
		preferences.putAll(prefs);
	}

	@Override
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append(PartyReference).append(" - ").append(preferences.toString());
		return sb.toString();
	}
}
