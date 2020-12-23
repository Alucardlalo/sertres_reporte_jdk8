package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.BuildingData;
import com.sertres.reporte.domain.service.BuildingDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buildingdata")
public class BuildingDataController {

    @Autowired
    private BuildingDataService buildingDataService;

    @GetMapping("/all")
    public List<BuildingData> getAll(){
        return buildingDataService.getAll();
    }

    @PostMapping("/save")
    public BuildingData save(@RequestBody BuildingData buildingData){
        return buildingDataService.save(buildingData);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int buildingDataId){
        buildingDataService.delete(buildingDataId);
    }
}
