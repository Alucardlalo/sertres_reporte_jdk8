package com.sertres.reporte.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import com.sertres.reporte.domain.Report;
import com.sertres.reporte.persistence.entity.Reporte;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ReportTypeMapper.class})
public interface ReportMapper {

    @Mappings({
            @Mapping(source = "idReporte", target = "reportId"),
            @Mapping(source = "idDispositivo", target = "deviceId"),
            @Mapping(source = "tituloReporte", target = "reportTittle"),
            @Mapping(source = "fechaCompromiso", target = "commitmentDate"),
            @Mapping(source = "fechaInicio", target = "beginDate"),
            @Mapping(source = "fechaFin", target = "endDate"),
            @Mapping(source = "estado", target = "status"),
            @Mapping(source = "idTipoReporte", target = "reportTypeId")
    })
    Report toReport(Reporte reporte);

    //conversion inversa
    @InheritInverseConfiguration
    Reporte toReport(Report report);
}
