package br.com.triadworks.todolist.modelo;

import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.triadworks.todolist.dao.UsuarioDAO;

public class AutenticaUsuarioLogica implements Logica{

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		String username = request.getParameter("username");
		String senha = request.getParameter("senha");
		
		Connection connection = (Connection) request.getAttribute("connection");
		
		Usuario usuario = new UsuarioDAO(connection).Autentica(username, senha);
		
		if(usuario != null) {
			request.getSession().setAttribute("usuarioLogado", usuario);
			response.sendRedirect("sistema?logica=ListaTarefa");
		}else {
			request.setAttribute("mensagem", "Usuário ou senha inválido");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		
	}

}
