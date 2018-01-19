package br.com.triadworks.todolist.modelo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Logica {
	
	public void executar(HttpServletRequest request, HttpServletResponse response);
	
}
