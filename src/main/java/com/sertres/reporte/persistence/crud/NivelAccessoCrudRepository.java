package com.sertres.reporte.persistence.crud;

import com.sertres.reporte.persistence.entity.NivelAcceso;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NivelAccessoCrudRepository extends CrudRepository <NivelAcceso, Integer> {

    List<NivelAcceso> findByIdNivelAcceso (int idNivelAcceso);

}
