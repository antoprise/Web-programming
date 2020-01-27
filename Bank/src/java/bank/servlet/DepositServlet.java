/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.servlet;

import bank.controller.AccountJpaController;
import bank.controller.HistoryJpaController;
import bank.controller.exceptions.NonexistentEntityException;
import bank.controller.exceptions.RollbackFailureException;
import bank.model.Account;
import bank.model.History;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.UserTransaction;

/**
 *
 * @author Student
 */
public class DepositServlet extends HttpServlet {

    @PersistenceUnit(unitName = "BankPU")
    EntityManagerFactory emf;
    @Resource
    UserTransaction utx;

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
            throws ServletException, IOException, NonexistentEntityException, RollbackFailureException, Exception {
        HttpSession session = request.getSession(false);
        String deposit = request.getParameter("deposit");
          if(deposit != null && deposit.trim().length() > 0){
     AccountJpaController accountCtrl = new AccountJpaController(utx, emf);
     Account accountObj = accountCtrl.findAccount(((Account)session.getAttribute("account")).getAccountid());
     int balance = accountObj.getBalance();
     int deposits = Integer.parseInt(deposit);
     
     if(deposits > 0 ){
         balance = balance+deposits;
         accountObj.setBalance(balance);
         accountCtrl.edit(accountObj);
         
         HistoryJpaController historyCtrl = new HistoryJpaController(utx, emf);
         History history = historyCtrl.findHistory(accountObj.getAccountid());
         
          
        history.setHistoryid(history.getHistoryid()+1);
         history.setHistoryid(history.getHistoryid() + 1);
                history.setAccountid(accountObj);
                history.setMethod("deposit");
                history.setAmount(deposits);
                history.setTime(new Date());
                history.setBalance(balance);
        
         historyCtrl.create(history);
         
         
         session.setAttribute("account", accountObj);
         request.setAttribute("message", "Deposit Complete !");
         getServletContext().getRequestDispatcher("/MyAccount.jsp").forward(request, response);
         return;
         
     }else{
         getServletContext().getRequestDispatcher("/Deposit.jsp").forward(request, response);
     }
 }
  getServletContext().getRequestDispatcher("/Deposit.jsp").forward(request, response);
        
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
        try {
            processRequest(request, response);
        } catch (RollbackFailureException ex) {
            Logger.getLogger(DepositServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DepositServlet.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            processRequest(request, response);
        } catch (RollbackFailureException ex) {
            Logger.getLogger(DepositServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DepositServlet.class.getName()).log(Level.SEVERE, null, ex);
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
