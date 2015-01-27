/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Abajo.Persona;
import Abajo.adm_registro;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author (°_°)
 */
@WebServlet(name = "Servlet_IPersona", urlPatterns = {"/Servlet_IPersona"})
public class Servlet_IPersona extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String nombre=request.getParameter("nom");
            String correo=request.getParameter("cor");
            String institucion=request.getParameter("ins");
            String nivel=request.getParameter("niv");
            String movil=request.getParameter("mov");
            String oficina=request.getParameter("ofi");
            int rol=Integer.parseInt(request.getParameter("rol"));
            Persona pp=(Persona)request.getSession().getAttribute("Per");
            int id=pp.getId();
            adm_registro adm=new adm_registro();
            System.out.println("ROL: "+rol);
            if(adm.I_Persona(nombre, correo, oficina, oficina, movil, institucion, institucion, rol, id)){
                pp=new Persona(nombre, correo, oficina, oficina, movil, institucion, institucion, rol, id);                
                request.getSession().setAttribute("Per", pp);
                response.sendRedirect("Admin/Persona.jsp?ee=si");
            }else{
                out.println("Error ingresando datos");
            }
            
        }catch(Exception e) {
            System.out.println("OOOOOO: "+e);
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
