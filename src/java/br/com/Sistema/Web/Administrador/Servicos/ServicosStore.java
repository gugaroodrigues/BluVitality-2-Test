/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Sistema.Web.Administrador.Servicos;

import br.com.Sistema.Bean.ServicosBean;
import br.com.Sistema.DAO.ServicosDAO;
import java.io.IOException;
import java.sql.Date;
import java.sql.Types;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Document : Created on : 17/09/2018 Author : @Gustavo Rodrigues
 * (gugaaroodrigues@gmail.com)
 */
@WebServlet("/servicos/store")
public class ServicosStore extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        ServicosBean servico = new ServicosBean();
        servico.setId(Integer.parseInt(req.getParameter("id")));
        servico.setId_funcionario(Integer.parseInt(req.getParameter("id_funcionario")));
        servico.setNome(req.getParameter("nome"));
        servico.setDescricao(req.getParameter("descricao"));
        servico.setId(new ServicosDAO().adicionar(servico));
        
        resp.sendRedirect("administrador/");
        
    }

}
