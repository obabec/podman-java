package com.obabec.model.container.linux;

public class LinuxRdma {
    private int hcaHandlers;
    private int hcaObjects;

    public LinuxRdma(int hcaHandlers, int hcaObjects) {
        this.hcaHandlers = hcaHandlers;
        this.hcaObjects = hcaObjects;
    }

    public int getHcaObjects() {
        return hcaObjects;
    }

    public void setHcaObjects(int hcaObjects) {
        this.hcaObjects = hcaObjects;
    }
}
