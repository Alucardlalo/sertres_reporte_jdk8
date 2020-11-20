package com.sertres.reporte.persistence;

import com.sertres.reporte.persistence.crud.DatoVariableCrudRepository;
import com.sertres.reporte.persistence.entity.DatoVariable;

import java.util.List;

public class DatoVariableRepository {
    private DatoVariableCrudRepository datoVariableCrudRepository;

    //metodo para recuperar todos los datos variable
    public List<DatoVariable> GetAllDatoVariable(){
        return (List<DatoVariable>) datoVariableCrudRepository.findAll();
    }

    //obtener Dato variable mediante id reporte
    public List<DatoVariable> GetByIdReporte(int idReporte){
        return datoVariableCrudRepository.findByIdReporte(idReporte);
    }

    //save and delete
    public DatoVariable save(DatoVariable datoVariable){
        return datoVariableCrudRepository.save(datoVariable);
    }

    public void delete (int idDatoVariable){
        datoVariableCrudRepository.deleteById(idDatoVariable);
    }
}
