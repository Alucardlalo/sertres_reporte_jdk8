package com.sertres.reporte.persistence.mapper;

import com.sertres.reporte.domain.VariableI;
import com.sertres.reporte.persistence.entity.Variable;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ReportTypeMapper.class , VariableMapper.class})
public interface VariableMapper {
    @Mappings({
            @Mapping(source = "idVariable", target = "variableId"),
            @Mapping(source = "idTipoReporte", target = "reportTypeId"),
            @Mapping(source = "nombreVariable", target = "variableName"),
            @Mapping(source = "etiquetaVariable", target = "variableLabel"),
            @Mapping(source = "orden", target = "order"),
            @Mapping(source = "tipoReporte",target = "reportType"),
            @Mapping(source = "datoVariable", target = "variableData")
    })
    VariableI toVariableI(Variable variable);

    List<VariableI> toVariblesI(List<Variable> variables);

    //mapeio inverso
    @InheritInverseConfiguration
    Variable toVariable(VariableI variableI);
}
