package com.obabec.model.container.linux;

public class LinuxDevice {
    private int fileMode;
    private int gid;
    private int major;
    private int minor;
    private String path;
    private String type;
    private int uid;

    public LinuxDevice(int fileMode, int gid, int major, int minor, String path, String type, int uid) {
        this.fileMode = fileMode;
        this.gid = gid;
        this.major = major;
        this.minor = minor;
        this.path = path;
        this.type = type;
        this.uid = uid;
    }

    public int getFileMode() {
        return fileMode;
    }

    public void setFileMode(int fileMode) {
        this.fileMode = fileMode;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
