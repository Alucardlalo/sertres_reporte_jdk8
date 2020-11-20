package com.sertres.reporte.persistence;

import com.sertres.reporte.persistence.crud.VariableCrudRepository;
import com.sertres.reporte.persistence.entity.Variable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VariableRepository {
    private VariableCrudRepository variableCrudRepository;

    //metodo para consultar todos los datos de variable
    public List<Variable> GetAllVariable(){
        return (List<Variable>) variableCrudRepository.findAll();
    }

    //mediante id tipo reporte
    public List<Variable> GetByIdTipoReporte(int idTipoReporte){
        return variableCrudRepository.findByIdTipoReporte(idTipoReporte);
    }
    //save and delete
    public Variable save(Variable variable){
        return variableCrudRepository.save(variable);
    }

    public void delete(int idVariable){
        variableCrudRepository.deleteById(idVariable);
    }

}
