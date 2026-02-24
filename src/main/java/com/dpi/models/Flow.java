package com.dpi.models;

public class Flow {
    private String sni;
    private String appType;
    private boolean blocked;
    private int packetCount;
    private long byteCount;

    // Getter and Setter methods

    public String getSni() {
        return sni;
    }

    public void setSni(String sni) {
        this.sni = sni;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public int getPacketCount() {
        return packetCount;
    }

    public void setPacketCount(int packetCount) {
        this.packetCount = packetCount;
    }

    public long getByteCount() {
        return byteCount;
    }

    public void setByteCount(long byteCount) {
        this.byteCount = byteCount;
    }
}