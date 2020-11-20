package com.sertres.reporte.domain.repository;

import com.sertres.reporte.domain.VariableI;

import java.util.List;

public interface VariableRepository {

    List<VariableI> GetAll();
    List<VariableI> GetByReportTypeId(int reportTypeId);

    //save and delete
    VariableI save(VariableI variableI);
    void delete (int variableId);

}
