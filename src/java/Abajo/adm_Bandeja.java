/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abajo;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author (°_°)
 */
public class adm_Bandeja {
    
    public ArrayList<Proyecto> L_Proyeto(int persona){
        ArrayList<Proyecto> lista=new ArrayList<Proyecto>();
        Proyecto pr=new Proyecto();
         try {
            
            Conexion con = new Conexion();
            con.Ini_con();
            String sql = "SELECT * FROM otri.proyecto where id_persona = "+persona;
            PreparedStatement st = (PreparedStatement) con.Ini_con().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                pr=new Proyecto(rs.getString(2), rs.getString(6), rs.getString(7));
                lista.add(pr);
            }           
            con.Fin_con();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(adm_registro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(adm_registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
