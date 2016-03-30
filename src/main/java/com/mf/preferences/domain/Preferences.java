package com.mf.preferences.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.*;

public class Preferences implements Serializable {

	public Preferences() {
		preferences = new HashMap<>();
	}

	@NotNull
	private String PartyReference;

	private final Map<String, String> preferencess;
	
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

	public Map<String, String> getPreferences() {
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
		StringBuilder sb=new StringBuilder();
		sb.append(PartyReference).append(" - ").append(preferences.toString());
		return sb.toString();
	}
}
