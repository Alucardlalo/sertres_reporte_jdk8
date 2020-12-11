package com.sertres.reporte.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "estado_reporte")
public class EstadoReporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado_reporte")
    private Integer idEstadoReporte;

    @Column(name = "descripcion")
    private String estadoReporteDescripcion;

    public Integer getIdEstadoReporte() {
        return idEstadoReporte;
    }

    public void setIdEstadoReporte(Integer idEstadoReporte) {
        this.idEstadoReporte = idEstadoReporte;
    }

    public String getEstadoReporteDescripcion() {
        return estadoReporteDescripcion;
    }

    public void setEstadoReporteDescripcion(String estadoReporteDescripcion) {
        this.estadoReporteDescripcion = estadoReporteDescripcion;
    }
}
