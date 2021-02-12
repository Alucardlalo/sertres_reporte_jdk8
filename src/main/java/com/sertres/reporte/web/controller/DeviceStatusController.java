package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.DeviceStatus;
import com.sertres.reporte.domain.service.DeviceStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estado")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class DeviceStatusController {

    @Autowired
    private DeviceStatusService statusService;

    @GetMapping("/all")
    public List<DeviceStatus> getAll(){
        return statusService.getAll();
    }

    @PostMapping("/save")
    public DeviceStatus save(@RequestBody DeviceStatus deviceStatus){
        return statusService.save(deviceStatus);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int statusId){
        statusService.delete(statusId);
    }
}
