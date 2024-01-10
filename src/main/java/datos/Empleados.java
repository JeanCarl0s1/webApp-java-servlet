/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author JEAN
 */

@Entity
public class Empleados {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String dni;
    private String ename;
    private String charge;

    public Empleados(){}
    
    public Empleados(int id, String dni, String name, String charge) {
        this.id = id;
        this.dni = dni;
        this.ename = name;
        this.charge = charge;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return ename;
    }

    public void setName(String name) {
        this.ename = name;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }
}
