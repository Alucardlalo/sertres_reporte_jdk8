package com.sertres.reporte.persistence;

import com.sertres.reporte.domain.DeviceStatus;
import com.sertres.reporte.domain.repository.DeviceStatusRepository;
import com.sertres.reporte.persistence.crud.EstadoDispositivoCrudRepository;
import com.sertres.reporte.persistence.entity.EstadoDispositivo;
import com.sertres.reporte.persistence.mapper.DeviceStatusMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EstadoDispositivoRepository implements DeviceStatusRepository {

    @Autowired
    private EstadoDispositivoCrudRepository estadoDispositivoCrudRepository;

    @Autowired
    private DeviceStatusMapper mapper;

    @Override
    public List<DeviceStatus> getAll() {
        List<EstadoDispositivo> estadoDispositivos = (List<EstadoDispositivo>) estadoDispositivoCrudRepository.findAll();
        return mapper.toDeviceStatusL(estadoDispositivos);
    }

    @Override
    public DeviceStatus save(DeviceStatus deviceStatus) {
        EstadoDispositivo estadoDispositivoS = mapper.toEstadoDispositivo(deviceStatus);
        return mapper.toDeviceStatus(estadoDispositivoS);
    }

    @Override
    public void delete(int deviceStatusId) {
        estadoDispositivoCrudRepository.deleteById(deviceStatusId);
    }
}
