package com.sertres.reporte.domain.service;

import com.sertres.reporte.domain.BuildingData;
import com.sertres.reporte.domain.repository.BuildingDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingDataService {

    @Autowired
    private BuildingDataRepository buildingDataRepository;

    public List<BuildingData> getAll(){
        return buildingDataRepository.GetAll();
    }


    //save and delete
    public BuildingData save(BuildingData buildingData){
        return buildingDataRepository.save(buildingData);
    }

    public void delete(int buildingDataId){
        buildingDataRepository.delete(buildingDataId);
    }
}
