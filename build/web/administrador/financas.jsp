<%-- 
    Document   : financas
    Created on : 27/08/2018, 10:47:48
    Author     : Alunos
--%>

<jsp:include page="../model/header.jsp"/>
<div class="card transparent z-depth-5">
</div>
<div class="card-content">
    <h1>Finanças</h1>
    <p >I am a very simple card. I am good at containing small bits of information. I am convenient because I require little markup to use effectively.</p>
</div>
<div class="card-tabs container">
    <ul class="tabs tabs-transparent red darken-3">
        <li class="tab"><a href="#test1" class="white-text">Finanças Gerais</a></li>
        <li class="tab"><a href="#test2" class="white-text">Finanças Funcionários</a></li>
        <li class="tab"><a href="#test3" class="white-text">Finanças Pacientes</a></li>
        <li class="tab"><a href="#test4" class="white-text">Finanças Hospital</a></li>
    </ul>
    <div class="card-content orange lighten-4 row">
        <div id="test1"><a class="red darken-3 btn modal-trigger white-text row" href="#modal1">Lucro</a><div id="test1"><a class="red darken-3 btn modal-trigger white-text row" href="#modal2">Despesas</a>
                <div id="test1"><a class="red darken-3 btn modal-trigger white-text" href="#modal3">Receita</a>
                    <!-- Modal Structure -->
                    <div id="modal1" class="modal">
                        <div class="modal-content">
                            <h4 class="center-align">Lucro</h4>
                            <div class="card-image">
                                <img src="../resources/images/grafico_teste3.png" >
                            </div>
                            <div class="modal-footer">
                                <i class="modal-close material-icons right">close</i>
                            </div>
                        </div>
                    </div>
                </div>
                <div id="modal2" class="modal">
                    <div class="modal-content">
                        <h4>Despesas</h4>
                        <div class="card-image">
                            <img src="../resources/images/grafico_teste2.png" >
                        </div>
                        <div class="modal-footer">
                            <i class="modal-close material-icons right">close</i>
                        </div>
                    </div>
                </div>
            </div>
            <div id="modal3" class="modal">
                <div class="modal-content">
                    <h4>Receita</h4>
                    <div class="card-image">
                        <img src="../resources/images/grafico_teste.png" >
                    </div>
                    <div class="modal-footer">
                        <i class="modal-close material-icons right">close</i>
                    </div>
                </div>
            </div>
        </div>
        <div id="test2">Test 2</div>
        <div id="test3">Test 3</div>
        <div id="test4"><div class="card-image">
                <img src="../resources/images/grafico_teste.png"> 
            </div>
        </div>
    </div>
</div>
<jsp:include page="../model/footer.jsp"/>
