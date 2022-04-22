/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author German G
 */
@WebService(serviceName = "Servicios")
public class Servicios {
    EmpleadoDAO dao=new EmpleadoDAO();
    @WebMethod(operationName = "listar")
    public List<Empleado> listar() {
        List datos=dao.listar();
        return datos;
    }
}
