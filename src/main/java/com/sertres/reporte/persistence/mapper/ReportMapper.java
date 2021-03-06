package com.sertres.reporte.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import com.sertres.reporte.domain.Report;
import com.sertres.reporte.persistence.entity.Reporte;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ReportTypeMapper.class , DeviceMapper.class, ReportStatusMapper.class , UserMapper.class})
public interface ReportMapper {

    @Mappings({
            @Mapping(source = "idReporte", target = "reportId"),
            @Mapping(source = "idTipoReporte", target = "reportTypeId"),
            @Mapping(source = "idDispositivo", target = "deviceId"),
            @Mapping(source = "tituloReporte", target = "reportTittle"),
            @Mapping(source = "fechaCompromiso", target = "commitmentDate"),
            @Mapping(source = "fechaInicio", target = "beginDate"),
            @Mapping(source = "fechaFin", target = "endDate"),
            @Mapping(source = "estadoReporte", target = "status"),
            @Mapping(source = "tipoReporte" , target = "reportType"),
            @Mapping(source = "revisionATM",target = "reviewATM"),
            @Mapping(source = "elaboradoPor",target = "createdBy"),
            @Mapping(source = "idElaboracion",target = "idCreated"),
            @Mapping(source = "dispositivoRel",target = "deviceRel"),
            @Mapping(source = "estadoReporteRel",target = "reportStatusRel"),
            @Mapping(source = "usuarioRel",target = "userRel")
    })
    Report toReport(Reporte reporte);

    List<Report> toReports(List<Reporte> reportes);

    //conversion inversa
    @InheritInverseConfiguration
    @Mapping(target = "tipoReporte", ignore = true)
    @Mapping(target = "datoVariable", ignore = true)
    @Mapping(target = "dispositivoRel",ignore = true)
    @Mapping(target = "estadoReporteRel",ignore = true)
    @Mapping(target = "usuarioRel",ignore = true)
    Reporte toReport(Report report);
}
