/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import datos.Empleados;
import java.util.List;

/**
 *
 * @author JEAN
 */
public class persistenceController {
    EmpleadosJpaController empJpa = new EmpleadosJpaController();
    
    
    public void createEmployee (Empleados emp) {
        empJpa.create(emp);
    }

    public List<Empleados> getEmployees () {
    
        return empJpa.findEmpleadosEntities();
    }
}

