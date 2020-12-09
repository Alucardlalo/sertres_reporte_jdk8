package com.sertres.reporte.domain.repository;

import com.sertres.reporte.domain.Building;

import java.util.List;

public interface BuildingRepository {

    List<Building> getAll();
    List<Building> getByBuildingId (int buildingId);

    //save and delete
    Building save (Building building);
    void delete (int buildingId);
}
