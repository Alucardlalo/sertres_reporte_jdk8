package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.BuildingData;
import com.sertres.reporte.domain.service.BuildingDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
