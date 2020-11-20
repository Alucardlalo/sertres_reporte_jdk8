package com.sertres.reporte.persistence.crud;

import com.sertres.reporte.persistence.entity.TipoReporte;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TipoReporteCrudRepository extends CrudRepository<TipoReporte, Integer> {

    //Querry method para obtener lista de todos los tiposReporte
    List<TipoReporte> findByIdTipoReporte(int idTipoReporte);
    List<TipoReporte> findByIdReporte(int idReporte);
}
