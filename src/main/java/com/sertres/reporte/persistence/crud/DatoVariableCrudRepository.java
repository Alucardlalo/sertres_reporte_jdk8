package com.sertres.reporte.persistence.crud;

import com.sertres.reporte.persistence.entity.DatoVariable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DatoVariableCrudRepository extends CrudRepository<DatoVariable, Integer> {

    List<DatoVariable> findByIdReporte(int idReporte);
}
