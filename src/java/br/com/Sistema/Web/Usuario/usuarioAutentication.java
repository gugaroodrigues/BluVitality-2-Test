package br.com.Sistema.Web.Usuario;

import br.com.Sistema.Bean.FuncionariosBean;
import br.com.Sistema.Bean.UsuariosBean;
import br.com.Sistema.DAO.FuncionariosDAO;
import br.com.Sistema.DAO.UsuariosDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Rafael Alipio Harada (rafhaharada@gmail.com)
 */
@WebServlet("/usuario/autentication")
public class usuarioAutentication extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        String login = req.getParameter("login");
        String senha = req.getParameter("senha");

        UsuariosBean usuario = new UsuariosDAO().autenticar(login, senha);

        if (usuario != null) {
            req.getSession().setAttribute("usuario", usuario);
            String tipoFuncionario = "";
            if(new FuncionariosDAO().obterPeloIdUsuario(usuario.getId()) != null){
                FuncionariosBean funcionario = new FuncionariosDAO().obterPeloIdUsuario(usuario.getId());
                tipoFuncionario = funcionario.getTipo();
            }
            if (!tipoFuncionario.isEmpty()) {
                resp.sendRedirect("/" + tipoFuncionario);
            } else {
                resp.sendRedirect("/usuario");
            }
        } else {
            resp.sendRedirect("/usuario/login");
        }

    }
}
