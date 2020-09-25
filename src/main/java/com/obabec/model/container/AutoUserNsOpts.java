package com.obabec.model.container;

import com.obabec.model.container.id.IDMap;

import java.util.List;

public class AutoUserNsOpts {
    private List<IDMap> additionalGIDMappings;
    private List<IDMap> additionalUIDMappings;
    private String groupFile;
    private int initialSize;
    private String passwdFile;
    private int size;

    public AutoUserNsOpts(List<IDMap> additionalGIDMappings, List<IDMap> additionalUIDMappings,
                          String groupFile, int initialSize, String passwdFile, int size) {
        this.additionalGIDMappings = additionalGIDMappings;
        this.additionalUIDMappings = additionalUIDMappings;
        this.groupFile = groupFile;
        this.initialSize = initialSize;
        this.passwdFile = passwdFile;
        this.size = size;
    }
}
