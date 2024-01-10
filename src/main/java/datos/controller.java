/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author JEAN
 */

import java.util.List;
import persistence.persistenceController;

public class controller {
    persistenceController perCtr = new persistenceController();
    
    public void createEmp (Empleados emp) {
        perCtr.createEmployee(emp);
    }
    public List<Empleados> getEmployees() {
        return perCtr.getEmployees();
    }
}



