package br.com.triadworks.todolist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.triadworks.todolist.modelo.Usuario;

public class UsuarioDAO {
	
	private Connection connection;
	
	public UsuarioDAO() {
		connection = new ConnectionFactory().getConnection();
	}
	
	public Usuario getUsuario(Integer id) {
		String sql = "select * from usuario where id = ?";
		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			Usuario usuario = null;
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				usuario = new Usuario();
				usuario.setId(id);
				usuario.setLogin(rs.getString("login"));
				usuario.setSenha(rs.getString("senha"));
			}
			
			rs.close();
			pstmt.close();
			return usuario;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
