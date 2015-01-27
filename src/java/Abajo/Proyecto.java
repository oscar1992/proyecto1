/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abajo;

/**
 *
 * @author (°_°)
 */
public class Proyecto {
    private String nombre;
    private String estado;
    private String fase;

    public Proyecto() {
    }

    public Proyecto(String nombre, String estado, String fase) {
        this.nombre = nombre;
        this.estado = estado;
        this.fase = fase;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }
}
