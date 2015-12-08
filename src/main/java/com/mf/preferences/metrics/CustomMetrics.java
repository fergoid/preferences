package com.mf.preferences.metrics;

import java.util.Collection;
import java.util.LinkedHashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.PublicMetrics;
import org.springframework.boot.actuate.metrics.Metric;

public class CustomMetrics implements PublicMetrics {

	@Autowired
	Integer instanceIndex;
	
	@Override
	public Collection<Metric<?>> metrics() {
		Collection<Metric<?>> result = new LinkedHashSet<Metric<?>>();
		result.add(new Metric<Integer>("applicationinstance", instanceIndex));
		return result;
	}

}
