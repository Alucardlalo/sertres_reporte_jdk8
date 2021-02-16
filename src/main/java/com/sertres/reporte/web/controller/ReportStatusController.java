package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.ReportStatus;
import com.sertres.reporte.domain.service.ReportStatusService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reporte/status")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@Api(description = "This API has a CRUD for Routine Report Status")
public class ReportStatusController {

    @Autowired
    private ReportStatusService rStatusService;

    @GetMapping("/all")
    @ApiOperation("get all Routine report status")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK")
    })
    public List<ReportStatus> getAll(){return rStatusService.getAll();}

    //save and delete
    @PostMapping("/save")
    @ApiOperation("Save new Routine report status")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Routine report status created"),
    })
    public ReportStatus save(@RequestBody ReportStatus reportStatus){
        return rStatusService.save(reportStatus);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("Delete Routine report status by Id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Routine report status delete"),
            @ApiResponse(code = 404, message = "Routine report status not found")
    })
    public void delete(@ApiParam(value = "This Id of Routine report status",required = true) @PathVariable("id") int rStatusId){
        rStatusService.delete(rStatusId);
    }
}
