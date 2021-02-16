package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.Device;
import com.sertres.reporte.domain.service.DeviceService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dispositivo")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@Api(description = "This API has a CRUD for Device")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @GetMapping("/all")
    @ApiOperation("Get all devices")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK")
    })
    public List<Device> getAll(){
        return deviceService.getAll();
    }

    @GetMapping("/{id}")
    @ApiOperation("Search a device with an Id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Device not found")
    })
    public List<Device> getByDeviceId(@ApiParam(value = "The id of Device",required = true) @PathVariable("id") int deviceId){
        return deviceService.getByDeviceId(deviceId);
    }

    @GetMapping("/edificio/{id}")
    @ApiOperation("Search a device with a building Id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Building not found")
    })
    public List<Device> getByBuildingId(@ApiParam(value = "The id of building",required = true)@PathVariable("id") int buildingId){
        return deviceService.getByBuildingId(buildingId);
    }

    @GetMapping("/status/{id}")
    @ApiOperation("Search a device with a device status id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Status not found")
    })
    public List<Device> getByDeviseStatus(@ApiParam(value = "The id of device status",required = true)@PathVariable("id") int statusId){
        return deviceService.getByDeviceStatus(statusId);
    }

    @PostMapping("/save")
    @ApiOperation("Save new Device")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Device Created")
    })
    public Device save(@RequestBody Device device){
        return deviceService.save(device);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("Delete Device by Id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Device delete"),
            @ApiResponse(code = 404, message = "Device not found")
    })
    public void delete(@ApiParam(value = "The id of Device",required = true)@PathVariable("id") int deviceId){
        deviceService.delete(deviceId);
    }
}
