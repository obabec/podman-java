package com.obabec.model.container;

public class Namespace {
    private String nsMode;
    private String string;

    public Namespace(String nsMode, String string) {
        this.nsMode = nsMode;
        this.string = string;
    }

    public String getNsMode() {
        return nsMode;
    }

    public void setNsMode(String nsMode) {
        this.nsMode = nsMode;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
