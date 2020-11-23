package com.sertres.reporte.persistence.mapper;

import com.sertres.reporte.domain.VariableData;
import com.sertres.reporte.persistence.entity.DatoVariable;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface VariableDataMapper {

    @Mappings({
            @Mapping(source = "idDatoVariable", target = "variableDataId"),
            @Mapping(source = "idReporte", target = "reportId"),
            @Mapping(source = "idVariable", target = "variableId"),
            @Mapping(source = "dato", target = "data")
    })
    VariableData toVariableData(DatoVariable datoVariable);

    //conversion inversa
    @InheritInverseConfiguration
    DatoVariable toDatoVariable(VariableData variableData);

}
