package br.com.triadworks.todolist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.triadworks.todolist.modelo.Tarefa;

public class TarefaDAO {

	private Connection connection;

	public TarefaDAO() {
		connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Tarefa tarefa) {
		String sql = "insert into tarefa (descricao, usuarioID) values (?,?)";
		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, tarefa.getDescricao());
			pstmt.setInt(2, tarefa.getUsuario().getId());
			
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Tarefa> getTarefas() {
		String sql = "select * from tarefa";
		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			List<Tarefa> tarefas = new ArrayList<>();
			Tarefa tarefa = null;
			
			while(rs.next()) {
				tarefa = new Tarefa();
				tarefa.setId(rs.getInt("id"));
				tarefa.setDescricao(rs.getString("descricao"));
				tarefa.setUsuario(new UsuarioDAO(connection).getUsuario(rs.getInt("usuarioID")));
				
				tarefas.add(tarefa);
			}
			
			rs.close();
			pstmt.close();
			return tarefas;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Tarefa getTarefa(Integer id) {
		String sql = "select * from tarefa where id = ?";
		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			Tarefa tarefa = null;
			
			if(rs.next()) {
				tarefa = new Tarefa();
				tarefa.setId(rs.getInt("id"));
				tarefa.setDescricao(rs.getString("descricao"));
				tarefa.setUsuario(new UsuarioDAO().getUsuario(rs.getInt("usuarioID")));
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
			pstmt.setInt(2, tarefa.getUsuario().getId());
			pstmt.setInt(3, tarefa.getId());
			
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
			pstmt.setInt(1, tarefa.getId());
			
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
