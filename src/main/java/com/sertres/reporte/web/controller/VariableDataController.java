package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.VariableData;
import com.sertres.reporte.domain.service.VariableDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/variabledata")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@Api(description = "This API has a CRUD for Variable Data")
public class VariableDataController {

    @Autowired
    private VariableDataService variableDataService;

    @GetMapping ("/all")
    @ApiOperation("Get all get the content of all routine reports")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK")
    })
    public List<VariableData> getAll(){
        return variableDataService.getAll();
    }

    @GetMapping("/report/{id}")
    @ApiOperation("get the content of Routine report Id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "ok"),
            @ApiResponse(code = 404, message = "Data of Routine report not found")
    })
    public List<VariableData> getByReportId(@PathVariable("id") int reportId){
        return variableDataService.getByReportId(reportId);
    }

    //save and delete
    @PostMapping("/save")
    @ApiOperation("Save new Variable data of Routine report")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Routine report response created"),
    })
    public VariableData save (@RequestBody VariableData variableData){
        return variableDataService.save(variableData);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("delete Response by Routine report")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Response by Routine report delete"),
            @ApiResponse(code = 404, message = "Response by Routine report not found")
    })
    public void delete(@PathVariable("id") int variableDataId){
        variableDataService.delete(variableDataId);
    }
}
