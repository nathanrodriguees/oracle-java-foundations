package br.edu.senaisp.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrmCadAluno extends JFrame {

	public FrmCadAluno() {
		setTitle("Cadastro de Alunos");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JButton btnOk = new JButton("Ok");
		add(btnOk);

		setVisible(true);
	}

}
