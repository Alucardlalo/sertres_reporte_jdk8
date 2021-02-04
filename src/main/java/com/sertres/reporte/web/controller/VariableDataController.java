package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.VariableData;
import com.sertres.reporte.domain.service.VariableDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/variabledata")
public class VariableDataController {

    @Autowired
    private VariableDataService variableDataService;

    @GetMapping ("/all")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<VariableData> getAll(){
        return variableDataService.getAll();
    }

    @GetMapping("/report/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<VariableData> getByReportId(@PathVariable("id") int reportId){
        return variableDataService.getByReportId(reportId);
    }

    //save and delete
    @PostMapping("/save")
    @CrossOrigin(origins = "http://localhost:3000")
    public VariableData save (@RequestBody VariableData variableData){
        return variableDataService.save(variableData);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int variableDataId){
        variableDataService.delete(variableDataId);
    }
}
