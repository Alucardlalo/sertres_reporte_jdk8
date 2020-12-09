package com.sertres.reporte.persistence.crud;

import com.sertres.reporte.persistence.entity.EstadoDispositivo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EstadoDispositivoCrudRepository extends CrudRepository <EstadoDispositivo, Integer> {

    List<EstadoDispositivo> findByIdEstadoDispositivo (int idEstadoDispositivo);

}
