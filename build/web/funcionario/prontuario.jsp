<%-- 
    Document   : headeradm
    Created on : 26/08/2018, 17:47:02
    Author     : @Luana Patricia Duarte 
    @Rafhael

--%>
<jsp:include page="../model/headerStart.jsp"/>
<li><a class='dropdown-trigger' href='#' data-target='dropdownCadastro'>Opções</a>
    <!-- Dropdown Structure -->
    <ul id='dropdownCadastro' class='dropdown-content'>
        <li><a href="/usuario/logout" onclick="signOut();">Sair</a></li>
        <li><a href="/funcionario">Voltar a página anterior</a></li>

    </ul>
</li>
<%@include file="../model/headerEnd.jsp" %>

FUNCIONARIO PRONTUARIO
<div class="row">
    <div class="">
        <ul class="tabs tabs-transparent center">
            <li class="tab"><a href="#Funcionarios1" class="active teal-text">Dados Pessoais</a></li>
            <li class="tab"><a href="#Funcionarios2" class="teal-text">Anamnese</a></li>
            <li class="tab"><a href="#Funcionarios3" class="teal-text">Histórico Clínico</a></li>
        </ul>
        <div id="Funcionarios1" class="col s12 container">
            <ul class="collection col s6">
                <li class="collection-item avatar teal lighten-4">
                    <img src="" alt="" class="circle red">
                    <span class="nome">Nome:</span>
                    <span><%=usuario.getNome()%></span>
                </li>
                <li class="collection-item teal lighten-5">
                    <span class="data-nascimento">Data de nascimento:</span>
                    <span>
                        <% String dataEn[] = usuario.getData_nascimento().toString().split("-");
                            String dataBr = dataEn[2] + "/" + dataEn[1] + "/" + dataEn[0];
                        %>
                        <%=dataBr%>
                    </span>
                </li>
                <li class="collection-item teal lighten-4">
                    <span class="cpf">CPF:</span>
                    <span><%=usuario.getCpf()%></span>
                </li>
                <li class="collection-item teal lighten-5">
                    <span class="rg">RG:</span>
                    <span><%=usuario.getRg()%></span>
                </li>
                <li class="collection-item teal lighten-4">
                    <span class="naturalidade">Naturalidade:</span>
                    <span><%=usuario.getNaturalidade()%></span>
                </li>
                <li class="collection-item teal lighten-5">
                    <span class="sexo">Sexo:</span>
                    <span><%=usuario.getSexo()%></span>
                </li>
                <li class="collection-item teal lighten-4">
                    <span class="sanguineo">Tipo Sanguíneo:</span>
                    <span><%=usuario.getTipo_sanguineo()%></span>
                </li>
            </ul>
            <ul class="collection col s6">
                <li class="collection-item teal lighten-4">
                    <span class="cidade">Cidade:</span>
                    <span><%=usuario.getCidade()%></span>
                    <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
                </li>
                <li class="collection-item teal lighten-5">
                    <span class="uf">UF:</span>
                    <span><%=usuario.getUf()%></span>
                    <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
                </li>
                <li class="collection-item teal lighten-4">
                    <span class="endereco">Endereço</span>
                    <span><%=usuario.getEndereco()%></span>
                    <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
                </li>
                <li class="collection-item teal lighten-5">
                    <span class="email">Email:</span>
                    <span><%=usuario.getEmail()%></span>
                    <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
                </li>
                <li class="collection-item teal lighten-4">
                    <span class="telefone">Telefone:</span>
                    <span><%=usuario.getTelefone()%></span>
                    <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
                </li>
                <li class="collection-item teal lighten-5">
                    <span class="contato-emergencia">Contato de emergência:</span>
                    <span><%=usuario.getContato_emergencia()%></span>
                    <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
                </li>
                <li class="collection-item teal lighten-4">
                    <span class="estado-civil">Estado Civil:</span>
                    <span><%=usuario.getEstado_civil()%></span>
                    <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
                </li>
                <li class="collection-item teal lighten-5">
                    <span class="convenio">Covenio:</span>
                    <span><%=usuario.getConvenio()%></span>
                    <a href="#!" class="secondary-content"><i class="material-icons">edit</i></a>
                </li>
            </ul>
            <div class="col s1 right">
                <a class="btn-floating btn cyan pulse right margin-botao"><i class="material-icons">edit</i></a>
            </div>
        </div>
        <div id="Funcionarios2" class="scrollBarOnDiv">
            <div class="valign-wrapper">
                <h5>This should be vertically aligned</h5>
            </div>
        </div>
        <div id="Funcionarios3" class="col s12 container">
            <table class="striped teal lighten-4">
                <thead>
                    <tr>
                        <th>Cursos</th>
                        <th>Data</th>
                        <th>Local</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Palestra1</td>
                        <td>01/01/2019</td>
                        <td>Hospital Blu Vitality</td>
                    </tr>
                    <tr>
                        <td>Palestra 2</td>
                        <td>05/10/2018</td>
                        <td>Hospital Blu Vitality</td>
                    </tr>
                    <tr>
                        <td>Palestra 3</td>
                        <td>10/12/2018</td>
                        <td>Hospital Blu Vitality</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>

<jsp:include page="../model/footer.jsp"/>