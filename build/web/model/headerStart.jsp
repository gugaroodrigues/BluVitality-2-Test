<%-- 
    Document   : headerStart
    Created on : 29/08/2018, 19:20:41
    Author     : Rafael Alipio Harada @Gustavo Rodrigues 
--%>

<%@page import="br.com.Sistema.DAO.UsuariosDAO"%>
<%@page import="br.com.Sistema.Bean.UsuariosBean"%>
<%@page import="br.com.Sistema.DAO.CargosDAO"%>
<%@page import="br.com.Sistema.Bean.CargosBean"%>
<%@page import="br.com.Sistema.Bean.FuncionariosBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.Sistema.DAO.FuncionariosDAO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <title>Blu Vitality</title>
        <meta charset='UTF-8'>
        <meta name='viewport' content='width=device-width, initial-scale=1.0'>
        <meta name="google-signin-scope" content="profile email">
        <meta name="google-signin-client_id" content="377062664693-qt543mqqgviu416aaqij0sbk642k5tnn.apps.googleusercontent.com">

        <!--Import Google Icon Font-->
        <link href='https://fonts.googleapis.com/icon?family=Material+Icons' rel='stylesheet'>

        <link rel='stylesheet' type='text/css' href='../resources/css/materialize.min.css'>
        <link rel='stylesheet' type='text/css' href='../resources/css/custom.css'>
        <link rel='stylesheet' type='text/css' href='../resources/css/loading.css'>
        <link rel='stylesheet' type='text/css' href='../resources/css/materialize.min.css'>
        <link rel='stylesheet' type='text/css' href='../resources/css/jquery.dataTables.min.css'>
        <link rel='stylesheet' type='text/css' href='../resources/css/select2.min.css'>
        <link rel='stylesheet' type='text/css' href='../resources/bootstrap/css/bootstrap.min.css'>
    </head>
    <body>
        <!--div  class = " preloader-wrapper " >
        <div  class = " preloader " >
            <i class="material-icons ld ld-cycle" >loop</i>
        </div >
        </div -->
        <!--Cabeçalho-->
        <header>
            <nav class='nav-extended white lighten-2 z-depth-0'>
                <div class='nav-wrapper'>
                    <a href='#Inicio' class='brand-logo'><img src="../resources/images/logo.gif" class="imagem-logo"></a>
                    <a href='#' data-target='mobile' class='sidenav-trigger teal-text'><i class='material-icons'>menu</i></a>
                    <ul id='nav-mobile' class='right'>