package com.sertres.reporte.persistence.mapper;

import com.sertres.reporte.domain.VariableData;
import com.sertres.reporte.persistence.entity.DatoVariable;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")//, uses = {ReportMapper.class , VariableMapper.class})
public interface VariableDataMapper {

    @Mappings({
            @Mapping(source = "idDatoVariable", target = "variableDataId"),
            @Mapping(source = "idReporte", target = "reportId"),
            @Mapping(source = "idVariable", target = "variableId"),
            @Mapping(source = "dato", target = "data")
           // @Mapping(source = "reportes", target = "reports"),
            //@Mapping(source = "variables", target = "variablesI")
    })
    VariableData toVariableData(DatoVariable datoVariable);

    //conversion inversa
    @InheritInverseConfiguration
    DatoVariable toDatoVariable(VariableData variableData);

}
