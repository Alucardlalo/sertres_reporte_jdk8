package com.sertres.reporte.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reporte")
public class Reporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reporte")
    private Integer idReporte;

    @Column(name = "id_tipo_reporte")
    private Integer idTipoReporte;

    @Column(name = "id_dispositivo")
    private Integer idDispositivo;

    @Column(name = "titulo_reporte")
    private String tituloReporte;

    @Column(name = "fecha_compromiso")
    private LocalDateTime fechaCompromiso;

    @Column(name = "fecha_inicio")
    private LocalDateTime fechaInicio;

    @Column(name = "fecha_fin")
    private LocalDateTime fechaFin;

    @Column(name = "estado")
    private Integer estadoReporte;

    @Column(name = "revisionatm")
    private boolean revisionATM;

    @Column(name = "elaborado_por")
    private Integer elaboradoPor;

    @Column(name = "id_elaboracion")
    private String idElaboracion;

    @ManyToOne//relacion reporte tipoReporte
    @JoinColumn(name = "id_tipo_reporte", insertable = false, updatable = false)
    private TipoReporte tipoReporte;

    @ManyToOne
    @JoinColumn(name = "id_reporte", insertable = false, updatable = false)
    private DatoVariable datoVariable;


    public Integer getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(Integer idReporte) {
        this.idReporte = idReporte;
    }

    public Integer getIdTipoReporte() {
        return idTipoReporte;
    }

    public void setIdTipoReporte(Integer idTipoReporte) {
        this.idTipoReporte = idTipoReporte;
    }

    public Integer getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(Integer idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public String getTituloReporte() {
        return tituloReporte;
    }

    public void setTituloReporte(String tituloReporte) {
        this.tituloReporte = tituloReporte;
    }

    public LocalDateTime getFechaCompromiso() {
        return fechaCompromiso;
    }

    public void setFechaCompromiso(LocalDateTime fechaCompromiso) {
        this.fechaCompromiso = fechaCompromiso;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getEstadoReporte() {
        return estadoReporte;
    }

    public void setEstadoReporte(Integer estadoReporte) {
        this.estadoReporte = estadoReporte;
    }

    //geter y setter relacion
    public TipoReporte getTipoReporte() {
        return tipoReporte;
    }

    public void setTipoReporte(TipoReporte tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    public DatoVariable getDatoVariable() {
        return datoVariable;
    }

    public void setDatoVariable(DatoVariable datoVariable) {
        this.datoVariable = datoVariable;
    }

    public boolean isRevisionATM() {
        return revisionATM;
    }

    public void setRevisionATM(boolean revisionATM) {
        this.revisionATM = revisionATM;
    }

    public Integer getElaboradoPor() {
        return elaboradoPor;
    }

    public void setElaboradoPor(Integer elaboradoPor) {
        this.elaboradoPor = elaboradoPor;
    }

    public String getIdElaboracion() {
        return idElaboracion;
    }

    public void setIdElaboracion(String idElaboracion) {
        this.idElaboracion = idElaboracion;
    }

    //relacion con dispositivo y estado dispositivo
    @ManyToOne
    @JoinColumn(name = "id_dispositivo",insertable = false, updatable = false)
    private Dispositivo dispositivoRel;

    public Dispositivo getDispositivoRel() {
        return dispositivoRel;
    }

    public void setDispositivoRel(Dispositivo dispositivoRel) {
        this.dispositivoRel = dispositivoRel;
    }

    @ManyToOne
    @JoinColumn(name = "estado",insertable = false,updatable = false)
    private EstadoReporte estadoReporteRel;

    public EstadoReporte getEstadoReporteRel() {
        return estadoReporteRel;
    }

    public void setEstadoReporteRel(EstadoReporte estadoReporteRel) {
        this.estadoReporteRel = estadoReporteRel;
    }

    @ManyToOne
    @JoinColumn(name = "elaborado_por",insertable = false,updatable = false)
    private Usuario usuarioRel;

    public Usuario getUsuarioRel() {
        return usuarioRel;
    }

    public void setUsuarioRel(Usuario usuarioRel) {
        this.usuarioRel = usuarioRel;
    }
}
