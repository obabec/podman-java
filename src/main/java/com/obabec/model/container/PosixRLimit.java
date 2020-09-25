package com.obabec.model.container;

public class PosixRLimit {
    private int hard;
    private int soft;
    private String type;

    public PosixRLimit(int hard, int soft, String type) {
        this.hard = hard;
        this.soft = soft;
        this.type = type;
    }

    public int getHard() {
        return hard;
    }

    public void setHard(int hard) {
        this.hard = hard;
    }

    public int getSoft() {
        return soft;
    }

    public void setSoft(int soft) {
        this.soft = soft;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
