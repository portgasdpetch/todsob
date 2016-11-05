/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author int303
 */
public class MultiplicationTableServlet extends HttpServlet {
    int defaultNum = 2;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
    public void init() throws ServletException{
        String numStr = getInitParameter("defaultNumber");        
        if(numStr != null){
            defaultNum = Integer.parseInt(numStr);
        }    
    }

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nStr = request.getParameter("number");            
        int n = defaultNum ;               
        String msg = "";
        
        try {
            n = Integer.parseInt(nStr);  
        } catch (Exception e) {
            msg = "Can not convert "+nStr+" to integer";    
        }
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MultiplicationTableServlet</title>");            
            out.println("</head>");
            out.println("<body style='background-color:navy;color:white' >");
            out.println("<table>");
            
            out.println("<tr><td colspan='5'> Multiplication Table of "+n+"</tr>");            
            for (int i = 1; i < 13; i++) {
                 out.println("<tr><td>"+n+"</td><td>x</td><td>"+i+"</td><td>=</td><td>"+(i*n)+"</td></tr>");
            }         
            
            out.println("</table><br><hr>");
            
            if(msg.length()>0){
                out.println("<h1 style='color:yellow'>"+msg+"</h1>");
            }
//            out.println("<h1>Servlet MultiplicationTableServlet at " + request.getContextPath() + "</h1>");
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
    
  

















