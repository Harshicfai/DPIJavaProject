package com.dpi.models;

public class RawPacket {
    public byte[] data;
    public int length;
    public long timestamp;

    public RawPacket(byte[] data, int length, long timestamp) {
        this.data = data;
        this.length = length;
        this.timestamp = timestamp;
    }
}