package com.ebenezerdiaz.adea.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class User {

    private String login;

    private String password;

    private String name;

    private Float custumer;

    private String email;

    // fecha_inicial
    private Date startDate;

    // fecha_final
    private Date finishDate;

    private Character status;

    // intentos
    private Float attempts;

    // fecha_revocada
    private Date revokedDate;

    // fecha_vigencia
    private Date effectiveDate;

    // no_acceso
    private Integer noAccess;

    // apellido_paterno
    private String lastName;

    // apellido_materno
    private String secondLastName;

    // area
    private Integer area;

    // fecha_modificacion
    private Date updatedDate;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getCustumer() {
        return custumer;
    }

    public void setCustumer(Float custumer) {
        this.custumer = custumer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Float getAttempts() {
        return attempts;
    }

    public void setAttempts(Float attempts) {
        this.attempts = attempts;
    }

    public Date getRevokedDate() {
        return revokedDate;
    }

    public void setRevokedDate(Date revokedDate) {
        this.revokedDate = revokedDate;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Integer getNoAccess() {
        return noAccess;
    }

    public void setNoAccess(Integer noAccess) {
        this.noAccess = noAccess;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
