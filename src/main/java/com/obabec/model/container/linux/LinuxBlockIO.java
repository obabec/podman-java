package com.obabec.model.container.linux;

import java.util.List;

public class LinuxBlockIO {
    int leafWeight;
    List<LinuxThrottleDevice> throttleReadBpsDevice;
    List<LinuxThrottleDevice> throttleReadIOPSDevice;
    List<LinuxThrottleDevice> throttleWriteBpsDevice;
    List<LinuxThrottleDevice> throttleWriteIOPSDevice;
    int weight;
    List<LinuxWeightDevice> weightDevice;

}
