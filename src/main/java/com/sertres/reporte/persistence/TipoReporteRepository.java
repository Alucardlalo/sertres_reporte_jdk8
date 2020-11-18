package com.sertres.reporte.persistence;

import com.sertres.reporte.persistence.crud.TipoReporteCrudRepository;
import com.sertres.reporte.persistence.entity.TipoReporte;

import java.util.List;

public class TipoReporteRepository {
    private TipoReporteCrudRepository tipoReporteCrudRepository;

    //metodo que recupera todos los tipos de reporte
    public List<TipoReporte> GetAll(){
        return (List<TipoReporte>) tipoReporteCrudRepository.findAll();
    }
}
