package com.obabec.model.container.linux;

public class LinuxThrottleDevice {
    private int major;
    private int minor;
    private int rate;

    public LinuxThrottleDevice(int major, int minor, int rate) {
        this.major = major;
        this.minor = minor;
        this.rate = rate;
    }

    public int getMajor() {
        return major;
    }

    public void setMajor(int major) {
        this.major = major;
    }

    public int getMinor() {
        return minor;
    }

    public void setMinor(int minor) {
        this.minor = minor;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
