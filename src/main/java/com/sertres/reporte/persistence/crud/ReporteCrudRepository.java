package com.sertres.reporte.persistence.crud;

import com.sertres.reporte.persistence.entity.Reporte;
import org.springframework.data.repository.CrudRepository;

public interface ReporteCrudRepository extends CrudRepository <Reporte, Integer> {
}
