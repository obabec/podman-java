package com.obabec.model.container.linux;

import java.util.List;
import java.util.Map;

public class LinuxResources {
    LinuxBlockIO blockIO;
    LinuxCPU cpu;
    List<LinuxDeviceCgroup> devices;
    List<LinuxHugepageLimit> hugepageLimits;
    LinuxMemory memory;
    LinuxNetwork network;
    LinuxPids pids;
    Map<String, LinuxRdma> rdma;
    Map<String, String> unified;
}
