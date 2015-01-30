/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import Abajo.Rol;
import Abajo.adm_registro;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author (°_°)
 */
public class Lista_Rol {
    
    private List<Rol> lista;
    adm_registro adm=new adm_registro();
    Map<String,String> datos=new HashMap<String, String>();
    

    public List<Rol> getLista() {
        lista=adm.L_Rol();
        for(int i=0;i<lista.size();i++){
            //datos.
        }
        return lista;
    }

    public void setLista(List<Rol> lista) {
        this.lista = lista;
    }
}
