<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/templates/includes.jsp" %>
<html style="overflow: hidden;">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>ToDoList - Login</title>
	<link rel="shortcut icon" href="imagens/favicon.ico">
</head>
<body>

	<c:import url="templates/cabecalho.jsp"/>
	
	<section class="row">
		<div class="col"></div>
  		<div class="col">
  		
  		<form action="sistema?logica=AutenticaUsuario" method="POST" style="margin-top: 10px;">
			<div class="form-group">
				<label for="inputUsername">Username: </label>
				<input id="inputUsername" class="form-control" type="text" name="username">
			</div>
			<div class="form-group">
				<label for="inputSenha">Senha: </label>
				<input id="inputSenha" class="form-control" type="password" name="senha">
			</div>
			<input class="btn btn-primary" type="submit" value="Logar">
		</form>
  		${requestScope.mensagem}
  		</div>
  		<div class="col"></div>
	</section>
	
	<c:import url="templates/rodape.jsp"/>
	
</body>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</html>