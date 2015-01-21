/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.netbeans.saas.google.GoogleAccountsService;
import org.netbeans.saas.RestResponse;


/**
 *
 * @author (°_°)
 */
@WebServlet(name = "Serv1", urlPatterns = {"/Serv1"})
public class Serv1 extends HttpServlet {

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
        
            
            
                String accountType = "GOOGLE";
                String email = request.getParameter("email").toString();
                String passwd = request.getParameter("pass").toString();
                String service = "xapi";
                String source = "UD-OTRI-0.1";;
                System.out.println("VIVO!!! EM: "+email+" pass: "+passwd+"");
                RestResponse result = null;
                try {
                    result = GoogleAccountsService.accountsClientLogin(accountType, email, passwd, service, source);
                } catch (IOException iOException) {
                    out.println("Error de Autenticación: "+iOException.getMessage());
                }
                // TODO - Uncomment the print Statement below to print result.
                //out.println("The SaasService returned: "+result.getDataAsString());
                System.out.println("Sigue?"+result.getResponseMessage());
                if (result.getResponseCode() == 200) {
                    //out.println("The SaasService returned:\n" + result.getDataAsString() + "");
                    //out.println("Response: " + result.getResponseMessage()+" Codigg: "+result.getResponseCode());
                    out.println("Autenticación registrada con éxito");
                } else {
                    System.out.println("Falló");
                    out.println("Hubo error en la autenticacion:" + result.getResponseMessage());
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
