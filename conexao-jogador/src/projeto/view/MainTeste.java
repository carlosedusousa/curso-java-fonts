package projeto.view;

import java.sql.Connection;
import java.sql.SQLException;

import projeto.conexao.JDBCConnect;
import projeto.control.LoginDao;
import projeto.model.Jogador;

public class MainTeste {
	
		public static void main(String[] args) throws SQLException {

			JDBCConnect conexao = new JDBCConnect();
			Connection con = conexao.criarConexao();
			Jogador eduardo = new Jogador("C a R L o S", "test e");
			LoginDao l = new LoginDao();

			l.addLogin(con, eduardo.getUsuario(), eduardo.getSenha());
			l.login(con, eduardo.getUsuario(), eduardo.getSenha());
		}

}
