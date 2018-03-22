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
			<h3><u>Forma��o:</u></h3>
			<ul class="lead">
				<li>Gradua��o em An�lise e Desenvolvimento de Sistemas - Est�cio FIC (Conclu�do - 2017)</li>
				<li>P�s-Gradua��o em Engenharia de Software - Est�cio FIC (Em Andamento)</li>
			</ul>
			<h3><u>Cursos:</u></h3>
			<ul class="lead">
				<li>L�gica de programa��o com JavaScript - TriadWorks (Presencial - 36h)</li>
				<li>Java e Orienta��o a Objetos - TriadWorks (Presencial - 40h)</li>
				<li>Java para Web - TriadWorks (Presencial - 40h)</li>
				<li>JSF 2, Primefaces e CDI - TriadWorks (Presencial - 40h)</li>
				<li>Persist�ncia com JPA 2 e Hibernate - TriadWorks (Presencial - 24h)</li>
			</ul>
			<p class="lead">
				<b><u>* Para mais informa��es:</u><a href="https://www.dropbox.com/s/yucrsw1vbajuibf/Curriculo-Matheus-Ferreira-Dantas.pdf?dl=0" target="_blank"> meu curriculo</a></b>
			</p>
		</div>
	
	</section>
	
	<c:import url="templates/rodape.jsp"/>
</body>
</html>