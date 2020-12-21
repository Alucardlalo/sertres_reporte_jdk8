package com.sertres.reporte.persistence.crud;

import com.sertres.reporte.persistence.entity.DatoEdificio;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DatoEdificioCrudRepository extends CrudRepository <DatoEdificio , Integer> {

    //List<DatoEdificio> findByIdDatoEdificio(int datoEdificioId);
}
