package com.sertres.reporte.persistence.crud;

import com.sertres.reporte.persistence.entity.Dispositivo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DispositivoCrudRepository extends CrudRepository <Dispositivo , Integer> {

    List<Dispositivo> findByIdDispositivo(int idDispositivo);
    List<Dispositivo> findByIdEstadoDispositivo(int idEstado);

}
