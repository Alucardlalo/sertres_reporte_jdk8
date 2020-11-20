package com.sertres.reporte.domain.repository;

import com.sertres.reporte.domain.VariableData;
import com.sertres.reporte.persistence.entity.DatoVariable;

import java.util.List;

public interface VariableDataRepository {

    List<VariableData> GetAll();
    List<VariableData> GetByReportId(int ReportId);

    //save and delete
    VariableData save(VariableData variableData);
    void delete(int variableDataId);
}
