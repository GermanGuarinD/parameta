/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author German G
 */
public class EmpleadoDAO implements EmpleadoInterfaz {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex=new Conexion();
    @Override
    public List listar() {
        List<Empleado> datos=new ArrayList<>();
        String sql="select * from Empleado";
            try{
                con=conex.getConnection();
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()){
                    Empleado e=new Empleado();
                    e.setId(rs.getInt("id"));
                    e.setNombre(rs.getString("nombre"));
                    e.setApellido(rs.getString("apellido"));
                    e.setTipoDocumento(rs.getString("tipoDocumento"));
                    e.setNumeroDocumento(rs.getString("numeroDocumento"));
                    e.setFechaNacimiento(rs.getString("fechaNacimiento"));
                    e.setFechaVinculacionCompania(rs.getString("fechaVinculacionCompania"));
                    e.setCargo(rs.getString("cargo"));
                    e.setSalario(rs.getFloat("salario"));
                    datos.add(e);
                    
                }
            }catch (Exception e){
            }
            return datos;
    }       


    @Override
    public Empleado listarID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String add(String nombre, String apellido, String tipoDocumento, String numeroDocumento, String fechaNacimiento, String fechaVinculacionCompania, String cargo, float salario, String edad, String tiempoVinculacionCompañia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
