package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.Report;
import com.sertres.reporte.domain.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reporte")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/all")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Report> getAll(){
        return reportService.getAll();
    }

    @GetMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Report> getByReport(@PathVariable("id") int reportId){
        return reportService.getByReport(reportId);
    }


    @PostMapping("/save")
    @CrossOrigin(origins = "http://localhost:3000")
    public Report save(@RequestBody Report report){
        return reportService.save(report);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id")int reportId){
        reportService.delete(reportId);
    }

}