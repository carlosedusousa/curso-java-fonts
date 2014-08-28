package main;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DaoOficina;
import db.JDBCConnect;

public class OficinaMain {

	public static void main(String[] args) throws SQLException {

		// Classe DaoConnect para realizar a conexão.
		JDBCConnect conexao = new JDBCConnect();
		Connection con = conexao.criarConexao();
		// Cria o Objeto oficina.
		DaoOficina oficina = new DaoOficina();

		oficina.addCliente(con, "janjao", "rua zzz", "100000000");
		oficina.addCliente(con, "xexel", "rua aaa", "200000000");
		oficina.addCliente(con, "peddro", "rua bbb", "400000000");
		oficina.addCliente(con, "joaquim", "rua ccc", "500000000");
		oficina.addCliente(con, "manoel", "rua ddd", "600000000");
		oficina.addCliente(con, "janjao", "rua eee", "700000000");
		oficina.addCliente(con, "tiago", "rua fff", "800000000");
		oficina.consultaCliente(con, "%%", "%%", "%%");
		oficina.addVeiculo(con, 1, "2014-10-09");
		oficina.addVeiculo(con, 2, "2014-10-01");
		oficina.addVeiculo(con, 3, "2014-10-02");
		oficina.addVeiculo(con, 1, "2014-10-04");
		oficina.consultaVeiculo(con, 1, "%%");
		oficina.addPeca(con, "retentor carburador", 13.99, 5);
		oficina.consultaPeca(con, "%%", 10.99, 5);
		oficina.addFuncionario(con, "Pedro", "Rua das Antas", "938327723", 1);
		oficina.consultaFuncionario(con, "%%", "%%", "%%", 1);
		oficina.addCategorias(con, "Mecânico", 100.987);
		oficina.consultaCategorias(con, "%%", 100.987);
		oficina.addReparo(con, 2, "2009-10-01");
		oficina.consultaReparo(con, 2, "%%");
		oficina.addPecaReparo(con, 2, 1);
		oficina.consultaPecaReparo(con, 2, 1);
		oficina.addFuncionarioReparo(con, 1, 2, "07:45:05");
		oficina.consultaFuncionarioReparo(con, 1, 2, "%%");

	}
}
