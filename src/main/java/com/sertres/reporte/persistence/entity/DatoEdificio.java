package com.sertres.reporte.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "datos_edificio")
public class DatoEdificio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dato_edificio")
    private Integer datoEdificioId;

    @Column(name = "responsable")
    private String datoEdificioResponsable;

    @Column(name = "segundo_contacto")
    private String datoEdificioSegundoContacto;

    @Column(name = "provedor")
    private String datoEdificioProvedor;

    @Column(name = "calle")
    private String datoEdificioCalle;

    @Column(name = "ciudad")
    private String datoEdificioCiudad;

    @Column(name = "cp")
    private Integer datoEdificioCP;

    @Column(name = "estado")
    private String datoEdificioEstado;

    @Column(name = "longitud")
    private String longitudEdificio;

    @Column(name = "latitud")
    private String latitudEdificio;

    public Integer getDatoEdificioId() {
        return datoEdificioId;
    }

    public void setDatoEdificioId(Integer datoEdificioId) {
        this.datoEdificioId = datoEdificioId;
    }

    public String getDatoEdificioResponsable() {
        return datoEdificioResponsable;
    }

    public void setDatoEdificioResponsable(String datoEdificioResponsable) {
        this.datoEdificioResponsable = datoEdificioResponsable;
    }

    public String getDatoEdificioSegundoContacto() {
        return datoEdificioSegundoContacto;
    }

    public void setDatoEdificioSegundoContacto(String datoEdificioSegundoContacto) {
        this.datoEdificioSegundoContacto = datoEdificioSegundoContacto;
    }

    public String getDatoEdificioProvedor() {
        return datoEdificioProvedor;
    }

    public void setDatoEdificioProvedor(String datoEdificioProvedor) {
        this.datoEdificioProvedor = datoEdificioProvedor;
    }

    public String getDatoEdificioCalle() {
        return datoEdificioCalle;
    }

    public void setDatoEdificioCalle(String datoEdificioCalle) {
        this.datoEdificioCalle = datoEdificioCalle;
    }

    public String getDatoEdificioCiudad() {
        return datoEdificioCiudad;
    }

    public void setDatoEdificioCiudad(String datoEdificioCiudad) {
        this.datoEdificioCiudad = datoEdificioCiudad;
    }

    public Integer getDatoEdificioCP() {
        return datoEdificioCP;
    }

    public void setDatoEdificioCP(Integer datoEdificioCP) {
        this.datoEdificioCP = datoEdificioCP;
    }

    public String getDatoEdificioEstado() {
        return datoEdificioEstado;
    }

    public void setDatoEdificioEstado(String datoEdificioEstado) {
        this.datoEdificioEstado = datoEdificioEstado;
    }

    public String getLongitudEdificio() {
        return longitudEdificio;
    }

    public void setLongitudEdificio(String longitudEdificio) {
        this.longitudEdificio = longitudEdificio;
    }

    public String getLatitudEdificio() {
        return latitudEdificio;
    }

    public void setLatitudEdificio(String latitudEdificio) {
        this.latitudEdificio = latitudEdificio;
    }

    //relacion con edificio
    @OneToMany(mappedBy = "datoEdificioRel")
    private List<Edificio> edificiosRelList;

    public List<Edificio> getEdificiosRelList() {
        return edificiosRelList;
    }

    public void setEdificiosRelList(List<Edificio> edificiosRelList) {
        this.edificiosRelList = edificiosRelList;
    }
}
