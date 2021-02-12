package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.VariableI;
import com.sertres.reporte.domain.service.VariableIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/variable")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class VariableIController {

    @Autowired
    private VariableIService variableIService;

    @GetMapping("/all")
    public List<VariableI> getAll(){
        return variableIService.getAll();
    }

    @GetMapping("/reporttype/{id}")
    public List<VariableI> getByReportType(@PathVariable("id") int reportType){
        return variableIService.getByReportType(reportType);
    }

    //save and delete
    @PostMapping("/save")
    public VariableI save(@RequestBody VariableI variableI){
        return variableIService.save(variableI);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int variableId){
        variableIService.delete(variableId);
    }
}
