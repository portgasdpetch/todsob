/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sit.int303.demo.model.Pokemon;

/**
 *
 * @author Khaitong
 */
public class ListPokemonServlet extends HttpServlet {

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
        String searchParam = request.getParameter("searchParam");
        if (searchParam == null) {
            searchParam = "";
        }
        List<Pokemon> pokemons = Pokemon.findByName(searchParam);
        
        request.setAttribute("Pokemons", pokemons);
        request.setAttribute("SearchParam", searchParam);
        getServletContext().getRequestDispatcher("/view/ShowPokemon").forward(request, response);

        // View --------------------------------------------------------------------------------
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet SearchPokemonServlet</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<table><tr><td><h1>Pokemon Listing ::</h1></td>");
//            out.println("<td><form action='SearchPokemon' method='post'>");
//            out.println("&nbsp;&nbsp;&nbsp;&nbsp;Search pokemon by name: ");
//            out.println("<input type='text' name='searchParam' value='"+ searchParam + "' />");
//            out.println("<input type='submit'/></form></td></tr></table><hr>");
//            if (pokemons != null) {
//                out.println("<table width=90%>");
//                int col = 1;
//                for (Pokemon p : pokemons) {
//                    if (col % 5 == 1) {
//                        out.println("<tr>");
//                    }
//                    out.println("<td align='center'><br><img src='go/" + p.getName() + ".png' height=80>");
//                    out.println("<br><br> #"+ (p.getId()<10? "00" : (p.getId()<100?"0" : ""))+ p.getId()+" "+ p.getName()+ "<br></td>");
//                    if (col % 5 == 0) {
//                        out.println("</tr>");
//                    }
//                    col++;
//                }
//                if ((col - 1) % 5 != 0) {
//                    out.println("</tr>");
//                }
//                out.println("</table><br><p><hr>");
//            } else {
//                out.println("<h3 style='color:red'>"+ searchParam+"% DOES NOT EXIST !!! ... Try Again</h3>");
//            }
//            out.println("</body>");
//            out.println("</html>");
//        }
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
