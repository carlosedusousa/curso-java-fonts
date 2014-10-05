package graficosCliente;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javazoom.jl.decoder.JavaLayerException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Toolkit;

import javax.swing.LayoutStyle.ComponentPlacement;

import audio.Som;

public class TelaTrilha extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Vector<JCheckBox> testaChks;
	private Som mp3;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTrilha frame = new TelaTrilha();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaTrilha() throws FileNotFoundException, JavaLayerException {
		setTitle("Trilha Sonora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JCheckBox chckbxSom = new JCheckBox("Som");
		chckbxSom.setSelected(true);
		testaChks = new Vector<JCheckBox>();
		testaChks.add(chckbxSom);

		String arquivo = "Skyrim.mp3";
		mp3 = new Som(arquivo);
		mp3.play();

		chckbxSom.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {
					chckbxCriarJogadorEvento(e, mp3);
				} catch (IOException | JavaLayerException e1) {
					e1.printStackTrace();
				} finally {
				}
			}
		});
		chckbxSom.setSelected(true);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(chckbxSom, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(79, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(chckbxSom)
					.addContainerGap(228, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

	public void chckbxCriarJogadorEvento(ActionEvent e, Som mp3)
			throws IOException, JavaLayerException {
		JCheckBox temp = testaChks.get(0);

		if (temp.isSelected()) {

			System.out.println("Tocando");
			mp3.play();

		} else {
			System.out.println("Stop");
			mp3.close();
		}

	}
}
