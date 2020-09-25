package com.obabec.model.container.linux;

import java.util.List;

public class LinuxBlockIO {
    private int leafWeight;
    private List<LinuxThrottleDevice> throttleReadBpsDevice;
    private List<LinuxThrottleDevice> throttleReadIOPSDevice;
    private List<LinuxThrottleDevice> throttleWriteBpsDevice;
    private List<LinuxThrottleDevice> throttleWriteIOPSDevice;
    private int weight;
    private List<LinuxWeightDevice> weightDevice;

    public LinuxBlockIO(int leafWeight, List<LinuxThrottleDevice> throttleReadBpsDevice,
                        List<LinuxThrottleDevice> throttleReadIOPSDevice,
                        List<LinuxThrottleDevice> throttleWriteBpsDevice,
                        List<LinuxThrottleDevice> throttleWriteIOPSDevice,
                        int weight, List<LinuxWeightDevice> weightDevice) {
        this.leafWeight = leafWeight;
        this.throttleReadBpsDevice = throttleReadBpsDevice;
        this.throttleReadIOPSDevice = throttleReadIOPSDevice;
        this.throttleWriteBpsDevice = throttleWriteBpsDevice;
        this.throttleWriteIOPSDevice = throttleWriteIOPSDevice;
        this.weight = weight;
        this.weightDevice = weightDevice;
    }

    public int getLeafWeight() {
        return leafWeight;
    }

    public void setLeafWeight(int leafWeight) {
        this.leafWeight = leafWeight;
    }

    public List<LinuxThrottleDevice> getThrottleReadBpsDevice() {
        return throttleReadBpsDevice;
    }

    public void setThrottleReadBpsDevice(List<LinuxThrottleDevice> throttleReadBpsDevice) {
        this.throttleReadBpsDevice = throttleReadBpsDevice;
    }

    public List<LinuxThrottleDevice> getThrottleReadIOPSDevice() {
        return throttleReadIOPSDevice;
    }

    public void setThrottleReadIOPSDevice(List<LinuxThrottleDevice> throttleReadIOPSDevice) {
        this.throttleReadIOPSDevice = throttleReadIOPSDevice;
    }

    public List<LinuxThrottleDevice> getThrottleWriteBpsDevice() {
        return throttleWriteBpsDevice;
    }

    public void setThrottleWriteBpsDevice(List<LinuxThrottleDevice> throttleWriteBpsDevice) {
        this.throttleWriteBpsDevice = throttleWriteBpsDevice;
    }

    public List<LinuxThrottleDevice> getThrottleWriteIOPSDevice() {
        return throttleWriteIOPSDevice;
    }

    public void setThrottleWriteIOPSDevice(List<LinuxThrottleDevice> throttleWriteIOPSDevice) {
        this.throttleWriteIOPSDevice = throttleWriteIOPSDevice;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<LinuxWeightDevice> getWeightDevice() {
        return weightDevice;
    }

    public void setWeightDevice(List<LinuxWeightDevice> weightDevice) {
        this.weightDevice = weightDevice;
    }
}
