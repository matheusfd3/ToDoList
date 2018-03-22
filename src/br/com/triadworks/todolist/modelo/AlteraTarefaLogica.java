package br.com.triadworks.todolist.modelo;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.triadworks.todolist.dao.TarefaDAO;

public class AlteraTarefaLogica implements Logica {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Connection connection = (Connection) request.getAttribute("connection");
		
		String descricao = new String(request.getParameter("descricao"));
		
		Long id = new Long(request.getParameter("id"));
		
		Tarefa tarefa = new TarefaDAO(connection).getTarefa(id);
		
		tarefa.setDescricao(descricao);
		
		new TarefaDAO(connection).altera(tarefa);
		
		response.sendRedirect("sistema?logica=ListaTarefa");

	}

}
