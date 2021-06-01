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
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion enlace = new Conexion();
        Connection conect = enlace.conectar();
        if(conect == null){
            System.out.println("No se pudo contecar");
        }else{
            System.out.println("Si se pudo conectar");
        }
    }
}
