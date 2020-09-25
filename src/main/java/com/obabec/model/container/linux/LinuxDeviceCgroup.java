package com.obabec.model.container.linux;

public class LinuxDeviceCgroup {
    private String access;
    private boolean allow;
    private int major;
    private int minor;
    private String type;

    public LinuxDeviceCgroup(String access, boolean allow, int major, int minor, String type) {
        this.access = access;
        this.allow = allow;
        this.major = major;
        this.minor = minor;
        this.type = type;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public boolean isAllow() {
        return allow;
    }

    public void setAllow(boolean allow) {
        this.allow = allow;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
