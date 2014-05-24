/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlet;

import ejb.PeticionRecetaBean;
import entity.Receta;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marco
 */
public class NuevaRecetaServlet extends HttpServlet {

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
        
    }

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @EJB
    private PeticionRecetaBean peticionReceta;
    
    private int recetaId = 0;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String nombreMedico = request.getParameter("nombreMedico");
        String numColegiado = request.getParameter("numColegiado");
        String nombrePaciente = request.getParameter("nombrePaciente");
        String numTarjetaSanitaria = request.getParameter("numTarjetaSanitaria");
        String fecha = request.getParameter("fecha");
        String nombreMedicamento = request.getParameter("nombreMedicamento");
        String abrevMedicamento = request.getParameter("abrevMedicamento");
        String posologia = request.getParameter("posologia");
        String tipoReceta = request.getParameter("tipoReceta");
        String periodoRecetaCronica = request.getParameter("periodoRecetaCronica");
        String periodoRecetaPeriodica = request.getParameter("periodoRecetaPeriodica");
        String fechaFinRecetaPeriodica = request.getParameter("fechaFinRecetaPeriodica");
        String alternativas = request.getParameter("alternativas");
        
        int tarjetaSanitaria = Integer.parseInt(numTarjetaSanitaria);
        int numeroColegiado = Integer.parseInt(numColegiado);
        
        String temp = recetaId +"";
        
        peticionReceta.creaReceta(temp, nombrePaciente, tarjetaSanitaria,
				nombreMedico, numeroColegiado, fecha, nombreMedicamento,
				posologia, tipoReceta, alternativas);
        
        recetaId++;
        
        //response.sendRedirect("NuevaRecetaServlet");
        response.sendRedirect("HomeServlet");
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
