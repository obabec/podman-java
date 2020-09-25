package com.obabec.model.container;

public class OverlayVolume {
    private String destination;
    private String source;

    public OverlayVolume(String destination, String source) {
        this.destination = destination;
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
