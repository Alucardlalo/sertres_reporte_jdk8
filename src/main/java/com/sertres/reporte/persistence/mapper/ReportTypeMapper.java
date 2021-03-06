package com.sertres.reporte.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import com.sertres.reporte.domain.ReportType;
import com.sertres.reporte.persistence.entity.TipoReporte;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReportTypeMapper {

    @Mappings({
            @Mapping( source = "idTipoReporte" ,target = "reportTypeId"),
            @Mapping( source = "tipoReporte" ,target = "reportType"),
            @Mapping( source = "descripcion" ,target = "descriptionI")
    })
    ReportType toReportType(TipoReporte tipoReporte);

    List<ReportType> toReportTypes(List<TipoReporte> tipoReportes);

    //conversion inversa
    @InheritInverseConfiguration
    @Mapping(target = "reportes",ignore = true)
    @Mapping(target = "variables",ignore = true)
    TipoReporte toTipoReporte(ReportType reportType);
}
