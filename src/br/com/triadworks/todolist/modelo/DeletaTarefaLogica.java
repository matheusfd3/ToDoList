package br.com.triadworks.todolist.modelo;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.triadworks.todolist.dao.TarefaDAO;

public class DeletaTarefaLogica implements Logica {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Connection connection = (Connection) request.getAttribute("connection");
		
		Long id = new Long(request.getParameter("id"));
		
		Tarefa tarefa = new TarefaDAO(connection).getTarefa(id);
		
		new TarefaDAO(connection).deleta(tarefa);
		
		response.sendRedirect("sistema?logica=ListaTarefa");
		
	}

}
