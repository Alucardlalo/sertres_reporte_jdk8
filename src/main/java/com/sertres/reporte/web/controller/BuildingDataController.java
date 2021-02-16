package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.BuildingData;
import com.sertres.reporte.domain.service.BuildingDataService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buildingdata")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@Api(description = "This API has a CRUD for Building Data")
public class BuildingDataController {

    @Autowired
    private BuildingDataService buildingDataService;

    @GetMapping("/all")
    @ApiOperation("Get all Building data")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK")
    })
    public List<BuildingData> getAll(){
        return buildingDataService.getAll();
    }

    @PostMapping("/save")
    @ApiOperation("Save new building data")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Building Data created")
    })
    public BuildingData save(@RequestBody BuildingData buildingData){
        return buildingDataService.save(buildingData);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("Delete building data by Id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Building data created"),
            @ApiResponse(code = 404, message = "Building data Id not found")
    })
    public void delete(@ApiParam(value = "The Id of Building data", required = true) @PathVariable("id") int buildingDataId){
        buildingDataService.delete(buildingDataId);
    }
}
