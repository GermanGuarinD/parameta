/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author German G
 */
public class Conexion {
    String bd="parameta";
    String url="jdbc:mysql://localhost:3306/";
    String user="root";
    String password="123456";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection cx;
    
    
   /* private static String url = "jdbc:mysql://localhost:3306/parameta";
    private static String user = "root";
    private static String password = "123456";
    public static Connection getConnection(){
        Connection connection = null;
        
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            

        }
        catch (SQLException ex)
        {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }*/

    public Conexion() {        
    }
    
    public Connection conectar(){
        try {
            Class.forName(driver);
            cx=DriverManager.getConnection(url+bd,user,password);
            System.out.println("SE CONECTO A LA BASE DE DATOWS");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("NO SE CONECTÓ");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }
    
    public void desconectar(){
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        Conexion conexion=new Conexion();
        conexion.conectar();
    }

    Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
