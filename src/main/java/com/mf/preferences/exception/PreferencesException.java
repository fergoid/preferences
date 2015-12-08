package com.mf.preferences.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mf.preferences.exception.BusinessException;


public class PreferencesException implements BusinessException<Throwable> {

    private static final Logger LOGGER = LoggerFactory.getLogger(PreferencesException.class);

	@Override
	public void logException(Throwable exception) {
		LOGGER.error("*** Preferences Service Exception " + exception.getMessage());
	}
}
