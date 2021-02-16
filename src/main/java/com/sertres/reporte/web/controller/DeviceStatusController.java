package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.DeviceStatus;
import com.sertres.reporte.domain.service.DeviceStatusService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estado")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@Api(description = "This API has a CRUD for Device Status")
public class DeviceStatusController {

    @Autowired
    private DeviceStatusService statusService;

    @GetMapping("/all")
    @ApiOperation("Get all Device status")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK")
    })
    public List<DeviceStatus> getAll(){
        return statusService.getAll();
    }

    @PostMapping("/save")
    @ApiOperation("Save new Device status")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Device status created")
    })
    public DeviceStatus save(@RequestBody DeviceStatus deviceStatus){
        return statusService.save(deviceStatus);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("Delete Device status By Id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Device status delete"),
            @ApiResponse(code = 404, message = "Device status not found")
    })
    public void delete(@ApiParam(value = "The id of Device Status",required = true) @PathVariable("id") int statusId){
        statusService.delete(statusId);
    }
}
