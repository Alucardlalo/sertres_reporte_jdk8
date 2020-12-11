package com.sertres.reporte.domain.repository;

import com.sertres.reporte.domain.ReportStatus;

import java.util.List;

public interface ReportStatusRepository {

    List<ReportStatus> getAll();

    //save and delete
    ReportStatus save (ReportStatus reportStatus);
    void delete(int reportStatusId);
}
