$(function () {

    $('.slider').slider();
    //Menu retratil
    $('.collapsible').collapsible();
    //modal
    $('.modal').modal();
    //Efeito parallax
    $('.parallax').parallax();
    $('select').formSelect({
        direction: 'left'

    });
    //Mobile Nav Menu
    $('.sidenav').sidenav({
        preventScrolling: true
    });
    $('.fixed-action-btn').floatingActionButton({
        direction: 'left',
        toolbarEnabled: true
    });
    $('.datepicker').datepicker({
        format: 'dd/mm/yyyy',
        i18n: {
            selectMonths: true, //Creates a dropdown to control month
            selectYears: 20, //Creates a dropdown of 15 years to control year
            //The title label to use for the month nav buttons
            labelMonthNext: 'Proximo Mês',
            labelMonthPrev: 'Mês Anterior',
            //The title label to use for the dropdown selectors
            labelMonthSelect: 'Selecionar Mês',
            labelYearSelect: 'Selecionar Ano',
            cancel: 'Cancelar',
            clear: 'Limpar',
            done: 'Ok',
            previousMonth: '‹',
            nextMonth: '›',
            months: ['Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio', 'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro'],
            monthsShort: ['Jan', 'Fev', 'Mar', 'Abr', 'Maio', 'Jun', 'Jul', 'Ago', 'Set', 'Out', 'Nov', 'Dez'],
            weekdays: ['Domingo', 'Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta', 'Sábado'],
            weekdaysShort: ['Dom', 'Seg', 'Ter', 'Qua', 'Qui', 'Sex', 'Sáb'],
            //Materialize modified
            weekdaysAbbrev: ['D', 'S', 'T', 'Q', 'Q', 'S', 'S'],
            today: 'Hoje',
            clear: 'Limpar',
            close: 'Fechar'
                    //The format to show on the `input` element
        }

    });
    $('.scrollspy').scrollSpy();
    $('.dropdown-trigger').dropdown({
        hover: true,
        constrainWidth: false,
        coverTrigger: false
    });
    $('.tabs').tabs({
        swipeable: true,
        onShow: true
    });
    $(".botao-servicos").on("click", function () {
        changeTab("Servicos" + $(this).data("id"));
    });
    $(".botao-exames").on("click", function () {
        changeTab("Exames" + $(this).data("id"));
    });
    $(".botao-contatos").on("click", function () {
        changeTab("Contatos" + $(this).data("id"));
    });
    $(".botao-sobre").on("click", function () {
        changeTab("Sobre" + $(this).data("id"));
    });
    function changeTab(id) {
        var instance = M.Tabs.getInstance($('.tabs'));
        instance.select(id);
        instance.updateTabIndicator();
    }

    $(".agendarE").hide();
    $(".agendarC").hide();
    $(".exameRadio").on("click", function () {
        $(".agendarE").show();
        $(".agendarC").hide();
    });
    $(".consultaRadio").on("click", function () {
        $(".agendarC").show();
        $(".agendarE").hide();
    });
    $('.g-signin2').click(function () {
// signInCallback defined in step 6.
        auth2.grantOfflineAccess().then(signInCallback);
    });
    function onSignIn(googleUser) {
        var profile = googleUser.getBasicProfile();
        console.log('ID: ' + profile.getId()); // Do not send to your backend! Use an ID token instead.
        console.log('Name: ' + profile.getName());
        console.log('Image URL: ' + profile.getImageUrl());
        console.log('Email: ' + profile.getEmail()); // This is null if the 'email' scope is not present.
        var userId = profile.getId();
        var userName = profile.getName();
        var userEmail = profile.getEmail();
        var userPicture = profile.getImageUrl();
        var userPicture = profile.getImageUrl();
        document.getElementById('user-photo').src = userPicture;
        document.getElementById('user-name').innerText = userName;
        document.getElementById('user-email').innerText = userEmail;
        // Recebendo o TOKEN que você usará nas demais requisições à API:
        var LoR = response.getAuthResponse().id_token;
        console.log("~ le Tolkien: " + LoR);
        response.getAuthResponse().sendRedirect(LoRName);
    }
    ;
    function signOut() {
        var auth2 = gapi.auth2.getAuthInstance();
        auth2.signOut().then(function () {
            window.location = "index.jsp";
        });
    }

    var Body = $('body');
    Body.addClass('preloader-site');
});
