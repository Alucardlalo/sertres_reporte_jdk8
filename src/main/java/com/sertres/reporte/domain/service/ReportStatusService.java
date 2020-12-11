package com.sertres.reporte.domain.service;

import com.sertres.reporte.domain.ReportStatus;
import com.sertres.reporte.domain.repository.ReportStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportStatusService {

    @Autowired
    private ReportStatusRepository reportStatusRepository;

    public List<ReportStatus> getAll(){
        return reportStatusRepository.getAll();
    }

    public ReportStatus save(ReportStatus reportStatus){
        return reportStatusRepository.save(reportStatus);
    }

    public void delete(int reportStatusId){
        reportStatusRepository.delete(reportStatusId);
    }
}
