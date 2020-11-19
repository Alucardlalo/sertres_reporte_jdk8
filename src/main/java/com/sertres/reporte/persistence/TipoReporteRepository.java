package com.sertres.reporte.persistence;

import com.sertres.reporte.persistence.crud.TipoReporteCrudRepository;
import com.sertres.reporte.persistence.entity.TipoReporte;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TipoReporteRepository {
    private TipoReporteCrudRepository tipoReporteCrudRepository;

    //metodo que recupera todos los tipos de reporte
    public List<TipoReporte> GetAllTipoReporte(){
        return (List<TipoReporte>) tipoReporteCrudRepository.findAll();
    }

    //querry method para traer tipo de reporte por id especifico
    public List<TipoReporte> GetByIdTipoReporte(int idTipoReporte){
        return tipoReporteCrudRepository.findByIdTipoReporte(idTipoReporte);
    }

    //retorna un tipo reporte especifico
    public Optional<TipoReporte> GetTipoReporte(int idTipoReporte){
        return tipoReporteCrudRepository.findById(idTipoReporte);
    }

    //salvar un nuevo tipo de reporte
    public TipoReporte saveTipoReporte(TipoReporte tipoReporte){
        return tipoReporteCrudRepository.save(tipoReporte);
    }

    //eliminar un tipo de reporte mediante clave primaria
    public void eliminarTipoReporte(int idTipoReporte){
        tipoReporteCrudRepository.deleteById(idTipoReporte);
    }
}
