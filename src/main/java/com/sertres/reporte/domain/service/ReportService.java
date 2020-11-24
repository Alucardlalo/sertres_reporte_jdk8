package com.sertres.reporte.domain.service;

import com.sertres.reporte.domain.Report;
import com.sertres.reporte.domain.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRepository;

    //todos los reportes
    public List<Report> getAll(){
        return reportRepository.getAll();
    }

    public List<Report> getByReport(int reportId){
        return reportRepository.GetByReport(reportId);
    }



    //save and delete
    public Report save(Report report){
        return reportRepository.save(report);
    }

    public void delete(int reportId){
        reportRepository.delete(reportId);
    }

    /*se debe cambiar por un opcional en reportRepository
    //delete real
    public boolean delete(int reportID) {
        return getByReport(reportId).stream().map(Report -> {
            reportRepository.delete(reportId);
            return true;
        }).orElse(False);
    }*/
}
