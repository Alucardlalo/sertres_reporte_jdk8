package com.sertres.reporte.domain.service;

import com.sertres.reporte.domain.VariableData;
import com.sertres.reporte.domain.repository.VariableDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VariableDataService {


    @Autowired
    private VariableDataRepository variableDataRepository;


    public List<VariableData> getAll(){
        return variableDataRepository.GetAll();
    }

    public List<VariableData> getByReportId(int reportId){
        return variableDataRepository.GetByReportId(reportId);
    }

    //save and delete
    public VariableData save(VariableData variableData){
        return variableDataRepository.save(variableData);
    }

    public void delete(int variableDataId){
        variableDataRepository.delete(variableDataId);
    }

}
