/*
    Document   : headeradm
    Created on : 26/08/2018, 17:47:02
    Author     :@Gustavo Rodrigues (gugaaroodrigues@gmail.com)

 */
package br.com.Sistema.Web.Administrador.Quarto;

import br.com.Sistema.Bean.QuartoBean;
import br.com.Sistema.DAO.QuartoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/quarto/store")
public class QuartoStore extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        QuartoBean quarto = new QuartoBean();
        quarto.setId(Integer.parseInt(req.getParameter("id")));
        quarto.setNumero_quarto(Integer.parseInt(req.getParameter("numeroQuarto")));
        quarto.setId_usuario(Integer.parseInt(req.getParameter("id_usuario")));
        quarto.setId_funcionario(Integer.parseInt(req.getParameter("id_funcionario")));
        quarto.setTipo(req.getParameter("tipo"));
        quarto.setData_entrada(Date.valueOf(req.getParameter("data_entrada")));
        quarto.setData_entrada(Date.valueOf(req.getParameter("data_saida")));
        quarto.setStatus(req.getParameter("status"));
        quarto.setId(new QuartoDAO().adicionarQuarto(quarto));
        
        resp.sendRedirect("administrador/");
                    
     
    }

}
