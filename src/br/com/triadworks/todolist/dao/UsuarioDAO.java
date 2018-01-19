package br.com.triadworks.todolist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.triadworks.todolist.modelo.Usuario;

public class UsuarioDAO {
	
	private Connection connection;
	
	public UsuarioDAO(Connection connection) {
		this.connection = connection;
	}
	
	public Usuario Autentica(String username, String senha) {
		String sql = "select * from usuario where username = ? and senha = ?";
		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, senha);
			
			ResultSet rs = pstmt.executeQuery();
			Usuario usuario = null;
			
			if(rs.next()) {
				usuario = new Usuario();
				usuario.setId(rs.getLong("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setUsername(rs.getString("username"));
			}
			
			rs.close();
			pstmt.close();
			return usuario;
			
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
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
				usuario.setUsername(rs.getString("username"));
			}
			
			rs.close();
			pstmt.close();
			return usuario;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
