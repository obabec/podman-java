package com.obabec.model.container;

import com.google.gson.annotations.SerializedName;
import com.obabec.model.container.id.IDMappingOptions;
import com.obabec.model.container.linux.LinuxDevice;
import com.obabec.model.container.linux.LinuxResources;
import com.obabec.model.container.linux.LinuxThrottleDevice;
import com.obabec.model.container.linux.LinuxWeightDevice;

import java.util.List;
import java.util.Map;

public class Container {
    private Map<String, String> annotations;
    @SerializedName("apparmor_profile")
    private String appArmorProfile;
    @SerializedName("cap_add")
    private List<String> capabilitiesAdd;
    @SerializedName("cap_drop")
    private List<String> capabilitiesDrop;

    // Policies
    @SerializedName("cgroup_parent")
    private String cgroupParent;
    @SerializedName("cgroupns")
    private Namespace cgroupNs;
    @SerializedName("cgroups_mode")
    private String cgroupMode;

    //Networks
    @SerializedName("cni_networks")
    private List<String> cniNetworks;


    private List<String> command;
    @SerializedName("common_pid_file")
    private String conmonPidFile;

    //Device settings
    private List<String> containerCreateCommand;
    private List<LinuxDevice> devices;

    //Dns settings
    @SerializedName("dns_option")
    private List<String> dnsOption;
    @SerializedName("dns_search")
    private List<String> dnsSearch;
    @SerializedName("dns_server")
    private List<List<Integer>> dnsServer;

    private List<String> entrypoint;

    //Environment vars
    private Map<String, String> env;
    @SerializedName("env_host")
    private boolean envHost;

    //todo: expose

    private List<String> groups;
    @SerializedName("healthconfig")
    private HealthConfig healthConfig;

    private String hostname;

    private IDMappingOptions idmappings;
    private String image;
    private String imageVolumeMode;

    private boolean init;
    private String initPath;
    private Namespace ipcns;

    private Map<String, String> labels;
    private LogConfig logConfiguration;

    private String name;
    private String namespace;

    private Namespace netNs;
    private Map<String, String> networkOptions;

    private boolean noNewPrivileges;
    private String ociRuntime;
    private List<OverlayVolume> overlayVolumes;

    private Namespace pidNs;

    private List<PortMappings> portMappings;

    private boolean privileged;

    private List<String> procfsOpts;

    private boolean publishImagePorts;
    private List<PosixRLimit> rLimits;

    private String rawImageName;
    private boolean readOnlyFilesystem;
    private boolean remove;

    private LinuxResources resourceLimits;
    private String restartPolicy;
    private int restartTries;
    private String rootFs;
    private String rootFsPropagation;
    private String sdnotifyMode;
    private String seccompPolicy;
    private String seccompProfilePath;
    private List<String> selinuxOpts;
    private int[] staticIP;
    private int[] staticIPv6;
    private int[] staticMAC;

    private boolean stdin;
    private int stopSignal;
    private int stopTimeout;

    private Map<String, String> sysctl;
    private String systemD;

    private LinuxThrottleDevice throttleReadBpsDevice;
    private LinuxThrottleDevice throttleReadIOPSDevice;
    private LinuxThrottleDevice throttleWriteBpsDevice;
    private LinuxThrottleDevice throttleWriteIOPSDevice;

    private String timezone;
    private String umask;

    private boolean useImageHosts;
    private boolean useImageResolveConf;
    private Namespace userNs;
    private Namespace utsNs;

    private List<NamedVolume> volumes;
    private List<String> volumesFrom;

    private LinuxWeightDevice weightDevice;
    private String workDir;

