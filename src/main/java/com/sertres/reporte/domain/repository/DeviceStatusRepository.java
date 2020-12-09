package com.sertres.reporte.domain.repository;

import com.sertres.reporte.domain.DeviceStatus;

import java.util.List;

public interface DeviceStatusRepository {

    List<DeviceStatus> getAll();

    //save and delete
    DeviceStatus save (DeviceStatus deviceStatus);
    void delete (int deviceStatusId);
}
