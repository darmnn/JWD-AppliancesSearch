package by.tc.task01.entity;

import java.util.Objects;

public class VacuumCleaner extends Appliance
{
    private int powerConsumption;
    private char filterType;
    private String bagType;
    private String wandType;
    private String motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner(int powerConsumption, char filterType, String bagType, String wandType, String motorSpeedRegulation, int cleaningWidth) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public String toString() {
        return "VacuumCleaner : " +
                "powerConsumption = " + powerConsumption +
                ", filterType = " + filterType +
                ", bagType = " + bagType  +
                ", wandType= " + wandType +
                ", motorSpeedRegulation= " + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return powerConsumption == that.powerConsumption &&
                filterType == that.filterType &&
                cleaningWidth == that.cleaningWidth &&
                Objects.equals(bagType, that.bagType) &&
                Objects.equals(wandType, that.wandType) &&
                Objects.equals(motorSpeedRegulation, that.motorSpeedRegulation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public char getFilterType() {
        return filterType;
    }

    public void setFilterType(char filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public String getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(String motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }
}
