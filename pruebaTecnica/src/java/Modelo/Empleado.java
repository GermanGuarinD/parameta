/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author German G
 */
public class Empleado {
    int id;
    String nombre;
    String apellido;
    String tipoDocumento;
    String numeroDocumento;
    String fechaNacimiento;
    String fechaVinculacionCompania;
    String cargo;
    float salario;
    String edad;
    String tiempoVinculacionCompañia;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellido, String tipoDocumento, String numeroDocumento, String fechaNacimiento, String fechaVinculacionCompania, String cargo, float salario, String edad, String tiempoVinculacionCompañia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaVinculacionCompania = fechaVinculacionCompania;
        this.cargo = cargo;
        this.salario = salario;
        this.edad = edad;
        this.tiempoVinculacionCompañia = tiempoVinculacionCompañia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaVinculacionCompania() {
        return fechaVinculacionCompania;
    }

    public void setFechaVinculacionCompania(String fechaVinculacionCompania) {
        this.fechaVinculacionCompania = fechaVinculacionCompania;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTiempoVinculacionCompañia() {
        return tiempoVinculacionCompañia;
    }

    public void setTiempoVinculacionCompañia(String tiempoVinculacionCompañia) {
        this.tiempoVinculacionCompañia = tiempoVinculacionCompañia;
    }
    
    
}
