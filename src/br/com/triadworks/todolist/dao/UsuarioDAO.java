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
	
	public UsuarioDAO(Connection connection) {
		this.connection = connection;
	}
	
	public Usuario getUsuario(Long id) {
		String sql = "select * from usuario where id = ?";
		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setLong(1, id);
			
			Usuario usuario = null;
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				usuario = new Usuario();
				usuario.setId(rs.getLong("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setUsuario(rs.getString("usuario"));
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
