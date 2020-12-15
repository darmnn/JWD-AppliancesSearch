package by.tc.task01.entity;

import java.util.Objects;

public class Laptop extends Appliance
{
    private float batteryCapacity;
    private String os;
    private int memoryRom;
    private int systemMemory;
    private float cpu;
    private int display;

    public Laptop(float batteryCapacity, String os, int memoryRom, int systemMemory, float cpu, int display) {
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.display = display;
    }

    @Override
    public String toString() {
        return "Laptop : " +
                "batteryCapacity = " + batteryCapacity +
                ", os = " + os  +
                ", memoryRom = " + memoryRom +
                ", systemMemory = " + systemMemory +
                ", cpu = " + cpu +
                ", display = " + display;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return batteryCapacity == laptop.batteryCapacity &&
                memoryRom == laptop.memoryRom &&
                systemMemory == laptop.systemMemory &&
                Double.compare(laptop.cpu, cpu) == 0 &&
                display == laptop.display &&
                Objects.equals(os, laptop.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, os, memoryRom, systemMemory, cpu, display);
    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(float cpu) {
        this.cpu = cpu;
    }

    public int getDisplay() {
        return display;
    }

    public void setDisplay(int display) {
        this.display = display;
    }
}
