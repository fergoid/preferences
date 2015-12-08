package com.mf.preferences;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "counter.PreferenceService.getPreferences.invoked",
		"counter.PreferencesController.getPreferences.completed",
		"counter.PreferencesController.getPreferences.started",
		"counter.status.200.preference",
		"counter.status.200.preference.manage.info",
		"counter.status.200.preference.manage.metrics",
		"counter.status.200.preference.root", "gauge.response.preference",
		"gauge.response.preference.manage.info",
		"gauge.response.preference.manage.metrics",
		"gauge.response.preference.root", "mem", "mem.free", "processors",
		"uptime", "instance.uptime", "heap.committed", "heap.init",
		"heap.used", "heap", "threads.peak", "threads.daemon", "threads",
		"classes", "classes.loaded", "classes.unloaded",
		"gc.ps_scavenge.count", "gc.ps_scavenge.time", "gc.ps_marksweep.count",
		"gc.ps_marksweep.time" })
public class Metrics {
	@JsonProperty("counter.PreferenceService.getPreferences.invoked")
	private Integer counterPreferenceServiceGetPreferencesInvoked;
	@JsonProperty("counter.PreferencesController.getPreferences.completed")
	private Integer counterPreferencesControllerGetPreferencesCompleted;
	@JsonProperty("counter.PreferencesController.getPreferences.started")
	private Integer counterPreferencesControllerGetPreferencesStarted;
	@JsonProperty("counter.status.200.preference")
	private Integer counterStatus200Preference;
	@JsonProperty("counter.status.200.preference.manage.info")
	private Integer counterStatus200PreferenceManageInfo;
	@JsonProperty("counter.status.200.preference.manage.metrics")
	private Integer counterStatus200PreferenceManageMetrics;
	@JsonProperty("counter.status.200.preference.root")
	private Integer counterStatus200PreferenceRoot;
	@JsonProperty("gauge.response.preference")
	private Integer gaugeResponsePreference;
	@JsonProperty("gauge.response.preference.manage.info")
	private Integer gaugeResponsePreferenceManageInfo;
	@JsonProperty("gauge.response.preference.manage.metrics")
	private Integer gaugeResponsePreferenceManageMetrics;
	@JsonProperty("gauge.response.preference.root")
	private Integer gaugeResponsePreferenceRoot;
	@JsonProperty("mem")
	private Integer mem;
	@JsonProperty("mem.free")
	private Integer memFree;
	@JsonProperty("processors")
	private Integer processors;
	@JsonProperty("uptime")
	private Integer uptime;
	@JsonProperty("instance.uptime")
	private Integer instanceUptime;
	@JsonProperty("heap.committed")
	private Integer heapCommitted;
	@JsonProperty("heap.init")
	private Integer heapInit;
	@JsonProperty("heap.used")
	private Integer heapUsed;
	@JsonProperty("heap")
	private Integer heap;
	@JsonProperty("threads.peak")
	private Integer threadsPeak;
	@JsonProperty("threads.daemon")
	private Integer threadsDaemon;
	@JsonProperty("threads")
	private Integer threads;
	@JsonProperty("classes")
	private Integer classes;
	@JsonProperty("classes.loaded")
	private Integer classesLoaded;
	@JsonProperty("classes.unloaded")
	private Integer classesUnloaded;
	@JsonProperty("gc.ps_scavenge.count")
	private Integer gcPsScavengeCount;
	@JsonProperty("gc.ps_scavenge.time")
	private Integer gcPsScavengeTime;
	@JsonProperty("gc.ps_marksweep.count")
	private Integer gcPsMarksweepCount;
	@JsonProperty("gc.ps_marksweep.time")
	private Integer gcPsMarksweepTime;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The counterPreferenceServiceGetPreferencesInvoked
	 */
	@JsonProperty("counter.PreferenceService.getPreferences.invoked")
	public Integer getCounterPreferenceServiceGetPreferencesInvoked() {
		return counterPreferenceServiceGetPreferencesInvoked;
	}

	/**
	 * 
	 * @param counterPreferenceServiceGetPreferencesInvoked
	 *            The counter.PreferenceService.getPreferences.invoked
	 */
	@JsonProperty("counter.PreferenceService.getPreferences.invoked")
	public void setCounterPreferenceServiceGetPreferencesInvoked(
			Integer counterPreferenceServiceGetPreferencesInvoked) {
		this.counterPreferenceServiceGetPreferencesInvoked = counterPreferenceServiceGetPreferencesInvoked;
	}

	/**
	 * 
	 * @return The counterPreferencesControllerGetPreferencesCompleted
	 */
	@JsonProperty("counter.PreferencesController.getPreferences.completed")
	public Integer getCounterPreferencesControllerGetPreferencesCompleted() {
		return counterPreferencesControllerGetPreferencesCompleted;
	}

