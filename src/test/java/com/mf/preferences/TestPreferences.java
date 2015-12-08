package com.mf.preferences;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mf.preferences.domain.Preferences;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TestPreferences extends Preferences {

	private static final long serialVersionUID = -4797187944171997505L;

}
