/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author Kevin
 */
public class Conexion {
    Connection enlazar = null;
    
    public Connection conectar(){
        String usuario = "root";
        String clave = "";
        String url = "jdbc:mysql://localhost:3306/restaurante";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            enlazar = (java.sql.Connection) java.sql.DriverManager.getConnection(url,usuario,clave);
        } catch (Exception e){
            System.out.println("Error No se pudo conectar por "+e);
        }
        return enlazar;
    }
    
    
}
