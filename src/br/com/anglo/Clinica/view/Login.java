package br.com.anglo.Clinica.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.anglo.Clinica.service.LoginService;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	public Login() {
		setTitle("jFisio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio: ");
		lblUsurio.setBounds(50, 48, 70, 14);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha: ");
		lblSenha.setBounds(50, 75, 70, 14);
		contentPane.add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(144, 45, 204, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(144, 72, 204, 20);
		contentPane.add(passwordField);
		
		JLabel lblClnicaEscolaDe = new JLabel("Cl\u00EDnica Escola de Fisioterapia");
		lblClnicaEscolaDe.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblClnicaEscolaDe.setBounds(50, 0, 298, 34);
		contentPane.add(lblClnicaEscolaDe);
		
		JButton btnOk = new JButton("Login");
		btnOk.addKeyListener(new KeyAdapter() {
		});
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String usuario = textField.getText();
				@SuppressWarnings("deprecation")
				String senha = passwordField.getText();
				verificaLogin(usuario, senha);
			}
		});
		btnOk.setBounds(144, 103, 204, 48);
		contentPane.add(btnOk);
	}
	
	public void verificaLogin(String usuario, String senha){
		if(usuario.isEmpty() || usuario.equals(" ")){
			JOptionPane.showMessageDialog(null, "Informe o seu usuario", "Erro", JOptionPane.ERROR_MESSAGE); 
			return;
		}else if(senha.isEmpty() || senha.equals(" ")){
			JOptionPane.showMessageDialog(null, "Informe sua senha", "Erro", JOptionPane.ERROR_MESSAGE);
			return;
		}
		LoginService loginService = new LoginService(usuario, senha);
		if(loginService.isValido()){
			this.dispose();
			return;
		} else {
			JOptionPane.showMessageDialog(null, "Informações invalidas", "Erro", JOptionPane.ERROR_MESSAGE);
			this.setVisible(true);
			textField.setText("");
			passwordField.setText("");
			return;
		}
	}
}
