package frame;

//import java.awt.FlowLayout;
//import java.awt.GridLayout;
//import java.util.Vector;

//import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JPasswordField;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;

public class FrameMain extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		new FrameMain().setVisible(true);

	}

	private FrameMain() {

		// JFrame frame = new JFrame("Tela Java Swing");
		// frame.setSize(300, 300);
		// frame.setVisible(true);
		// frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//
		// frame.setLayout(new FlowLayout());
		//
		// JPanel painel = new JPanel();
		// JLabel rotuloPainel = new JLabel();
		//
		// rotuloPainel.setText(" Nome : ");
		// painel.add(rotuloPainel);
		// JTextField textField = new JTextField(40);
		// painel.add(textField);
		//
		// frame.setContentPane(painel);
		// frame.pack();
		// frame.setVisible(true);
		//
		// JTextArea textArea = new JTextArea(10, 20);
		// JLabel rotuloTextArea = new JLabel();
		// rotuloTextArea.setText("Observações : ");
		// painel.add(rotuloTextArea);
		// painel.add(textArea);
		//
		// JButton buttonEnviar = new JButton("enviar");
		// painel.add(buttonEnviar);
		//
		// JPasswordField passwordField = new JPasswordField(20);
		// JLabel rotuloSenha = new JLabel();
		// rotuloSenha.setText("Usuário : ");
		// painel.add(rotuloSenha);
		// painel.add(passwordField);
		//
		//
		//


//				JFrame frame = new JFrame("Login do Sistema");
//				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				JPanel panel = new JPanel();
//				panel.setLayout(new GridLayout (3, 2));
//				
//				JLabel label1 = new JLabel(" Usuário : ");
//				JTextField textField1 = new JTextField(20);
//				
//		
//				JLabel label2 = new JLabel(" Senha : ");
//				JPasswordField passwordField = new JPasswordField(20);
//				
//				JButton button = new JButton(" Logar ");
//								
//				panel.add(label1);
//				panel.add(textField1);
//
//				panel.add(label2);
//				panel.add(passwordField);
//				
//				panel.add(rootPane);		
//				panel.add(button);
//					
//				frame.setContentPane(panel);
//				frame.pack();
//				frame.setVisible(true);
		

	}
	
	
	public void Mouse(){
		System.out.println("HEHHEHEHEHEH");
	}
}
