package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.ReportType;
import com.sertres.reporte.domain.service.ReportTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reporttype")
public class ReportTypeController {

    @Autowired
    private ReportTypeService reportTypeService;

    @GetMapping("/all")
    public List<ReportType> getAll(){
        return reportTypeService.getAll();
    }

    @GetMapping("/{id}")
    public List<ReportType> getByReportTypeId(@PathVariable("id") int ReportTypeId){
        return reportTypeService.getBYReportTypeId(ReportTypeId);
    }
    @GetMapping("/report/{ReportTypeId}")
    public Optional<List<ReportType>> getReportType(@PathVariable("ReportTypeId") int ReportTypeID){
        return reportTypeService.getReportType(ReportTypeID);
    }

    //save and delete
    @PostMapping("/save")
    public ReportType save(@RequestBody ReportType reportType){
        return reportTypeService.save(reportType);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int reportTypeId){
         reportTypeService.delete(reportTypeId);
    }

}
