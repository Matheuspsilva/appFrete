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
	  <h2>Cadastramento de Rota</h2>

	  <form action="/rota/incluir" method="post">

        <div class="mb-3 mt-3">
            <label for="nome">Nome:</label>
            <input type="text" class="form-control" id="nome"  name="nome">
        </div>

        <div class="mb-3 mt-3">
          <label for="nome">Distância:</label>
          <input type="text" class="form-control" id="distancia"  name="distancia">
        </div>

        <div class="mb-3 mt-3">
          <label for="nome">Endereço Origem:</label>
          <input type="text" class="form-control" id="enderecoOrigem"  name="enderecoOrigem">
        </div>

        <div class="mb-3 mt-3">
          <label for="nome">Endereço Destino:</label>
          <input type="text" class="form-control" id="enderecoDestino"  name="enderecoDestino">
        </div>

	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>
</body>
</html>