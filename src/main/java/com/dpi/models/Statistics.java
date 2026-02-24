package com.dpi.models;

public class Statistics {
    private int forwardedCount;
    private int droppedCount;
    private int applicationCount;

    public Statistics() {
        this.forwardedCount = 0;
        this.droppedCount = 0;
        this.applicationCount = 0;
    }

    public void incrementForwarded() {
        forwardedCount++;
    }

    public void incrementDropped() {
        droppedCount++;
    }

    public void incrementApplication() {
        applicationCount++;
    }

    public int getForwardedCount() {
        return forwardedCount;
    }

    public int getDroppedCount() {
        return droppedCount;
    }

    public int getApplicationCount() {
        return applicationCount;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "forwardedCount=" + forwardedCount +
                ", droppedCount=" + droppedCount +
                ", applicationCount=" + applicationCount +
                '}';
    }
}