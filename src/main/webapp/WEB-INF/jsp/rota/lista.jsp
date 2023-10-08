<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Minha Página Inicial</title>
    <!-- Incluir as referências ao Bootstrap e outros recursos CSS aqui -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Incluir os links para seus estilos personalizados, se houver -->
</head>
<body>
    <div class="container">
        <header>
            <jsp:include page="../navbar.jsp" />
        </header>

         <main>
            <h2>Classe Rota</h2>
            <h4><a href="/rota/cadastro">Nova</a></h4>
            <table class="table">
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>Distancia</th>
                        <th>Endereço Origem </th>
                        <th>Endereço Destino</th>
                        <th>Ação</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="s" items="${listaRotas}">
                        <tr>
                            <td>${s.nome}</td>
                            <td>${s.distancia}</td>
                            <td>${s.enderecoOrigem}</td>
                            <td>${s.enderecoDestino}</td>

                            <td><a href="/rota/${s.id}/excluir">excluir</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </main>


        <footer class="text-center mt-4">
            <p>&copy; 2023 Minha Empresa. Todos os direitos reservados.</p>
        </footer>
    </div>

    <!-- Incluir os scripts Bootstrap e outros recursos JavaScript aqui -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
    <!-- Incluir os links para seus scripts personalizados, se houver -->
</body>
</html>
