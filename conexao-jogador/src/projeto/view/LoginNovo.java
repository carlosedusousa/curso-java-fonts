package projeto.view;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.*;

import projeto.conexao.JDBCConnect;
import projeto.control.LoginDao;
import projeto.model.Jogador;
public class LoginNovo extends javax.swing.JFrame {
    
	private static final long serialVersionUID = 1L;
	
	public LoginNovo() {
        initComponents();
    }
 
    private void initComponents() {

        pDados = new javax.swing.JPanel();
        lNome = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        lSenha = new javax.swing.JLabel();
        tSenha = new javax.swing.JPasswordField();
        bOK = new javax.swing.JButton();
        bLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Criar Novo Jogador");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pDados.setBorder(javax.swing.BorderFactory.createTitledBorder("Insira os Dados"));
        pDados.setToolTipText("");

        lNome.setText("Jogador:");

        lSenha.setText("Senha:");

        javax.swing.GroupLayout pDadosLayout = new javax.swing.GroupLayout(pDados);
        pDados.setLayout(pDadosLayout);
        pDadosLayout.setHorizontalGroup(
            pDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNome)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lSenha)
                    .addComponent(tSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pDadosLayout.setVerticalGroup(
            pDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosLayout.createSequentialGroup()
                .addComponent(lNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        bOK.setText("OK");
        bOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bOKMouseClicked(evt);
            }
        });

        bLimpar.setText("Limpar");
        bLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bLimparMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(bOK, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bOK, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    @SuppressWarnings("deprecation")
	private void bOKMouseClicked(java.awt.event.MouseEvent evt){
    	
    	try {
			JDBCConnect conexao = new JDBCConnect();
			Connection con = conexao.criarConexao();
			Jogador jogador = new Jogador(tNome.getText(), tSenha.getText());
			LoginDao logando = new LoginDao();

			if(logando.addLogin(con, jogador.getUsuario(), jogador.getSenha()))
				JOptionPane.showMessageDialog(null, "O Usuário " 
						+ tNome.getText().toUpperCase().replaceAll("\\s+","") + " criado com sucesso" );
			else{
				JOptionPane.showMessageDialog(null, "Já existe este usuário "
						+ tNome.getText().toUpperCase().replaceAll("\\s+","") );
				con.close();
				System.out.println("conexão finalizada.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			
		}
		    	
    }

    private void bLimparMouseClicked(java.awt.event.MouseEvent evt) {
         tNome.setText("");
         tSenha.setText("");
    }

    private javax.swing.JButton bLimpar;
    private javax.swing.JButton bOK;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lSenha;
    private javax.swing.JPanel pDados;
    private javax.swing.JTextField tNome;
    private javax.swing.JPasswordField tSenha;

}
