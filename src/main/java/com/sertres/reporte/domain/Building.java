package com.sertres.reporte.domain;

public class Building {

    private int buildingId;

    private String buildingType;

    private int buildingData;

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

    public int getBuildingData() {
        return buildingData;
    }

    public void setBuildingData(int buildingData) {
        this.buildingData = buildingData;
    }

    //relacion con building daata
    private BuildingData buildingDataRel;

    public BuildingData getBuildingDataRel() {
        return buildingDataRel;
    }

    public void setBuildingDataRel(BuildingData buildingDataRel) {
        this.buildingDataRel = buildingDataRel;
    }
}
