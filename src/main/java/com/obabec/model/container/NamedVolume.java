package com.obabec.model.container;

import java.util.List;

public class NamedVolume {
    private String dest;
    private String name;
    private List<String> options;

    public NamedVolume(String dest, String name, List<String> options) {
        this.dest = dest;
        this.name = name;
        this.options = options;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
}
