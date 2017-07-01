/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dzulha.bimestral;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author T-
 */
@Entity
@Table(name="TarjetasCredito")

public class TarjetasCredito {
    @Id
    @Column(name="id_sala")
    private Long id;

    public TarjetasCredito(Long id, String Tarjeta, String tipo, Float saldo, date fecha, Clientes idCliente) {
        this.id = id;
        this.Tarjeta = Tarjeta;
        this.tipo = tipo;
        this.saldo = saldo;
        this.fecha = fecha;
        this.idCliente = idCliente;
    }

    public TarjetasCredito() {
    }

    public date getFecha() {
        return fecha;
    }

    public void setFecha(date fecha) {
        this.fecha = fecha;
    }
    @Column(name="Tarjeta")
    private String Tarjeta;
    @Column(name="tipo")
    private String tipo;
   @Column(name="saldo")
    private Float saldo;
   @Column(name="fecha")
   private date fecha;
   @ManyToOne
   @JoinColumn(name="id_Cliente")
    private Clientes idCliente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTarjeta() {
        return Tarjeta;
    }

    public void setTarjeta(String Tarjeta) {
        this.Tarjeta = Tarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Clientes getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Clientes idCliente) {
        this.idCliente = idCliente;
    }
}

