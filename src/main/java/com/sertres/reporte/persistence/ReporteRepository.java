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

    //reporte por id
    public List<Reporte> GetByIdReporte(int idReporte){
        return reporteCrudRepository.findByIdReporte(idReporte);
    }

    //busqueda por nombre de reporte
    public List<Reporte> GetByNameReporte(String tituloReporte){
        return reporteCrudRepository.findByNameReporte(tituloReporte);
    }

    //save and delete
    public Reporte save(Reporte reporte){
        return reporteCrudRepository.save(reporte);
    }

    public void delete (int idReporte){
        reporteCrudRepository.deleteById(idReporte);
    }
}
