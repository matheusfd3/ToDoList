<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="templates/includes.jsp" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Home - ${usuarioLogado.nome}</title>
	<script>
		var preencherAltera = function(id, descricao){
			document.getElementById('hidden-id').value = id;
			document.getElementById('text-descricao').value = descricao;
		}
	</script>
</head>
<body>
	<c:import url="templates/cabecalho.jsp"/>
	
	<section id="corpo-home"class="container">
		<table class="table table-striped table-bordered">
			<tr>
				<th>#</th>
				<th class="largura">Tarefa</th>
				<th>Altera</th>
				<th>Deleta</th>
				<th><a href="" data-toggle="modal" data-target="#div-adiciona"><img alt="Adicionar" src="imagens/add.png" width="25" height="25"></a></th>
			</tr>
			<c:forEach var="tarefa" items="${sessionScope.listaTarefa}" varStatus="numeracao">
				<tr>
					<td>${numeracao.count}</td>
					<td class="largura">${tarefa.descricao}</td>
					<td><a href="" onclick="preencherAltera(${tarefa.id},'${tarefa.descricao}')" data-toggle="modal" data-target="#div-altera"><img alt="Alterar" src="imagens/update.png" width="25" height="25"></a></td>
					<td><a href="sistema?logica=DeletaTarefa&id=${tarefa.id}"><img alt="Deletar" src="imagens/delete.png" width="25" height="25"></a></td>
					<td></td>
				</tr>
			</c:forEach>
		</table>
	</section>
	
	<!-- The Modal -->
		<div class="modal fade" id="div-adiciona">
		  <div class="modal-dialog">
		    <div class="modal-content">
				<form action="sistema?logica=AdicionaTarefa" method="POST" id="formAdiciona">
				
			      <!-- Modal Header -->
			      <div class="modal-header">
			        <h4 class="modal-title">Criar Nova Tarefa</h4>
			        <button type="button" class="close" data-dismiss="modal">&times;</button>
			      </div>
			
			      <!-- Modal body -->
			      <div class="modal-body">
	    			<input type="text" class="form-control" placeholder="Digite uma tarefa" name="descricao"> 
			      </div>
			
			      <!-- Modal footer -->
			      <div class="modal-footer">
			        <input type="submit" class="btn btn-success" value="Adicionar">
			      </div>
			      
				</form>
		    </div>
		  </div>
		</div>
		
		<!-- The Modal -->
		<div class="modal fade" id="div-altera">
		  <div class="modal-dialog">
		    <div class="modal-content">
				<form action="sistema?logica=AlteraTarefa" method="POST" id="formAltera">
				
			      <!-- Modal Header -->
			      <div class="modal-header">
			        <h4 class="modal-title">Alterar Tarefa</h4>
			        <button type="button" class="close" data-dismiss="modal">&times;</button>
			      </div>
			
			      <!-- Modal body -->
			      <div class="modal-body">
			      	<input id="hidden-id" type="hidden" name="id" value="">
			      	<input id="text-descricao" type="text" class="form-control" placeholder="Digite a nova tarefa" name="descricao" value="">
			      </div>
			
			      <!-- Modal footer -->
			      <div class="modal-footer">
			        <input type="submit" class="btn btn-success" value="Alterar">
			      </div>
			      
				</form>
		    </div>
		  </div>
		</div>
		
	<c:import url="templates/rodape.jsp"/>
</body>
</html>