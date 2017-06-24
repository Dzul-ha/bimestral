/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dzulha.bimestral;

/**
 *
 * @author T-
 */
public class SalaCine {
    private Integer IdSala;
    private String TituloPelicula;
    private String Clasificacion; 
    private Integer num_asientos;

    public SalaCine() {
    }

    public SalaCine(Integer IdSala, String TituloPelicula, String Clasificacion, Integer num_asientos) {
        this.IdSala = IdSala;
        this.TituloPelicula = TituloPelicula;
        this.Clasificacion = Clasificacion;
        this.num_asientos = num_asientos;
    }

    public Integer getIdSala() {
        return IdSala;
    }

    public void setIdSala(Integer IdSala) {
        this.IdSala = IdSala;
    }

    public String getTituloPelicula() {
        return TituloPelicula;
    }

    public void setTituloPelicula(String TituloPelicula) {
        this.TituloPelicula = TituloPelicula;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public Integer getNum_asientos() {
        return num_asientos;
    }

    public void setNum_asientos(Integer num_asientos) {
        this.num_asientos = num_asientos;
    }
    
}
