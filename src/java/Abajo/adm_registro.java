/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abajo;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author (°_°)
 */
public class adm_registro {
    
    public boolean existe(String correo){
        boolean ret=false;
        try {
            int i=0;
            Conexion con=new Conexion();
            con.Ini_con();
            String sql="select * from persona where Correo = '"+correo+"'";
            PreparedStatement st=(PreparedStatement)con.Ini_con().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                i++;
            }
            if(i==1){
                ret=true;
            }else{
                ret=false;
            }
            con.Fin_con();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(adm_registro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(adm_registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    public boolean registro(String nombres, String correo, String nacimiento, String oficina, String movil, String institucion, String estudios){
        boolean ret=false;
        try{
            Conexion con=new Conexion();
            con.Ini_con();
            String sql="INSERT INTO otri.persona ( Nombres, Correo, Fecha de Nacimiento, Telefono_Oficina, Telefono_Movil, Institucion, Nivel_de_Estudios, Contraseña) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement st=(PreparedStatement)con.Ini_con().prepareStatement(sql);
            st.setString(1, sql);
            st.setString(2, sql);
            st.setString(3, sql);
            st.setString(4, sql);
            st.setString(5, sql);
            st.setString(6, sql);
            st.setString(7, sql);
            st.executeQuery();
            con.Fin_con();
            ret=true;
        }catch(Exception e){
            ret=false;
        }
        
        return ret;
    }
}
