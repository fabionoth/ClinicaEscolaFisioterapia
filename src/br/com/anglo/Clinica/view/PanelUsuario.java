package br.com.anglo.Clinica.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import br.com.anglo.Clinica.model.Usuario;
import br.com.anglo.Clinica.service.UsuarioService;

public class PanelUsuario extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTable table;
	private JScrollPane scrollPane;
	private UsuarioService service = new UsuarioService();
	private String busca = null;
	private JTextField tFId;
	private JTextField tFNome;
	private JTextField tFUsuario;
	private JTextField tFDataDeCadastro;
	private JTextField tFEndereco;
	private JTextField tFBairro;
	private JTextField tFCidade;
	private JTextField tFNacionalidade;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField tFTelefone;
	private JTextField tFEmail;
	private JTextField tFCelular;
	private JTextField tFRg;
	private JPasswordField tFSenha;
	private JRadioButton rdbtnSupervisor;
	private JRadioButton rdbtnSecretria;
	private JRadioButton rdbtnEstagiario;
	private JFormattedTextField tFCpf;
	private JFormattedTextField tFDataDeNascimento;

	/**
	 * Create the panel.
	 */
	public PanelUsuario() {
		setBorder(new TitledBorder(null, "Usuario", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));

		setLayout(null);
		setSize(782, 434);

		textField = new JTextField();
		textField.setBounds(10, 18, 220, 20);
		add(textField);
		textField.setColumns(50);

		busca = "%" + textField.getText() + "%";

		scrollPane = new JScrollPane(getTable());
		scrollPane.setBounds(10, 51, 318, 337);
		add(scrollPane);

		JButton btnBusca = new JButton("Busca");
		btnBusca.setBounds(240, 17, 89, 23);
		btnBusca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				busca = "%" + textField.getText() + "%";
				table.setModel(new UsuarioTableModel(service
						.buscaUsuario(busca)));
				repaint();
			}
		});
		add(btnBusca);

		JButton btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				novo();
			}
		});
		btnNovo.setBounds(10, 399, 67, 23);
		add(btnNovo);

		JButton btnAbrir = new JButton("Abrir");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				abrir();
			}
		});
		btnAbrir.setBounds(87, 399, 67, 23);
		add(btnAbrir);

		JButton btnEditar_1 = new JButton("Editar");
		btnEditar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editar();
			}
		});
		btnEditar_1.setBounds(186, 399, 66, 23);
		add(btnEditar_1);

		JButton btnApagar = new JButton("Apagar");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				apagar();
			}
		});
		btnApagar.setBounds(261, 399, 67, 23);
		add(btnApagar);

		JLabel lblId = new JLabel("Id: ");
		lblId.setBounds(338, 51, 24, 14);
		add(lblId);

		tFId = new JTextField();
		tFId.setEditable(false);
		tFId.setBounds(372, 49, 36, 20);
		add(tFId);
		tFId.setColumns(10);

		tFNome = new JTextField();
		tFNome.setBounds(382, 77, 210, 20);
		add(tFNome);
		tFNome.setColumns(10);

		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(338, 79, 46, 14);
		add(lblNome);

		JLabel lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setBounds(338, 108, 46, 14);
		add(lblUsuario);

		tFUsuario = new JTextField();
		tFUsuario.setBounds(392, 105, 130, 20);
		add(tFUsuario);
		tFUsuario.setColumns(10);

		JLabel lblSenha = new JLabel("Senha: ");
		lblSenha.setBounds(567, 109, 42, 14);
		add(lblSenha);

		JSeparator separator = new JSeparator();
		separator.setBounds(338, 159, 434, 2);
		add(separator);

		tFDataDeCadastro = new JTextField();
		tFDataDeCadastro.setEditable(false);
		tFDataDeCadastro.setBounds(673, 49, 99, 20);
		add(tFDataDeCadastro);
		tFDataDeCadastro.setColumns(10);

		JLabel lblDataDeCadastro = new JLabel("Data de Cadastro: ");
		lblDataDeCadastro.setBounds(567, 52, 96, 14);
		add(lblDataDeCadastro);

		JLabel lblEndereo = new JLabel("Endere\u00E7o: ");
		lblEndereo.setBounds(338, 175, 57, 14);
		add(lblEndereo);

		tFEndereco = new JTextField();
		tFEndereco.setBounds(401, 172, 121, 20);
		add(tFEndereco);
		tFEndereco.setColumns(10);

		JLabel lblNewLabel = new JLabel("Bairro: ");
		lblNewLabel.setBounds(532, 175, 46, 14);
		add(lblNewLabel);

		tFBairro = new JTextField();
		tFBairro.setBounds(586, 172, 186, 20);
		add(tFBairro);
		tFBairro.setColumns(10);

		JLabel lblCidade = new JLabel("Cidade: ");
		lblCidade.setBounds(338, 203, 46, 14);
		add(lblCidade);

		tFCidade = new JTextField();
		tFCidade.setBounds(392, 200, 130, 20);
		add(tFCidade);
		tFCidade.setColumns(10);

		JLabel lblNacionalidade = new JLabel("Nacionalidade: ");
		lblNacionalidade.setBounds(532, 203, 80, 14);
		add(lblNacionalidade);

		tFNacionalidade = new JTextField();
		tFNacionalidade.setBounds(616, 200, 156, 20);
		add(tFNacionalidade);
		tFNacionalidade.setColumns(10);

		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento: ");
		lblDataDeNascimento.setBounds(532, 265, 105, 14);
		add(lblDataDeNascimento);

		JLabel lblTipo = new JLabel("Tipo: ");
		lblTipo.setBounds(338, 133, 46, 14);
		add(lblTipo);

		rdbtnEstagiario = new JRadioButton("Estagi\u00E1rio");
		rdbtnEstagiario.setSelected(true);
		buttonGroup.add(rdbtnEstagiario);
		rdbtnEstagiario.setBounds(407, 130, 80, 23);
		add(rdbtnEstagiario);

		rdbtnSecretria = new JRadioButton("Secret\u00E1ria");
		buttonGroup.add(rdbtnSecretria);
		rdbtnSecretria.setBounds(489, 130, 80, 23);
		add(rdbtnSecretria);

		rdbtnSupervisor = new JRadioButton("Supervisor");
		buttonGroup.add(rdbtnSupervisor);
		rdbtnSupervisor.setBounds(571, 130, 86, 23);
		add(rdbtnSupervisor);

		JLabel lblTelefone = new JLabel("Telefone: ");
		lblTelefone.setBounds(338, 237, 57, 14);
		add(lblTelefone);

		MaskFormatter formatTel;
		try {
			formatTel = new MaskFormatter("(##)####-####");
			tFTelefone = new JFormattedTextField(formatTel);
			tFTelefone.setBounds(402, 234, 154, 20);
			add(tFTelefone);
		} catch (ParseException e2) {
			e2.printStackTrace();
		}
		
		JLabel lblEmail = new JLabel("E-mail: ");
		lblEmail.setBounds(338, 265, 46, 14);
		add(lblEmail);

		tFEmail = new JTextField();
		tFEmail.setBounds(382, 262, 136, 20);
		add(tFEmail);
		tFEmail.setColumns(10);

		JLabel lblCelular = new JLabel("Celular: ");
		lblCelular.setBounds(566, 237, 46, 14);
		add(lblCelular);

		MaskFormatter formatCel;

		try {
			formatCel = new MaskFormatter("(##)####-####");
			tFCelular = new JFormattedTextField(formatCel);
			tFCelular.setBounds(626, 234, 146, 20);
			add(tFCelular);

		} catch (ParseException e2) {
			e2.printStackTrace();
		}

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				salvar();
			}
		});
		btnSalvar.setBounds(683, 399, 89, 23);
		add(btnSalvar);

		JLabel lblRg = new JLabel("RG: ");
		lblRg.setBounds(338, 296, 25, 14);
		add(lblRg);

		tFRg = new JTextField();
		tFRg.setBounds(373, 293, 135, 20);
		add(tFRg);
		tFRg.setColumns(10);

		JLabel lblCpf = new JLabel("CPF: ");
		lblCpf.setBounds(532, 296, 36, 14);
		add(lblCpf);

		tFSenha = new JPasswordField();
		tFSenha.setBounds(619, 105, 153, 20);
		add(tFSenha);

		try {
			MaskFormatter format = new MaskFormatter("###.###.###-##");
			tFCpf = new JFormattedTextField(format);
			tFCpf.setEditable(false);
			tFCpf.setBounds(611, 293, 161, 20);
			add(tFCpf);

		} catch (ParseException e1) {

			e1.printStackTrace();
		}
		MaskFormatter formatDate;
		try {
			formatDate = new MaskFormatter("##/##/####");
			tFDataDeNascimento = new JFormattedTextField(formatDate);
			tFDataDeNascimento.setBounds(647, 262, 125, 20);
			add(tFDataDeNascimento);
			notEditableTextFieds();
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new UsuarioTableModel(service.buscaUsuario(busca)));
		}
		return table;
	}

	public void notEditableTextFieds() {
		tFNome.setEditable(false);
		tFUsuario.setEditable(false);
		tFSenha.setEditable(false);
		rdbtnEstagiario.setEnabled(false);
		rdbtnSecretria.setEnabled(false);
		rdbtnSupervisor.setEnabled(false);
		tFEndereco.setEditable(false);
		tFBairro.setEditable(false);
		tFCidade.setEditable(false);
		tFNacionalidade.setEditable(false);
		tFTelefone.setEditable(false);
		tFCelular.setEditable(false);
		tFEmail.setEditable(false);
		tFRg.setEditable(false);
		tFCpf.setEditable(false);
		tFDataDeNascimento.setEditable(false);
	}

	public void editableTextFieds() {
		tFNome.setEditable(true);
		tFUsuario.setEditable(true);
		tFSenha.setEditable(true);
		rdbtnEstagiario.setEnabled(true);
		rdbtnSecretria.setEnabled(true);
		rdbtnSupervisor.setEnabled(true);
		tFEndereco.setEditable(true);
		tFBairro.setEditable(true);
		tFCidade.setEditable(true);
		tFNacionalidade.setEditable(true);
		tFTelefone.setEditable(true);
		tFCelular.setEditable(true);
		tFEmail.setEditable(true);
		tFRg.setEditable(true);
		tFCpf.setEditable(true);
		tFDataDeNascimento.setEditable(true);
	}

	public void clearTextFields() {
		tFId.setText("");
		tFNome.setText("");
		tFUsuario.setText("");
		tFSenha.setText("");
		tFEndereco.setText("");
		tFBairro.setText("");
		tFCidade.setText("");
		tFNacionalidade.setText("");
		tFTelefone.setText("");
		tFCelular.setText("");
		tFEmail.setText("");
		tFRg.setText("");
		tFCpf.setText("");
		tFDataDeNascimento.setText("");
	}

	public Calendar cString(String s) {
		if (s.isEmpty() || s == "") {
			return null;
		}
		Calendar cal = Calendar.getInstance();
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			cal.setTime(sdf.parse(s));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return cal;
	}

	public String sCalendar(Calendar c) {
		if (c == null) {
			return "";
		} else {
			SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
			return simple.format(c.getTime());
		}
	}

	private void novo() {
		clearTextFields();
		editableTextFieds();
		tFDataDeCadastro.setText(sCalendar(Calendar.getInstance()));
	}

	private void editar() {
		int index = table.getSelectedRow();
		if (index == -1) {
			JOptionPane.showMessageDialog(null,
					"Selecione um paciente na Tabela", "Erro",
					JOptionPane.ERROR_MESSAGE);
			return;
		} else {
			editableTextFieds();
			Usuario u = new UsuarioTableModel(service.buscaUsuario(busca))
					.getUsuario(index);
			tFId.setText(u.getId().toString());
			tFDataDeCadastro.setText(sCalendar(u.getDataCadastro()));
			tFNome.setText(u.getNome());
			tFUsuario.setText(u.getUsuario());
			tFSenha.setText(u.getSenha());
			if (u.getTipo().equals("estagiario")) {
				rdbtnEstagiario.setSelected(true);
			} else if (u.getTipo().equals("secretaria")) {
				rdbtnSecretria.setSelected(true);
			} else if (u.getTipo().equals("supervisor")) {
				rdbtnSupervisor.setSelected(true);
			} else {
				rdbtnEstagiario.setSelected(true);
			}
			tFEndereco.setText(u.getEndereco());
			tFBairro.setText(u.getBairro());
			tFCidade.setText(u.getCidade());
			tFNacionalidade.setText(u.getNacionalidade());
			tFTelefone.setText(u.getTelefone());
			tFCelular.setText(u.getCelular());
			tFEmail.setText(u.getEmail());
			tFRg.setText(u.getRg());
			tFCpf.setText(u.getCpf());
			tFDataDeNascimento.setText(sCalendar(u.getNascimento()));
		}
	}

	private void abrir() {
		int index = table.getSelectedRow();
		if (table.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(null,
					"Selecione um paciente na Tabela", "Erro",
					JOptionPane.ERROR_MESSAGE);
			return;
		} else {
			notEditableTextFieds();
			Usuario u = new UsuarioTableModel(service.buscaUsuario(busca))
					.getUsuario(index);
			tFId.setText(u.getId().toString());
			tFDataDeCadastro.setText(sCalendar(u.getDataCadastro()));
			tFNome.setText(u.getNome());
			tFUsuario.setText(u.getUsuario());
			tFSenha.setText(u.getSenha());
			if (u.getTipo().equals("estagiario")) {
				rdbtnEstagiario.setSelected(true);
			} else if (u.getTipo().equals("secretaria")) {
				rdbtnSecretria.setSelected(true);
			} else if (u.getTipo().equals("supervisor")) {
				rdbtnSupervisor.setSelected(true);
			} else {
				rdbtnEstagiario.setSelected(true);
			}
			tFEndereco.setText(u.getEndereco());
			tFBairro.setText(u.getBairro());
			tFCidade.setText(u.getCidade());
			tFNacionalidade.setText(u.getNacionalidade());
			tFTelefone.setText(u.getTelefone());
			tFCelular.setText(u.getCelular());
			tFEmail.setText(u.getEmail());
			tFRg.setText(u.getRg());
			tFCpf.setText(u.getCpf());
			tFDataDeNascimento.setText(sCalendar(u.getNascimento()));
		}
	}

	private void apagar() {
		int index = table.getSelectedRow();
		if (index == -1) {
			JOptionPane.showMessageDialog(null,
					"Selecione um paciente na Tabela", "Erro",
					JOptionPane.ERROR_MESSAGE);
			return;
		} else {
			Usuario u = new UsuarioTableModel(service.buscaUsuario(busca))
					.getUsuario(index);
			UsuarioService service = new UsuarioService();
			service.deleteUsuario(u);
			table.setModel(new UsuarioTableModel(service.buscaUsuario(busca)));
		}
		

	}

	private void salvar() {
		if( tFNome.isEditable()){
			if(tFNome.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,
						"Preencha o campo nome", "Erro",
						JOptionPane.ERROR_MESSAGE);
				return;
			}else if(tFUsuario.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,
						"Preencha o campo usuario", "Erro",
						JOptionPane.ERROR_MESSAGE);
				return;
			}else if(tFSenha.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,
						"Preencha o campo senha", "Erro",
						JOptionPane.ERROR_MESSAGE);
				return;
			} else{
				if (tFId.getText().isEmpty() || tFId.getText() == "") {
					JOptionPane.showMessageDialog(null,
							"Anote os seguintes dados: \nUsuario: "+tFUsuario.getText()+"\nSenha: "+tFSenha.getText(), "Erro",
							JOptionPane.WARNING_MESSAGE);
					salvarNovo();
				} else {
					JOptionPane.showMessageDialog(null,
							"Anote os seguintes dados: \nUsuario: "+tFUsuario.getText()+"\nSenha: "+tFSenha.getText(), "Erro",
							JOptionPane.WARNING_MESSAGE);
					salvarEditar();
				}
				table.setModel(new UsuarioTableModel(service.buscaUsuario(busca)));
			}
		} else {
			JOptionPane.showMessageDialog(null,
					"Você deve ter permissão de editar", "Erro",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	@SuppressWarnings("deprecation")
	private void salvarEditar() {
		int index = table.getSelectedRow();
		UsuarioService service = new UsuarioService();
		Usuario u = new UsuarioTableModel(service.buscaUsuario(busca))
				.getUsuario(index);
		u.setId(Long.parseLong(tFId.getText()));
		u.setDataCadastro(cString(tFDataDeCadastro.getText()));
		u.setNome(tFNome.getText());
		u.setUsuario(tFUsuario.getText());
		u.setSenha(tFSenha.getText());
		if (rdbtnEstagiario.isSelected()) {
			u.setTipo("estagiario");
		} else if (rdbtnSecretria.isSelected()) {
			u.setTipo("secretaria");
		} else if (rdbtnSupervisor.isSelected()) {
			u.setTipo("supervisor");
		} else {
			u.setTipo("estagiario");
		}
		u.setEndereco(tFEndereco.getText());
		u.setBairro(tFBairro.getText());
		u.setCidade(tFCidade.getText());
		u.setNacionalidade(tFNacionalidade.getText());
		u.setTelefone(tFTelefone.getText());
		u.setCelular(tFCelular.getText());
		u.setEmail(tFEmail.getText());
		u.setRg(tFRg.getText());
		u.setCpf(tFCpf.getText());
		u.setNascimento(cString(tFDataDeNascimento.getText()));
		service.atualizaUsuario(u);
		clearTextFields();
		notEditableTextFieds();
	}

	@SuppressWarnings("deprecation")
	private void salvarNovo() {
		UsuarioService service = new UsuarioService();
		Usuario u = new Usuario();
		u.setDataCadastro(cString(tFDataDeCadastro.getText()));
		u.setNome(tFNome.getText());
		u.setUsuario(tFUsuario.getText());
		u.setSenha(tFSenha.getText());
		if (rdbtnEstagiario.isSelected()) {
			u.setTipo("estagiario");
		} else if (rdbtnSecretria.isSelected()) {
			u.setTipo("secretaria");
		} else if (rdbtnSupervisor.isSelected()) {
			u.setTipo("supervisor");
		} else {
			u.setTipo("estagiario");
		}
		u.setEndereco(tFEndereco.getText());
		u.setBairro(tFBairro.getText());
		u.setCidade(tFCidade.getText());
		u.setNacionalidade(tFNacionalidade.getText());
		u.setTelefone(tFTelefone.getText());
		u.setCelular(tFCelular.getText());
		u.setEmail(tFEmail.getText());
		u.setRg(tFRg.getText());
		u.setCpf(tFCpf.getText());
		u.setNascimento(cString(tFDataDeNascimento.getText()));
		service.adicionarUsuario(u);
		clearTextFields();
		notEditableTextFieds();
	}
}
