package com.dpi.models;

import java.util.Objects;

public class FiveTuple {
    private String srcIp;
    private String destIp;
    private int srcPort;
    private int destPort;
    private String protocol;

    public FiveTuple(String srcIp, String destIp, int srcPort, int destPort, String protocol) {
        this.srcIp = srcIp;
        this.destIp = destIp;
        this.srcPort = srcPort;
        this.destPort = destPort;
        this.protocol = protocol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FiveTuple)) return false;
        FiveTuple that = (FiveTuple) o;
        return srcPort == that.srcPort && 
               destPort == that.destPort && 
               Objects.equals(srcIp, that.srcIp) && 
               Objects.equals(destIp, that.destIp) && 
               Objects.equals(protocol, that.protocol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(srcIp, destIp, srcPort, destPort, protocol);
    }

    // Getters and setters can be added here if needed
}