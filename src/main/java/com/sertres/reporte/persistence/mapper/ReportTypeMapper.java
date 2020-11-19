package com.sertres.reporte.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import com.sertres.reporte.domain.ReportType;
import com.sertres.reporte.persistence.entity.TipoReporte;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ReportTypeMapper {

    @Mappings({
            @Mapping( source = "idTipoReporte" ,target = "reportTypeId"),
            @Mapping( source = "tipoReporte" ,target = "reportType"),
            @Mapping( source = "descripcion" ,target = "description" )
    })
    ReportType toReportType(TipoReporte tipoReporte);

    //conversion inversa
    @InheritInverseConfiguration
    TipoReporte toTipoReporte(ReportType reportType);
}
