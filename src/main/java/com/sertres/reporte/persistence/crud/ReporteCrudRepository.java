package com.sertres.reporte.persistence.crud;

import com.sertres.reporte.persistence.entity.Reporte;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReporteCrudRepository extends CrudRepository <Reporte, Integer> {

    //Querry method para obtener lista de todos los Reportes
    List<Reporte> findByIdReporte(int idReporte);
    //List<Reporte> findByNameReporte(String tituloReporte);
}
