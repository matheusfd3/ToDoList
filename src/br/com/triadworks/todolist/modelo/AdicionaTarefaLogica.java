package br.com.triadworks.todolist.modelo;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.triadworks.todolist.dao.TarefaDAO;

public class AdicionaTarefaLogica implements Logica {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response) throws Exception {

		Connection connection = (Connection) request.getAttribute("connection");
		Usuario usuario = (Usuario) request.getSession().getAttribute("usuarioLogado");

		Tarefa tarefa = new Tarefa();
		tarefa.setDescricao(request.getParameter("descricao"));
		tarefa.setUsuario(usuario);

		new TarefaDAO(connection).adiciona(tarefa);

		response.sendRedirect("sistema?logica=ListaTarefa");

	}

}
