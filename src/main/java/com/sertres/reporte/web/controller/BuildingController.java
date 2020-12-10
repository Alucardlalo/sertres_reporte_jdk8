package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.Building;
import com.sertres.reporte.domain.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Edificio")
public class BuildingController {

    @Autowired
    private BuildingService buildingService;

    @GetMapping("/all")
    public List<Building> getAll(){
        return buildingService.getAll();
    }

    @GetMapping("/{id}")
    public List<Building> getByBuildingId (@PathVariable("id") int buildingId){
        return buildingService.getByBuildingId(buildingId);
    }

    @GetMapping("/save")
    public Building save(@RequestBody Building building){
        return buildingService.save(building);
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable("id") int buildingId){
        buildingService.delete(buildingId);
    }
}
