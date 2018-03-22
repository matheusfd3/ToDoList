<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/templates/includes.jsp" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>ToDoList - Documenta��o</title>
</head>
<body>
	<c:import url="templates/cabecalho.jsp"/>
	
	<section class="container">
		<h1 class="text-center">Projeto Started - ToDOList</h1>
		<h3><u>Descri��o:</u></h3> 
		<p class="lead"> Um projeto simples WEB onde teremos um CRUD. Deve-se cadastrar uma tarefa e atribuir <br>
		a mesma para um usu�rio cadastrado. N�o ser� necess�rio um CRUD para o usu�rio. <br>
		Fa�a utilizando o mais simples, nada de ferramentas, apenas o b�sico.</p>
	
		<h3><u>Arquitetura:</u></h3>
		<p class="lead"> MVC Action Based, JSP, JSTL, CSS, JavaScript (pode usar o Jquery ou outro framework <br>
		para valida��o).</p>
	
		<h3><u>Informa��es:</u></h3>
			<ol class="lead">
				<li>Banco de dados (qualquer um que voc� quiser, recomendado: MySQL, Postgresql).</li>
				<li>Estrutura simples com Tomcat (escolha a vers�o), JSP e Servlets.</li>
				<li>CRUD completo da tarefa (toda tarefa tem que estar ligada a UM �NICO usu�rio).</li>
				<ol type="a">
					<li>Adicionar tarefa</li>
					<li>Alterar tarefa</li>
					<li>Deletar tarefa</li>
					<li>listar tarefas</li>
				</ol>
				<li>Usu�rios podem ser adicionados diretamente no banco.</li>
				<li><b>Um usu�rio poder� ter v�rias tarefas, mas n�o o contr�rio.</b></li>
				
				<ol type="a">
					<li>Autentica��o e Permiss�o b�sica de acesso por usu�rio.</li>
					<ol type="i">
						<li>O usu�rio poder� criar, alterar, excluir e listar somente as SUAS tarefas.</li>
						<li>Um usu�rio logado NUNCA poder� acessar tarefas de outro usu�rio.</li>
					</ol>
				</ol>
			</ol>
	
		<p class="lead"><u>OBS:</u> A tarefa ser� apenas al�m do ID uma descri��o do que � a tarefa e qual usu�rio <br>
		ela pertence. N�o se pode adicionar tarefa sem que o usu�rio <b>esteja logado.</b></p>
	</section>
	
	<c:import url="templates/rodape.jsp"/>
</body>
</html>