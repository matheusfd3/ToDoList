package br.com.triadworks.todolist.filtro;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import br.com.triadworks.todolist.dao.ConnectionFactory;

@WebFilter(filterName="ConexaoFilter", urlPatterns="/sistema")
public class ConexaoFilter implements Filter {

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String logica = request.getParameter("logica");
		
		if(logica.equals("LogoutUsuario")) {
			chain.doFilter(request, response);
		}else {
			Connection connection = new ConnectionFactory().getConnection();
			request.setAttribute("connection", connection);
			
			chain.doFilter(request, response);
			
			try {
				connection.close();
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
