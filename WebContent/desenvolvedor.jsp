<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="templates/includes.jsp" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>ToDoList - Desenvolvedor</title>
</head>
<body>
	<c:import url="templates/cabecalho.jsp"/>
	
	<section class="container">
	
		<div id="div-img-desenvolvedor">
			<img class="img-thumbnail" alt="Desenvolvedor" src="imagens/Desenvolvedor.jpg" width="200" height="200">
		</div>
		
		<div id="div-conteudo-desenvolvedor">
			<p class="lead" >				 
				Nome: Matheus Ferreira Dantas<br>
				Idade: 22 anos<br>
			</p>
			<h3><u>Formação:</u></h3>
			<ul class="lead">
				<li>Graduação em Análise e Desenvolvimento de Sistemas - Estácio FIC (Concluído - 2017)</li>
				<li>Pós-Graduação em Engenharia de Software - Estácio FIC (Em Andamento)</li>
			</ul>
			<h3><u>Cursos:</u></h3>
			<ul class="lead">
				<li>Lógica de programação com JavaScript - TriadWorks (Presencial - 36h)</li>
				<li>Java e Orientação a Objetos - TriadWorks (Presencial - 40h)</li>
				<li>Java para Web - TriadWorks (Presencial - 40h)</li>
				<li>JSF 2, Primefaces e CDI - TriadWorks (Presencial - 40h)</li>
				<li>Persistência com JPA 2 e Hibernate - TriadWorks (Presencial - 24h)</li>
			</ul>
			<p class="lead">
				<b><u>* Para mais informações:</u><a href="https://www.dropbox.com/s/yucrsw1vbajuibf/Curriculo-Matheus-Ferreira-Dantas.pdf?dl=0" target="_blank"> meu curriculo</a></b>
			</p>
		</div>
	
	</section>
	
	<c:import url="templates/rodape.jsp"/>
</body>
</html>