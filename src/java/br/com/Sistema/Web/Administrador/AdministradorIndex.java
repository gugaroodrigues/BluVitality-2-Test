/*
    Document   : headeradm
    Created on : 26/08/2018, 17:47:02
    Author     :@Gustavo Rodrigues (gugaaroodrigues@gmail.com)
*/
package br.com.Sistema.Web.Administrador;

import br.com.Sistema.Bean.FuncionariosBean;
import br.com.Sistema.DAO.FuncionariosDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet ("/administrador")
public class AdministradorIndex extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        List<FuncionariosBean> funcionario = new FuncionariosDAO().obterTodos();
        
        resp.setContentType("text/html;charset=UTF-8");
        req.getRequestDispatcher("../administrador/index.jsp").include(req, resp);
        
    }
    
    
}