	/**
	 * 
	 * @param counterPreferencesControllerGetPreferencesCompleted
	 *            The counter.PreferencesController.getPreferences.completed
	 */
	@JsonProperty("counter.PreferencesController.getPreferences.completed")
	public void setCounterPreferencesControllerGetPreferencesCompleted(
			Integer counterPreferencesControllerGetPreferencesCompleted) {
		this.counterPreferencesControllerGetPreferencesCompleted = counterPreferencesControllerGetPreferencesCompleted;
	}

	/**
	 * 
	 * @return The counterPreferencesControllerGetPreferencesStarted
	 */
	@JsonProperty("counter.PreferencesController.getPreferences.started")
	public Integer getCounterPreferencesControllerGetPreferencesStarted() {
		return counterPreferencesControllerGetPreferencesStarted;
	}

	/**
	 * 
	 * @param counterPreferencesControllerGetPreferencesStarted
	 *            The counter.PreferencesController.getPreferences.started
	 */
	@JsonProperty("counter.PreferencesController.getPreferences.started")
	public void setCounterPreferencesControllerGetPreferencesStarted(
			Integer counterPreferencesControllerGetPreferencesStarted) {
		this.counterPreferencesControllerGetPreferencesStarted = counterPreferencesControllerGetPreferencesStarted;
	}

	/**
	 * 
	 * @return The counterStatus200Preference
	 */
	@JsonProperty("counter.status.200.preference")
	public Integer getCounterStatus200Preference() {
		return counterStatus200Preference;
	}

	/**
	 * 
	 * @param counterStatus200Preference
	 *            The counter.status.200.preference
	 */
	@JsonProperty("counter.status.200.preference")
	public void setCounterStatus200Preference(Integer counterStatus200Preference) {
		this.counterStatus200Preference = counterStatus200Preference;
	}

	/**
	 * 
	 * @return The counterStatus200PreferenceManageInfo
	 */
	@JsonProperty("counter.status.200.preference.manage.info")
	public Integer getCounterStatus200PreferenceManageInfo() {
		return counterStatus200PreferenceManageInfo;
	}

	/**
	 * 
	 * @param counterStatus200PreferenceManageInfo
	 *            The counter.status.200.preference.manage.info
	 */
	@JsonProperty("counter.status.200.preference.manage.info")
	public void setCounterStatus200PreferenceManageInfo(
			Integer counterStatus200PreferenceManageInfo) {
		this.counterStatus200PreferenceManageInfo = counterStatus200PreferenceManageInfo;
	}

	/**
	 * 
	 * @return The counterStatus200PreferenceManageMetrics
	 */
	@JsonProperty("counter.status.200.preference.manage.metrics")
	public Integer getCounterStatus200PreferenceManageMetrics() {
		return counterStatus200PreferenceManageMetrics;
	}

	/**
	 * 
	 * @param counterStatus200PreferenceManageMetrics
	 *            The counter.status.200.preference.manage.metrics
	 */
	@JsonProperty("counter.status.200.preference.manage.metrics")
	public void setCounterStatus200PreferenceManageMetrics(
			Integer counterStatus200PreferenceManageMetrics) {
		this.counterStatus200PreferenceManageMetrics = counterStatus200PreferenceManageMetrics;
	}

	/**
	 * 
	 * @return The counterStatus200PreferenceRoot
	 */
	@JsonProperty("counter.status.200.preference.root")
	public Integer getCounterStatus200PreferenceRoot() {
		return counterStatus200PreferenceRoot;
	}

	/**
	 * 
	 * @param counterStatus200PreferenceRoot
	 *            The counter.status.200.preference.root
	 */
	@JsonProperty("counter.status.200.preference.root")
	public void setCounterStatus200PreferenceRoot(
			Integer counterStatus200PreferenceRoot) {
		this.counterStatus200PreferenceRoot = counterStatus200PreferenceRoot;
	}

	/**
	 * 
	 * @return The gaugeResponsePreference
	 */
	@JsonProperty("gauge.response.preference")
	public Integer getGaugeResponsePreference() {
		return gaugeResponsePreference;
	}

	/**
	 * 
	 * @param gaugeResponsePreference
	 *            The gauge.response.preference
	 */
	@JsonProperty("gauge.response.preference")
	public void setGaugeResponsePreference(Integer gaugeResponsePreference) {
		this.gaugeResponsePreference = gaugeResponsePreference;
	}

	/**
	 * 
	 * @return The gaugeResponsePreferenceManageInfo
	 */
	@JsonProperty("gauge.response.preference.manage.info")
	public Integer getGaugeResponsePreferenceManageInfo() {
		return gaugeResponsePreferenceManageInfo;
	}

