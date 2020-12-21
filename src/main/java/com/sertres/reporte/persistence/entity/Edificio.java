package com.sertres.reporte.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "edificio")
public class Edificio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_edificio")
    private Integer idEdificio;

    @Column(name = "tipo")
    private String TipoEdificio;

    @Column(name = "datos_edificio")
    private Integer datos_edificio;

    public Integer getIdEdificio() {
        return idEdificio;
    }

    public void setIdEdificio(Integer idEdificio) {
        this.idEdificio = idEdificio;
    }

    public String getTipoEdificio() {
        return TipoEdificio;
    }

    public void setTipoEdificio(String tipoEdificio) {
        TipoEdificio = tipoEdificio;
    }

    public Integer getDatos_edificio() {
        return datos_edificio;
    }

    public void setDatos_edificio(Integer datos_edificio) {
        this.datos_edificio = datos_edificio;
    }

    //relacion con dispositivo
    @OneToMany(mappedBy = "edificioRel")
    private List<Dispositivo> dispositivoRelList;

    public List<Dispositivo> getDispositivoRelList() {
        return dispositivoRelList;
    }

    public void setDispositivoRelList(List<Dispositivo> dispositivoRelList) {
        this.dispositivoRelList = dispositivoRelList;
    }

    @ManyToOne
    @JoinColumn(name = "datos_edificio",insertable = false,updatable = false)
    private DatoEdificio datoEdificioRel;

    public DatoEdificio getDatoEdificioRel() {
        return datoEdificioRel;
    }

    public void setDatoEdificioRel(DatoEdificio datoEdificioRel) {
        this.datoEdificioRel = datoEdificioRel;
    }
}
