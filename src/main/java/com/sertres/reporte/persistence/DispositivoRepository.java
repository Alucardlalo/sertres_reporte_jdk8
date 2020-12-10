package com.sertres.reporte.persistence;

import com.sertres.reporte.domain.Device;
import com.sertres.reporte.domain.repository.DeviceRepository;
import com.sertres.reporte.persistence.crud.DispositivoCrudRepository;
import com.sertres.reporte.persistence.entity.Dispositivo;
import com.sertres.reporte.persistence.mapper.DeviceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DispositivoRepository implements DeviceRepository {

    @Autowired
    private DispositivoCrudRepository dispositivoCrudRepository;

    @Autowired
    private DeviceMapper mapper;

    @Override
    public List<Device> getAll() {
        List<Dispositivo> dispositivos = (List<Dispositivo>) dispositivoCrudRepository.findAll();
        return mapper.toDevises(dispositivos);
    }

    @Override
    public List<Device> getByDeviceId(int deviceId){
        List<Dispositivo> dispositivosI = dispositivoCrudRepository.findByIdDispositivo(deviceId);
        return mapper.toDevises(dispositivosI);
    }

    @Override
    public List<Device> getByBuildingId(int buildingId) {
        List<Dispositivo> dispositivoListB = dispositivoCrudRepository.findByIdDispositivo(buildingId);
        return mapper.toDevises(dispositivoListB);
    }

    @Override
    public List<Device> getByDeviceStatus(int deviceStatusId) {
        List<Dispositivo> dispositivoListS = dispositivoCrudRepository.findByIdDispositivo(deviceStatusId);
        return mapper.toDevises(dispositivoListS);
    }

    @Override
    public Device save(Device device) {
        Dispositivo dispositivoS = mapper.toDispositivo(device);
        return mapper.toDevice(dispositivoS);
    }

    @Override
    public void delete(int DeviceId) {
        dispositivoCrudRepository.deleteById(DeviceId);
    }
}
