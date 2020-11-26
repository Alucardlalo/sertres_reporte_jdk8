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

    @ManyToOne
    @JoinColumn(name = "id_reporte",updatable = false,insertable = false)
    private Reporte reporteDatoV;

    public Reporte getReporteDatoV() {
        return reporteDatoV;
    }

    public void setReporteDatoV(Reporte reporteDatoV) {
        this.reporteDatoV = reporteDatoV;
    }
}
