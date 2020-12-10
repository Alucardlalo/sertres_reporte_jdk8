package com.sertres.reporte.persistence.mapper;

import com.sertres.reporte.domain.AccessLevel;
import com.sertres.reporte.persistence.entity.NivelAcceso;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccessLevelMapper {

    @Mappings({
            @Mapping(source = "idNivelAcceso", target = "accessLevelId"),
            @Mapping(source = "nombreNivelAcceso", target = "accessLevelName"),
            @Mapping(source = "detalleNivelAcceso", target = "accessLevelDetails"),
            @Mapping(source = "tipoNivelAcceso", target = "accessLevelType")
    })
    AccessLevel toAccessLevel (NivelAcceso nivelAcceso);

    List<AccessLevel> toAccessLevels(List<NivelAcceso> nivelAccesoList);

    @InheritInverseConfiguration
    @Mapping(target = "usuarioList",ignore = true)
    NivelAcceso toNivelAcceso(AccessLevel accessLevel);
}
