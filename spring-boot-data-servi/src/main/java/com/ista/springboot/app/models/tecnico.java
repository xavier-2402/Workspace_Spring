package com.ista.springboot.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codTecnico;
    @Column(nullable = false, length = 10)
    private String username;
    @Column(nullable = false, length = 10)
    private String password;

    public tecnico() {
    }

    public tecnico(Long codTecnico, String username, String password) {
        this.codTecnico = codTecnico;
        this.username = username;
        this.password = password;
    }

    public Long getCodTecnico() {
        return codTecnico;
    }

    public void setCodTecnico(Long codTecnico) {
        this.codTecnico = codTecnico;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
