package oficina;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import dao.OficinaDaoMySQL;
import db.JDBCConnect;

public class OficinaMain {
	
	public static java.util.Date Date (String data) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date aquisicaoDate = sdf.parse(data);
		return aquisicaoDate;
		
	}
	

	public static void main(String[] args) throws SQLException, ParseException {

		// Classe DaoConnect para realizar a conexão.
		JDBCConnect conexao = new JDBCConnect();
		Connection con = conexao.criarConexao();
		// Cria o Objeto oficina.
		OficinaDaoMySQL oficina = new OficinaDaoMySQL();

		oficina.addCliente(con, "janjao", "rua zzz", "100000000");
		oficina.addCliente(con, "xexel", "rua aaa", "200000000");
		oficina.addCliente(con, "peddro", "rua bbb", "400000000");
		oficina.addCliente(con, "joaquim", "rua ccc", "500000000");
		oficina.addCliente(con, "manoel", "rua ddd", "600000000");
		oficina.addCliente(con, "janjao", "rua eee", "700000000");
		oficina.addCliente(con, "tiago", "rua fff", "800000000");
		oficina.consultaCliente(con, "%%", "%%", "%%");
		oficina.addVeiculo(con, 1, Date("2014-01-06"));
		oficina.addVeiculo(con, 2, Date("2011-10-23"));
		oficina.addVeiculo(con, 3, Date("2012-10-15"));
		oficina.addVeiculo(con, 1, Date("2013-10-13"));
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
