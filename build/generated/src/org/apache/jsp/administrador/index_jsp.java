package org.apache.jsp.administrador;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.Sistema.Bean.UsuariosBean;
import br.com.Sistema.Bean.UsuariosBean;
import java.util.List;
import br.com.Sistema.DAO.UsuariosDAO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(10);
    _jspx_dependants.add("/administrador/../model/headerEnd.jsp");
    _jspx_dependants.add("/administrador/ultimos-servicos.jsp");
    _jspx_dependants.add("/administrador/table-pacientes.jsp");
    _jspx_dependants.add("/administrador/tabela-funcionarios.jsp");
    _jspx_dependants.add("/administrador/quarto/quarto-formulario-cadastro.jsp");
    _jspx_dependants.add("/administrador/quarto/quarto-formulario-remover.jsp");
    _jspx_dependants.add("/administrador/quarto/quarto-formulario-quarentena.jsp");
    _jspx_dependants.add("/administrador/table-quartos.jsp");
    _jspx_dependants.add("/administrador/formulario-pendencias.jsp");
    _jspx_dependants.add("/administrador/../model/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../model/headerStart.jsp", out, false);
      out.write("\r\n");
      out.write("<li><a class='dropdown-trigger' href='#' data-target='dropdownCadastro'>OpÃ§Ãµes</a>\r\n");
      out.write("    <!-- Dropdown Structure -->\r\n");
      out.write("    <ul id='dropdownCadastro' class='dropdown-content'>\r\n");
      out.write("        <li><a href=\"../\" onclick=\"signOut();\">Sair</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            <!--mobile e tablet side nav-->\r\n");
      out.write("            <ul class='sidenav' id='mobile'>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\" class=\"sidenav-close waves-effect waves-teal teal\"><i class=\"material-icons white-text\">arrow_back</i></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"collapsible-header waves-effect waves-teal\">Serviços<i class=\"material-icons\">arrow_drop_down</i></a>\r\n");
      out.write("                            <div class=\"collapsible-body\">\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"#Servicos\">Serviços</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <div class=\"divider\"></div>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"collapsible-header waves-effect waves-teal\">Exames<i class=\"material-icons\">arrow_drop_down</i></a>\r\n");
      out.write("                            <div class=\"collapsible-body\">\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"#Exames\">Exames</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <div class=\"divider\"></div>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"collapsible-header waves-effect waves-teal\">Contatos<i class=\"material-icons\">arrow_drop_down</i></a>\r\n");
      out.write("                            <div class=\"collapsible-body\">\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"#Contatos\">Contatos</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <div class=\"divider\"></div>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"collapsible-header waves-effect waves-teal\">Sobre<i class=\"material-icons\">arrow_drop_down</i></a>\r\n");
      out.write("                            <div class=\"collapsible-body\">\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"#Sobre\">Sobre</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("<!--%@include file=\"../model/sessionConfirm.jsp\" %-->\r\n");
      out.write("<div class=\" row\">\r\n");
      out.write("\r\n");
      out.write("    <h5>Seja Bem vindo</h5>\r\n");
      out.write("    <a class=\"waves-effect waves-light red btn-small right\" id=\"btnFinancas\">Finaceiro</a>\r\n");
      out.write("    <div class=\"\" style=\"margin-top: auto\">\r\n");
      out.write("        <div class=\"divider\"></div>\r\n");
      out.write("        <ul class=\"tabs tabs-transparent center\">\r\n");
      out.write("            <li class=\"tab\"><a href=\"#InicioADM\" class=\"active teal-text waves-effect\">Bem vindo</a></li>\r\n");
      out.write("            <li class=\"tab\"><a href=\"#listapaciente\" class=\"teal-text waves-effect\">Pacientes</a></li>\r\n");
      out.write("            <li class=\"tab\"><a href=\"#lisfuncionarios\" class=\"teal-text waves-effect\">Funcionarios</a></li>\r\n");
      out.write("            <li class=\"tab\"><a href=\"#hospitalQuartos\" class=\"teal-text waves-effect atualizaTabFunc\">Quarto</a></li>\r\n");
      out.write("            <li class=\"tab\"><a href=\"#hospitalPendencias\" class=\"teal-text waves-effect\">PendÃªncias</a></li>\r\n");
      out.write("            <li class=\"tab\"><a href=\"#hospitalEquipamentos\" class=\"teal-text waves-effect\">Equipamentos</a></li>\r\n");
      out.write("            <li class=\"tab\"><a href=\"#hospitalEventos\" class=\"teal-text waves-effect\">Eventos</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"divider\"></div>\r\n");
      out.write("        <div id=\"InicioADM\" class=\"col s12 container\">\r\n");
      out.write("            <div class=\"col s6\">\r\n");
      out.write("                <div class=\"row teal darken-2\"> \r\n");
      out.write("                    <h5>\r\n");
      out.write("                        Seja bem vindo\r\n");
      out.write("                    </h5> \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col s6 right\">\r\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <table class=\"dataTable cell-border stripe \" id=\"ultimos-servicos\">\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th scope=\"col\">Nome<a href=\"#\"></a></th>\n");
      out.write("                <th scope=\"col\">Descrição</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("        </tbody>\n");
      out.write("    </table>");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"listapaciente\" class=\"col s12 scrollBarOnDiv container\">\r\n");
      out.write("            <div class=\"col s12\">\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav>\r\n");
      out.write("    <div class=\"nav-wrapper teal lighten-4\">\r\n");
      out.write("        <form>\r\n");
      out.write("            <div class=\"input-field \">\r\n");
      out.write("                <input id=\"searchFuncionario\"  type=\"search\" required>\r\n");
      out.write("                <label class=\"label-icon \" for=\"search\"><i class=\"material-icons\">search</i></label>\r\n");
      out.write("                <i class=\"material-icons\">close</i>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
 List<UsuariosBean> usuarios = new UsuariosDAO().obterTodos();
      out.write("\r\n");
      out.write("<table class=\"responsive-table\">\r\n");
      out.write("    <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th>Paciente</th>\r\n");
      out.write("            <th>CPF</th>\r\n");
      out.write("            <th>Ação</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("    <tbody>\r\n");
      out.write("        ");
 for (UsuariosBean administradorUsuario : usuarios) {
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>");
      out.print(administradorUsuario.getNome());
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(administradorUsuario.getCpf());
      out.write("</td>\r\n");
      out.write("            <td><a href=\"\"><i class=\"material-icons\">edit</i></a><a href=\"\"><i class=\"material-icons\">delete</i></a></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        ");
 }
      out.write("\r\n");
      out.write("    </tbody>\r\n");
      out.write("    <tfoot>\r\n");
      out.write("        <tr>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </tfoot>\r\n");
      out.write("</table>");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"lisfuncionarios\" class=\"col s12 container\">\r\n");
      out.write("            <div class=\"\">\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table class=\"table dataTable\" id=\"tabela-funcionario\">\r\n");
      out.write("    <thead  class=\"table-dark\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th scope=\"col\">Nome</th>\r\n");
      out.write("            <th scope=\"col\">Função</th>\r\n");
      out.write("            <th scope=\"col\">Status</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("    <tbody>\r\n");
      out.write("    </tbody>\r\n");
      out.write("</table> \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"hospitalQuartos\" class=\"col s12 container scrollBarOnDiv\">\r\n");
      out.write("            <!--a class=\"waves-effect waves-light btn-small right\" id=\"btnRemove\">Nova Ala</a>\r\n");
      out.write("            <a href=\"#\" class=\"waves-effect waves-light btn-small right\" id=\"btnAdd\">Adicionar</a>\r\n");
      out.write("             %>-->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col s6\">\r\n");
      out.write("                <div class=\"row teal darken-2\"> \r\n");
      out.write("                    <span class=\"flow-text \">Quartos</span><br>\r\n");
      out.write("                    <a class=\"waves-effect waves-light btn-small right\" id=\"btnRemove\">Nova Ala</a>\r\n");
      out.write("                    <a href=\"#\" class=\"waves-effect waves-light btn-small right-align \" id=\"btnAdd\">Adicionar</a>\r\n");
      out.write("                    <ul class=\"collapsible\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <div class=\"collapsible-header\"><i class=\"material-icons\">filter_drama</i>Cadastrar</div>\r\n");
      out.write("                            <div class=\"collapsible-body\">\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <form action=\"fomularioCadastro\" class=\"col s12\">\r\n");
      out.write("                <label for=\"numero\">Numero do Quarto:</label>\r\n");
      out.write("                <input type=\"number\" name=\"numero\" id=\"quarto-cadastro-numero-quarto\">\r\n");
      out.write("                <label>Tipo:</label>\r\n");
      out.write("                <select id=\"quarto-cadastro-tipo\">\r\n");
      out.write("                    <option value=\"null\"></option>\r\n");
      out.write("                    <option value=\"UTI\">UTI</option>\r\n");
      out.write("                    <option value=\"SemiIntencivo\">Semi - Intensivo</option>\r\n");
      out.write("                    <option value=\"salaDeOperacao\"> Sala de Cirurgia</option>\r\n");
      out.write("                    <option value=\"leito\">Leito</option>\r\n");
      out.write("                    <option value=\"consultorio\">Consultorio</option>\r\n");
      out.write("                    <option value=\"recuperacao\">Sala de recuperação</option>\r\n");
      out.write("                </select>\r\n");
      out.write("                <span class=\"\">Status:</span>\r\n");
      out.write("                <label>\r\n");
      out.write("                    <input id=\"quarto-cadastro-status\" name=\"sexo\" type=\"radio\" checked />\r\n");
      out.write("                    <span>Ativo</span>\r\n");
      out.write("                </label>\r\n");
      out.write("                <label>\r\n");
      out.write("                    <input name=\"sexo\" type=\"radio\" />\r\n");
      out.write("                    <span>invativo</span>\r\n");
      out.write("                </label>\r\n");
      out.write("            </form>\r\n");
      out.write("            <a class=\"waves-effect  btn-small\" id=\"quarto-cadastro-salvar\">SALVAR</a>\r\n");
      out.write("       ");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <div class=\"collapsible-header\"><i class=\"material-icons\">place</i>Remover</div>\r\n");
      out.write("                            <div class=\"collapsible-body\">\r\n");
      out.write("                                ");
      out.write("    <form>\r\n");
      out.write("        <span>Numero do Quarto:</span>\r\n");
      out.write("        <input type=\"number\" name=\"numero\" id=\"remover-numero-quarto\">\r\n");
      out.write("        <span>TIPO:</span>\r\n");
      out.write("    </form>\r\n");
      out.write("    <select id=\"quarto-remover-tipo\">\r\n");
      out.write("        <option value=\"null\"></option>\r\n");
      out.write("        <option value=\"UTI\">UTI</option>\r\n");
      out.write("        <option value=\"SemiIntencivo\">Semi - Intensivo</option>\r\n");
      out.write("        <option value=\"salaDeOperacao\"> Sala de Cirurgia</option>\r\n");
      out.write("        <option value=\"leito\">Leito</option>\r\n");
      out.write("        <option value=\"consultorio\">Consultorio</option>\r\n");
      out.write("        <option value=\"recuperacao\">Sala de recuperação</option>\r\n");
      out.write("    </select>\r\n");
      out.write("    <a class=\"waves-effect  btn-small\" id=\"quarto-cadastro-remover\">Remover</a>");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <div class=\"collapsible-header\"><i class=\"material-icons\">whatshot</i>Quarentena</div>\r\n");
      out.write("                            <div class=\"collapsible-body\">\r\n");
      out.write("                                ");
      out.write("    <form>\r\n");
      out.write("        <span>Numero do Quarto:</span>\r\n");
      out.write("        <input type=\"number\" name=\"numero\" id=\"quarentena-numero-quarto\">\r\n");
      out.write("        <span>TIPO:</span>\r\n");
      out.write("    </form>\r\n");
      out.write("    <select id=\"quarto-quarentena-tipo\">\r\n");
      out.write("        <option value=\"null\"></option>\r\n");
      out.write("        <option value=\"UTI\">UTI</option>\r\n");
      out.write("        <option value=\"SemiIntencivo\">Semi - Intensivo</option>\r\n");
      out.write("        <option value=\"salaDeOperacao\"> Sala de Cirurgia</option>\r\n");
      out.write("        <option value=\"leito\">Leito</option>\r\n");
      out.write("        <option value=\"consultorio\">Consultorio</option>\r\n");
      out.write("        <option value=\"recuperacao\">Sala de recuperação</option>\r\n");
      out.write("    </select>\r\n");
      out.write("    <a class=\"waves-effect  btn-small\" id=\"quarto-mover-quarentena\">Adicionar</a>\r\n");
      out.write("    <a class=\"waves-effect  btn-small\" id=\"quarto-remover-quarentena\">Remover</a>\r\n");
      out.write("    \r\n");
      out.write("    <form action=\"/categoria/store\" method=\"post\">\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("\t<label for='campo-categoria'><i class=''></i> Categoria</label>\r\n");
      out.write("\t<input class='form-control' type='text' id='campo-categoria' name=\"categoria\" required='required'>\r\n");
      out.write("    </div>\r\n");
      out.write("\t\r\n");
      out.write("    <input class='btn btn-success' type=\"submit\" value=\"Adicionar\">\r\n");
      out.write("</form>");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col s6 right\">\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table class=\"table dataTable\" id=\"quarto-index\">\r\n");
      out.write("    <thead class=\"thead-light\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th scope=\"col\">Numero</th>\r\n");
      out.write("            <th scope=\"col\">Tipo</th>\r\n");
      out.write("            <th scope=\"col\">data</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("    <tbody>\r\n");
      out.write("    </tbody>\r\n");
      out.write("</table>     \r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"hospitalPendencias\" class=\"col s12 container\">\r\n");
      out.write("            <div class=\" row-border col s12 m6\">\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("    <form class=\"col s12\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"input-field col s6\">\r\n");
      out.write("                <input id=\"input_text\" type=\"text\" data-length=\"10\">\r\n");
      out.write("                <label for=\"input_text\">Nome da Pendência</label>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"input-field col s8\">\r\n");
      out.write("                <input type=\"text\" class=\"datepicker\" id=\"tempoPendencia\">\r\n");
      out.write("                <label for=\"tempoPendencia\">Tempo Limite</label>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"input-field col s12\">\r\n");
      out.write("                <textarea id=\"textarea2\" class=\"materialize-textarea\" data-length=\"120\"></textarea>\r\n");
      out.write("                <label for=\"textarea2\">Descrição</label>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <a class=\"waves-effect waves-light btn\"><i class=\"material-icons left\">event</i>button</a>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"hospitalEquipamentos\" class=\"col s12 container\">\r\n");
      out.write("            <div class=\"\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"hospitalEventos\" class=\"col s12 container\">\r\n");
      out.write("            <div class=\"\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--<div id=\"loading\" style=\"display: block\">\r\n");
      out.write("    <i class=\"material-icons right ld ld-cycle\" id=\"loading\">loop</i>\r\n");
      out.write("</div>-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--Roda pé-->\r\n");
      out.write("<!--div class=\"slider\">\r\n");
      out.write("    <ul class=\"slides\">\r\n");
      out.write("        <li>\r\n");
      out.write("            <img src=\"../resources/images/slider1.jpg\" alt=''>\r\n");
      out.write("            <div class=\"caption left-align black-text\">\r\n");
      out.write("                <h3>Blu Vitality</h3>\r\n");
      out.write("                <h5>Vital para você, vital para nós.</h5>\r\n");
      out.write("            </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <img src=\"../resources/images/slider2.png\" alt=''>\r\n");
      out.write("            <div class=\"caption left-align black-text\">\r\n");
      out.write("                <h3>Alta Tecnologia e Gestão</h3>\r\n");
      out.write("                <h5>Tenha mais mobilidade e eficiência.</h5>\r\n");
      out.write("            </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <img src=\"../resources/images/slider3.jpg\" alt=''>\r\n");
      out.write("            <div class=\"caption left-align black-text\">\r\n");
      out.write("                <h3>Visite Nosso Hospital</h3>\r\n");
      out.write("                <h5>Estruturado,organizado e preparado!</h5>\r\n");
      out.write("            </div>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div-->\r\n");
      out.write("<footer class=\"page-footer teal accent-4\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col l6 s12\">\r\n");
      out.write("                <h4 class=\"white-text\">Contatos Rápidos</h4>\r\n");
      out.write("                <h5 class=\"white-text\">Fale Conosco</h5>\r\n");
      out.write("                <p class=\"grey-text text-lighten-4\">Telefone: +55 (47) 4002-8922</p>\r\n");
      out.write("                <p class=\"grey-text text-lighten-4\">E-mail: bluvitality@gmail.com</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col l4 offset-l2 s12\">\r\n");
      out.write("                <h5 class=\"white-text\">Links</h5>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Termos de Uso</a></li>\r\n");
      out.write("                    <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Politica de Privacidade</a></li>\r\n");
      out.write("                    <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Desenvolvedores do Site</a></li>\r\n");
      out.write("                    <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Ajuda</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"footer-copyright\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            © BluVitality 2018 All Rights Reserved\r\n");
      out.write("            <a class=\"grey-text text-lighten-4 right\" href=\"#!\">More Links</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("<!--   JavaScript Setup  -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"../resources/js/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../resources/js/materialize.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../resources/js/google-platform.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../resources/js/custom.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../resources/js/select2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../resources/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../resources/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write(' ');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}