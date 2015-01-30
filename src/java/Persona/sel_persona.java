/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author (°_°)
 */

@ManagedBean(name="sel_perosna")
public class sel_persona {
    private String persona;

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }
}
