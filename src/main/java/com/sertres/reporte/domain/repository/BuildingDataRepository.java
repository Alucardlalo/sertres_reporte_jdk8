package com.sertres.reporte.domain.repository;

import com.sertres.reporte.domain.BuildingData;

import java.util.List;

public interface BuildingDataRepository {

    List<BuildingData> GetAll();

    //save and delete
    BuildingData save(BuildingData buildingData);
    void delete(int buildingDataId);
}
