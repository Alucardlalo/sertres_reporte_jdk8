package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.ReportType;
import com.sertres.reporte.domain.service.ReportTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reporttype")
public class ReportTypeController {

    @Autowired
    private ReportTypeService reportTypeService;


    public List<ReportType> getAll(){
        return reportTypeService.getAll();
    }

    public List<ReportType> getByReportTypeId(int ReportTypeId){
        return reportTypeService.getBYReportTypeId(ReportTypeId);
    }

    public Optional<List<ReportType>> getReportType(int ReportTypeID){
        return reportTypeService.getReportType(ReportTypeID);
    }

    //save and delete
    public ReportType save(ReportType reportType){
        return reportTypeService.save(reportType);
    }

    public void delete(int reportTypeId){
         reportTypeService.delete(reportTypeId);
    }

}
