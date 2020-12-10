package com.sertres.reporte.persistence.mapper;

import com.sertres.reporte.domain.Device;
import com.sertres.reporte.persistence.entity.Dispositivo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DeviceMapper {

    @Mappings({
            @Mapping(source = "idDispositivo", target = "deviceId"),
            @Mapping(source = "nombreDispositivo", target = "deviceName"),
            @Mapping(source = "descripcionDispositivo", target = "deviceDescription"),
            @Mapping(source = "marcaDispositivo", target = "deviceBrand"),
            @Mapping(source = "modeloDispositivo", target = "deviceModel"),
            @Mapping(source = "serieDispositivo", target = "deviceSeries"),
            @Mapping(source = "tipoDispositivo", target = "deviceType"),
            @Mapping(source = "estadoDispositivo", target = "deviceStatus"),
            @Mapping(source = "ultimaFechaEstado", target = "lastDateStatus"),
            @Mapping(source = "edificio", target = "building")
            //relaciones con estadoDispositivo & Edificio

    })
    Device toDevice(Dispositivo dispositivo);

    List<Device> toDevises(List<Dispositivo> dispositivoList);

    @InheritInverseConfiguration
    //@Mapping(target = "edificioRel", ignore = true)
    //@Mapping(target = "estadoDispositivoRel", ignore = true)
    Dispositivo toDispositivo(Device device);
}
