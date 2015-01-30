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
public class Persona {
    private String Nombre;
    private String Correo;
    private String Fecha_de_Nacimiento;
    private String Telefono_Oficina;
    private String Telefono_Movil;
    private String Institución;
    private String Nivel_de_Estudios;
    private String Rol;
    private int id;

    public Persona() {
    }

    public Persona(String Nombre, String Correo, String Fecha_de_Nacimiento, String Telefono_Oficina, String Telefono_Movil, String Institución, String Nivel_de_Estudios, String Rol, int id) {
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Fecha_de_Nacimiento = Fecha_de_Nacimiento;
        this.Telefono_Oficina = Telefono_Oficina;
        this.Telefono_Movil = Telefono_Movil;
        this.Institución = Institución;
        this.Nivel_de_Estudios = Nivel_de_Estudios;
        this.Rol = Rol;
        this.id = id;
    }
 

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getFecha_de_Nacimiento() {
        return Fecha_de_Nacimiento;
    }

    public void setFecha_de_Nacimiento(String Fecha_de_Nacimiento) {
        this.Fecha_de_Nacimiento = Fecha_de_Nacimiento;
    }

    public String getTelefono_Oficina() {
        return Telefono_Oficina;
    }

    public void setTelefono_Oficina(String Telefono_Oficina) {
        this.Telefono_Oficina = Telefono_Oficina;
    }

    public String getTelefono_Movil() {
        return Telefono_Movil;
    }

    public void setTelefono_Movil(String Telefono_Movil) {
        this.Telefono_Movil = Telefono_Movil;
    }

    public String getInstitución() {
        return Institución;
    }

    public void setInstitución(String Institución) {
        this.Institución = Institución;
    }

    public String getNivel_de_Estudios() {
        return Nivel_de_Estudios;
    }

    public void setNivel_de_Estudios(String Nivel_de_Estudios) {
        this.Nivel_de_Estudios = Nivel_de_Estudios;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
