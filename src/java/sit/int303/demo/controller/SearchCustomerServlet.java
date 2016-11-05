/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sit.int303.demo.model.Customer;

/**
 *
 * @author int303
 */
public class SearchCustomerServlet extends HttpServlet {

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

        String searchParam = request.getParameter("searchParam");
        int id;
        String target = "/ListCustomer.jsp";
        String message = "";
        
        
        if (searchParam != null) {         
            try {
                id = Integer.parseInt(searchParam);
                HttpSession session = request.getSession(false);
                Customer cust = null;
                if(session != null && session.getAttribute("customers") != null){
                    List<Customer> customers = (List)session.getAttribute("customers");
                    cust = new Customer();
                    cust.setCustomerId(id);
                    int index = customers.indexOf(cust);
                    if (index >=0) {
                        cust = customers.get(index);
                    } else {
                        cust = null ;
                        message = "Customer id is '"+id+"' does not exist"; 
                    }
                }else{
                    cust = Customer.findById(id);
                }
                
                if(cust == null){
                    message = "Customer id is '"+id+"' does not exist";
                }else{
                    request.setAttribute("customer", cust);
                }
                
                target = "/CustomerDetail.jsp";
            } catch (Exception e) {
                HttpSession session = request.getSession();
                List<Customer> custs = Customer.findByName(searchParam);            
                if(custs == null){
                    message = "Customer name like '"+searchParam+"%' does not exist"; 
                    if(session.getAttribute("customers") != null){
                        ((List)session.getAttribute("customers")).clear();
                    }else{
                        session.setAttribute("customers", new ArrayList<Customer>());                        
                    }
                }else{
                    session.setAttribute("customers", custs);
                }
                
            }
        }else{
            request.getSession().setAttribute("customers",new ArrayList<Customer>());
        }           
        
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher(target).forward(request, response);
        
        
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet SearchCustomerServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet SearchCustomerServlet at " + request.getContextPath() + "</h1>");
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
