package com.obabec.model.container.id;

import com.obabec.model.container.AutoUserNsOpts;

import java.util.List;

public class IDMappingOptions {
    boolean autoUserNs;
    AutoUserNsOpts autoUserNsOpts;
    List<IDMap> gidMap;
    boolean hostGIDMapping;
    boolean hostUIDMapping;
    List<IDMap> uidMap;
}
