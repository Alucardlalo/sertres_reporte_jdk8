package com.sertres.reporte.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    private String usuario;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    private String clave;

    @Column(name = "detalles")
    private String detallesUsuario;

    @Column(name = "email")
    private String emailUsuario;

    @Column(name = "ultimo_acceso")
    private LocalDateTime ultimoAcceso;

    @Column(name = "nivel_acceso")
    private Integer nivelAcceso;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDetallesUsuario() {
        return detallesUsuario;
    }

    public void setDetallesUsuario(String detallesUsuario) {
        this.detallesUsuario = detallesUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public LocalDateTime getUltimoAcceso() {
        return ultimoAcceso;
    }

    public void setUltimoAcceso(LocalDateTime ultimoAcceso) {
        this.ultimoAcceso = ultimoAcceso;
    }

    public Integer getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(Integer nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    //relacion user => nivelAcceso
    @ManyToOne
    @JoinColumn(name = "id_nivelacceso", insertable = false, updatable = false)
    private NivelAcceso nivelAccesoRel;

    public NivelAcceso getNivelAccesoRel() {
        return nivelAccesoRel;
    }

    public void setNivelAccesoRel(NivelAcceso nivelAccesoRel) {
        this.nivelAccesoRel = nivelAccesoRel;
    }
}
