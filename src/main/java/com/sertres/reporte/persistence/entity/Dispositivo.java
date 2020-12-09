package com.sertres.reporte.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table (name= "dispositivo")
public class Dispositivo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_dispositivo")
    private Integer idDispositivo;

    @Column(name = "nombre_dispositivo")
    private String nombreDispositivo;

    @Column(name = "descripcion")
    private String descripcionDispositivo;

    @Column(name = "marca")
    private String marcaDispositivo;

    @Column(name = "modelo")
    private String modeloDispositivo;

    @Column(name = "serie")
    private String serieDispositivo;

    @Column(name = "tipo_dispositivo")
    private String tipoDispositivo;

    @Column(name = "estado_dispositivo")
    private Integer estadoDispositivo;

    @Column(name = "ultima_fecha_estado")
    private LocalDateTime ultimaFechaEstado;

    //no necesita @Column porq tiene el mismo nombre que en la base de datos
    private Integer edificio;

    public Integer getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(Integer idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public String getNombreDispositivo() {
        return nombreDispositivo;
    }

    public void setNombreDispositivo(String nombreDispositivo) {
        this.nombreDispositivo = nombreDispositivo;
    }

    public String getDescripcionDispositivo() {
        return descripcionDispositivo;
    }

    public void setDescripcionDispositivo(String descripcionDispositivo) {
        this.descripcionDispositivo = descripcionDispositivo;
    }

    public String getMarcaDispositivo() {
        return marcaDispositivo;
    }

    public void setMarcaDispositivo(String marcaDispositivo) {
        this.marcaDispositivo = marcaDispositivo;
    }

    public String getModeloDispositivo() {
        return modeloDispositivo;
    }

    public void setModeloDispositivo(String modeloDispositivo) {
        this.modeloDispositivo = modeloDispositivo;
    }

    public String getSerieDispositivo() {
        return serieDispositivo;
    }

    public void setSerieDispositivo(String serieDispositivo) {
        this.serieDispositivo = serieDispositivo;
    }

    public String getTipoDispositivo() {
        return tipoDispositivo;
    }

    public void setTipoDispositivo(String tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
    }

    public Integer getEstadoDispositivo() {
        return estadoDispositivo;
    }

    public void setEstadoDispositivo(Integer estadoDispositivo) {
        this.estadoDispositivo = estadoDispositivo;
    }

    public LocalDateTime getUltimaFechaEstado() {
        return ultimaFechaEstado;
    }

    public void setUltimaFechaEstado(LocalDateTime ultimaFechaEstado) {
        this.ultimaFechaEstado = ultimaFechaEstado;
    }

    public Integer getEdificio() {
        return edificio;
    }

    public void setEdificio(Integer edificio) {
        this.edificio = edificio;
    }
}
