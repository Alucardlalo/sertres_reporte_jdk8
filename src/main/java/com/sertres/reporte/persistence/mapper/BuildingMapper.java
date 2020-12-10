package com.sertres.reporte.persistence.mapper;

import com.sertres.reporte.domain.Building;
import com.sertres.reporte.persistence.entity.Edificio;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;


@Mapper(componentModel = "spring")
public interface BuildingMapper {

    @Mappings({
            @Mapping(source = "idEdificio", target = "buildingId"),
            @Mapping(source = "tipoEdificio", target = "buildingType"),
            @Mapping(source = "jsonEdificio", target = "buildingJson")
    })
    Building toBuilding(Edificio edificio);

    List<Building> toBuildings(List<Edificio> edificios);

    @InheritInverseConfiguration
    //@Mapping(target = "dispositivoRelList",ignore = true)
    Edificio toEdificio(Building building);
}
