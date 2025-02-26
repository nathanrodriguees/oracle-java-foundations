package br.edu.senaisp.view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.edu.senaisp.dao.AlunoDAO;
import br.edu.senaisp.model.Aluno;

public class FrmCadAluno extends JFrame {

	private Aluno aluno;

	public FrmCadAluno() {

		setTitle("Cadastro de Alunos");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JPanel pnl1 = new JPanel();
		pnl1.setLayout(new FlowLayout());

		JLabel lblNome = new JLabel("Nome");
		lblNome.setSize(30, 20);
		JTextField txtNome = new JTextField();
		txtNome.setPreferredSize(new Dimension(100, 20));
		pnl1.add(lblNome);
		pnl1.add(txtNome);

		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setSize(30, 20);
		JTextField txtCPF = new JTextField();
		txtCPF.setPreferredSize(new Dimension(100, 20));
		pnl1.add(lblCPF);
		pnl1.add(txtCPF);

		JButton btnGravar = new JButton("Gravar");
		pnl1.add(btnGravar);

		JButton btnListar = new JButton("Listar");
		pnl1.add(btnListar);

		JTextArea txtLista = new JTextArea(10, 30);
		pnl1.add(txtLista);

		add(pnl1);
		pnl1.setVisible(true);

		setVisible(true);

		btnListar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AlunoDAO dao = new AlunoDAO();

				txtLista.setText("");
				for (Aluno a : dao.buscarTodos()) {
					txtLista.append(a.getNome());
				}
			}
		});

		btnGravar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				aluno = new Aluno(txtNome.getText(), txtCPF.getText());
				System.out.println(aluno.getNome() + " | " + aluno.getCpf());

				AlunoDAO dao = new AlunoDAO();
				dao.salvar(aluno);
			}
		});

	}

}
