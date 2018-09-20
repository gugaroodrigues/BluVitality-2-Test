//Adicionar-Quarto
$(function () {

    $('#quarto-cadastro-salvar').on('click', function () {
        $.ajax({
            url: '/quarto/store',
            method: 'post',
            data: {
                'numeroQuarto': $('#quarto-cadastro-numero-quarto').val(),
                'tipo': $('#quarto-cadastro-tipo').val(),
                'status': $('#quarto-cadastro-status').val()
            }

        });
    });

//Remover-Quarto
    $('#quarto-cadastro-remover').on('click', function () {
        $.ajax({
            url: '/',
            method: 'post',
            data: {
                'numeroQuarto': $('#remover-numero-quarto').val(),
                'tipo': $('#quarto-remover-tipo').val(),
            }
        });
    });

//Mover-Quarto-quarentena
    $('#quarto-mover-quarentena').on('click', function () {
        $.ajax({
            url: '/',
            method: 'post',
            data: {
                'numeroQuarto': $('#remover-numero-quarto').val(),
                'tipo': $('#quarto-remover-tipo').val(),
            }
        });
    });

    $('#tabela-funcionario').DataTable({
        'ajax': '/funcionarios/obtertodosparadatatable',
        'columns': [
            {'data': 'usuario'},
            {'data': 'cargo'},
            {'data': 'tipo'}

        ]
    });
    $('#quarto-index').DataTable({
        'ajax': '/quarto/obtertodosparadatatable',
        'columns': [
            {'data': 'numero_quarto'},
            {'data': 'tipo'},
            {'data': 'status'}
        ]
    });
    $('#ultimos-servicos').DataTable({
        'ajax': '/servicos/obtertodosparadatatable',
        'columns': [
            {'data': 'nome'},
            {'data': 'descricao'}
        ]
    });

    $('#tabela-usuario').DataTable({
        'ajax': '/usuarios/obtertodosparadatatable',
        'columns': [
            {'data': 'nome'},
            {'data': 'idade'},
            {'data': 'cpf'},
            {'data': 'telefone'}
        ]
    });
});




