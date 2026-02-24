package com.dpi.models;

import java.time.Instant;

public class RawPacket {
    private byte[] data;
    private int length;
    private Instant timestamp;

    public RawPacket(byte[] data, int length) {
        this.data = data;
        this.length = length;
        this.timestamp = Instant.now();
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

    public Instant getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "RawPacket{" +
                "data=" + data +
                ", length=" + length +
                ", timestamp=" + timestamp +
                '}';
    }
}