package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.Report;
import com.sertres.reporte.domain.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/all")
    public List<Report> getAll(){
        return reportService.getAll();
    }

    @GetMapping("/{id}")
    public List<Report> getByReport(@PathVariable("id") int reportId){
        return reportService.getByReport(reportId);
    }

    /*
    public List<Report> getByReportName(String reportName){
        return reportService.getByReportName(reportName);
    }*/

    @PostMapping("/save")
    public Report save(@RequestBody Report report){
        return reportService.save(report);
    }

    @PostMapping("/delete/{id}")
    public void delete(@PathVariable("id")int reportId){
        reportService.delete(reportId);
    }

}
