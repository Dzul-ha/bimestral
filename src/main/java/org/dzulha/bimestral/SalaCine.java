/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dzulha.bimestral;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author T-
 */
@Entity
@Table(name="SalaCine")
 

public class SalaCine {
    
    @Id
    @Column(name="id_sala")
    private Long id;
    @Column(name="TituloPelicula")
    private String titulo;
    @Column(name="Clasificacion")
    private String clasidicacion;
    @Column(name="num_asientos")
    private Integer asientos;
    
   public SalaCine(){
   }

    @Override
    public String toString() {
        return "SalaCine{" + "id=" + id + ", titulo=" + titulo + ", clasidicacion=" + clasidicacion + ", asientos=" + asientos + '}';
    }
   

    public SalaCine(Long id, String titulo, String clasidicacion, Integer asientos) {
        this.id = id;
        this.titulo = titulo;
        this.clasidicacion = clasidicacion;
        this.asientos = asientos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getClasidicacion() {
        return clasidicacion;
    }

    public void setClasidicacion(String clasidicacion) {
        this.clasidicacion = clasidicacion;
    }

    public Integer getAsientos() {
        return asientos;
    }

    public void setAsientos(Integer asientos) {
        this.asientos = asientos;
    }

    
    
   

}