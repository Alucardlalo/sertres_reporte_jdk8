package com.sertres.reporte.persistence;

import com.sertres.reporte.persistence.crud.ReporteCrudRepository;
import com.sertres.reporte.persistence.entity.Reporte;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReporteRepository {
    private ReporteCrudRepository reporteCrudRepository;

    //metodo para consultar todos los reportes
    public List<Reporte> GetAllReporte(){
        return (List<Reporte>) reporteCrudRepository.findAll();
    }
}
