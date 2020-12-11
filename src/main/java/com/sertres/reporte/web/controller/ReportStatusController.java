package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.ReportStatus;
import com.sertres.reporte.domain.service.ReportStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reporte/status")
public class ReportStatusController {

    @Autowired
    private ReportStatusService rStatusService;

    @GetMapping("/all")
    public List<ReportStatus> getAll(){return rStatusService.getAll();}

    //save and delete
    @PostMapping("/save")
    public ReportStatus save(@RequestBody ReportStatus reportStatus){
        return rStatusService.save(reportStatus);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int rStatusId){
        rStatusService.delete(rStatusId);
    }
}
