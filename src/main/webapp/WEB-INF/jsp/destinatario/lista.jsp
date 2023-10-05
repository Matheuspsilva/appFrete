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
            <h2>Classe Destinatario</h2>
            <h4><a href="/destinatario/cadastro">Novo</a></h4>
            <table class="table">
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>Endereço</th>
                        <th>Telefone</th>
                        <th>CNPJ</th>
                        <th>Ação</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="s" items="${listaDestinatario}">
                        <tr>
                            <td>${s.nome}</td>
                            <td>${s.endereco}</td>
                            <td>${s.telefone}</td>
                            <td>${s.cnpj}</td>
                            <td>
                                <a href="/destinatario/${s.id}/excluir">Excluir</a>
                            </td>
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
