package com.sertres.reporte.domain.service;

import com.sertres.reporte.domain.DeviceStatus;
import com.sertres.reporte.domain.repository.DeviceStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceStatusService {

    @Autowired
    private DeviceStatusRepository deviceStatusRepository;

    public List<DeviceStatus> getAll(){
        return deviceStatusRepository.getAll();
    }

    //save and delete
    public DeviceStatus save(DeviceStatus deviceStatus){
        return deviceStatusRepository.save(deviceStatus);
    }

    public void delete(int deviceStatusId){
        deviceStatusRepository.delete(deviceStatusId);
    }
}
