package com.obabec.model.container.id;

public class IDMap {
    private int containerID;
    private int hostID;
    private int size;

    public IDMap(int containerID, int hostID, int size) {
        this.containerID = containerID;
        this.hostID = hostID;
        this.size = size;
    }

    public int getContainerID() {
        return containerID;
    }

    public void setContainerID(int containerID) {
        this.containerID = containerID;
    }

    public int getHostID() {
        return hostID;
    }

    public void setHostID(int hostID) {
        this.hostID = hostID;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
