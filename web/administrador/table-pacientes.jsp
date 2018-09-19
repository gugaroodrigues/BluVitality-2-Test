<%-- 
    Document   : table-pacientes
    Created on : 11/09/2018, 14:10:53
    Author     : @Gustavo Rodrigues (gugaaroodrigues@gmail.com)
--%>

<%@page import="br.com.Sistema.Bean.UsuariosBean"%>
<%@page import="java.util.List"%>
<%@page import="br.com.Sistema.DAO.UsuariosDAO"%>
<nav>
    <div class="nav-wrapper teal lighten-4">
        <form>
            <div class="input-field ">
                <input id="searchFuncionario"  type="search" required>
                <label class="label-icon " for="search"><i class="material-icons">search</i></label>
                <i class="material-icons">close</i>
            </div>
        </form>
    </div>
</nav>
<% List<UsuariosBean> usuarios = new UsuariosDAO().obterTodos();%>
<table class="responsive-table">
    <thead>
        <tr>
            <th>Paciente</th>
            <th>CPF</th>
            <th>Ação</th>
        </tr>
    </thead>
    <tbody>
        <% for (UsuariosBean administradorUsuario : usuarios) {%>
        <tr>
            <td><%=administradorUsuario.getNome()%></td>
            <td><%=administradorUsuario.getCpf()%></td>
            <td><a href=""><i class="material-icons">edit</i></a><a href=""><i class="material-icons">delete</i></a></td>
        </tr>
        <% }%>
    </tbody>
    <tfoot>
        <tr>
        </tr>
    </tfoot>
</table>