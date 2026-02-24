package com.dpi.models;

public class RawPacket {
    private byte[] data;
    private int length;
    private long timestamp;

    public RawPacket(byte[] data, int length, long timestamp) {
        this.data = data;
        this.length = length;
        this.timestamp = timestamp;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}