package com.sertres.reporte.persistence.crud;

import com.sertres.reporte.persistence.entity.Variable;
import org.springframework.data.repository.CrudRepository;

public interface VariableCrudRepository extends CrudRepository<Variable, Integer> {
}
