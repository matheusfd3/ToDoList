<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/templates/includes.jsp" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>ToDoList - Documentação</title>
</head>
<body>
	<c:import url="templates/cabecalho.jsp"/>
	
	<section class="container">
		<h1 class="text-center">Projeto Started - ToDOList</h1>
		<h3><u>Descrição:</u></h3> 
		<p class="lead"> Um projeto simples WEB onde teremos um CRUD. Deve-se cadastrar uma tarefa e atribuir <br>
		a mesma para um usuário cadastrado. Não será necessário um CRUD para o usuário. <br>
		Faça utilizando o mais simples, nada de ferramentas, apenas o básico.</p>
	
		<h3><u>Arquitetura:</u></h3>
		<p class="lead"> MVC Action Based, JSP, JSTL, CSS, JavaScript (pode usar o Jquery ou outro framework <br>
		para validação).</p>
	
		<h3><u>Informações:</u></h3>
			<ol class="lead">
				<li>Banco de dados (qualquer um que você quiser, recomendado: MySQL, Postgresql).</li>
				<li>Estrutura simples com Tomcat (escolha a versão), JSP e Servlets.</li>
				<li>CRUD completo da tarefa (toda tarefa tem que estar ligada a UM ÚNICO usuário).</li>
				<ol type="a">
					<li>Adicionar tarefa</li>
					<li>Alterar tarefa</li>
					<li>Deletar tarefa</li>
					<li>listar tarefas</li>
				</ol>
				<li>Usuários podem ser adicionados diretamente no banco.</li>
				<li><b>Um usuário poderá ter várias tarefas, mas não o contrário.</b></li>
				
				<ol type="a">
					<li>Autenticação e Permissão básica de acesso por usuário.</li>
					<ol type="i">
						<li>O usuário poderá criar, alterar, excluir e listar somente as SUAS tarefas.</li>
						<li>Um usuário logado NUNCA poderá acessar tarefas de outro usuário.</li>
					</ol>
				</ol>
			</ol>
	
		<p class="lead"><u>OBS:</u> A tarefa será apenas além do ID uma descrição do que é a tarefa e qual usuário <br>
		ela pertence. Não se pode adicionar tarefa sem que o usuário <b>esteja logado.</b></p>
	</section>
	
	<c:import url="templates/rodape.jsp"/>
</body>
</html>