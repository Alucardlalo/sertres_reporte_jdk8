package com.sertres.reporte.domain.service;

import com.sertres.reporte.domain.Device;
import com.sertres.reporte.domain.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    public List<Device> getAll(){
        return deviceRepository.getAll();
    }

    public List<Device> getByDeviceId(int buildingId){
        return deviceRepository.getByDeviceId(buildingId);
    }

    public List<Device> getByBuildingId(int buildingId){
        return deviceRepository.getByBuildingId(buildingId);
    }

    public List<Device> getByDeviceStatus(int deviceStatusId){
        return deviceRepository.getByDeviceStatus(deviceStatusId);
    }

    //save and delete
    public Device save(Device device){
        return deviceRepository.save(device);
    }

    public void delete(int deviceId){
        deviceRepository.delete(deviceId);
    }
}
