package com.obabec.model.container.linux;

public class LinuxWeightDevice {
    private int leafWeight;
    private int major;
    private int minor;
    private int weight;

    public LinuxWeightDevice(int leafWeight, int major, int minor, int weight) {
        this.leafWeight = leafWeight;
        this.major = major;
        this.minor = minor;
        this.weight = weight;
    }

    public int getLeafWeight() {
        return leafWeight;
    }

    public void setLeafWeight(int leafWeight) {
        this.leafWeight = leafWeight;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
