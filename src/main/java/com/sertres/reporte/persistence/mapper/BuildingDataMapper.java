package com.sertres.reporte.persistence.mapper;

import com.sertres.reporte.domain.BuildingData;
import com.sertres.reporte.persistence.entity.DatoEdificio;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BuildingDataMapper {

    @Mappings({
            @Mapping(source = "datoEdificioId", target = "buildingDataId"),
            @Mapping(source = "datoEdificioResponsable", target = "buildingDataResponsable"),
            @Mapping(source = "datoEdificioSegundoContacto", target = "buildingDataSecondContact"),
            @Mapping(source = "datoEdificioProvedor", target = "buildingDataProvider"),
            @Mapping(source = "datoEdificioCalle", target = "buildingDataStreet"),
            @Mapping(source = "datoEdificioCiudad", target = "buildingDataCity"),
            @Mapping(source = "datoEdificioCP", target = "buildingDataCP"),
            @Mapping(source = "datoEdificioEstado", target = "buildingDataState")
    })
    BuildingData toBuildingData(DatoEdificio datoEdificio);

    List<BuildingData> toBuildingsData(List<DatoEdificio> datoEdificioList);

    //conversion inversa
    @InheritInverseConfiguration
    DatoEdificio toDatoEdificio(BuildingData buildingData);
}
