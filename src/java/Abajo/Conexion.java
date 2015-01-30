/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abajo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author (°_°)
 */
public class Conexion {
    Connection cone;
    String driver="com.mysql.jdbc.Driver";
    String direccion="jdbc:mysql://10.20.230.192:3306/otri";
    String usuario="root";
    String clave="";
    
    public Connection Ini_con() throws ClassNotFoundException, SQLException{
        Class.forName(driver);
        cone=(Connection)DriverManager.getConnection(direccion, usuario, clave);
        return cone; 
    }
    
    public void Fin_con() throws SQLException{
        cone.close();
    }
}
