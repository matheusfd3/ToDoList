<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/templates/includes.jsp" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>ToDoList - Login</title>
</head>
<body>
	<c:import url="templates/cabecalho.jsp"/>
	<section>
		<form action="sistema?logica=AutenticaUsuario" method="POST">
			<label for="inputUsername">Username: </label>
			<input id="inputUsername" type="text" name="username">
			<label for="inputSenha">Senha: </label>
			<input id="inputSenha" type="password" name="senha">
			<input type="submit" value="Logar">
		</form>
	</section>
	<c:import url="templates/rodape.jsp"/>
</body>
</html>