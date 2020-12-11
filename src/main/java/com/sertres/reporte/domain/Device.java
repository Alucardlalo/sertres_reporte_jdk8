package com.sertres.reporte.domain;

import java.time.LocalDateTime;

public class Device {

    private int deviceId;

    private String deviceName;

    private String deviceDescription;

    private String deviceBrand;

    private String deviceModel;

    private String deviceSeries;

    private String deviceType;

    private int deviceStatus;

    private LocalDateTime lastDateStatus;

    private int building;

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceDescription() {
        return deviceDescription;
    }

    public void setDeviceDescription(String deviceDescription) {
        this.deviceDescription = deviceDescription;
    }

    public String getDeviceBrand() {
        return deviceBrand;
    }

    public void setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceSeries() {
        return deviceSeries;
    }

    public void setDeviceSeries(String deviceSeries) {
        this.deviceSeries = deviceSeries;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public int getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(int deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public LocalDateTime getLastDateStatus() {
        return lastDateStatus;
    }

    public void setLastDateStatus(LocalDateTime lastDateStatus) {
        this.lastDateStatus = lastDateStatus;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }
    //relationship
    private DeviceStatus deviceStatusRel;

    public DeviceStatus getDeviceStatusRel() {
        return deviceStatusRel;
    }

    public void setDeviceStatusRel(DeviceStatus deviceStatusRel) {
        this.deviceStatusRel = deviceStatusRel;
    }

    private Building buildingRel;

    public Building getBuildingRel() {
        return buildingRel;
    }

    public void setBuildingRel(Building buildingRel) {
        this.buildingRel = buildingRel;
    }
}
