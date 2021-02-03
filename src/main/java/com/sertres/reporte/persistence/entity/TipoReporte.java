package com.sertres.reporte.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Rutina_tipo_reporte")
public class TipoReporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//para el autoincrement
    @Column(name = "id_tipo_reporte")
    private Integer idTipoReporte;

    @Column(name = "tipo_reporte")
    private String tipoReporte;

    private String descripcion;

    @OneToMany(mappedBy = "tipoReporte")
    private List<Reporte> reportes;

    @OneToMany(mappedBy = "tipoReporte")
    private List<Variable> variables;

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

    //geter and setter relacion
    public List<Reporte> getReportes() {
        return reportes;
    }

    public void setReportes(List<Reporte> reportes) {
        this.reportes = reportes;
    }

    public List<Variable> getVariables() {
        return variables;
    }

    public void setVariables(List<Variable> variables) {
        this.variables = variables;
    }
}
