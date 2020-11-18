package com.sertres.reporte.persistence;

import com.sertres.reporte.persistence.crud.VariableCrudRepository;
import com.sertres.reporte.persistence.entity.Variable;

import java.util.List;

public class VariableRepository {
    private VariableCrudRepository variableCrudRepository;

    //metodo para consultar todos los datos de variable
    public List<Variable> GetAllVariable(){
        return (List<Variable>) variableCrudRepository.findAll();
    }
}
