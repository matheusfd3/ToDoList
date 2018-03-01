<%@ include file="/templates/includes.jsp" %>
<header>
	<img class="img-fluid" src="imagens/Logo.jpg" alt="logo" />
</header>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark sticky-top">
  	<c:choose>
		<c:when test="${sessionScope.usuarioLogado == null}">
			<ul class="navbar-nav">
    			<li class="nav-item">
      				<a class="nav-link" href="login.jsp">Login</a>
    			</li>
    			<li class="nav-item">
      				<a class="nav-link" href="documentacao.jsp">Documentação</a>
    			</li>
    			<li class="nav-item">
      				<a class="nav-link" href="desenvolvedor.jsp">Desenvolvedor</a>
    			</li>
  			</ul>
  		</c:when>
  		<c:otherwise>
  			<ul class="navbar-nav">
    			<li class="nav-item">
      				<a class="nav-link" href="home-usuario.jsp">Home</a>
    			</li>
		    	<li class="nav-item">
		      		<a class="nav-link" href="documentacao.jsp">Documentação</a>
		    	</li>
		    	<li class="nav-item">
		      		<a class="nav-link" href="desenvolvedor.jsp">Desenvolvedor</a>
		    	</li>
		    	<li class="nav-item" style="position:absolute;right:10px;">
		      		<a class="nav-link" href="#">Sair</a>
		    	</li>
		  	</ul>
  		</c:otherwise>
  	</c:choose>
</nav>
 
