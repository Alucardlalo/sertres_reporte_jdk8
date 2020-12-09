package com.sertres.reporte.persistence.entity;

import javax.persistence.*;

@Entity
@Table (name = "estado_dispositivo")
public class EstadoDispositivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado_dispositivo")
    private Integer idEstadoDispositivo;

    private String descripcion;


    public Integer getIdEstadoDispositivo() {
        return idEstadoDispositivo;
    }

    public void setIdEstadoDispositivo(Integer idEstadoDispositivo) {
        this.idEstadoDispositivo = idEstadoDispositivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
