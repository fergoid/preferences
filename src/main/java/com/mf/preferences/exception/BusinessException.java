package com.mf.preferences.exception;

public interface BusinessException<T> {
	public void logException(T exception);
}
