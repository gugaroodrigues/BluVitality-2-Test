<%-- 
    Document   : formulario-pendencias
    Created on : 17/09/2018, 03:27:41
    Author     : Gus
--%>



<div class="row">
    <form class="col s12" id="form-pendencias" >
        <div class="row">
            <div class="input-field col s6">
                <input id="input_text" type="text" data-length="10">
                <label for="input_text1">Nome da Pendência</label>
            </div>
        </div>
        <div class="row">
            <div class="input-field col s8">
                <input type="text" class="datepicker" id="tempoPendencia">
                <label for="tempoPendencia1">Tempo Limite</label>
            </div>
        </div>
        <div class="row">
            <div class="input-field col s12">
                <textarea id="textarea2" class="materialize-textarea" data-length="120"></textarea>
                <label for="textarea2">Descrição</label>
            </div>
        </div>
        <a class="waves-effect waves-light btn" id="btnPendencia"><i class="material-icons left">event</i>button</a>
    </form>
</div>