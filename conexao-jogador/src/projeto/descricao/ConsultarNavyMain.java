/* 
 (c)2014|US-UltimateShip.
 Univali - Universidade do Vale do Itajaí.
 GeraçãoTec - Projeto Filnal Batalha Final em JAVA.

 Criadores:
 Alexandre <alexandreess@gmail.com>
 Carlos Eduardo Passos de Sousa <carloseduardosousa@gmail.com>
 Henrique Wilhelm <henrique.wilhelm@gmail.com> 
 Jaison dos santos <jaison1906@gmail.com>
 Otavio Ribeiro <otavioribeiro@capflorianopolis.org.br>
*/

package descricao;

import descricao.ConsultaDescNavy;

public class ConsultarNavyMain {
	public static void main(String[] args) {
		
	
		// Consulta dados.
		ConsultaDescNavy a = new ConsultaDescNavy();
		// Todos.
		a.consultaNavy('p'); // plataforma petrofifera
		a.consultaNavy('d'); // destroyer
		a.consultaNavy('s'); // submarino
		a.consultaNavy('t');// titanic
		a.consultaNavy('n'); // perola negra
		a.consultaNavy('b'); // bote salva vidas;		
		a.consultaNavy('p'); // platafórma petrolífera;
		a.consultaNavy('k'); // canoa;

	}
}
