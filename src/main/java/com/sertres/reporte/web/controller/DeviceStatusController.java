package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.DeviceStatus;
import com.sertres.reporte.domain.service.DeviceStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estado")
public class DeviceStatusController {

    @Autowired
    private DeviceStatusService statusService;

    @GetMapping("/all")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<DeviceStatus> getAll(){
        return statusService.getAll();
    }

    @PostMapping("/save")
    @CrossOrigin(origins = "http://localhost:3000")
    public DeviceStatus save(@RequestBody DeviceStatus deviceStatus){
        return statusService.save(deviceStatus);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int statusId){
        statusService.delete(statusId);
    }
}
