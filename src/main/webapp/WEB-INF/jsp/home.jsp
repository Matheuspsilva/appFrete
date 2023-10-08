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
            <jsp:include page="navbar.jsp" />
        </header>

        <main>

            <h1>Bem-vindo à Minha Página Inicial</h1>
            <p>Este é um exemplo de página inicial simples.</p>
            <!-- Conteúdo adicional da sua página -->

            <h2>Classe Frete</h2>
            <p>Representa informações sobre um serviço de frete, incluindo sua descrição, valor, data de entrega, status e informações sobre o remetente, destinatário e transportadora envolvidos.</p>
            <table class="table">
                <thead>
                    <tr>
                        <th>Atributo</th>
                        <th>Tipo</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>id</td>
                        <td>Long</td>
                    </tr>
                    <tr>
                        <td>descricao</td>
                        <td>String</td>
                    </tr>
                    <tr>
                        <td>valor</td>
                        <td>double</td>
                    </tr>
                    <tr>
                        <td>dataEntrega</td>
                        <td>LocalDate</td>
                    </tr>
                    <tr>
                        <td>status</td>
                        <td>StatusFrete</td>
                    </tr>
                    <tr>
                        <td>remetente</td>
                        <td>Remetente</td>
                    </tr>
                    <tr>
                        <td>destinatario</td>
                        <td>Destinatario</td>
                    </tr>
                    <tr>
                        <td>transportadora</td>
                        <td>Transportadora</td>
                    </tr>
                </tbody>
            </table>

            <h2>Classe Rota</h2>
            <p>Representa informações sobre uma rota de frete, incluindo origem, destino e distância.</p>
            <table class="table">
                <thead>
                    <tr>
                        <th>Atributo</th>
                        <th>Tipo</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>id</td>
                        <td>Long</td>
                    </tr>
                    <tr>
                        <td>origem</td>
                        <td>String</td>
                    </tr>
                    <tr>
                        <td>destino</td>
                        <td>String</td>
                    </tr>
                    <tr>
                        <td>distancia</td>
                        <td>double</td>
                    </tr>
                </tbody>
            </table>

            <h2>Enum StatusFrete</h2>
            <table class="table">
                <thead>
                    <tr>
                        <th>Valor</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>PENDENTE</td>
                    </tr>
                    <tr>
                        <td>EM_TRANSITO</td>
                    </tr>
                    <tr>
                        <td>ENTREGUE</td>
                    </tr>
                    <tr>
                        <td>CANCELADO</td>
                    </tr>
                </tbody>
            </table>

            <h2>Classe Remetente</h2>
            <p>Representa informações sobre o remetente de um serviço de frete, incluindo nome, endereço, telefone e CNPJ.</p>
            <table class="table">
                <thead>
                    <tr>
                        <th>Atributo</th>
                        <th>Tipo</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>id</td>
                        <td>Long</td>
                    </tr>
                    <tr>
                        <td>nome</td>
                        <td>String</td>
                    </tr>
                    <tr>
                        <td>endereco</td>
                        <td>String</td>
                    </tr>
                    <tr>
                        <td>telefone</td>
                        <td>String</td>
                    </tr>
                    <tr>
                        <td>cnpj</td>
                        <td>String</td>
                    </tr>
                </tbody>
            </table>

            <h2>Classe Destinatario</h2>
            <p>Representa informações sobre o destinatário de um serviço de frete, incluindo nome, endereço, telefone e CNPJ.</p>
            <table class="table">
                <thead>
                    <tr>
                        <th>Atributo</th>
                        <th>Tipo</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>id</td>
                        <td>Long</td>
                    </tr>
                    <tr>
                        <td>nome</td>
                        <td>String</td>
                    </tr>
                    <tr>
                        <td>endereco</td>
                        <td>String</td>
                    </tr>
                    <tr>
                        <td>telefone</td>
                        <td>String</td>
                    </tr>
                    <tr>
                        <td>cnpj</td>
                        <td>String</td>
                    </tr>
                </tbody>
            </table>

            <h2>Classe Transportadora</h2>
            <p>Representa informações sobre a transportadora de um serviço de frete, incluindo nome, endereço, telefone e CNPJ.</p>
            <table class="table">
                <thead>
                    <tr>
                        <th>Atributo</th>
                        <th>Tipo</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>id</td>
                        <td>Long</td>
                    </tr>
                    <tr>
                        <td>nome</td>
                        <td>String</td>
                    </tr>
                    <tr>
                        <td>endereco</td>
                        <td>String</td>
                    </tr>
                    <tr>
                        <td>telefone</td>
                        <td>String</td>
                    </tr>
                    <tr>
                        <td>cnpj</td>
                        <td>String</td>
                    </tr>
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
