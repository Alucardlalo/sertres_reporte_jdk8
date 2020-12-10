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

    @Column(name = "json")
    private String jsonEdificio;

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

    public String getJsonEdificio() {
        return jsonEdificio;
    }

    public void setJsonEdificio(String jsonEdificio) {
        this.jsonEdificio = jsonEdificio;
    }

    @OneToMany(mappedBy = "edificioRel")
    private List<Dispositivo> dispositivoRelList;

    public List<Dispositivo> getDispositivoRelList() {
        return dispositivoRelList;
    }

    public void setDispositivoRelList(List<Dispositivo> dispositivoRelList) {
        this.dispositivoRelList = dispositivoRelList;
    }
}