    public Container(Map<String, String> annotations, String appArmorProfile, List<String> capabilitiesAdd,
                     List<String> capabilitiesDrop, String cgroupParent, Namespace cgroupNs, String cgroupMode,
                     List<String> cniNetworks, List<String> command, String conmonPidFile,
                     List<String> containerCreateCommand, List<LinuxDevice> devices, List<String> dnsOption,
                     List<String> dnsSearch, List<List<Integer>> dnsServer, List<String> entrypoint,
                     Map<String, String> env, boolean envHost, List<String> groups, HealthConfig healthConfig,
                     String hostname, String image, String imageVolumeMode, boolean init, String initPath,
                     Namespace ipcns, Map<String, String> labels, LogConfig logConfiguration, String name,
                     String namespace, Namespace netNs, Map<String, String> networkOptions, boolean noNewPrivileges,
                     String ociRuntime, List<OverlayVolume> overlayVolumes, Namespace pidNs,
                     List<PortMappings> portMappings, boolean privileged, List<String> procfsOpts,
                     boolean publishImagePorts, List<PosixRLimit> rLimits, String rawImageName,
                     boolean readOnlyFilesystem, boolean remove, LinuxResources resourceLimits, String restartPolicy,
                     int restartTries, String rootFs, String rootFsPropagation, String sdnotifyMode,
                     String seccompPolicy, String seccompProfilePath, List<String> selinuxOpts, int[] staticIP,
                     int[] staticIPv6, int[] staticMAC, boolean stdin, int stopSignal, int stopTimeout,
                     Map<String, String> sysctl, String systemD, LinuxThrottleDevice throttleReadBpsDevice,
                     LinuxThrottleDevice throttleReadIOPSDevice, LinuxThrottleDevice throttleWriteBpsDevice,
                     LinuxThrottleDevice throttleWriteIOPSDevice, String timezone, String umask, boolean useImageHosts,
                     boolean useImageResolveConf, Namespace userNs, Namespace utsNs, List<NamedVolume> volumes,
                     List<String> volumesFrom, LinuxWeightDevice weightDevice, String workDir) {
        this.annotations = annotations;
        this.appArmorProfile = appArmorProfile;
        this.capabilitiesAdd = capabilitiesAdd;
        this.capabilitiesDrop = capabilitiesDrop;
        this.cgroupParent = cgroupParent;
        this.cgroupNs = cgroupNs;
        this.cgroupMode = cgroupMode;
        this.cniNetworks = cniNetworks;
        this.command = command;
        this.conmonPidFile = conmonPidFile;
        this.containerCreateCommand = containerCreateCommand;
        this.devices = devices;
        this.dnsOption = dnsOption;
        this.dnsSearch = dnsSearch;
        this.dnsServer = dnsServer;
        this.entrypoint = entrypoint;
        this.env = env;
        this.envHost = envHost;
        this.groups = groups;
        this.healthConfig = healthConfig;
        this.hostname = hostname;
        this.image = image;
        this.imageVolumeMode = imageVolumeMode;
        this.init = init;
        this.initPath = initPath;
        this.ipcns = ipcns;
        this.labels = labels;
        this.logConfiguration = logConfiguration;
        this.name = name;
        this.namespace = namespace;
        this.netNs = netNs;
        this.networkOptions = networkOptions;
        this.noNewPrivileges = noNewPrivileges;
        this.ociRuntime = ociRuntime;
        this.overlayVolumes = overlayVolumes;
        this.pidNs = pidNs;
        this.portMappings = portMappings;
        this.privileged = privileged;
        this.procfsOpts = procfsOpts;
        this.publishImagePorts = publishImagePorts;
        this.rLimits = rLimits;
        this.rawImageName = rawImageName;
        this.readOnlyFilesystem = readOnlyFilesystem;
        this.remove = remove;
        this.resourceLimits = resourceLimits;
        this.restartPolicy = restartPolicy;
        this.restartTries = restartTries;
        this.rootFs = rootFs;
        this.rootFsPropagation = rootFsPropagation;
        this.sdnotifyMode = sdnotifyMode;
        this.seccompPolicy = seccompPolicy;
        this.seccompProfilePath = seccompProfilePath;
        this.selinuxOpts = selinuxOpts;
        this.staticIP = staticIP;
        this.staticIPv6 = staticIPv6;
        this.staticMAC = staticMAC;
        this.stdin = stdin;
        this.stopSignal = stopSignal;
        this.stopTimeout = stopTimeout;
        this.sysctl = sysctl;
        this.systemD = systemD;
        this.throttleReadBpsDevice = throttleReadBpsDevice;
        this.throttleReadIOPSDevice = throttleReadIOPSDevice;
        this.throttleWriteBpsDevice = throttleWriteBpsDevice;
        this.throttleWriteIOPSDevice = throttleWriteIOPSDevice;
        this.timezone = timezone;
        this.umask = umask;
        this.useImageHosts = useImageHosts;
        this.useImageResolveConf = useImageResolveConf;
        this.userNs = userNs;
        this.utsNs = utsNs;
        this.volumes = volumes;
        this.volumesFrom = volumesFrom;
        this.weightDevice = weightDevice;
        this.workDir = workDir;
    }

