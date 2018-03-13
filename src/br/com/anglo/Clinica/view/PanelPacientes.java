package br.com.anglo.Clinica.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import br.com.anglo.Clinica.model.Paciente;
import br.com.anglo.Clinica.model.Sessao;
import br.com.anglo.Clinica.model.Tratamento;
import br.com.anglo.Clinica.model.Usuario;
import br.com.anglo.Clinica.service.PacienteService;

public class PanelPacientes extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	public JTable table;
	public JTable tableTratamento;
	private JScrollPane scrollPane;
	PacienteService service = new PacienteService();
	private JTextField tFNome;
	private JTextField tFId;
	private JTextField tFEndereco;
	private JTextField tFBairro;
	private JTextField tFCidade;
	private JTextField tFNacionalidade;
	private JTextField tFRG;
	private JTextField tFProfissao;
	private JTextField tFEmail;
	private final ButtonGroup buttonGroup;
	private JTextField tFUsuarioRespon;
	private JFormattedTextField tFTelefone;
	private JFormattedTextField tFCelular;
	private JFormattedTextField tFDataDeNascimento;
	private JFormattedTextField tFCPF;
	private JFormattedTextField tFDataCadastro;
	private JRadioButton rdbtnPendente;
	private JRadioButton rdbtnEncaminhado;
	private JRadioButton rdbtnAlta;
	private String busca;
	private JScrollPane scrollPane_1;

	public PanelPacientes() {
		long startTempo = System.currentTimeMillis();
		setBorder(new TitledBorder(null, "Pacientes", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		setLayout(null);
		setSize(782, 434);
		setVisible(true);

		scrollPane = new JScrollPane(getTablePaciente());
		scrollPane.setBounds(10, 51, 318, 337);
		add(scrollPane);

		textField = new JTextField();
		textField.setBounds(10, 18, 219, 20);
		add(textField);
		textField.setColumns(50);

		busca = "%" + textField.getText() + "%";
		JButton btnNewButton = new JButton("Buscar");
		table.setModel(new PacienteTableModel(service.buscaPaciente(busca)));

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				busca = "%" + textField.getText() + "%";
				table.setModel(new PacienteTableModel(service
						.buscaPaciente(busca)));
				repaint();
			}
		});

		btnNewButton.setBounds(239, 17, 89, 23);
		add(btnNewButton);

		JButton btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				novo();
			}
		});
		btnNovo.setBounds(82, 399, 62, 23);
		add(btnNovo);

		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editar();
			}
		});
		btnEditar.setBounds(154, 399, 62, 23);
		add(btnEditar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				excluir();
			}
		});
		btnExcluir.setBounds(226, 399, 63, 23);
		add(btnExcluir);

		JButton btnTriagem = new JButton("Triagem");
		btnTriagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				triagem();
			}
		});
		btnTriagem.setBounds(338, 245, 89, 23);
		add(btnTriagem);

		JButton btnAbrir = new JButton("Abrir");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				abrir();
			}
		});
		btnAbrir.setBounds(10, 399, 62, 23);
		add(btnAbrir);

		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(338, 80, 46, 14);
		add(lblNome);

		tFNome = new JTextField();
		tFNome.setEditable(false);
		tFNome.setBounds(397, 77, 86, 20);
		add(tFNome);
		tFNome.setColumns(10);

		JLabel lblId = new JLabel("Id: ");
		lblId.setBounds(338, 21, 46, 14);
		add(lblId);

		tFId = new JTextField();
		tFId.setEditable(false);
		tFId.setBounds(397, 18, 46, 20);
		add(tFId);
		tFId.setColumns(10);

		JLabel lblTelefone = new JLabel("Telefone: ");
		lblTelefone.setBounds(338, 108, 49, 14);
		add(lblTelefone);

		JLabel lblNewLabel = new JLabel("Celular: ");
		lblNewLabel.setBounds(490, 108, 46, 14);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o: ");
		lblNewLabel_1.setBounds(338, 136, 62, 14);
		add(lblNewLabel_1);

		tFEndereco = new JTextField();
		tFEndereco.setEditable(false);
		tFEndereco.setBounds(397, 133, 86, 20);
		add(tFEndereco);
		tFEndereco.setColumns(10);

		JLabel lblBairro = new JLabel("Bairro: ");
		lblBairro.setBounds(490, 136, 46, 14);
		add(lblBairro);

		tFBairro = new JTextField();
		tFBairro.setEditable(false);
		tFBairro.setBounds(546, 133, 86, 20);
		add(tFBairro);
		tFBairro.setColumns(10);

		JLabel lblCidade = new JLabel("Cidade: ");
		lblCidade.setBounds(638, 136, 46, 14);
		add(lblCidade);

		tFCidade = new JTextField();
		tFCidade.setEditable(false);
		tFCidade.setBounds(687, 133, 86, 20);
		add(tFCidade);
		tFCidade.setColumns(10);

		MaskFormatter formatTel;
		try {
			formatTel = new MaskFormatter("(##)####-####");
			tFTelefone = new JFormattedTextField(formatTel);
			tFTelefone.setEditable(false);
			tFTelefone.setBounds(397, 105, 86, 20);
			add(tFTelefone);
		} catch (ParseException e2) {
			e2.printStackTrace();
		}

		MaskFormatter formatCel;
		try {
			formatCel = new MaskFormatter("(##)####-####");
			tFCelular = new JFormattedTextField(formatCel);
			tFCelular.setEditable(false);
			tFCelular.setBounds(546, 105, 86, 20);
			add(tFCelular);

		} catch (ParseException e2) {
			e2.printStackTrace();
		}

		JLabel lblNacionalidade = new JLabel("Nacionalidade: ");
		lblNacionalidade.setBounds(338, 164, 73, 14);
		add(lblNacionalidade);

		tFNacionalidade = new JTextField();
		tFNacionalidade.setEditable(false);
		tFNacionalidade.setBounds(421, 161, 115, 20);
		add(tFNacionalidade);
		tFNacionalidade.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Data de Nasicmento: ");
		lblNewLabel_2.setBounds(556, 164, 103, 14);
		add(lblNewLabel_2);

		try {
			MaskFormatter format = new MaskFormatter("###.###.###-##");
			tFCPF = new JFormattedTextField(format);
			tFCPF.setEditable(false);
			tFCPF.setBounds(498, 189, 97, 20);
			add(tFCPF);

		} catch (ParseException e1) {

			e1.printStackTrace();
		}

		JLabel lblDataDoCadastro = new JLabel("Data do Cadastro: ");
		lblDataDoCadastro.setBounds(338, 49, 97, 14);
		add(lblDataDoCadastro);

		tFDataCadastro = new JFormattedTextField();
		tFDataCadastro.setEditable(false);
		tFDataCadastro.setBounds(439, 46, 97, 20);
		add(tFDataCadastro);

		JLabel lblCpf = new JLabel("CPF: ");
		lblCpf.setBounds(470, 192, 36, 14);
		add(lblCpf);

		tFRG = new JTextField();
		tFRG.setEditable(false);
		tFRG.setBounds(374, 189, 86, 20);
		add(tFRG);
		tFRG.setColumns(10);

		JLabel lblRg = new JLabel("RG: ");
		lblRg.setBounds(338, 192, 31, 14);
		add(lblRg);

		try {
			MaskFormatter formatDate = new MaskFormatter("##/##/####");
			tFDataDeNascimento = new JFormattedTextField(formatDate);
			tFDataDeNascimento.setEditable(false);
			tFDataDeNascimento.setBounds(676, 161, 97, 20);
			add(tFDataDeNascimento);

		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		JLabel lblProfisso = new JLabel("Profiss\u00E3o: ");
		lblProfisso.setBounds(605, 192, 54, 14);
		add(lblProfisso);

		tFProfissao = new JTextField();
		tFProfissao.setEditable(false);
		tFProfissao.setBounds(669, 189, 104, 20);
		add(tFProfissao);
		tFProfissao.setColumns(10);

		JLabel lblEmail = new JLabel("E-mail: ");
		lblEmail.setBounds(640, 105, 46, 14);
		add(lblEmail);

		tFEmail = new JTextField();
		tFEmail.setEditable(false);
		tFEmail.setBounds(687, 105, 86, 20);
		add(tFEmail);
		tFEmail.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setBounds(339, 271, 434, 2);
		add(separator);

		JLabel lblStatus = new JLabel("Status: ");
		lblStatus.setBounds(334, 220, 46, 14);
		add(lblStatus);

		buttonGroup = new ButtonGroup();
		rdbtnPendente = new JRadioButton("Pendente");
		rdbtnPendente.setSelected(true);
		buttonGroup.add(rdbtnPendente);
		rdbtnPendente.setBounds(379, 216, 73, 23);
		add(rdbtnPendente);

		rdbtnEncaminhado = new JRadioButton("Encaminhado");
		buttonGroup.add(rdbtnEncaminhado);
		rdbtnEncaminhado.setBounds(454, 216, 89, 23);
		add(rdbtnEncaminhado);

		rdbtnAlta = new JRadioButton("Alta");
		buttonGroup.add(rdbtnAlta);
		rdbtnAlta.setBounds(542, 216, 54, 23);
		add(rdbtnAlta);

		JLabel lblUsurioResponsvel = new JLabel(
				"Usu\u00E1rio Respons\u00E1vel: ");
		lblUsurioResponsvel.setBounds(546, 49, 113, 14);
		add(lblUsurioResponsvel);

		tFUsuarioRespon = new JTextField();
		tFUsuarioRespon.setEditable(false);
		tFUsuarioRespon.setBounds(655, 46, 117, 20);
		add(tFUsuarioRespon);
		tFUsuarioRespon.setColumns(10);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				salvar();
			}
		});
		btnSalvar.setBounds(687, 245, 89, 23);
		add(btnSalvar);

		scrollPane_1 = new JScrollPane(getTableTratamento());
		scrollPane_1.setBounds(338, 304, 434, 84);
		add(scrollPane_1);

		JLabel lblTratamento = new JLabel("Tratamento: ");
		lblTratamento.setBounds(338, 279, 73, 14);
		add(lblTratamento);

		JButton jBANovoTratamento = new JButton("Novo");
		jBANovoTratamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				novoTratamento();
			}
		});
		jBANovoTratamento.setBounds(542, 399, 62, 23);
		add(jBANovoTratamento);

		JButton jBAbrirTratamento = new JButton("Abrir");
		jBAbrirTratamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		jBAbrirTratamento.setBounds(470, 399, 66, 23);
		add(jBAbrirTratamento);

		JButton jBEditarTratamento = new JButton("Editar");
		jBEditarTratamento.setBounds(615, 399, 73, 23);
		add(jBEditarTratamento);

		JButton jBExcluirTratamento = new JButton("Excluir");
		jBExcluirTratamento.setBounds(699, 399, 73, 23);
		add(jBExcluirTratamento);

		long endTempo = System.currentTimeMillis();
		System.out.print(endTempo - startTempo);
	}

	private void abrir() {
		notEditableTextFields();
		cleanTextFields();
		int index = table.getSelectedRow();
		try {

			if (index == -1) {
				JOptionPane.showMessageDialog(null,
						"Selecione um paciente na Tabela", "Erro",
						JOptionPane.ERROR_MESSAGE);
				return;
			} else {
				Paciente p = getPaciente(index);
				tFId.setText(p.getId().toString());
				tFDataCadastro.setText(sCalendar(p.getDataCadastro()));
				tFNome.setText(p.getNome());
				tFTelefone.setText(p.getTelefone());
				tFCelular.setText(p.getCelular());
				tFEmail.setText(p.getEmail());
				tFEndereco.setText(p.getEndereco());
				tFBairro.setText(p.getBairro());
				tFCidade.setText(p.getCidade());
				tFRG.setText(p.getRg());
				tFCPF.setText(p.getCpf());
				tFProfissao.setText(p.getProfissao());
				tFNacionalidade.setText(p.getNacionalidade());
				tFDataDeNascimento.setText(sCalendar(p.getNascimento()));
				tFUsuarioRespon.setText(p.getUsuario().getNome());
				if (p.getStatus().equals("pendente")) {
					rdbtnPendente.setSelected(true);
				} else if (p.getStatus().equals("alta")) {
					rdbtnAlta.setSelected(true);
				} else if (p.getStatus().equals("encaminhado")) {
					rdbtnEncaminhado.setSelected(true);
				} else {
					rdbtnPendente.setSelected(true);
				}
				tableTratamento.setModel(new TratamentoTableModel(p
						.getTratamentos()));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void novo() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cleanTextFields();
					editableTextFields();
					tFDataCadastro.setText(sCalendar(Calendar.getInstance()));
					tFUsuarioRespon.setText(Sessao.getInstance().getUsuario()
							.getNome());

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void editar() {
		abrir();
		if (tFId.getText().isEmpty()) {
			return;
		} else {
			editableTextFields();
		}
	}

	public void excluir() {
		try {
			int index = table.getSelectedRow();
			if (index == -1) {
				JOptionPane.showMessageDialog(null,
						"Selecione um paciente na Tabela", "Erro",
						JOptionPane.ERROR_MESSAGE);
			} else {
				int resposta = JOptionPane.showConfirmDialog(null,
						"Deseja completar essa operacao?",
						"Confirmar Operacao?", JOptionPane.WARNING_MESSAGE);
				if (resposta == JOptionPane.OK_OPTION) {
					service.deletePaciente(new PacienteTableModel(service
							.getAllPacientes()).getPaciente(index));
					// Este metodo eu utilizo para Atualizar a TABELA
					table.setModel(new PacienteTableModel(service
							.getAllPacientes()));
				} else {
					return;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void salvar() {
		if (tFNome.isEditable()) {
			if (tFId.getText().isEmpty()) {
				salvarNovo();
			} else {
				salvarEditar();
			}
		} else {
			JOptionPane.showMessageDialog(null,
					"Voce deve ter permissao de editar", "Erro",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void salvarEditar() {
		int index = table.getSelectedRow();
		Paciente p = getPaciente(index);

		p.setId(Long.parseLong(tFId.getText()));
		p.setDataCadastro(cString(tFDataCadastro.getText()));
		p.setNome(tFNome.getText());
		p.setTelefone(tFTelefone.getText());
		p.setCelular(tFCelular.getText());
		p.setEmail(tFEmail.getText());
		p.setEndereco(tFEndereco.getText());
		p.setBairro(tFBairro.getText());
		p.setCidade(tFBairro.getText());
		p.setNacionalidade(tFNacionalidade.getText());
		p.setNascimento(cString(tFDataDeNascimento.getText()));
		p.setRg(tFRG.getText());
		p.setCpf(tFCPF.getText());
		p.setProfissao(tFProfissao.getText());

		if (rdbtnAlta.isSelected()) {
			p.setStatus("alta");
		} else if (rdbtnEncaminhado.isSelected()) {
			p.setStatus("encaminhado");
		} else if (rdbtnPendente.isSelected()) {
			p.setStatus("pendente");
		} else {
			p.setStatus("pendente");
		}
		PacienteService service = new PacienteService();
		service.atualizaPaciente(p);
		JOptionPane.showMessageDialog(null, "Operacao completa", "Sucesso",
				JOptionPane.INFORMATION_MESSAGE);
		table.setModel(new PacienteTableModel(service.getAllPacientes()));
		notEditableTextFields();
		cleanTextFields();
	}

	private void salvarNovo() {
		Paciente p = new Paciente();
		Usuario u = Sessao.getInstance().getUsuario();

		p.setDataCadastro(cString(tFDataCadastro.getText()));
		p.setNome(tFNome.getText());
		p.setTelefone(tFTelefone.getText());
		p.setCelular(tFCelular.getText());
		p.setEmail(tFEmail.getText());
		p.setEndereco(tFEndereco.getText());
		p.setBairro(tFBairro.getText());
		p.setCidade(tFBairro.getText());
		p.setNacionalidade(tFNacionalidade.getText());
		p.setNascimento(cString(tFDataDeNascimento.getText()));
		p.setUsuario(u);
		p.setRg(tFRG.getText());
		p.setCpf(tFCPF.getText());
		p.setProfissao(tFProfissao.getText());

		if (rdbtnAlta.isSelected()) {
			p.setStatus("alta");
		} else if (rdbtnEncaminhado.isSelected()) {
			p.setStatus("encaminhado");
		} else if (rdbtnPendente.isSelected()) {
			p.setStatus("pendente");
		} else {
			p.setStatus("pendente");
		}
		PacienteService service = new PacienteService();
		service.adicionarPaciente(p);
		JOptionPane.showMessageDialog(null, "Paciente atualizado com Sucesso",
				"Sucesso", JOptionPane.INFORMATION_MESSAGE);
		table.setModel(new PacienteTableModel(service.buscaPaciente(busca)));
		notEditableTextFields();
		cleanTextFields();
	}

	private JTable getTablePaciente() {
		if (table == null) {
			table = new JTable();
			table.setModel(new PacienteTableModel(service.buscaPaciente(busca)));
		}
		return table;
	}

	private JTable getTableTratamento() {
		if (tableTratamento == null) {
			tableTratamento = new JTable();
			tableTratamento.setModel(new TratamentoTableModel());
		}
		return tableTratamento;
	}

	void notEditableTextFields() {
		tFNome.setEditable(false);
		tFTelefone.setEditable(false);
		tFCelular.setEditable(false);
		tFEmail.setEditable(false);
		tFEndereco.setEditable(false);
		tFBairro.setEditable(false);
		tFCidade.setEditable(false);
		tFRG.setEditable(false);
		tFCPF.setEditable(false);
		tFProfissao.setEditable(false);
		rdbtnAlta.setEnabled(false);
		rdbtnEncaminhado.setEnabled(false);
		rdbtnPendente.setEnabled(false);
		tFNacionalidade.setEditable(false);
		tFDataDeNascimento.setEditable(false);
	}

	void editableTextFields() {
		tFNome.setEditable(true);
		tFTelefone.setEditable(true);
		tFCelular.setEditable(true);
		tFEmail.setEditable(true);
		tFEndereco.setEditable(true);
		tFBairro.setEditable(true);
		tFCidade.setEditable(true);
		tFRG.setEditable(true);
		tFCPF.setEditable(true);
		tFProfissao.setEditable(true);
		tFNacionalidade.setEditable(true);
		tFDataDeNascimento.setEditable(true);
		rdbtnAlta.setEnabled(true);
		rdbtnEncaminhado.setEnabled(true);
		rdbtnPendente.setEnabled(true);
	}

	void cleanTextFields() {
		tFId.setText("");
		tFDataCadastro.setText("");
		tFDataDeNascimento.setText("");
		tFNome.setText("");
		tFTelefone.setText("");
		tFCelular.setText("");
		tFEmail.setText("");
		tFEndereco.setText("");
		tFBairro.setText("");
		tFCidade.setText("");
		tFRG.setText("");
		tFCPF.setText("");
		tFProfissao.setText("");
		rdbtnPendente.setSelected(true);
		tFNacionalidade.setText("");
	}

	Paciente getPaciente(int index) {
		List<Paciente> pacientes = service.buscaPaciente(busca);
		return pacientes.get(index);
	}

	Tratamento getTratamento(int index, Paciente p) {
		List<Tratamento> tratamentos = p.getTratamentos();
		return tratamentos.get(index);
	}

	public String sCalendar(Calendar c) {
		if (c == null) {
			return "";
		} else {
			SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
			return simple.format(c.getTime());
		}
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

	private void triagem() {
		int index = table.getSelectedRow();
		if (index == -1) {
			JOptionPane.showMessageDialog(null,
					"Selecione um paciente na Tabela", "Erro",
					JOptionPane.ERROR_MESSAGE);
		} else {
			Paciente p = getPaciente(index);
			if (p.getTriagem() == null) {
				new DialogTriagem(this, p, "novo");
			} else {
				new DialogTriagem(this, p, "editar");
			}
		}
	}

	private void novoTratamento() {
		int index = table.getSelectedRow();
		if (index == -1) {
			JOptionPane.showMessageDialog(null,
					"Selecione um paciente na Tabela", "Erro",
					JOptionPane.ERROR_MESSAGE);
		} else {
			Paciente p = getPaciente(index);
			new DialogTratamento(p,"novo");
		}
	}
	private void abrirTratamento(){
		int index = table.getSelectedRow();
		if (index == -1) {
			JOptionPane.showMessageDialog(null,
					"Selecione um paciente na Tabela", "Erro",
					JOptionPane.ERROR_MESSAGE);
		} else {
			Paciente p = getPaciente(index);
			int indexTratamento = tableTratamento.getSelectedRow();
			if(indexTratamento == -1){
				JOptionPane.showMessageDialog(null,
						"Selecione um tratamento na tabela", "Erro",
						JOptionPane.ERROR_MESSAGE);
			}
			Tratamento t = getTratamento(indexTratamento, p);
			new DialogTratamento(p, t, "");
		}
	}
}
