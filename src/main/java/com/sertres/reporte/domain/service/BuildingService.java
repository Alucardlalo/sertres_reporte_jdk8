package com.sertres.reporte.domain.service;

import com.sertres.reporte.domain.Building;
import com.sertres.reporte.domain.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingService {

    @Autowired
    private BuildingRepository buildingRepository;

    public List<Building> getAll(){
        return buildingRepository.getAll();
    }

    public List<Building> getByBuildingId(int buildingId){
        return buildingRepository.getByBuildingId(buildingId);
    }

    //save and delete
    public Building save (Building building){
        return buildingRepository.save(building);
    }

    public void delete(int buildingId){
        buildingRepository.delete(buildingId);
    }
}
