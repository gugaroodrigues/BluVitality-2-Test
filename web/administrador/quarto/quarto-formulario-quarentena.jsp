    <form>
        <span>Numero do Quarto:</span>
        <input type="number" name="numero" id="quarentena-numero-quarto">
        <span>TIPO:</span>
    </form>
    <select id="quarto-quarentena-tipo">
        <option value="null"></option>
        <option value="UTI">UTI</option>
        <option value="SemiIntencivo">Semi - Intensivo</option>
        <option value="salaDeOperacao"> Sala de Cirurgia</option>
        <option value="leito">Leito</option>
        <option value="consultorio">Consultorio</option>
        <option value="recuperacao">Sala de recuperação</option>
    </select>
    <a class="waves-effect  btn-small" id="quarto-mover-quarentena">Adicionar</a>
    <a class="waves-effect  btn-small" id="quarto-remover-quarentena">Remover</a>
    
    <form action="/categoria/store" method="post">
    
    <div class="form-group">
	<label for='campo-categoria'><i class=''></i> Categoria</label>
	<input class='form-control' type='text' id='campo-categoria' name="categoria" required='required'>
    </div>
	
    <input class='btn btn-success' type="submit" value="Adicionar">
</form>