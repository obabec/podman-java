package com.obabec.model.container;

import java.util.ArrayList;
import java.util.List;

public class HealthConfig {
    int interval;
    int retries;
    int startPeriod;
    List<String> test;
    int timeout;

    public HealthConfig(int interval, int retries, int startPeriod, List<String> test, int timeout) {
        this.interval = interval;
        this.retries = retries;
        this.startPeriod = startPeriod;
        this.test = test;
        this.timeout = timeout;
    }

    public static HealthConfig getDefault() {
        return new HealthConfig(0, 0. 0, new ArrayList<String>(), 0);
    }
}
