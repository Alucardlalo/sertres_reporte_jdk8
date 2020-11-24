package com.sertres.reporte.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import com.sertres.reporte.domain.Report;
import com.sertres.reporte.persistence.entity.Reporte;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ReportTypeMapper.class})
public interface ReportMapper {

    @Mappings({
            @Mapping(source = "idReporte", target = "reportId"),
            @Mapping(source = "idTipoReporte", target = "reportTypeId"),
            @Mapping(source = "idDispositivo", target = "deviceId"),
            @Mapping(source = "tituloReporte", target = "reportTittle"),
            @Mapping(source = "fechaCompromiso", target = "commitmentDate"),
            @Mapping(source = "fechaInicio", target = "beginDate"),
            @Mapping(source = "fechaFin", target = "endDate"),
            @Mapping(source = "estado", target = "status"),
            @Mapping(source = "tipoReporte" , target = "reportType")
    })
    Report toReport(Reporte reporte);

    List<Report> toReports(List<Reporte> reportes);

    //conversion inversa
    @InheritInverseConfiguration
    @Mapping(target = "tipoReporte", ignore = true)
    @Mapping(target = "datoVariable", ignore = true)
    Reporte toReport(Report report);
}
