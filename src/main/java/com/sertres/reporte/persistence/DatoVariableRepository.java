package com.sertres.reporte.persistence;

import com.sertres.reporte.domain.VariableData;
import com.sertres.reporte.domain.repository.VariableDataRepository;
import com.sertres.reporte.persistence.crud.DatoVariableCrudRepository;
import com.sertres.reporte.persistence.entity.DatoVariable;
import com.sertres.reporte.persistence.mapper.VariableDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DatoVariableRepository implements VariableDataRepository {

    @Autowired
    private DatoVariableCrudRepository datoVariableCrudRepository;

    @Autowired
    private VariableDataMapper mapper;
    //no se han creado los mapeos

    @Override
    public List<VariableData> GetAll() {
        List<DatoVariable> datosVariables = (List<DatoVariable>) datoVariableCrudRepository.findAll();
        return mapper.toVariableDatas(datosVariables);
    }

    @Override
    public List<VariableData> GetByReportId(int ReportId) {
        List<DatoVariable> datoVariables = datoVariableCrudRepository.findByIdReporte(ReportId);
        return mapper.toVariableDatas(datoVariables);
    }

    @Override
    public VariableData save(VariableData variableData) {
        DatoVariable variableData1 = mapper.toDatoVariable(variableData);
        return mapper.toVariableData(datoVariableCrudRepository.save(variableData1));
    }

    @Override
    public void delete (int idDatoVariable){
        datoVariableCrudRepository.deleteById(idDatoVariable);
    }
}
