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
                <c:choose>
                    <c:when test="${empty sessionScope.usuario}">
                        <li class="nav-item">
                            <a class="nav-link" href="/login">Login</a>
                        </li>
                    </c:when>
                    <c:otherwise>
                        <li class="nav-item">
                            <a class="nav-link" href="javascript:void(0);" onclick="logout();">Logout</a>
                        </li>
                    </c:otherwise>
                </c:choose>
            </li>
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
