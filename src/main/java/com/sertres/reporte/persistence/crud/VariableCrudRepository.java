package com.sertres.reporte.persistence.crud;

import com.sertres.reporte.persistence.entity.Variable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VariableCrudRepository extends CrudRepository<Variable, Integer> {

    List<Variable> findByIdTipoReporte(int idTipoReporte);
}
