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
public class adm_registro {

    public Persona existe(String correo) {
        Persona pp=new Persona();
        try {
            
            Conexion con = new Conexion();
            con.Ini_con();
            String sql = "select * from persona where Correo = '" + correo + "'";
            PreparedStatement st = (PreparedStatement) con.Ini_con().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                    pp=new Persona(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getInt(1));
            }
           
            con.Fin_con();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(adm_registro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(adm_registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pp;
    }

    public boolean registro(String nombres, String correo, String nacimiento, String oficina, String movil, String institucion, String estudios) {
        boolean ret = false;
        try {
            Conexion con = new Conexion();
            con.Ini_con();
            String sql = "INSERT INTO otri.persona ( Nombres, Correo, Fecha_de_Nacimiento, Telefono_Oficina, Telefono_Movil, Institucion, Nivel_de_Estudios) VALUES (?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement st = (PreparedStatement) con.Ini_con().prepareStatement(sql);
            st.setString(1, nombres);
            st.setString(2, correo);
            st.setString(3, nacimiento);
            st.setString(4, oficina);
            st.setString(5, movil);
            st.setString(6, institucion);
            st.setString(7, estudios);
            //st.setString(8, "1");
            st.executeUpdate();
            con.Fin_con();
            ret = true;
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
            ret = false;
        }

        return ret;
    }

    public ArrayList<Persona> L_Personas_rol() {
        ArrayList<Persona> lista = new ArrayList<Persona>();
        try {
            Persona pp = new Persona();
            Conexion con = new Conexion();
            con.Ini_con();
            String sql = "select Nombres, Correo, Fecha_de_Nacimiento, Telefono_Oficina, Telefono_Movil, Institucion, Nivel_de_Estudios , id_rol , id from persona";
            PreparedStatement st = (PreparedStatement) con.Ini_con().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                pp = new Persona(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), Integer.parseInt(rs.getString(8)), rs.getInt(9));
                lista.add(pp);
            }
            con.Fin_con();
        } catch (Exception e) {
            System.out.println("Error llenado de lista");
        }
        return lista;
    }

    public ArrayList<Rol> L_Rol() {
        ArrayList<Rol> lista = new ArrayList<Rol>();
        try {
            Rol rr = new Rol();
            Conexion con = new Conexion();
            con.Ini_con();
            String sql = "SELECT rol.id, rol.Rol FROM otri.rol;";
            PreparedStatement st = (PreparedStatement) con.Ini_con().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                rr = new Rol(rs.getInt(1), rs.getString(2));
                lista.add(rr);
            }
            con.Fin_con();
        } catch (Exception e) {
            System.out.println("Error llenando la lista de roles");
        }
        return lista;
    }
    
    public Persona T_Persona(int id){
        try {
            Persona pp = new Persona();
            Conexion con = new Conexion();
            con.Ini_con();
            String sql = "select Nombres, Correo, Fecha_de_Nacimiento, Telefono_Oficina, Telefono_Movil, Institucion, Nivel_de_Estudios , id_rol , id from persona where id="+id;
            PreparedStatement st = (PreparedStatement) con.Ini_con().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                pp = new Persona(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), Integer.parseInt(rs.getString(8)), rs.getInt(9));
                
            }
            con.Fin_con();
            return  pp;
        } catch (Exception e) {
            System.out.println("Error llenado de lista");
            return null;
        }
        
    }
    
    public boolean I_Persona(String Nombre, String Correo, String Fecha_de_Nacimiento, String Telefono_Oficina, String Telefono_Movil, String Institución, String Nivel_de_Estudios, int Rol, int id){
        boolean ret=false;
        try {
            Conexion con = new Conexion();
            con.Ini_con();
            String sql = "UPDATE otri.persona SET Nombres ='"+Nombre+"' , Correo = '"+Correo+"', Fecha_de_Nacimiento = '"+Fecha_de_Nacimiento+"', Telefono_Oficina = '"+Telefono_Oficina+"', Telefono_Movil = '"+Telefono_Movil+"', Institucion = '"+Institución+"', Nivel_de_Estudios = '"+Nivel_de_Estudios+"', id_rol = "+Rol+" WHERE id = "+id+";";
            PreparedStatement st = (PreparedStatement) con.Ini_con().prepareStatement(sql);
            st.executeUpdate();
            con.Fin_con();
            ret = true;
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
            ret = false;
        }
        
        return ret;
    }
}
