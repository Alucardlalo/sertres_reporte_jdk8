package com.sertres.reporte.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "nivel_acceso")
public class NivelAcceso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nivelacceso")
    private Integer idNivelAcceso;

    @Column(name = "nombre")
    private String nombreNivelAcceso;

    @Column(name = "detalles")
    private String detalleNivelAcceso;

    @Column(name = "tipo")
    private String tipoNivelAcceso;


    public Integer getIdNivelAcceso() {
        return idNivelAcceso;
    }

    public void setIdNivelAcceso(Integer idNivelAcceso) {
        this.idNivelAcceso = idNivelAcceso;
    }

    public String getNombreNivelAcceso() {
        return nombreNivelAcceso;
    }

    public void setNombreNivelAcceso(String nombreNivelAcceso) {
        this.nombreNivelAcceso = nombreNivelAcceso;
    }

    public String getDetalleNivelAcceso() {
        return detalleNivelAcceso;
    }

    public void setDetalleNivelAcceso(String detalleNivelAcceso) {
        this.detalleNivelAcceso = detalleNivelAcceso;
    }

    public String getTipoNivelAcceso() {
        return tipoNivelAcceso;
    }

    public void setTipoNivelAcceso(String tipoNivelAcceso) {
        this.tipoNivelAcceso = tipoNivelAcceso;
    }

    //relacion con user

}
