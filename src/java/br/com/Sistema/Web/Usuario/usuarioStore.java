package br.com.Sistema.Web.Usuario;

import br.com.Sistema.Bean.UsuariosBean;
import br.com.Sistema.DAO.UsuariosDAO;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Rafael Alipio Harada (rafhaharada@gmail.com)
 */
@WebServlet("/usuario/store")
public class usuarioStore extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UsuariosBean usuario = new UsuariosBean();

        usuario.setNome(req.getParameter("nome-completo"));
        usuario.setSexo(req.getParameter("sexo").charAt(0));
        usuario.setCpf(req.getParameter("cpf"));
        usuario.setRg(req.getParameter("rg"));
        usuario.setEstado_civil(req.getParameter("estado-civil"));
        usuario.setTelefone(req.getParameter("telefone"));
        usuario.setEmail(req.getParameter("email"));
        usuario.setEndereco(req.getParameter("endereco"));
        usuario.setComplemento(req.getParameter("complemento"));
        usuario.setContato_emergencia(req.getParameter("contato-emergencia"));
        usuario.setUf(req.getParameter("uf"));
        usuario.setNaturalidade(req.getParameter("naturalidade"));
        String dataBr[] = req.getParameter("data-nascimento").split("/");
        String dataEn = dataBr[2] + "-" + dataBr[1] + "-" + dataBr[0];
        usuario.setData_nascimento(java.sql.Date.valueOf(dataEn));
        int idade = Period.between(LocalDate.parse(dataEn), LocalDate.now()).getYears();
        usuario.setIdade((byte) idade);
        usuario.setTipo_sanguineo(req.getParameter("tipo-sanguineo"));
        usuario.setConvenio(req.getParameter("convenio"));

        usuario.setId(new UsuariosDAO().adicionar(usuario));

        resp.setContentType("text/html;charset=UTF-8");
        resp.sendRedirect("/usuario?id=" + usuario.getId());
    }
}
