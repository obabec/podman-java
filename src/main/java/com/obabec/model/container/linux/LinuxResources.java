package com.obabec.model.container.linux;

import java.util.List;
import java.util.Map;

public class LinuxResources {
    private LinuxBlockIO blockIO;
    private LinuxCPU cpu;
    private List<LinuxDeviceCgroup> devices;
    private List<LinuxHugepageLimit> hugepageLimits;
    private LinuxMemory memory;
    private LinuxNetwork network;
    private LinuxPids pids;
    private Map<String, LinuxRdma> rdma;
    private Map<String, String> unified;

    public LinuxResources(LinuxBlockIO blockIO, LinuxCPU cpu, List<LinuxDeviceCgroup> devices,
                          List<LinuxHugepageLimit> hugepageLimits, LinuxMemory memory, LinuxNetwork network,
                          LinuxPids pids, Map<String, LinuxRdma> rdma, Map<String, String> unified) {
        this.blockIO = blockIO;
        this.cpu = cpu;
        this.devices = devices;
        this.hugepageLimits = hugepageLimits;
        this.memory = memory;
        this.network = network;
        this.pids = pids;
        this.rdma = rdma;
        this.unified = unified;
    }

    public LinuxBlockIO getBlockIO() {
        return blockIO;
    }

    public void setBlockIO(LinuxBlockIO blockIO) {
        this.blockIO = blockIO;
    }

    public LinuxCPU getCpu() {
        return cpu;
    }

    public void setCpu(LinuxCPU cpu) {
        this.cpu = cpu;
    }

    public List<LinuxDeviceCgroup> getDevices() {
        return devices;
    }

    public void setDevices(List<LinuxDeviceCgroup> devices) {
        this.devices = devices;
    }

    public List<LinuxHugepageLimit> getHugepageLimits() {
        return hugepageLimits;
    }

    public void setHugepageLimits(List<LinuxHugepageLimit> hugepageLimits) {
        this.hugepageLimits = hugepageLimits;
    }

    public LinuxMemory getMemory() {
        return memory;
    }

    public void setMemory(LinuxMemory memory) {
        this.memory = memory;
    }

    public LinuxNetwork getNetwork() {
        return network;
    }

    public void setNetwork(LinuxNetwork network) {
        this.network = network;
    }

    public LinuxPids getPids() {
        return pids;
    }

    public void setPids(LinuxPids pids) {
        this.pids = pids;
    }

    public Map<String, LinuxRdma> getRdma() {
        return rdma;
    }

    public void setRdma(Map<String, LinuxRdma> rdma) {
        this.rdma = rdma;
    }

    public Map<String, String> getUnified() {
        return unified;
    }

    public void setUnified(Map<String, String> unified) {
        this.unified = unified;
    }
}
