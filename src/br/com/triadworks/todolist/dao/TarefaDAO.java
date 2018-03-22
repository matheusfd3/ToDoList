package br.com.triadworks.todolist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.triadworks.todolist.modelo.Tarefa;
import br.com.triadworks.todolist.modelo.Usuario;

public class TarefaDAO {

	private Connection connection;
	
	public TarefaDAO(Connection connection) {
		this.connection = connection;
	}

	public void adiciona(Tarefa tarefa) {
		String sql = "insert into tarefa (descricao, usuarioID) values (?,?)";
		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, tarefa.getDescricao());
			pstmt.setLong(2, tarefa.getUsuario().getId());
			
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Tarefa> getListaDeTarefaDoUsuario(Usuario usuario) {
		String sql = "select * from tarefa where usuarioID = ?";
		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setLong(1, usuario.getId());
			
			ResultSet rs = pstmt.executeQuery();
			
			List<Tarefa> tarefas = new ArrayList<>();
			Tarefa tarefa = null;
			
			while(rs.next()) {
				tarefa = new Tarefa();
				tarefa.setId(rs.getLong("id"));
				tarefa.setDescricao(rs.getString("descricao"));
				tarefa.setUsuario(new UsuarioDAO(connection).getUsuario(rs.getLong("usuarioID")));
				
				tarefas.add(tarefa);
			}
			
			rs.close();
			pstmt.close();
			return tarefas;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Tarefa getTarefa(Long id) {
		String sql = "select * from tarefa where id = ?";
		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setLong(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			Tarefa tarefa = null;
			
			if(rs.next()) {
				tarefa = new Tarefa();
				tarefa.setId(rs.getLong("id"));
				tarefa.setDescricao(rs.getString("descricao"));
				tarefa.setUsuario(new UsuarioDAO(connection).getUsuario(rs.getLong("usuarioID")));
			}
			
			rs.close();
			pstmt.close();
			return tarefa;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Tarefa tarefa) {
		String sql = "update tarefa set descricao = ?, usuarioID = ? where id = ?";
		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, tarefa.getDescricao());
			pstmt.setLong(2, tarefa.getUsuario().getId());
			pstmt.setLong(3, tarefa.getId());
			
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void deleta(Tarefa tarefa) {
		String sql = "delete from tarefa where id = ?";
		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setLong(1, tarefa.getId());
			
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
