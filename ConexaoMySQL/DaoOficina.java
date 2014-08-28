package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoOficina {

		public void main(String[] args) throws SQLException {

		}
		
		// INSERTS
		public void addCliente(Connection con, String nome, String endereco, String telefone) throws SQLException {

			String insertSQL = "INSERT INTO clientes (nome, endereco, telefone) VALUES (?,?,?)";

			PreparedStatement preparedStatement = con.prepareStatement(insertSQL);
			preparedStatement.setString(1, nome);
			preparedStatement.setString(2, endereco);
			preparedStatement.setString(3, telefone);
			preparedStatement.executeUpdate();
			System.out.println("Inserido");
		}
		
		public void addVeiculo(Connection con, int cliente_id, String aquisicao) throws SQLException {
			
			String insertSQL = "INSERT INTO veiculos (cliente_id,aquisicao) VALUES (?,?)";

			PreparedStatement preparedStatement = con.prepareStatement(insertSQL);
			preparedStatement.setInt(1, cliente_id);
			preparedStatement.setString(2, aquisicao);
			preparedStatement.executeUpdate();
			System.out.println("Inserido");
		}

		public void addPeca(Connection con, String designacao, double custo ,int estoque) throws SQLException {

			String insertSQL = "INSERT INTO pecas (designacao, custo ,estoque) VALUES (?,?,?)";

			PreparedStatement preparedStatement = con.prepareStatement(insertSQL);
			preparedStatement.setString(1, designacao);
			preparedStatement.setDouble(2, custo);
			preparedStatement.setInt(3, estoque);
			preparedStatement.executeUpdate();
			System.out.println("Inserido");
		}

		public void addFuncionario(Connection con, String nome, String endereco, String telefone, int cateogoria_id) throws SQLException {

			String insertSQL = "INSERT INTO funcionarios (nome, endereco, telefone, categoria_id) VALUES (?,?,?,?)";

			PreparedStatement preparedStatement = con.prepareStatement(insertSQL);
			preparedStatement.setString(1, nome);
			preparedStatement.setString(2, endereco);
			preparedStatement.setString(3, telefone);
			preparedStatement.setInt(4, cateogoria_id);
			preparedStatement.executeUpdate();
			System.out.println("Inserido");
		}

		public void addCategorias(Connection con, String nome, double custo_hora) throws SQLException {

			String insertSQL = "INSERT INTO categorias (nome, custo_hora) VALUES (?,?)";

			PreparedStatement preparedStatement = con.prepareStatement(insertSQL);
			preparedStatement.setString(1, nome);
			preparedStatement.setDouble(2, custo_hora);
			preparedStatement.executeUpdate();
			System.out.println("Inserido");
		}
		
		public void addReparo(Connection con, int veiculo_id, String efetuado_em) throws SQLException {
			
			String insertSQL = "INSERT INTO reparos (veiculo_id, efetuado_em) VALUES (?,?)";

			PreparedStatement preparedStatement = con.prepareStatement(insertSQL);
			preparedStatement.setInt(1, veiculo_id);
			preparedStatement.setString(2, efetuado_em);
			preparedStatement.executeUpdate();
			System.out.println("Inserido");
		}

		public void addPecaReparo(Connection con,int peca_id, int reparo_id) throws SQLException {
			
			String insertSQL = "INSERT INTO pecas_reparos (peca_id, reparo_id) VALUES (?,?)";

			PreparedStatement preparedStatement = con.prepareStatement(insertSQL);
			preparedStatement.setInt(1, peca_id);
			preparedStatement.setInt(2, reparo_id);
			preparedStatement.executeUpdate();
			System.out.println("Inserido");
		}

		public void addFuncionarioReparo(Connection con,int funcionario_id, int reparo_id, String tempo_gasto) throws SQLException {
			
			String insertSQL = "INSERT INTO funcionarios_reparos (funcionario_id, reparo_id, tempo_gasto) VALUES (?,?,?)";

			PreparedStatement preparedStatement = con.prepareStatement(insertSQL);
			preparedStatement.setInt(1, funcionario_id);
			preparedStatement.setInt(2, reparo_id);
			preparedStatement.setString(3, tempo_gasto);
			preparedStatement.executeUpdate();
			System.out.println("Inserido");
		}

		// CONSULTAS
		public void consultaCliente (Connection con, String nome, String endereco, String telefone) throws SQLException {
						
	        String sql = "SELECT * FROM clientes WHERE nome LIKE ? AND endereco LIKE ? AND telefone LIKE ?";
	   
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, nome);
			preparedStatement.setString(2, endereco);
			preparedStatement.setString(3, telefone);
			
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				System.out.println("Nome: "+rs.getString("nome").toUpperCase() 
									+"| Endereço: "+rs.getString("endereco") 
									+ "| Telefone: "+ rs.getString("telefone"));
			}
			
		}
		
		public void consultaVeiculo(Connection con, int cliente_id, String aquisicao) throws SQLException {
			
			String sql = "SELECT * FROM veiculos WHERE cliente_id = ? AND aquisicao LIKE ?";
			
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, cliente_id);
			preparedStatement.setString(2, aquisicao);
			
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) { 
				System.out.println("Cliente ID: "+rs.getString("cliente_id") 
									+"| Data: "+rs.getString("aquisicao"));
			}

		}
		
		public void consultaPeca (Connection con, String designacao, double custo ,int estoque) throws SQLException {
			
	        String sql = "SELECT * FROM pecas WHERE designacao LIKE ? AND custo = ? AND estoque = ?";
	   
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, designacao);
			preparedStatement.setDouble(2, custo);
			preparedStatement.setInt(3, estoque);
			
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				System.out.println("Designação: "+rs.getString("designacao").toUpperCase() 
									+"| Custo: "+rs.getString("custo") 
									+ "| Estoque: "+ rs.getString("estoque"));
			}
			
		}

		public void consultaFuncionario(Connection con, String nome, String endereco, String telefone, int cateogoria_id) throws SQLException {
			
	        String sql = "SELECT * FROM funcionarios WHERE nome LIKE ? AND endereco LIKE ? AND telefone LIKE ? AND categoria_id = ?";
	 	   
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, nome);
			preparedStatement.setString(2, endereco);
			preparedStatement.setString(3, telefone);
			preparedStatement.setInt(4, cateogoria_id);
			
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				System.out.println("Nome: "+rs.getString("nome").toUpperCase() 
									+"| Endereço: "+rs.getString("endereco") 
									+ "| Telefone: "+ rs.getString("telefone")
									+ "| Categoria ID: "+ rs.getString("categoria_id"));
			}
			
		}
		
		public void consultaCategorias (Connection con, String nome, double custo_hora) throws SQLException {
			
	        String sql = "SELECT * FROM categorias WHERE nome LIKE ? AND custo_hora = ?";
	   
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, nome);
			preparedStatement.setDouble(2, custo_hora);
						
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				System.out.println("Nome: "+rs.getString("nome").toUpperCase() 
									+"| Custo/Hora: "+rs.getString("custo_hora"));
			}
			
		}

		public void consultaReparo(Connection con, int veiculo_id, String efetuado_em) throws SQLException {
			
			String sql = "SELECT * FROM reparos WHERE veiculo_id = ? AND efetuado_em LIKE ?";
			
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, veiculo_id);
			preparedStatement.setString(2, efetuado_em);
			
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) { 
				System.out.println("Veículo ID: "+rs.getString("veiculo_id") 
									+"| Data do reparo: "+rs.getString("efetuado_em"));
			}

		}
		
		public void consultaPecaReparo(Connection con,int peca_id, int reparo_id) throws SQLException {
			
			String sql = "SELECT * FROM pecas_reparos WHERE peca_id = ? AND reparo_id = ?";
			
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, peca_id);
			preparedStatement.setInt(2, reparo_id);
			
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) { 
				System.out.println("Peça ID: "+rs.getString("peca_id") 
									+"| Reparo ID: "+rs.getString("reparo_id"));
			}

		}

		public void consultaFuncionarioReparo(Connection con,int funcionario_id, int reparo_id, String tempo_gasto) throws SQLException {
			
			String sql = "SELECT * FROM funcionarios_reparos WHERE funcionario_id = ? AND reparo_id = ? AND tempo_gasto LIKE ?";
			
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, funcionario_id);
			preparedStatement.setInt(2, reparo_id);
			preparedStatement.setString(3, tempo_gasto);
			
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) { 
				System.out.println("Funcionario ID: "+rs.getString("funcionario_id") 
									+"| Reparo ID: "+rs.getString("reparo_id")
									+"| Tempo de Serviço: "+rs.getString("tempo_gasto"));
			}

		}
}