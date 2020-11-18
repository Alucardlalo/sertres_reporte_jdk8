package com.sertres.reporte.persistence;

import com.sertres.reporte.persistence.crud.ReporteCrudRepository;
import com.sertres.reporte.persistence.entity.Reporte;

import java.util.List;

public class ReporteRepository {
    private ReporteCrudRepository reporteCrudRepository;

    //metodo para consultar todos los reportes
    public List<Reporte> GetAll(){
        return (List<Reporte>) reporteCrudRepository.findAll();
    }
}
