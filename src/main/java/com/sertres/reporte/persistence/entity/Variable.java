package com.sertres.reporte.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "variables")
public class Variable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_variable")
    private Integer idVariable;

    @Column(name = "id_tipo_reporte")
    private Integer idTipoReporte;

    @Column(name = "nombre_variable")
    private String nombreVariable;

    @Column(name = "etiqueta_variable")
    private String etiquetaVariable;

    private Integer orden;

    @ManyToOne//relacion reporte tipoReporte
    @JoinColumn(name = "id_tipo_reporte",insertable = false, updatable = false)
    private TipoReporte tipoReporte;

    @ManyToOne
    @JoinColumn(name = "id_variable",insertable = false, updatable = false)
    private DatoVariable datoVariable;

    public Integer getIdVariable() {
        return idVariable;
    }

    public void setIdVariable(Integer idVariable) {
        this.idVariable = idVariable;
    }

    public Integer getIdTipoReporte() {
        return idTipoReporte;
    }

    public void setIdTipoReporte(Integer idTipoReporte) {
        this.idTipoReporte = idTipoReporte;
    }

    public String getNombreVariable() {
        return nombreVariable;
    }

    public void setNombreVariable(String nombreVariable) {
        this.nombreVariable = nombreVariable;
    }

    public String getEtiquetaVariable() {
        return etiquetaVariable;
    }

    public void setEtiquetaVariable(String etiquetaVariable) {
        this.etiquetaVariable = etiquetaVariable;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

}
