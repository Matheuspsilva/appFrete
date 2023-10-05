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
	  <h2>Cadastramento de Usuario</h2>

	  <form action="/usuario/incluir" method="post">

	    <div class="mb-3 mt-3">
	        <label for="nome" class="form-label">Nome</label>
            <input type="text" class="form-control" id="nome" name="nome" placeholder="Nome">
	    </div>

        <div class="mb-3 mt-3">
            <label for="email" class="form-label">Email</label>
            <input type="text" class="form-control" id="email" name="email" placeholder="Email">
        </div>

        <div class="mb-3 mt-3">
            <label for="senha" class="form-label">Senha</label>
            <input type="text" class="form-control" id="senha" name="senha" placeholder="Senha">
        </div>

	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>
</body>
</html>