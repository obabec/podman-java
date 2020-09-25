package com.obabec.model.container;

import java.util.Map;

public class LogConfig {
    private String driver;
    private Map<String, String> options;
    private String path;

    public LogConfig(String driver, Map<String, String> options, String path) {
        this.driver = driver;
        this.options = options;
        this.path = path;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(Map<String, String> options) {
        this.options = options;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
