package com.obabec.model.container.linux;

public class LinuxCPU {
    private String cpus;
    private String mems;
    private int period;
    private int quota;
    private int realtimePeriod;
    private int realtimeRuntime;
    private int shares;

    public LinuxCPU(String cpus, String mems, int period, int quota,
                    int realtimePeriod, int realtimeRuntime, int shares) {
        this.cpus = cpus;
        this.mems = mems;
        this.period = period;
        this.quota = quota;
        this.realtimePeriod = realtimePeriod;
        this.realtimeRuntime = realtimeRuntime;
        this.shares = shares;
    }

    public String getCpus() {
        return cpus;
    }

    public void setCpus(String cpus) {
        this.cpus = cpus;
    }

    public String getMems() {
        return mems;
    }

    public void setMems(String mems) {
        this.mems = mems;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public int getRealtimePeriod() {
        return realtimePeriod;
    }

    public void setRealtimePeriod(int realtimePeriod) {
        this.realtimePeriod = realtimePeriod;
    }

    public int getRealtimeRuntime() {
        return realtimeRuntime;
    }

    public void setRealtimeRuntime(int realtimeRuntime) {
        this.realtimeRuntime = realtimeRuntime;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }
}
