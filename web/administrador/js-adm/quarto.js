//Adicionar-Quarto
jQuery_2_1_1(function () {

    jQuery_2_1_1('#quarto-cadastro-salvar').on('click', function () {
        jQuery_2_1_1.ajax({
            url: '/quarto/store',
            method: 'post',
            data: {
                'numeroQuarto': jQuery_2_1_1('#quarto-cadastro-numero-quarto').val(),
                'tipo': jQuery_2_1_1('#quarto-cadastro-tipo').val(),
                'status': jQuery_2_1_1('#quarto-cadastro-status').val()
            }

        });
    });
});

//Remover-Quarto
jQuery_2_1_1(function () {

    jQuery_2_1_1('#quarto-cadastro-remover').on('click', function () {
        jQuery_2_1_1.ajax({
            url: '/',
            method: 'post',
            data: {
                'numeroQuarto': jQuery_2_1_1('#remover-numero-quarto').val(),
                'tipo': jQuery_2_1_1('#quarto-remover-tipo').val(),
            }
        });
    });
});


//Mover-Quarto-quarentena
jQuery_2_1_1(function () {

    jQuery_2_1_1('#quarto-mover-quarentena').on('click', function () {
        jQuery_2_1_1.ajax({
            url: '/',
            method: 'post',
            data: {
                'numeroQuarto': jQuery_2_1_1('#remover-numero-quarto').val(),
                'tipo': jQuery_2_1_1('#quarto-remover-tipo').val(),
            }
        });
    });
});




