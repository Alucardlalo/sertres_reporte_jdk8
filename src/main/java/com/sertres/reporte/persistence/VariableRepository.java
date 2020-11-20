package com.sertres.reporte.persistence;

import com.sertres.reporte.domain.VariableI;
import com.sertres.reporte.domain.repository.VariableIRepository;
import com.sertres.reporte.persistence.crud.VariableCrudRepository;
import com.sertres.reporte.persistence.entity.Variable;
import com.sertres.reporte.persistence.mapper.VariableMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VariableRepository implements VariableIRepository {
    private VariableCrudRepository variableCrudRepository;
    private VariableMapper mapper;

    @Override
    public List<VariableI> GetAll() {
        List<Variable> variables = (List<Variable>) variableCrudRepository.findAll();
        return mapper.toVariblesI(variables);
    }

    @Override
    public List<VariableI> GetByReportTypeId(int reportTypeId) {
        List<Variable> variables = (List<Variable>) variableCrudRepository.findByIdTipoReporte(reportTypeId);
        return mapper.toVariblesI(variables);
    }

    @Override
    public VariableI save(VariableI variableI) {
        Variable variable = mapper.toVariable(variableI);
        return mapper.toVariableI(variableCrudRepository.save(variable));
    }

    @Override
    public void delete(int variableId) {
        variableCrudRepository.deleteById(variableId);

    }


}
