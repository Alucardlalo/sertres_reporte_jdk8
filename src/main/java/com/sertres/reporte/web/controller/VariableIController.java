package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.VariableI;
import com.sertres.reporte.domain.service.VariableIService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/variable")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@Api(description = "This API has a CRUD for Questions of Routine report type")
public class VariableIController {

    @Autowired
    private VariableIService variableIService;

    @GetMapping("/all")
    @ApiOperation("get all Questions of all Routine report type")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
    })
    public List<VariableI> getAll(){
        return variableIService.getAll();
    }

    @GetMapping("/reporttype/{id}")
    @ApiOperation("Search Questions of routine report type")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Routine report type questions"),
            @ApiResponse(code = 404, message = "Routine report type not found")
    })
    public List<VariableI> getByReportType(@ApiParam(value = "This Report type Id",required = true) @PathVariable("id") int reportType){
        return variableIService.getByReportType(reportType);
    }

    //save and delete
    @PostMapping("/save")
    @ApiOperation("Save new Question of Routine report type")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Question created"),
    })
    public VariableI save(@RequestBody VariableI variableI){
        return variableIService.save(variableI);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("delete Question")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Question by Routine report type delete"),
            @ApiResponse(code = 404, message = "Question by Routine report type not found")
    })
    public void delete(@PathVariable("id") int variableId){
        variableIService.delete(variableId);
    }
}
