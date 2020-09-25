package com.obabec.model.container.id;

import com.obabec.model.container.AutoUserNsOpts;

import java.util.List;

public class IDMappingOptions {
    private boolean autoUserNs;
    private AutoUserNsOpts autoUserNsOpts;
    private List<IDMap> gidMap;
    private boolean hostGIDMapping;
    private boolean hostUIDMapping;
    private List<IDMap> uidMap;

    public IDMappingOptions(boolean autoUserNs, AutoUserNsOpts autoUserNsOpts,
                            List<IDMap> gidMap, boolean hostGIDMapping, boolean hostUIDMapping, List<IDMap> uidMap) {
        this.autoUserNs = autoUserNs;
        this.autoUserNsOpts = autoUserNsOpts;
        this.gidMap = gidMap;
        this.hostGIDMapping = hostGIDMapping;
        this.hostUIDMapping = hostUIDMapping;
        this.uidMap = uidMap;
    }

    public boolean isAutoUserNs() {
        return autoUserNs;
    }

    public void setAutoUserNs(boolean autoUserNs) {
        this.autoUserNs = autoUserNs;
    }

    public AutoUserNsOpts getAutoUserNsOpts() {
        return autoUserNsOpts;
    }

    public void setAutoUserNsOpts(AutoUserNsOpts autoUserNsOpts) {
        this.autoUserNsOpts = autoUserNsOpts;
    }

    public List<IDMap> getGidMap() {
        return gidMap;
    }

    public void setGidMap(List<IDMap> gidMap) {
        this.gidMap = gidMap;
    }

    public boolean isHostGIDMapping() {
        return hostGIDMapping;
    }

    public void setHostGIDMapping(boolean hostGIDMapping) {
        this.hostGIDMapping = hostGIDMapping;
    }

    public boolean isHostUIDMapping() {
        return hostUIDMapping;
    }

    public void setHostUIDMapping(boolean hostUIDMapping) {
        this.hostUIDMapping = hostUIDMapping;
    }

    public List<IDMap> getUidMap() {
        return uidMap;
    }

    public void setUidMap(List<IDMap> uidMap) {
        this.uidMap = uidMap;
    }
}
