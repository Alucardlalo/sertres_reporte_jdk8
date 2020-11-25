package com.sertres.reporte.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "dato_variable")
public class DatoVariable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dato_variable")
    private Integer idDatoVariable;

    @Column(name = "id_reporte")
    private Integer idReporte;

    @Column(name = "id_variable")
    private Integer idVariable;

    private String dato;

    @OneToMany(mappedBy = "datoVariable")
    private List<Reporte> reportes1;

    public List<Reporte> getReportes1() {
        return reportes1;
    }

    public void setReportes1(List<Reporte> reportes1) {
        this.reportes1 = reportes1;
    }

    public Integer getIdDatoVariable() {
        return idDatoVariable;
    }

    public void setIdDatoVariable(Integer idDatoVariable) {
        this.idDatoVariable = idDatoVariable;
    }

    public Integer getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(Integer idReporte) {
        this.idReporte = idReporte;
    }

    public Integer getIdVariable() {
        return idVariable;
    }

    public void setIdVariable(Integer idVariable) {
        this.idVariable = idVariable;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

}
