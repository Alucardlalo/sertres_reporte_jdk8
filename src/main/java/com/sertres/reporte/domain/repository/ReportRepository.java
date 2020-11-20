package com.sertres.reporte.domain.repository;

import com.sertres.reporte.domain.Report;

import java.util.List;
import java.util.Optional;

public interface ReportRepository {
    List<Report> getAll();
    List<Report> GetByReport(int reportId);
    List<Report> GetByNameReport(String reportTittle);
    //save and delete
    Report save(Report report);
    void delete(int reportId);
}
