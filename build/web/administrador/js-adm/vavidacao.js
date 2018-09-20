/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function () {
$('#form-pendencias').validate({
    errorClass: 'text-red darken-4',
    validElementClass: 'text-teal accent-3',
    success: 'valid',
    rules: {
        input_text: {
            required: true,
            minlength: 4,
            maxlength: 10
        },
        tempoPendencia: {   
            required: true,
            date: true,
            now = new Date,
            mindate: now.getDay()
        },
        textarea2: {
            required: true,
            minlength: 10,
            maxlength: 250
        },
        messages: {
            input_text: {
                required: 'Nome é obrigatório',
                minlength: 'Nome deve conter no mínimo {0} caracteres',
                maxlength: 'Nome deve conter no máximo {0} caracteres'
            },
            tempoPendencia: {
                required: 'Data deve ser preenchida',
                mindate: 'Data não pode ser menor que' + now.getDay()
            },
            textarea2: {
                required: 'Descrição deve ser preenchida',
                minlength: 'Minimo 10 caracteres',
                maxlength: 'Maximo 250 caracteres'

            }
        }

    }
});

$("#form-pendencias").on('btnPendencia', function (e) {

    if ($("#form-pendencias").valid() == false) {
        e.preventDefault();
    } else {
        alert('asdaspdas');
    }
});

});