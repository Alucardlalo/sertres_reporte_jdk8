package com.sertres.reporte.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "estado_dispositivo")
public class EstadoDispositivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado_dispositivo")
    private Integer idEstadoDispositivo;

    @Column(name = "descripcion")
    private String estadoDispositivoDescripcion;


    public Integer getIdEstadoDispositivo() {
        return idEstadoDispositivo;
    }

    public void setIdEstadoDispositivo(Integer idEstadoDispositivo) {
        this.idEstadoDispositivo = idEstadoDispositivo;
    }

    public String getEstadoDispositivoDescripcion() {
        return estadoDispositivoDescripcion;
    }

    public void setEstadoDispositivoDescripcion(String estadoDispositivoDescripcion) {
        this.estadoDispositivoDescripcion = estadoDispositivoDescripcion;
    }

    //relacion estadodispositivo & dispositivo
    @OneToMany(mappedBy = "estadoDispositivoRel")
    private List<Dispositivo> dispositivoRelList;

    public List<Dispositivo> getDispositivoRelList() {
        return dispositivoRelList;
    }

    public void setDispositivoRelList(List<Dispositivo> dispositivoRelList) {
        this.dispositivoRelList = dispositivoRelList;
    }

}
