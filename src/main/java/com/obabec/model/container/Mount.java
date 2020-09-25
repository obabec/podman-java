package com.obabec.model.container;

import java.util.List;

public class Mount {
    private String destination;
    private List<String> options;
    private String source;
    private String type;

    public Mount(String destination, List<String> options, String source, String type) {
        this.destination = destination;
        this.options = options;
        this.source = source;
        this.type = type;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
