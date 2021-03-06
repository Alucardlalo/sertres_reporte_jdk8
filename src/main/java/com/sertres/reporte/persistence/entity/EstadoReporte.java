package com.sertres.reporte.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Rutina_estado_Reporte")
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

    //relacion con reporte
    @OneToMany(mappedBy = "estadoReporteRel")
    private List<Reporte> reporteRelList;

    public List<Reporte> getReporteRelList() {
        return reporteRelList;
    }

    public void setReporteRelList(List<Reporte> reporteRelList) {
        this.reporteRelList = reporteRelList;
    }
}
