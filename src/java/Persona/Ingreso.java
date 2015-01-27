/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import Abajo.Persona;
import Abajo.adm_registro;
import java.io.IOException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.bean.ManagedBean;
import javax.servlet.http.HttpServletResponse;
import org.netbeans.saas.google.GoogleAccountsService;
import org.netbeans.saas.RestResponse;

/**
 *
 * @author (°_°)
 */
@ManagedBean
public class Ingreso {
            String accountType = "GOOGLE";
            private String email ;
            private String passwd ;
            String service = "xapi";
            String source = "UD-OTRI-0.2";
            HttpServletResponse response;
            
    public void ing() {
            
        try {
            

            RestResponse result = null;
            try {
                result = GoogleAccountsService.accountsClientLogin(accountType, getEmail(), getPasswd(), service, source);
            } catch (IOException iOException) {
                System.out.println("Error de Autenticación: " + iOException.getMessage());
            }
            System.out.println("Sigue?"+result.getResponseMessage());
                if (result.getResponseCode() == 200) {
                    adm_registro obj = new adm_registro();
                    Persona pp=obj.existe(getEmail());
                    if(pp!=null){
                        FacesContext contex = FacesContext.getCurrentInstance();
                        contex.getExternalContext().redirect( "/Proyecto/Bandeja.jsp" );
                        //response.sendRedirect("Proyecto/Bandeja.jsp");
                    }else{
                        response.sendRedirect("RegistroI2.jsp");
                    }
                    
                } else {
                    System.out.println("Falló");
                    System.out.println("Hubo error en la autenticacion:" + result.getResponseMessage());
                }
            //TODO - Uncomment the print Statement below to print result.
            //System.out.println("The SaasService returned: "+result.getDataAsString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
