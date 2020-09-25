package com.obabec.model.container.linux;

public class LinuxPids {
    private int limit;

    public LinuxPids(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
