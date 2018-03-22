package br.com.triadworks.todolist.modelo;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.triadworks.todolist.dao.TarefaDAO;

public class ListaTarefaLogica implements Logica {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Connection connection = (Connection) request.getAttribute("connection");
		
		Usuario usuario = (Usuario) request.getSession().getAttribute("usuarioLogado");
		
		List<Tarefa> listaTarefa = new TarefaDAO(connection).getListaDeTarefaDoUsuario(usuario);
		
		request.getSession().setAttribute("listaTarefa", listaTarefa);
		
		response.sendRedirect("home-usuario.jsp");

	}

}
