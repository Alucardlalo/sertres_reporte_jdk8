package com.sertres.reporte.domain.service;

import com.sertres.reporte.domain.VariableI;
import com.sertres.reporte.domain.repository.VariableIRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VariableIService {

    @Autowired
    private VariableIRepository variableIRepository;


    public List<VariableI> getAll(){
        return variableIRepository.GetAll();
    }

    public List<VariableI> getByReportType(int reportType){
        return variableIRepository.GetByReportTypeId(reportType);
    }

    //save and delete
    public VariableI save(VariableI variableI){
        return variableIRepository.save(variableI);
    }

    public void delete(int variableId){
        variableIRepository.delete(variableId);
    }

}
