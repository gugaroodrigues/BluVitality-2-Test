



            <form action="fomularioCadastro" class="col s12">
                <label for="numero">Numero do Quarto:</label>
                <input type="number" name="numero" id="quarto-cadastro-numero-quarto">
                <label>Tipo:</label>
                <select id="quarto-cadastro-tipo">
                    <option value="null"></option>
                    <option value="UTI">UTI</option>
                    <option value="SemiIntencivo">Semi - Intensivo</option>
                    <option value="salaDeOperacao"> Sala de Cirurgia</option>
                    <option value="leito">Leito</option>
                    <option value="consultorio">Consultorio</option>
                    <option value="recuperacao">Sala de recuperação</option>
                </select>
                <span class="">Status:</span>
                <label>
                    <input id="quarto-cadastro-status" name="sexo" type="radio" checked />
                    <span>Ativo</span>
                </label>
                <label>
                    <input name="sexo" type="radio" />
                    <span>invativo</span>
                </label>
            </form>
            <a class="waves-effect  btn-small" id="quarto-cadastro-salvar">SALVAR</a>
       