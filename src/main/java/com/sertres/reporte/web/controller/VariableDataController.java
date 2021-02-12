package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.VariableData;
import com.sertres.reporte.domain.service.VariableDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/variabledata")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class VariableDataController {

    @Autowired
    private VariableDataService variableDataService;

    @GetMapping ("/all")
    public List<VariableData> getAll(){
        return variableDataService.getAll();
    }

    @GetMapping("/report/{id}")
    public List<VariableData> getByReportId(@PathVariable("id") int reportId){
        return variableDataService.getByReportId(reportId);
    }

    //save and delete
    @PostMapping("/save")
    public VariableData save (@RequestBody VariableData variableData){
        return variableDataService.save(variableData);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int variableDataId){
        variableDataService.delete(variableDataId);
    }
}
