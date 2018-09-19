
package br.com.Sistema.Web.Administrador.Quarto;

import br.com.Sistema.Bean.FuncionariosBean;
import br.com.Sistema.Bean.QuartoBean;
import br.com.Sistema.DAO.FuncionariosDAO;
import br.com.Sistema.DAO.QuartoDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
    Document   : headeradm
    Created on : 26/08/2018, 17:47:02
    Author     :@Gustavo Rodrigues (gugaaroodrigues@gmail.com)
*/
@WebServlet ("/quarto/lista")
public class QuartoCadastro extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        List<QuartoBean> quarto = new QuartoDAO().obterTodos();
        
        resp.setContentType("text/html;charset=UTF-8");
        req.getRequestDispatcher("../administrador/hospital.jsp").include(req, resp);
        
    }
    
  
}
