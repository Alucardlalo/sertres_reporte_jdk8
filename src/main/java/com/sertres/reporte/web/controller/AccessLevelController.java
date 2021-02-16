package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.AccessLevel;
import com.sertres.reporte.domain.service.AccessLevelService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/access")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@Api(description = "This API has a CRUD for Access Level")
public class AccessLevelController {

    @Autowired
    private AccessLevelService accessLevelService;

    @GetMapping("/all")
    @ApiOperation("Get all Access level ")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "not found"),
    })
    public List<AccessLevel> getAll(){
        return accessLevelService.getAll();
    }

    @GetMapping("/{id}")
    @ApiOperation("Search an access level with an ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Access level not found"),
    })
    public List<AccessLevel> getByAccessLevelId (@ApiParam(value = "The id of the access level",required = true) @PathVariable("id") int accessLevel){
        return accessLevelService.getByAccessLevelId(accessLevel);
    }

    @PostMapping("/save")
    @ApiOperation("Save new Access level")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Access level Created")
    })
    public AccessLevel save(@RequestBody AccessLevel accessLevel){
        return accessLevelService.save(accessLevel);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("Delete Access level by ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Access level delete"),
            @ApiResponse(code = 404, message = "Access level not found")
    })
    public void delete(@ApiParam(value = "The id of the access level",required = true) @PathVariable("id") int accessLevelId){
         accessLevelService.delete(accessLevelId);
    }
}
