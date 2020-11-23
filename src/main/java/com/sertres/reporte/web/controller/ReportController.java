package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.Report;
import com.sertres.reporte.domain.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/report")
public class ReportController {
    @Autowired
    private ReportService reportService;

    public List<Report> getAll(){
        return reportService.getAll();
    }

    public List<Report> getByReport(int reportId){
        return reportService.getByReport(reportId);
    }

    public List<Report> getByReportName(String reportName){
        return reportService.getByReportName(reportName);
    }

    public Report save(Report report){
        return reportService.save(report);
    }

    public void delete(int reportId){
        reportService.delete(reportId);
    }

}