    public Map<String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
    }

    public String getAppArmorProfile() {
        return appArmorProfile;
    }

    public void setAppArmorProfile(String appArmorProfile) {
        this.appArmorProfile = appArmorProfile;
    }

    public List<String> getCapabilitiesAdd() {
        return capabilitiesAdd;
    }

    public void setCapabilitiesAdd(List<String> capabilitiesAdd) {
        this.capabilitiesAdd = capabilitiesAdd;
    }

    public List<String> getCapabilitiesDrop() {
        return capabilitiesDrop;
    }

    public void setCapabilitiesDrop(List<String> capabilitiesDrop) {
        this.capabilitiesDrop = capabilitiesDrop;
    }

    public String getCgroupParent() {
        return cgroupParent;
    }

    public void setCgroupParent(String cgroupParent) {
        this.cgroupParent = cgroupParent;
    }

    public Namespace getCgroupNs() {
        return cgroupNs;
    }

    public void setCgroupNs(Namespace cgroupNs) {
        this.cgroupNs = cgroupNs;
    }

    public String getCgroupMode() {
        return cgroupMode;
    }

    public void setCgroupMode(String cgroupMode) {
        this.cgroupMode = cgroupMode;
    }

    public List<String> getCniNetworks() {
        return cniNetworks;
    }

    public void setCniNetworks(List<String> cniNetworks) {
        this.cniNetworks = cniNetworks;
    }

    public List<String> getCommand() {
        return command;
    }

    public void setCommand(List<String> command) {
        this.command = command;
    }

    public String getConmonPidFile() {
        return conmonPidFile;
    }

    public void setConmonPidFile(String conmonPidFile) {
        this.conmonPidFile = conmonPidFile;
    }

    public List<String> getContainerCreateCommand() {
        return containerCreateCommand;
    }

    public void setContainerCreateCommand(List<String> containerCreateCommand) {
        this.containerCreateCommand = containerCreateCommand;
    }

    public List<LinuxDevice> getDevices() {
        return devices;
    }

    public void setDevices(List<LinuxDevice> devices) {
        this.devices = devices;
    }

    public List<String> getDnsOption() {
        return dnsOption;
    }

    public void setDnsOption(List<String> dnsOption) {
        this.dnsOption = dnsOption;
    }

    public List<String> getDnsSearch() {
        return dnsSearch;
    }

    public void setDnsSearch(List<String> dnsSearch) {
        this.dnsSearch = dnsSearch;
    }

    public List<List<Integer>> getDnsServer() {
        return dnsServer;
    }

    public void setDnsServer(List<List<Integer>> dnsServer) {
        this.dnsServer = dnsServer;
    }

    public List<String> getEntrypoint() {
        return entrypoint;
    }

    public void setEntrypoint(List<String> entrypoint) {
        this.entrypoint = entrypoint;
    }

    public Map<String, String> getEnv() {
        return env;
    }

    public void setEnv(Map<String, String> env) {
        this.env = env;
    }

    public boolean isEnvHost() {
        return envHost;
    }

    public void setEnvHost(boolean envHost) {
        this.envHost = envHost;
    }

    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    public HealthConfig getHealthConfig() {
        return healthConfig;
    }

    public void setHealthConfig(HealthConfig healthConfig) {
        this.healthConfig = healthConfig;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageVolumeMode() {
        return imageVolumeMode;
    }

    public void setImageVolumeMode(String imageVolumeMode) {
        this.imageVolumeMode = imageVolumeMode;
    }

    public boolean isInit() {
        return init;
    }

    public void setInit(boolean init) {
        this.init = init;
    }

    public String getInitPath() {
        return initPath;
    }

    public void setInitPath(String initPath) {
        this.initPath = initPath;
    }

    public Namespace getIpcns() {
        return ipcns;
    }

    public void setIpcns(Namespace ipcns) {
        this.ipcns = ipcns;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public LogConfig getLogConfiguration() {
        return logConfiguration;
    }

    public void setLogConfiguration(LogConfig logConfiguration) {
        this.logConfiguration = logConfiguration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public Namespace getNetNs() {
        return netNs;
    }

    public void setNetNs(Namespace netNs) {
        this.netNs = netNs;
    }

    public Map<String, String> getNetworkOptions() {
        return networkOptions;
    }

    public void setNetworkOptions(Map<String, String> networkOptions) {
        this.networkOptions = networkOptions;
    }

    public boolean isNoNewPrivileges() {
        return noNewPrivileges;
    }

    public void setNoNewPrivileges(boolean noNewPrivileges) {
        this.noNewPrivileges = noNewPrivileges;
    }

    public String getOciRuntime() {
        return ociRuntime;
    }

    public void setOciRuntime(String ociRuntime) {
        this.ociRuntime = ociRuntime;
    }

    public List<OverlayVolume> getOverlayVolumes() {
        return overlayVolumes;
    }

    public void setOverlayVolumes(List<OverlayVolume> overlayVolumes) {
        this.overlayVolumes = overlayVolumes;
    }

    public Namespace getPidNs() {
        return pidNs;
    }

    public void setPidNs(Namespace pidNs) {
        this.pidNs = pidNs;
    }

    public List<PortMappings> getPortMappings() {
        return portMappings;
    }

    public void setPortMappings(List<PortMappings> portMappings) {
        this.portMappings = portMappings;
    }

    public boolean isPrivileged() {
        return privileged;
    }

    public void setPrivileged(boolean privileged) {
        this.privileged = privileged;
    }

    public List<String> getProcfsOpts() {
        return procfsOpts;
    }

    public void setProcfsOpts(List<String> procfsOpts) {
        this.procfsOpts = procfsOpts;
    }

    public boolean isPublishImagePorts() {
        return publishImagePorts;
    }

    public void setPublishImagePorts(boolean publishImagePorts) {
        this.publishImagePorts = publishImagePorts;
    }

    public List<PosixRLimit> getrLimits() {
        return rLimits;
    }

    public void setrLimits(List<PosixRLimit> rLimits) {
        this.rLimits = rLimits;
    }

    public String getRawImageName() {
        return rawImageName;
    }

    public void setRawImageName(String rawImageName) {
        this.rawImageName = rawImageName;
    }

    public boolean isReadOnlyFilesystem() {
        return readOnlyFilesystem;
    }

    public void setReadOnlyFilesystem(boolean readOnlyFilesystem) {
        this.readOnlyFilesystem = readOnlyFilesystem;
    }

    public boolean isRemove() {
        return remove;
    }

    public void setRemove(boolean remove) {
        this.remove = remove;
    }

    public LinuxResources getResourceLimits() {
        return resourceLimits;
    }

    public void setResourceLimits(LinuxResources resourceLimits) {
        this.resourceLimits = resourceLimits;
    }

    public String getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    public int getRestartTries() {
        return restartTries;
    }

    public void setRestartTries(int restartTries) {
        this.restartTries = restartTries;
    }

    public String getRootFs() {
        return rootFs;
    }

    public void setRootFs(String rootFs) {
        this.rootFs = rootFs;
    }

    public String getRootFsPropagation() {
        return rootFsPropagation;
    }

    public void setRootFsPropagation(String rootFsPropagation) {
        this.rootFsPropagation = rootFsPropagation;
    }

    public String getSdnotifyMode() {
        return sdnotifyMode;
    }

    public void setSdnotifyMode(String sdnotifyMode) {
        this.sdnotifyMode = sdnotifyMode;
    }

    public String getSeccompPolicy() {
        return seccompPolicy;
    }

    public void setSeccompPolicy(String seccompPolicy) {
        this.seccompPolicy = seccompPolicy;
    }

    public String getSeccompProfilePath() {
        return seccompProfilePath;
    }

    public void setSeccompProfilePath(String seccompProfilePath) {
        this.seccompProfilePath = seccompProfilePath;
    }

    public List<String> getSelinuxOpts() {
        return selinuxOpts;
    }

    public void setSelinuxOpts(List<String> selinuxOpts) {
        this.selinuxOpts = selinuxOpts;
    }

    public int[] getStaticIP() {
        return staticIP;
    }

    public void setStaticIP(int[] staticIP) {
        this.staticIP = staticIP;
    }

    public int[] getStaticIPv6() {
        return staticIPv6;
    }

    public void setStaticIPv6(int[] staticIPv6) {
        this.staticIPv6 = staticIPv6;
    }

    public int[] getStaticMAC() {
        return staticMAC;
    }

    public void setStaticMAC(int[] staticMAC) {
        this.staticMAC = staticMAC;
    }

    public boolean isStdin() {
        return stdin;
    }

    public void setStdin(boolean stdin) {
        this.stdin = stdin;
    }

    public int getStopSignal() {
        return stopSignal;
    }

    public void setStopSignal(int stopSignal) {
        this.stopSignal = stopSignal;
    }

    public int getStopTimeout() {
        return stopTimeout;
    }

    public void setStopTimeout(int stopTimeout) {
        this.stopTimeout = stopTimeout;
    }

    public Map<String, String> getSysctl() {
        return sysctl;
    }

    public void setSysctl(Map<String, String> sysctl) {
        this.sysctl = sysctl;
    }

    public String getSystemD() {
        return systemD;
    }

    public void setSystemD(String systemD) {
        this.systemD = systemD;
    }

    public LinuxThrottleDevice getThrottleReadBpsDevice() {
        return throttleReadBpsDevice;
    }

    public void setThrottleReadBpsDevice(LinuxThrottleDevice throttleReadBpsDevice) {
        this.throttleReadBpsDevice = throttleReadBpsDevice;
    }

    public LinuxThrottleDevice getThrottleReadIOPSDevice() {
        return throttleReadIOPSDevice;
    }

    public void setThrottleReadIOPSDevice(LinuxThrottleDevice throttleReadIOPSDevice) {
        this.throttleReadIOPSDevice = throttleReadIOPSDevice;
    }

    public LinuxThrottleDevice getThrottleWriteBpsDevice() {
        return throttleWriteBpsDevice;
    }

    public void setThrottleWriteBpsDevice(LinuxThrottleDevice throttleWriteBpsDevice) {
        this.throttleWriteBpsDevice = throttleWriteBpsDevice;
    }

    public LinuxThrottleDevice getThrottleWriteIOPSDevice() {
        return throttleWriteIOPSDevice;
    }

    public void setThrottleWriteIOPSDevice(LinuxThrottleDevice throttleWriteIOPSDevice) {
        this.throttleWriteIOPSDevice = throttleWriteIOPSDevice;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getUmask() {
        return umask;
    }

    public void setUmask(String umask) {
        this.umask = umask;
    }

    public boolean isUseImageHosts() {
        return useImageHosts;
    }

    public void setUseImageHosts(boolean useImageHosts) {
        this.useImageHosts = useImageHosts;
    }

    public boolean isUseImageResolveConf() {
        return useImageResolveConf;
    }

    public void setUseImageResolveConf(boolean useImageResolveConf) {
        this.useImageResolveConf = useImageResolveConf;
    }

    public Namespace getUserNs() {
        return userNs;
    }

    public void setUserNs(Namespace userNs) {
        this.userNs = userNs;
    }

    public Namespace getUtsNs() {
        return utsNs;
    }

    public void setUtsNs(Namespace utsNs) {
        this.utsNs = utsNs;
    }

    public List<NamedVolume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<NamedVolume> volumes) {
        this.volumes = volumes;
    }

    public List<String> getVolumesFrom() {
        return volumesFrom;
    }

    public void setVolumesFrom(List<String> volumesFrom) {
        this.volumesFrom = volumesFrom;
    }

    public LinuxWeightDevice getWeightDevice() {
        return weightDevice;
    }

    public void setWeightDevice(LinuxWeightDevice weightDevice) {
        this.weightDevice = weightDevice;
    }

    public String getWorkDir() {
        return workDir;
    }

    public void setWorkDir(String workDir) {
        this.workDir = workDir;
    }
}
