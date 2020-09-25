package com.obabec.model.container;

import java.util.ArrayList;
import java.util.List;

public class HealthConfig {
    private int interval;
    private int retries;
    private int startPeriod;
    private List<String> test;
    private int timeout;

    public HealthConfig(int interval, int retries, int startPeriod, List<String> test, int timeout) {
        this.interval = interval;
        this.retries = retries;
        this.startPeriod = startPeriod;
        this.test = test;
        this.timeout = timeout;
    }

    public static HealthConfig getDefault() {
        return new HealthConfig(0, 0, 0, new ArrayList<String>(), 0);
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public int getRetries() {
        return retries;
    }

    public void setRetries(int retries) {
        this.retries = retries;
    }

    public int getStartPeriod() {
        return startPeriod;
    }

    public void setStartPeriod(int startPeriod) {
        this.startPeriod = startPeriod;
    }

    public List<String> getTest() {
        return test;
    }

    public void setTest(List<String> test) {
        this.test = test;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
