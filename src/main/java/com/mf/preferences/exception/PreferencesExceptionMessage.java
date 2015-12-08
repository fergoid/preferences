package com.mf.preferences.exception;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mf.preferences.exception.BusinessException;
import com.mf.preferences.exception.PreferencesException;

public class PreferencesExceptionMessage implements BusinessException<String>{
    private static final Logger LOGGER = LoggerFactory.getLogger(PreferencesException.class);

	@Override
	public void logException(String exception) {
		LOGGER.error("*** Preferences Service Exception " + exception);
	}
	

}
