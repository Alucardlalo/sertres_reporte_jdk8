package com.sertres.reporte.persistence.mapper;

import com.sertres.reporte.domain.ReportStatus;
import com.sertres.reporte.persistence.entity.EstadoReporte;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReportStatusMapper {

    @Mappings({
            @Mapping(source = "idEstadoReporte",target = "reportStatusId"),
            @Mapping(source = "estadoReporteDescripcion",target = "reportStatusDesc")
    })
    ReportStatus toReportStatus (EstadoReporte estadoReporte);

    List<ReportStatus> toReportStatusL (List<EstadoReporte> estadoReporteList);

    @InheritInverseConfiguration
    @Mapping(target = "reporteRelList",ignore = true)
    EstadoReporte toEstadoReporte (ReportStatus reportStatus);
}
