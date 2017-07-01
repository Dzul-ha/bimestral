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
@Table(name="Clientes")


public class Clientes {
    
    @Id
    @Column(name="id_Cliente")
    private Long idCliente;

    public Clientes(Long idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
    }

    public Clientes(Long idCliente, String nombre, int Tarjetas) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.Tarjetas = Tarjetas;
    }

    public Clientes() {
    }
    @Column(name="nombre")
    private String nombre;
    @Column(name="num_tarjetas")
    private int Tarjetas;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTarjetas() {
        return Tarjetas;
    }

    public void setTarjetas(int Tarjetas) {
        this.Tarjetas = Tarjetas;
    }
    }
