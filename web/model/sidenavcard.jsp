<%-- 
    Document   : sidenavcard
    Created on : 27/08/2018, 11:15:48
    Author     : Rafael Alipio Harada
--%>

<%@page import="br.com.Sistema.DAO.UsuariosDAO"%>
<%@page import="br.com.Sistema.Bean.UsuariosBean"%>
<%@page import="br.com.Sistema.DAO.CargosDAO"%>
<%@page import="br.com.Sistema.Bean.CargosBean"%>
<%@page import="br.com.Sistema.Bean.FuncionariosBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.Sistema.DAO.FuncionariosDAO"%>
<%@page import="java.util.List"%>
<!--JSP IF implementation.-->
<%
    String cargoDoFuncionario = "";
    if (usuario != null) {
        List<FuncionariosBean> funcionarios = new FuncionariosDAO().obterTodos();
        for (int i = 0; i < funcionarios.size(); i++) {
            if (usuario.getId() == funcionarios.get(i).getId_usuario()) {
                int id_cargo = funcionarios.get(i).getId_cargo();
                cargoDoFuncionario = new CargosDAO().obterPeloId(id_cargo).getNome();
                break;
            }
        }
    }
    if (cargoDoFuncionario.equals("Administração")) {
%>
<li>
    <div class="user-view">
        <div class="background">
            <img src="../resources/images/slider1.jpg">
        </div>
        <a href="#EditarPerfil">
            <!--%if(usuario.getImage() == null){%-->
            <img class="circle" src="../resources/images/cat6.gif">
            <!--%}else{%-->
            <!--%=usuario.getImage()%-->
            <!--%}%-->
        </a>
        <a href="#EditarPerfil">
            <span class="white-text">
                <%=usuario.getNome()%>
            </span>
        </a>
        <a href="#EditarPerfil">
            <span class="white-text">
                <%=usuario.getEmail()%>
            </span>
        </a>
    </div>
</li>
<li class="no-padding">
    <ul class="collapsible collapsible-accordion">
        <li>
            <a class="collapsible-header waves-effect waves-teal">Hospital<i class="material-icons">arrow_drop_down</i></a>
            <div class="collapsible-body">
                <ul>
                    <li><a href="#!">Configurações local</a></li>
                    <li><a href="#!">Eventos</a></li>
                    <li><a href="#!">Equipamentos</a></li>
                    <li><a href="#!">Funcionarios</a></li>
                </ul>
            </div>
        </li>
        <div class="divider"></div>
        <li>
            <a class="collapsible-header waves-effect waves-teal">Pacientes<i class="material-icons">arrow_drop_down</i></a>
            <div class="collapsible-body">
                <ul>
                    <li><a href="#!">Perfil</a></li>
                    <li><a href="#!">Prontuario</a></li>
                    <li><a href="#!">Localização</a></li>
                    <li><a href="#!">Geral B.O</a></li>
                </ul>
            </div>
        </li>
        <div class="divider"></div>
        <li>
            <a class="collapsible-header waves-effect waves-teal">Pendencias<i class="material-icons">arrow_drop_down</i></a>
            <div class="collapsible-body">
                <ul>
                    <li><a href="#!">Adicionar</a></li>
                    <li><a href="#!">Solicitar</a></li>
                    <li><a href="#!">Pedidos</a></li>
                </ul>
            </div>
        </li>
        <div class="divider"></div>
        <li>
            <a class="collapsible-header waves-effect waves-teal">Estoque<i class="material-icons">arrow_drop_down</i></a>
            <div class="collapsible-body">
                <ul>
                    <li><a href="#!" class="waves-effect">Medicamentos</a></li>
                    <li><a href="#!">Equipamentos</a></li>
                    <li><a href="#!">Solicitar M.</a></li>
                    <li><a href="#!">Cadastrar</a></li>
                </ul>
            </div>
        </li>
        <div class="divider"></div>
        <%
        } else if (cargoDoFuncionario.equals("Médico")) {
        %>
        <li>
            <div class="user-view">
                <div class="background">
                    <img src="../resources/images/bg1.gif">
                </div>
                <a href="#EditarPerfil">
                    <!--%if(usuario.getImage() == null){%-->
                    <img class="circle" src="../resources/images/cat6.gif">
                    <!--%}else{%-->
                    <!--%=usuario.getImage()%-->
                    <!--%}%-->
                </a>
                <a href="#EditarPerfil">
                    <span class="white-text">
                        <%=usuario.getNome()%>
                    </span>
                </a>
                <a href="#EditarPerfil">
                    <span class="white-text">
                        <%=usuario.getEmail()%>
                    </span>
                </a>
            </div>
        </li>
        <li>
            <a href='#'>Perfil</a>
        </li>
        <li>
            <a href='#'>Pendências</a>
        </li>
        <li>
            <a href='#'>Pacientes</a>
        </li>
        <li>
            <ul class="collapsible collapsible-accordion">
                <%
                } else if (cargoDoFuncionario.equals("Recepção")) {
                %>
                <li>
                    <div class="user-view">
                        <div class="background">
                            <img src="../resources/images/bg1.gif">
                        </div>
                        <a href="#EditarPerfil">
                            <!--%if(usuario.getImage() == null){%-->
                            <img class="circle" src="../resources/images/cat6.gif">
                            <!--%}else{%-->
                            <!--%=usuario.getImage()%-->
                            <!--%}%-->
                        </a>
                        <a href="#EditarPerfil">
                            <span class="white-text">
                                <%=usuario.getNome()%>
                            </span>
                        </a>
                        <a href="#EditarPerfil">
                            <span class="white-text">
                                <%=usuario.getEmail()%>
                            </span>
                        </a>
                    </div>
                </li>
                <li>
                    <a href='#'>Perfil</a>
                </li>
                <li>
                    <a href='#'>Pendências</a>
                </li>
                <li>
                    <a href='#'>Pacientes</a>
                </li>
                <li>
                    <ul class="collapsible collapsible-accordion">
                        <%
                        } else if (cargoDoFuncionario.equals("Limpeza")) {
                        %>
                        <li>
                            <div class="user-view">
                                <div class="background">
                                    <img src="../resources/images/bg1.gif">
                                </div>
                                <a href="#EditarPerfil">
                                    <!--%if(usuario.getImage() == null){%-->
                                    <img class="circle" src="../resources/images/cat6.gif">
                                    <!--%}else{%-->
                                    <!--%=usuario.getImage()%-->
                                    <!--%}%-->
                                </a>
                                <a href="#EditarPerfil"><span class="white-text">
                                        <%=usuario.getNome()%>
                                    </span>
                                </a>
                                <a href="#EditarPerfil"><span class="white-text">
                                        <%=usuario.getEmail()%>
                                    </span>
                                </a>
                            </div>
                        </li>
                        <li>
                            <a href='#'>Perfil</a>
                        </li>
                        <li>
                            <a href='#'>Pendências</a>
                        </li>
                        <li>
                            <ul class="collapsible collapsible-accordion">
                                <%
                                } else {
                                %>
                                <li>
                                    <div class="user-view">
                                        <div class="background">
                                            <img src="../resources/images/bg1.gif">
                                        </div>
                                        <a href="#EditarPerfil">
                                            <!--%if(usuario.getImage() == null){%-->
                                            <img class="circle" src="../resources/images/cat6.gif">
                                            <!--%}else{%-->
                                            <!--%=usuario.getImage()%-->
                                            <!--%}%-->
                                        </a>
                                        <a href="#EditarPerfil"><span class="white-text">
                                                <%=usuario.getNome()%>
                                            </span>
                                        </a>
                                        <a href="#EditarPerfil"><span class="white-text">
                                                <%=usuario.getEmail()%>
                                            </span>
                                        </a>
                                    </div>
                                </li>
                                <li>
                                    <ul class="collapsible collapsible-accordion">
                                        <%
                                            }
                                        %>