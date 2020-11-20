package com.sertres.reporte.persistence.mapper;

import com.sertres.reporte.domain.VariableI;
import com.sertres.reporte.persistence.entity.Variable;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ReportTypeMapper.class , })
public interface VariableMapper {
    @Mappings({
            @Mapping(source = "idVariable", target = "variableId"),
            @Mapping(source = "tipoReporte", target = "reportType"),
            @Mapping(source = "nombreVariable", target = "variableName"),
            @Mapping(source = "etiquetaVariable", target = "variableLabel"),
            @Mapping(source = "orden", target = "order")
    })
    Variable toVariableI(VariableI variableI);

    //mapeio inverso
    @InheritInverseConfiguration
    VariableI toVariable(Variable variable);
}
