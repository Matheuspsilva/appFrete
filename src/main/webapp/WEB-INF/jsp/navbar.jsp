<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Barra de navegação Bootstrap -->
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
        aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a class="nav-link" href="/">App Gestão Frete <span class="sr-only"></span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/frete/lista">Frete</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/rota/lista">Rota</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/remetente/lista">Remetente</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/destinatario/lista">Destinatario</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/transportadora/lista">Transportadora</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/usuario/lista">Usuario</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/login">Login</a>
            </li>

        </ul>
    </div>
</nav>
