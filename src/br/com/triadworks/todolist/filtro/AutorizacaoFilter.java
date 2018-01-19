package br.com.triadworks.todolist.filtro;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.triadworks.todolist.modelo.Usuario;

@WebFilter(filterName="AutorizacaoFilter", urlPatterns="/*")
public class AutorizacaoFilter implements Filter {

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		String uri = req.getRequestURI();
		String logica = req.getParameter("logica");
		
		if(logica.equals("AutenticarUsuario") || uri.endsWith("login.jsp")) {
			chain.doFilter(request, response);
		}else {
			Usuario usuarioLogado = (Usuario)req.getSession().getAttribute("usuarioLogado");
			
			if(usuarioLogado != null) {
				chain.doFilter(request, response);
			}else {
				res.sendRedirect("/login.jsp");
			}
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
