/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlet;

import ejb.PeticionRecetaBean;
import entity.Receta;
import exception.RecetaNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marco
 */
public class VerRecetasServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param recetas
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(List<Receta> recetas,HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       try (PrintWriter out = response.getWriter()) {
            int numRecetas = recetas.size();
            out.println("<p>Recetas: </p>");
            out.println("");
            out.println(numRecetas);
            for(int i = 0; i < numRecetas; i++){
                out.println("<p> Receta: " + recetas.get(i).toString());
            }
        }
    }

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    //@EJB
    //private PeticionRecetaBean peticionReceta;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {            
            String numColegiado = request.getParameter("numColegiado");
            String numTarjetaSanitaria = request.getParameter("numTarjetaSanitaria");
        
            //int numeroColegiado = Integer.parseInt(numColegiado);
            //int numeroTarjeta = Integer.parseInt(numTarjetaSanitaria);
            
            
            //List<Receta> recetas = peticionReceta.getListaRecetas(numeroTarjeta);
            //int numRecetas = recetas.size();
            //System.out.println(numRecetas);
            //processRequest(recetas,request,response);
            response.sendRedirect("MostrarRecetasServlet");
        } catch (Exception ex) {
            Logger.getLogger(VerRecetasServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException ,HttpServletRequest request, HttpServletResponse responseif a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
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
