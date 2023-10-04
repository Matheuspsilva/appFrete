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
            <!-- Barra de navegação Bootstrap -->
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="#">Minha Empresa</a>
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
                    </ul>
                </div>
            </nav>
        </header>

        <main>
            <h2>Classe Transportadora</h2>
            <h4><a href="/transportadora/cadastro">Novo</a></h4>
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
                    <c:forEach var="s" items="${listaTransportadoras}">
                        <tr>
                            <td>${s.nome}</td>
                            <td>${s.endereco}</td>
                            <td>${s.telefone}</td>
                            <td>${s.cnpj}</td>
                            <td>
                                <a href="/transportadora/${s.id}/excluir">Excluir</a>
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
