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
	<div class="container mt-3">
	  <h2>Cadastramento de Frete</h2>

	  <form action="/frete/incluir" method="post">

	    <div class="mb-3 mt-3">
	        <label for="nome" class="form-label">Descricao</label>
            <input type="text" class="form-control" id="descricao" name="descricao" placeholder="Descricao do frete">
	    </div>

        <!-- Criar campo select para rota, Criar campo select para escolher Remetente, Cria select para escolher Destinatario, Criar select para escolher Transportadora -->
        <div class="mb-3 mt-3">
            <label for="nome" class="form-label">Rota</label>
            <select class="form-select" aria-label="Default select example" name="rota">
                <option selected>Selecione a rota</option>
                <c:forEach items="${rotas}" var="rota">
                    <option value="${rota.id}">${rota.nome}</option>
                </c:forEach>
            </select>
        </div>

        <div class="mb-3 mt-3">
            <label for="nome" class="form-label">Remetente</label>
            <select class="form-select" aria-label="Default select example" name="remetente">
                <option selected>Selecione o remetente</option>
                <c:forEach items="${remetentes}" var="remetente">
                    <option value="${remetente.id}">${remetente.nome}</option>
                </c:forEach>
            </select>
        </div>

        <div class="mb-3 mt-3">
            <label for="nome" class="form-label">Destinatario</label>
            <select class="form-select" aria-label="Default select example" name="destinatario">
                <option selected>Selecione o destinatario</option>
                <c:forEach items="${destinatarios}" var="destinatario">
                    <option value="${destinatario.id}">${destinatario.nome}</option>
                </c:forEach>
            </select>
        </div>

        <div class="mb-3 mt-3">
            <label for="nome" class="form-label">Transportadora</label>
            <select class="form-select" aria-label="Default select example" name="transportadora">
                <option selected>Selecione a transportadora</option>
                <c:forEach items="${transportadoras}" var="transportadora">
                    <option value="${transportadora.id}">${transportadora.nome}</option>
                </c:forEach>
            </select>

        </form>


	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>
</body>
</html>