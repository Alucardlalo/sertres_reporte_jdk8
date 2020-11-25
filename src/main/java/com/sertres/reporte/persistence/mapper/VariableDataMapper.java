package com.sertres.reporte.persistence.mapper;

import com.sertres.reporte.domain.VariableData;
import com.sertres.reporte.persistence.entity.DatoVariable;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ReportMapper.class})
public interface VariableDataMapper {

    @Mappings({
            @Mapping(source = "idDatoVariable", target = "variableDataId"),
            @Mapping(source = "idReporte", target = "reportId"),
            @Mapping(source = "idVariable", target = "variableId"),
            @Mapping(source = "dato", target = "data"),
            //@Mapping(source = "reportes1", target = "report1")
    })
    VariableData toVariableData(DatoVariable datoVariable);

    List<VariableData> toVariableDatas(List<DatoVariable> variableDatas);

    //conversion inversa
    @InheritInverseConfiguration
    @Mapping(target = "reportes1",ignore = true)
    DatoVariable toDatoVariable(VariableData variableData);

}
