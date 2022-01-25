package es.david.formulario;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author David
 */
public class FormularioServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter salida = response.getWriter();
        salida.println("<html><body>");
        salida.println("Nombre introducido: " + request.getParameter("nombre"));
        salida.println("<br><br>");
        salida.println("Apellido introducido: " + request.getParameter("apellido"));
        salida.println("<br><br>");
        salida.println("Correo introducido: " + request.getParameter("correo"));
        salida.println("<br><br>");
        salida.println("Usuario introducido: " + request.getParameter("usuario"));
        salida.println("<br><br>");
        salida.println("Contraseña introducido: " + request.getParameter("contrasena"));
        salida.println("<br><br>");
        salida.println("Teléfono introducido: " + request.getParameter("telefono"));
        salida.println("</body></html>");
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
