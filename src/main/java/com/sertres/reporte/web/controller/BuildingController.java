package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.Building;
import com.sertres.reporte.domain.service.BuildingService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/edificio")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@Api(description = "This API has a CRUD for Building")
public class BuildingController {

    @Autowired
    private BuildingService buildingService;

    @GetMapping("/all")
    @ApiOperation("Geat all Buildings")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK")
    })
    public List<Building> getAll(){
        return buildingService.getAll();
    }

    @GetMapping("/{id}")
    @ApiOperation("Search a Building with an ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Building not found")
    })
    public List<Building> getByBuildingId (@ApiParam(value = "The id of building", required = true) @PathVariable("id") int buildingId){
        return buildingService.getByBuildingId(buildingId);
    }

    @PostMapping("/save")
    @ApiOperation("Save new Building")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Building Created")
    })
    public Building save(@RequestBody Building building){
        return buildingService.save(building);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("Delete Building by ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Building delete"),
            @ApiResponse(code = 404, message = "Building not found")
    })
    public void delete(@ApiParam(value = "The id of Building", required = true)@PathVariable("id") int buildingId){
        buildingService.delete(buildingId);
    }
}
