/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.first.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sit.int303.first.model.VerySimpleCalculatorServlet;

/**
 *
 * @author INT303
 */
public class NewCal extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          try{ 
            String xStr = request.getParameter("x");
           String yStr = request.getParameter("y");
           String opStr = request.getParameter("operand");
           int result = 0;
           int x = Integer.valueOf(xStr);
           int y = Integer.valueOf(yStr);
           
          VerySimpleCalculatorServlet sc =new VerySimpleCalculatorServlet();
           sc.setX(x);
           sc.setY(y);
           sc.setOperator(opStr);
           request.setAttribute("calculator", sc);
           getServletContext().getRequestDispatcher("/SimpleCalculatorView.jsp").forward(request, response);
          }catch(Exception e){
              
          }
           
  /*         if(opStr.equals("+")){
             result = x+y;
            out.println(String.format("<h1> x = %d, y =%d %d + %d=%d</h1>\n",x,y,x,y,result)); 
           }else if(opStr.equals("-")){
             result = x-y;
            out.println(String.format("<h1> x = %d, y =%d %d - %d=%d</h1>\n",x,y,x,y,result)); 
           }else if(opStr.equals("*")){
             result = x*y;
            out.println(String.format("<h1> x = %d, y =%d %d * %d=%d</h1>\n",x,y,x,y,result)); 
           }else if(opStr.equals("/")){
             result = x/y;
            out.println(String.format("<h1> x = %d, y =%d %d / %d=%d</h1>\n",x,y,x,y,result)); 
           }
           */
            
       /*   out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewCal</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 style=\"color:red;\"");
            out.println(sc.toString());
            out.println("</h1>");
           // out.println(String.format("<h1> x = %d, y =%d %d + %d=%d</h1>\n",x,y,x,y,result));
            out.println("</body>");
            out.println("</html>");*/
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