	/**
	 * 
	 * @param gaugeResponsePreferenceManageInfo
	 *            The gauge.response.preference.manage.info
	 */
	@JsonProperty("gauge.response.preference.manage.info")
	public void setGaugeResponsePreferenceManageInfo(
			Integer gaugeResponsePreferenceManageInfo) {
		this.gaugeResponsePreferenceManageInfo = gaugeResponsePreferenceManageInfo;
	}

	/**
	 * 
	 * @return The gaugeResponsePreferenceManageMetrics
	 */
	@JsonProperty("gauge.response.preference.manage.metrics")
	public Integer getGaugeResponsePreferenceManageMetrics() {
		return gaugeResponsePreferenceManageMetrics;
	}

	/**
	 * 
	 * @param gaugeResponsePreferenceManageMetrics
	 *            The gauge.response.preference.manage.metrics
	 */
	@JsonProperty("gauge.response.preference.manage.metrics")
	public void setGaugeResponsePreferenceManageMetrics(
			Integer gaugeResponsePreferenceManageMetrics) {
		this.gaugeResponsePreferenceManageMetrics = gaugeResponsePreferenceManageMetrics;
	}

	/**
	 * 
	 * @return The gaugeResponsePreferenceRoot
	 */
	@JsonProperty("gauge.response.preference.root")
	public Integer getGaugeResponsePreferenceRoot() {
		return gaugeResponsePreferenceRoot;
	}

	/**
	 * 
	 * @param gaugeResponsePreferenceRoot
	 *            The gauge.response.preference.root
	 */
	@JsonProperty("gauge.response.preference.root")
	public void setGaugeResponsePreferenceRoot(
			Integer gaugeResponsePreferenceRoot) {
		this.gaugeResponsePreferenceRoot = gaugeResponsePreferenceRoot;
	}

	/**
	 * 
	 * @return The mem
	 */
	@JsonProperty("mem")
	public Integer getMem() {
		return mem;
	}

	/**
	 * 
	 * @param mem
	 *            The mem
	 */
	@JsonProperty("mem")
	public void setMem(Integer mem) {
		this.mem = mem;
	}

	/**
	 * 
	 * @return The memFree
	 */
	@JsonProperty("mem.free")
	public Integer getMemFree() {
		return memFree;
	}

	/**
	 * 
	 * @param memFree
	 *            The mem.free
	 */
	@JsonProperty("mem.free")
	public void setMemFree(Integer memFree) {
		this.memFree = memFree;
	}

	/**
	 * 
	 * @return The processors
	 */
	@JsonProperty("processors")
	public Integer getProcessors() {
		return processors;
	}

	/**
	 * 
	 * @param processors
	 *            The processors
	 */
	@JsonProperty("processors")
	public void setProcessors(Integer processors) {
		this.processors = processors;
	}

	/**
	 * 
	 * @return The uptime
	 */
	@JsonProperty("uptime")
	public Integer getUptime() {
		return uptime;
	}

	/**
	 * 
	 * @param uptime
	 *            The uptime
	 */
	@JsonProperty("uptime")
	public void setUptime(Integer uptime) {
		this.uptime = uptime;
	}

	/**
	 * 
	 * @return The instanceUptime
	 */
	@JsonProperty("instance.uptime")
	public Integer getInstanceUptime() {
		return instanceUptime;
	}

	/**
	 * 
	 * @param instanceUptime
	 *            The instance.uptime
	 */
	@JsonProperty("instance.uptime")
	public void setInstanceUptime(Integer instanceUptime) {
		this.instanceUptime = instanceUptime;
	}

	/**
	 * 
	 * @return The heapCommitted
	 */
	@JsonProperty("heap.committed")
	public Integer getHeapCommitted() {
		return heapCommitted;
	}

	/**
	 * 
	 * @param heapCommitted
	 *            The heap.committed
	 */
	@JsonProperty("heap.committed")
	public void setHeapCommitted(Integer heapCommitted) {
		this.heapCommitted = heapCommitted;
	}

	/**
	 * 
	 * @return The heapInit
	 */
	@JsonProperty("heap.init")
	public Integer getHeapInit() {
		return heapInit;
	}

	/**
	 * 
	 * @param heapInit
	 *            The heap.init
	 */
	@JsonProperty("heap.init")
	public void setHeapInit(Integer heapInit) {
		this.heapInit = heapInit;
	}

	/**
	 * 
	 * @return The heapUsed
	 */
	@JsonProperty("heap.used")
	public Integer getHeapUsed() {
		return heapUsed;
	}

	/**
	 * 
	 * @param heapUsed
	 *            The heap.used
	 */
	@JsonProperty("heap.used")
	public void setHeapUsed(Integer heapUsed) {
		this.heapUsed = heapUsed;
	}

	/**
	 * 
	 * @return The heap
	 */
	@JsonProperty("heap")
	public Integer getHeap() {
		return heap;
	}

