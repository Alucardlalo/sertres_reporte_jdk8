package com.sertres.reporte.domain.repository;

import com.sertres.reporte.domain.ReportType;
import com.sertres.reporte.persistence.entity.TipoReporte;

import java.util.List;
import java.util.Optional;

public interface ReportTypeRepository {

    List<ReportType> getAll();
    Optional<List<ReportType>> GetReportType(int reportTypeId);
    //save and delete
    ReportType save (ReportType reportType);
    void delete(int reportTypeId);
}
