package com.sertres.reporte.persistence.mapper;

import com.sertres.reporte.domain.DeviceStatus;
import com.sertres.reporte.persistence.entity.EstadoDispositivo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DeviceStatusMapper {

    @Mappings({
            @Mapping(source = "idEstadoDispositivo", target = "deviceStatusId"),
            @Mapping(source = "estadoDispositivoDescripcion", target = "deviceStatusDescription")
    })
    DeviceStatus toDeviceStatus (EstadoDispositivo estadoDispositivo);

    List<DeviceStatus> toDeviceStatusL(List<EstadoDispositivo> estadoDispositivoList);

    @InheritInverseConfiguration
   //@Mapping(target = "dispositivoRelList",ignore = true)
    EstadoDispositivo toEstadoDispositivo(DeviceStatus deviceStatus);
}
