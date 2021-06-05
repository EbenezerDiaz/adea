package com.ebenezerdiaz.adea.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuarios")
public class Usuario {

    @Id
    @Column(name = "login", length = 20)
    private String login;

    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "cliente", nullable = false)
    private Float cliente;

    @Column(name = "email", nullable = true, length = 50)
    private String email;

    @Column(name = "fecha_alta", nullable = false, updatable = false, columnDefinition = "time without time zone")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;

    @Column(name = "fecha_baja", nullable = true, columnDefinition = "time without time zone")
    private Date fechaBaja;

    @Column(name = "status", nullable = false, columnDefinition = "char(1) default 'A'")
    private Character status;

    @Column(name = "intentos", nullable = false, columnDefinition = "double default 0" )
    private Float intentos;

    @Column(name = "fecha_revocado", nullable = true, columnDefinition = "time without time zone")
    private Date fechaRevocado;

    @Column(name = "fecha_vigencia", nullable = true, columnDefinition = "time without time zone")
    private Date fechaVigencia;

    @Column(name = "no_acceso", nullable = true)
    private Integer noAcceso;

    @Column(name = "apellido_paterno", nullable = true, length = 50)
    private String apellidoPaterno;

    @Column(name = "apellido_materno", nullable = true, length = 50)
    private String apellidoMaterno;

    @Column(name = "area", nullable = true)
    private Integer area;

    @Column(name = "fecha_modificacion", nullable = false, columnDefinition = "time without time zone DEFAULT CURRENT_TIMESTAMP + INTERVAL '1 MONTH'")
    private Date fechaModificacion;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getCliente() {
        return cliente;
    }

    public void setCliente(Float cliente) {
        this.cliente = cliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Float getIntentos() {
        return intentos;
    }

    public void setIntentos(Float intentos) {
        this.intentos = intentos;
    }

    public Date getFechaRevocado() {
        return fechaRevocado;
    }

    public void setFechaRevocado(Date fechaRevocado) {
        this.fechaRevocado = fechaRevocado;
    }

    public Date getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(Date fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public Integer getNoAcceso() {
        return noAcceso;
    }

    public void setNoAcceso(Integer noAcceso) {
        this.noAcceso = noAcceso;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
}
