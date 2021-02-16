package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.Report;
import com.sertres.reporte.domain.service.ReportService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reporte")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@Api(description = "This API has a CRUD for Routine report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/all")
    @ApiOperation("Geat all Routine Reports")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
    })
    public List<Report> getAll(){
        return reportService.getAll();
    }

    @GetMapping("/{id}")
    @ApiOperation("Search a Routine Report with an Routine Id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Routine report not found")
    })
    public List<Report> getByReport(@ApiParam(value = "The id of Routine Report",required = true) @PathVariable("id") int reportId){
        return reportService.getByReport(reportId);
    }

    @PostMapping("/save")
    @ApiOperation("Save new Routine report")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Routine Report Created")
    })
    public Report save(@RequestBody Report report){
        return reportService.save(report);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("Delete Routine Report by Id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Routine report delete"),
            @ApiResponse(code = 404, message = "Routine report not found")
    })
    public void delete(@ApiParam(value = "The id of Routine Report",required = true)@PathVariable("id")int reportId){
        reportService.delete(reportId);
    }

}