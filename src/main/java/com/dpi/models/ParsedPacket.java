public class ParsedPacket {
    private String srcMac;
    private String destMac;
    private String srcIp;
    private String destIp;
    private int srcPort;
    private int destPort;
    private String protocol;
    private boolean hasTcp;
    private boolean hasUdp;
    private int payloadOffset;
    private int payloadLength;

    // Getters and Setters
    public String getSrcMac() {
        return srcMac;
    }

    public void setSrcMac(String srcMac) {
        this.srcMac = srcMac;
    }

    public String getDestMac() {
        return destMac;
    }

    public void setDestMac(String destMac) {
        this.destMac = destMac;
    }

    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }

    public String getDestIp() {
        return destIp;
    }

    public void setDestIp(String destIp) {
        this.destIp = destIp;
    }

    public int getSrcPort() {
        return srcPort;
    }

    public void setSrcPort(int srcPort) {
        this.srcPort = srcPort;
    }

    public int getDestPort() {
        return destPort;
    }

    public void setDestPort(int destPort) {
        this.destPort = destPort;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public boolean isHasTcp() {
        return hasTcp;
    }

    public void setHasTcp(boolean hasTcp) {
        this.hasTcp = hasTcp;
    }

    public boolean isHasUdp() {
        return hasUdp;
    }

    public void setHasUdp(boolean hasUdp) {
        this.hasUdp = hasUdp;
    }

    public int getPayloadOffset() {
        return payloadOffset;
    }

    public void setPayloadOffset(int payloadOffset) {
        this.payloadOffset = payloadOffset;
    }

    public int getPayloadLength() {
        return payloadLength;
    }

    public void setPayloadLength(int payloadLength) {
        this.payloadLength = payloadLength;
    }
}