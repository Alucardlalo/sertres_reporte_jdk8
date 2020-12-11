package com.sertres.reporte.persistence.crud;

import com.sertres.reporte.persistence.entity.EstadoReporte;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EstadoReporteCrudRepository extends CrudRepository <EstadoReporte, Integer> {

    List<EstadoReporte> findByIdEstadoReporte(int idEstadoReporte);
}