	/**
	 * 
	 * @param heap
	 *            The heap
	 */
	@JsonProperty("heap")
	public void setHeap(Integer heap) {
		this.heap = heap;
	}

	/**
	 * 
	 * @return The threadsPeak
	 */
	@JsonProperty("threads.peak")
	public Integer getThreadsPeak() {
		return threadsPeak;
	}

	/**
	 * 
	 * @param threadsPeak
	 *            The threads.peak
	 */
	@JsonProperty("threads.peak")
	public void setThreadsPeak(Integer threadsPeak) {
		this.threadsPeak = threadsPeak;
	}

	/**
	 * 
	 * @return The threadsDaemon
	 */
	@JsonProperty("threads.daemon")
	public Integer getThreadsDaemon() {
		return threadsDaemon;
	}

	/**
	 * 
	 * @param threadsDaemon
	 *            The threads.daemon
	 */
	@JsonProperty("threads.daemon")
	public void setThreadsDaemon(Integer threadsDaemon) {
		this.threadsDaemon = threadsDaemon;
	}

	/**
	 * 
	 * @return The threads
	 */
	@JsonProperty("threads")
	public Integer getThreads() {
		return threads;
	}

	/**
	 * 
	 * @param threads
	 *            The threads
	 */
	@JsonProperty("threads")
	public void setThreads(Integer threads) {
		this.threads = threads;
	}

	/**
	 * 
	 * @return The classes
	 */
	@JsonProperty("classes")
	public Integer getClasses() {
		return classes;
	}

	/**
	 * 
	 * @param classes
	 *            The classes
	 */
	@JsonProperty("classes")
	public void setClasses(Integer classes) {
		this.classes = classes;
	}

	/**
	 * 
	 * @return The classesLoaded
	 */
	@JsonProperty("classes.loaded")
	public Integer getClassesLoaded() {
		return classesLoaded;
	}

	/**
	 * 
	 * @param classesLoaded
	 *            The classes.loaded
	 */
	@JsonProperty("classes.loaded")
	public void setClassesLoaded(Integer classesLoaded) {
		this.classesLoaded = classesLoaded;
	}

	/**
	 * 
	 * @return The classesUnloaded
	 */
	@JsonProperty("classes.unloaded")
	public Integer getClassesUnloaded() {
		return classesUnloaded;
	}

	/**
	 * 
	 * @param classesUnloaded
	 *            The classes.unloaded
	 */
	@JsonProperty("classes.unloaded")
	public void setClassesUnloaded(Integer classesUnloaded) {
		this.classesUnloaded = classesUnloaded;
	}

	/**
	 * 
	 * @return The gcPsScavengeCount
	 */
	@JsonProperty("gc.ps_scavenge.count")
	public Integer getGcPsScavengeCount() {
		return gcPsScavengeCount;
	}

	/**
	 * 
	 * @param gcPsScavengeCount
	 *            The gc.ps_scavenge.count
	 */
	@JsonProperty("gc.ps_scavenge.count")
	public void setGcPsScavengeCount(Integer gcPsScavengeCount) {
		this.gcPsScavengeCount = gcPsScavengeCount;
	}

	/**
	 * 
	 * @return The gcPsScavengeTime
	 */
	@JsonProperty("gc.ps_scavenge.time")
	public Integer getGcPsScavengeTime() {
		return gcPsScavengeTime;
	}

	/**
	 * 
	 * @param gcPsScavengeTime
	 *            The gc.ps_scavenge.time
	 */
	@JsonProperty("gc.ps_scavenge.time")
	public void setGcPsScavengeTime(Integer gcPsScavengeTime) {
		this.gcPsScavengeTime = gcPsScavengeTime;
	}

	/**
	 * 
	 * @return The gcPsMarksweepCount
	 */
	@JsonProperty("gc.ps_marksweep.count")
	public Integer getGcPsMarksweepCount() {
		return gcPsMarksweepCount;
	}

	/**
	 * 
	 * @param gcPsMarksweepCount
	 *            The gc.ps_marksweep.count
	 */
	@JsonProperty("gc.ps_marksweep.count")
	public void setGcPsMarksweepCount(Integer gcPsMarksweepCount) {
		this.gcPsMarksweepCount = gcPsMarksweepCount;
	}

	/**
	 * 
	 * @return The gcPsMarksweepTime
	 */
	@JsonProperty("gc.ps_marksweep.time")
	public Integer getGcPsMarksweepTime() {
		return gcPsMarksweepTime;
	}

	/**
	 * 
	 * @param gcPsMarksweepTime
	 *            The gc.ps_marksweep.time
	 */
	@JsonProperty("gc.ps_marksweep.time")
	public void setGcPsMarksweepTime(Integer gcPsMarksweepTime) {
		this.gcPsMarksweepTime = gcPsMarksweepTime;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
