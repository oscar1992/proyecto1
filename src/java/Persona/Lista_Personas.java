/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import Abajo.Persona;
import Abajo.Rol;
import Abajo.adm_registro;
import java.io.IOException;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;


/**
 *
 * @author (°_°)
 */

@ManagedBean(name="personas")

public class Lista_Personas {
    
    private List<Persona> lista;
    private String sele;
    adm_registro adm=new adm_registro();    
    static boolean mt1=false;
    static private Persona objp;
    static int quien;
    
    public List<Persona> getLista() {        
        lista=adm.L_Personas_rol(); 
        return lista;
    }

    public void setLista(List<Persona> lista) {
        this.lista = lista;
    }

    public String getSele() {
        return sele;
    }

    public void setSele(String sele) {
        this.sele = sele;
    }
    
    public void mmm(ActionEvent eve, int id) throws IOException{
        FacesContext contex = FacesContext.getCurrentInstance();
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "OOOOOOO",  null);
        System.out.println("ihopih: "+quien);
        quien=id;
        for (Persona lista1 : lista) {
            if (lista1.getId() == quien) {
                objp = lista1;
            }
        }
        System.out.println("antes: "+mt1+" quien: "+quien);
        
        if(mt1){
            //mt1=false;
        }else{
            mt1=true;
        }        
        System.out.println("tt2: "+mt1);
        contex.addMessage(null, message);
        //System.out.println("ihopih: "+quien);
    }
    
    public void mos(ActionEvent eve){
        
    }

    public boolean isMt1() {
        return mt1;
    }

    public void setMt1(boolean mt1) {
        this.mt1 = mt1;
    }

    public Persona getObjp() {
        return objp;
    }

    public void setObjp(Persona objp) {
        this.objp = objp;
    }

    public int getQuien() {
        return quien;
    }

    public void setQuien(int quien) {
        this.quien = quien;
    }
   
    
    
}
