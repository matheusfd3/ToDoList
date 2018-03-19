<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/templates/includes.jsp" %>
<html style="overflow: hidden;">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>ToDoList - Login</title>
</head>
<body>

	<c:import url="templates/cabecalho.jsp"/>
	
	<section class="row">
		<div class="col-sm-4"></div>
  		<div class="col-sm-4">
  		
  		<p id="mensagem" class="bg-danger">${requestScope.mensagem}</p>
  		<form action="sistema?logica=AutenticaUsuario" method="POST">
			<div class="form-group">
				<label for="inputUsername">Username: </label>
				<input id="inputUsername" class="form-control" type="text" placeholder="insira nome de usuário" name="username">
			</div>
			<div class="form-group">
				<label for="inputSenha">Senha: </label>
				<input id="inputSenha" class="form-control" type="password" placeholder="digite a senha" name="senha">
			</div>
			<input class="btn btn-primary" type="submit" value="Logar">
		</form>
  		
  		</div>
  		<div class="col-sm-4"></div>
	</section>
	
	<c:import url="templates/rodape.jsp"/>
	
</body>
</html>