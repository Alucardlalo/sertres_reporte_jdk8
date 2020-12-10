package com.sertres.reporte.domain;

public class Building {

    private int buildingId;

    private String buildingType;

    private String buildingJson;

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public String getBuildingJson() {
        return buildingJson;
    }

    public void setBuildingJson(String buildingJson) {
        this.buildingJson = buildingJson;
    }
}
