package com.sertres.reporte.domain.repository;

import com.sertres.reporte.domain.Device;

import java.util.List;

public interface DeviceRepository {

    List<Device> getAll();
    List<Device> getByBuildingId(int buildingId);
    List<Device> getByDeviceStatus (int deviceStatusId);
    List<Device> getByDeviceType (String deviceType);
    //save and delete
    Device save(Device device);
    void delete (int DeviceId);
}
