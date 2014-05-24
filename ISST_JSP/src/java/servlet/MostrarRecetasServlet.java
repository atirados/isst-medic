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
public class MostrarRecetasServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(List<Receta> recetas, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            int numRecetas = recetas.size();
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
    
    @EJB
    private PeticionRecetaBean peticionReceta;
    static public String numeroColegiado;
    static public String nombreMedico;

    static public String paciente;
    static public String fecha;
    static public String medicamento;
    static public String posologia;
    static public String tipoReceta;
    static public String alternativa;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/mostrarRecetas.jsp");
        System.out.println("Algoalgoalgo");
        try {
            List<Receta> recetas = peticionReceta.getListaRecetas(15);

            int numRecetas = recetas.size();
            request.setAttribute("numColegiado", "12");
            System.out.println("Algoalgoalgo2 " + numRecetas);
            
            for(int i = 0; i < numRecetas; i++){
               Receta receta = recetas.get(i);
               
               int numColegiado = receta.getNumeroColegiado();
               numeroColegiado = ""+numColegiado;
               nombreMedico = receta.getNombreMedico();
               paciente = receta.getNombrePaciente();
               fecha = receta.getFechaExpedicion();
               medicamento = receta.getNombreMedicamento();
               posologia = receta.getPosologia();
               tipoReceta = receta.getTipo();
               alternativa = receta.getMedicamentoAlternativo();
               
            }
            dispatcher.forward(request, response);
        } catch (RecetaNotFoundException ex) {
            Logger.getLogger(VerRecetasServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //dispatcher.forward(request, response);
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
