package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.Device;
import com.sertres.reporte.domain.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dispositivo")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @GetMapping("/all")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Device> getAll(){
        return deviceService.getAll();
    }

    @GetMapping("/{id}")
    public List<Device> getByDeviceId(@PathVariable("id") int deviceId){
        return deviceService.getByDeviceId(deviceId);
    }

    @GetMapping("/edificio/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Device> getByBuildingId(@PathVariable("id") int buildingId){
        return deviceService.getByBuildingId(buildingId);
    }

    @GetMapping("/status/{id}")
    public List<Device> getByDeviseStatus(@PathVariable("id") int statusId){
        return deviceService.getByDeviceStatus(statusId);
    }

    @PostMapping("/save")
    @CrossOrigin(origins = "http://localhost:3000")
    public Device save(@RequestBody Device device){
        return deviceService.save(device);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int deviceId){
        deviceService.delete(deviceId);
    }
}
