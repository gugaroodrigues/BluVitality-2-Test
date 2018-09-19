package br.com.Sistema.Web.Usuario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Rafael Alipio Harada (rafhaharada@gmail.com)
 */

@WebServlet("/usuario/cadastro")
public class usuarioCadastro extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html;charset=UTF-8");
        req.getRequestDispatcher("/usuario/cadastrar.jsp").include(req, resp);
    }
}