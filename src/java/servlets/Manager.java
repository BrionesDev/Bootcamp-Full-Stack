package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author formación
 */
@WebServlet(name = "Manager", urlPatterns = {"/Manager"})
public class Manager extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Manager</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Manager at " + request.getContextPath() + "</h1>");

            out.println("<h2>Method used: " + request.getMethod() + "</h2>");

            out.println("<p>Nombre: " + request.getParameter("nombre") + "</p>");
            out.println("<p>Apellidos: " + request.getParameter("apellidos") + "</p>");
            out.println("<p>Edad: " + request.getParameter("edad") + "</p>");

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
//        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Manager</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Manager at " + request.getContextPath() + "</h1>");

            out.println("<h2>Method used: " + request.getMethod() + "</h2>");

//            out.println("<p>Nombre: " + request.getParameter("nombre") + "</p>");
//            out.println("<p>Apellidos: " + request.getParameter("apellidos") + "</p>");
//            out.println("<p>Edad: " + request.getParameter("edad") + "</p>");
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            if (username.equalsIgnoreCase("root") && password.equalsIgnoreCase("root")) {
                out.println("<p>Bienvenido " + username.toUpperCase() + "!</p>");
                
                out.println("<form method=\"GET\" action=\"./ConsultaLibros\"");
                out.println("Selección de libro: <input type=\"text\" name=\"bookTitle\">");
                out.println("<input type=\"submit\">");
                out.println("</form>");
            } else {
//                out.println("<p>Usuario " + username.toUpperCase() + " inexistente!</p>");
                response.sendRedirect("error.html"); // HTML
//                response.sendRedirect("error.jsp?username=" + username); // JSP (NO SE HACE)
            }

            out.println("</body>");
            out.println("</html>");
        }

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
//        processRequest(request, response);

        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Manager</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Manager at " + request.getContextPath() + "</h1>");

            out.println("<h2>Method used: " + request.getMethod() + "</h2>");

//            out.println("<p>Nombre: " + request.getParameter("nombre") + "</p>");
//            out.println("<p>Apellidos: " + request.getParameter("apellidos") + "</p>");
//            out.println("<p>Edad: " + request.getParameter("edad") + "</p>");

            String username = request.getParameter("username");
            String password = request.getParameter("password");

            if (username.equalsIgnoreCase("root") && password.equalsIgnoreCase("root")) {
                out.println("<p>Bienvenido " + username + "!</p>");
                
                out.println("<form method=\"POST\" action=\"./ConsultaLibros\"");
                out.println("Selección de libro: <input type=\"text\" name=\"bookTitle\">");
                out.println("<input type=\"submit\">");
                out.println("</form>");
                
            } else {
                out.println("<p>Usuario " + username + " inexistente!</p>");
                response.sendRedirect("error.html"); // HTML
//                response.sendRedirect("error.jsp?username=" + username); // JSP (NO SE HACE)
            }
            out.println("</body>");
            out.println("</html>");
        }
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
