package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.Building;
import com.sertres.reporte.domain.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/edificio")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
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

    @PostMapping("/save")
    public Building save(@RequestBody Building building){
        return buildingService.save(building);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int buildingId){
        buildingService.delete(buildingId);
    }
}
