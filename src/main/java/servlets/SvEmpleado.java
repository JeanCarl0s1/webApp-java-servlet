/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import datos.Empleados;
import datos.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author JEAN
 */

public class SvEmpleado extends HttpServlet {

    controller control = new controller();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SvEmpleado</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              
        List<Empleados> employeeList = new ArrayList<>();
        employeeList = control.getEmployees(); 

        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaEmpleados", employeeList);
        
        response.sendRedirect("MostrarEmpleados.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String dni = request.getParameter("dniInput");
        String name = request.getParameter("nameInput");
        String charge = request.getParameter("chargeInput");
        
        Empleados emp = new Empleados();
        emp.setDni(dni);
        emp.setName(name);
        emp.setCharge(charge);
        
        control.createEmp(emp);
        
        response.sendRedirect("index.jsp");
    }
        
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
