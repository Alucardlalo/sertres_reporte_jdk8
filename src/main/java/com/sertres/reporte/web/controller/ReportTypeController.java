package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.ReportType;
import com.sertres.reporte.domain.service.ReportTypeService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reporttype")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@Api(description = "This API has a CRUD for Routine report type")
public class ReportTypeController {

    @Autowired
    private ReportTypeService reportTypeService;

    @GetMapping("/all")
    @ApiOperation("Get all Routine report types")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK")
    })
    public List<ReportType> getAll(){
        return reportTypeService.getAll();
    }

    @GetMapping("/{id}")
    @ApiOperation("Search a Routine report type with an Id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Routine report type not found")
    })
    public List<ReportType> getByReportTypeId(@ApiParam(value = "The Routine report type Id",required = true) @PathVariable("id") int ReportTypeId){
        return reportTypeService.getBYReportTypeId(ReportTypeId);
    }
    @GetMapping("/report/{ReportTypeId}")
    public Optional<List<ReportType>> getReportType(@PathVariable("ReportTypeId") int ReportTypeID){
        return reportTypeService.getReportType(ReportTypeID);
    }

    //save and delete
    @PostMapping("/save")
    @ApiOperation("Save new Routine report type")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Routine report type created"),
    })
    public ReportType save(@RequestBody ReportType reportType){
        return reportTypeService.save(reportType);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("delete Routine report type by Id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Routine report type delete"),
            @ApiResponse(code = 404, message = "Routine report type not found")
    })
    public void delete(@ApiParam(value = "The routine report type Id",required = true)@PathVariable("id") int reportTypeId){
         reportTypeService.delete(reportTypeId);
    }

}
