package br.com.triadworks.todolist.modelo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutUsuarioLogica implements Logica{

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response) throws Exception {

		request.getSession().invalidate();
		response.sendRedirect("index.jsp");
		
	}

}
