package com.obabec.model.container;

import com.obabec.model.container.linux.LinuxDevice;
import com.obabec.model.container.linux.LinuxResources;
import com.obabec.model.container.linux.LinuxThrottleDevice;
import com.obabec.model.container.linux.LinuxWeightDevice;

import java.util.List;
import java.util.Map;

public class Container {
    Map<String, String> annotations;
    String appArmorProfile;

    List<String> capabilitiesAdd;
    List<String> capabilitiesDrop;

    // Policies
    String cgroupParent;
    Namespace cgroupNs;
    String cgroupMode;

    //Networks
    List<String> cniNetworks;

    List<String> command;
    String conmonPidFile;

    //Device settings
    List<String> containerCreateCommand;
    List<LinuxDevice> devices;

    //Dns settings
    List<String> dnsOption;
    List<String> dnsSearch;
    List<List<Integer>> dnsServer;

    List<String> entrypoint;

    //Environment vars
    Map<String, String> env;
    boolean envHost;

    //todo: expose

    List<String> groups;
    HealthConfig healthConfig;

    String hostname;


    String image;
    String imageVolumeMode;

    boolean init;
    String initPath;
    Namespace ipcns;

    Map<String, String> labels;
    LogConfig logConfiguration;

    String name;
    String namespace;

    Namespace netNs;
    Map<String, String> networkOptions;

    boolean noNewPrivileges;
    String ociRuntime;
    List<OverlayVolume> overlayVolumes;

    Namespace pidNs;

    List<PortMappings> portMappings;

    boolean privileged;

    List<String> procfsOpts;

    boolean publishImagePorts;
    List<PosixRLimit> rLimits;

    String rawImageName;
    boolean readOnlyFilesystem;
    boolean remove;

    LinuxResources resource_limits;
    String restartPolicy;
    int restartTries;
    String rootFs;
    String rootFsPropagation;
    String sdnotifyMode;
    String seccompPolicy;
    String seccompProfilePath;
    List<String> selinuxOpts;
    int[] staticIP;
    int[] staticIPv6;
    int[] staticMAC;

    boolean stdin;
    int stopSignal;
    int stopTimeout;

    Map<String, String> sysctl;
    String systemD;

    LinuxThrottleDevice throttleReadBpsDevice;
    LinuxThrottleDevice throttleReadIOPSDevice;
    LinuxThrottleDevice throttleWriteBpsDevice;
    LinuxThrottleDevice throttleWriteIOPSDevice;

    String timezone;
    String umask;

    boolean useImageHosts;
    boolean useImageResolveConf;
    Namespace userNs;
    Namespace utsNs;

    List<NamedVolume> volumes;
    List<String> volumesFrom;

    LinuxWeightDevice weightDevice;
    String workDir;

}
