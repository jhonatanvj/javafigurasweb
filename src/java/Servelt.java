/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import Modell.Cuadrado;
import Modell.Figura;
import Modell.Trapecio;
import Modell.Triangulo;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author jhona
 */
@WebServlet(urlPatterns = {"/Servelt"})
public class Servelt extends HttpServlet {
    
     public static Figura fi;
    public static void liskov(Figura a){
        a.calcularArea();
        a.calcularPerimetro();
        fi=a;
    }
    

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
        
        if("triangulo".equals(request.getParameter("figura"))) {
            Triangulo t = new Triangulo();
            t.setNombre(request.getParameter("figura"));
            t.setAltura(Integer.parseInt(request.getParameter("alturaTriangulo") ));
            t.setBase(Integer.parseInt(request.getParameter("baseTriangulo")));
            liskov(t);
        }else if("cuadrado".equals(request.getParameter("figura"))){
            Cuadrado c = new Cuadrado();
            c.setNombre(request.getParameter("figura"));
            c.setLado(Integer.parseInt(request.getParameter("ladoCuadrado")));
            liskov(c);
        }else if("trapecio".equals(request.getParameter("figura"))){
            Trapecio tra = new Trapecio();
            tra.setNombre(request.getParameter("figura"));
            tra.setAltura(Integer.parseInt(request.getParameter("alturaTrapecio")));
            tra.setBase1(Integer.parseInt(request.getParameter("base1Trapecio")));
            tra.setBase2(Integer.parseInt(request.getParameter("base2Trapecio")));
            tra.setLado(Integer.parseInt(request.getParameter("ladoTrapecio")));
            liskov(tra);
        }
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultados</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>El area del " + fi.getNombre()+ " es: "+fi.getArea()+"</h1>");
            out.println("<h1>El perimetro del " + fi.getNombre()+ " es: "+fi.getPerimetro()+"</h1>");
            out.println("</body>");
            out.println("</html>");
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
