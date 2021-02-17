package com.sertres.reporte.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table (name= "dispositivo")
public class Dispositivo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_dispositivo")
    private Integer idDispositivo;

    @Column(name = "nombre_dispositivo")
    private String nombreDispositivo;

    @Column(name = "descripcion_dispositivo")
    private String descripcionDispositivo;

    @Column(name = "marca")
    private String marcaDispositivo;

    @Column(name = "modelo")
    private String modeloDispositivo;

    @Column(name = "serie")
    private String serieDispositivo;

    @Column(name = "tipo_dispositivo")
    private String tipoDispositivo;

    @Column(name = "id_estado_dispositivo")
    private Integer estadoDispositivo;

    @Column(name = "fecha_estado_dispositivo")
    private LocalDateTime ultimaFechaEstado;

    @Column(name = "edificio")
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

    //relaciones con edificio & dispositivo estado
    @ManyToOne
    @JoinColumn(name = "id_estado_dispositivo",insertable = false,updatable = false)
    private EstadoDispositivo estadoDispositivoRel;

    public EstadoDispositivo getEstadoDispositivoRel() {
        return estadoDispositivoRel;
    }

    public void setEstadoDispositivoRel(EstadoDispositivo estadoDispositivoRel) {
        this.estadoDispositivoRel = estadoDispositivoRel;
    }

    @ManyToOne
    @JoinColumn(name = "edificio", insertable = false, updatable = false)
    private Edificio edificioRel;

    public Edificio getEdificioRel() {
        return edificioRel;
    }

    public void setEdificioRel(Edificio edificioRel) {
        this.edificioRel = edificioRel;
    }

    //relacion con reporte
    @OneToMany(mappedBy = "dispositivoRel")
    private List<Reporte> reporteRelList;

    public List<Reporte> getReporteRelList() {
        return reporteRelList;
    }

    public void setReporteRelList(List<Reporte> reporteRelList) {
        this.reporteRelList = reporteRelList;
    }
}
