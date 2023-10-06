<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Barra de navegação Bootstrap -->
<!--navbar Expandida bootstrap -->

<nav class="navbar navbar-dark bg-dark " id="navbarNav">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="/">App Gestão Frete</a>
        </div>
        <c:if test="${not empty sessionScope.usuario}">
            <ul class="nav">
                <li class="nav-item">
                    <a class="nav-link text-white" href="/frete/lista">Frete</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-white" href="/rota/lista">Rota</a>
                </li>
                <li class="nav-item ">
                    <a class="nav-link text-white" href="/remetente/lista">Remetente</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-white" href="/destinatario/lista">Destinatario</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-white" href="/transportadora/lista">Transportadora</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-white" href="/usuario/lista">Usuario</a>
                </li>
            </ul>
        </c:if>
        <ul class="nav navbar-nav navbar-right">
            <c:choose>
                <c:when test="${empty sessionScope.usuario}">
                    <li class="nav-item">
                        <a class="nav-link text-white" href="/login">Login</a>
                    </li>
                </c:when>
                <c:otherwise>
                    <li>
                        <a class="nav-link text-white" href="javascript:void(0);" onclick="logout();">Logout</a>
                    </li>
                </c:otherwise>
            </c:choose>
        </ul>
    </div>
</nav>

<script type="text/javascript">
    function logout() {
        var xhr = new XMLHttpRequest();
        xhr.open("POST", "/logout", true);
        xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        xhr.onreadystatechange = function () {
            if (xhr.readyState === 4 && xhr.status === 200) {
                // Redirecionar ou atualizar a página após o logout bem-sucedido
                window.location.href = "/";
            }
        };
        xhr.send();
    }
</script>
