package com.sertres.reporte.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "tipo_reporte")
public class TipoReporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//para el autoincrement
    @Column(name = "id_tipo_reporte")
    private Integer idTipoReporte;

    @Column(name = "tipo_reporte")
    private String tipoReporte;

    private String descripcion;


    public Integer getIdTipoReporte() {
        return idTipoReporte;
    }

    public void setIdTipoReporte(Integer idTipoReporte) {
        this.idTipoReporte = idTipoReporte;
    }

    public String getTipoReporte() {
        return tipoReporte;
    }

    public void setTipoReporte(String tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
