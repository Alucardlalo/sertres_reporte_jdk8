package com.sertres.reporte.persistence.crud;

import com.sertres.reporte.persistence.entity.Edificio;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EdificioCrudRepository extends CrudRepository <Edificio , Integer> {

    List<Edificio> finByIdEdificio (int idEdificio);
}
