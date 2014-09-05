package projeto.view;

import java.sql.Connection;
import java.sql.SQLException;

import projeto.conexao.JDBCConnect;
import projeto.control.LoginDao;
import projeto.model.Jogador;
/**
 * 
 * @author cadu
 *
 */
public class MainTeste {
	
		public static void main(String[] args) throws SQLException {
			// Cria um objeto tipo JDBCconnect com as configurações pre-definidas.
			JDBCConnect conexao = new JDBCConnect();
			// Realiza a conexão com o banco MySQL.
			Connection con = conexao.criarConexao();
			// Novo objeto Jogador.
			Jogador eduardo = new Jogador("C a R L o S", "test e");
			// Objeto loginDao que vai tratar o objeto jogador.
			LoginDao l = new LoginDao();

			// Adiciona um usuário.
			l.addLogin(con, eduardo.getUsuario(), eduardo.getSenha());
			// Realiza login do usuário.
			l.login(con, eduardo.getUsuario(), eduardo.getSenha());
			// Consulta todos os usuários e senhas no banco.
			l.log(con,"cAr");
		}
}
