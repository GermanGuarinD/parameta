/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author German G
 */
public interface EmpleadoInterfaz {
    public List listar();
    public Empleado listarID(int id);
    public String add(String nombre, String apellido, String tipoDocumento, String numeroDocumento, String fechaNacimiento, String fechaVinculacionCompania, String cargo, float salario, String edad, String tiempoVinculacionCompañia);
    
}
