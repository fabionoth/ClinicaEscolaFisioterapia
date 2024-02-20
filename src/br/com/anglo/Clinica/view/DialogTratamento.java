package br.com.anglo.Clinica.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.com.anglo.Clinica.model.Paciente;
import br.com.anglo.Clinica.model.Sessao;
import br.com.anglo.Clinica.model.Tratamento;
import br.com.anglo.Clinica.model.Usuario;
import br.com.anglo.Clinica.service.PacienteService;
import br.com.anglo.Clinica.service.TratamentoService;

import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogTratamento extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tFId;
	private JTextField tFDescricao;
	private JTextField tFCondutaCurtoPrazo;
	private JTextField tFCondutaMedioPrazo;
	private JTextField tFCondutaLongoPrazo;
	private JTextField tFObjetivosCurtoPrazo;
	private JTextField tFObjetivosMedioPrazo;
	private JTextField tFObjetivosLongoPrazo;
	private JTextField tFPaciente;
	private JTextField tFUsuario;
	private JFormattedTextField tFDataInicio;
	private JFormattedTextField tFDataFim;
	private JTextArea tFObs;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public Paciente p;
	public Tratamento t;
	String tipo;


	
	/**
	 * @wbp.parser.constructor
	 */
	public DialogTratamento(Paciente p, String tipo) {
		inicialize();
		this.p = p;
		this.tipo = tipo;
	}
	public DialogTratamento(Paciente p, Tratamento t, String tipo) {
		inicialize();
		this.p = p;
		this.t = t;
		this.tipo = tipo;
	}
	void inicialize() {
		setTitle("Tratamento");
		setSize(600, 580);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblId = new JLabel("Id: ");
			lblId.setBounds(10, 11, 32, 14);
			contentPanel.add(lblId);
		}
		
		tFId = new JTextField();
		tFId.setEditable(false);
		tFId.setBounds(52, 8, 86, 20);
		contentPanel.add(tFId);
		tFId.setColumns(10);
		
		JLabel lblDataInicio = new JLabel("Data Inicio: ");
		lblDataInicio.setBounds(10, 39, 65, 14);
		contentPanel.add(lblDataInicio);
		
		JLabel lblDataFim = new JLabel("Data Fim: ");
		lblDataFim.setBounds(197, 39, 49, 14);
		contentPanel.add(lblDataFim);
		
		JLabel lblNewLabel = new JLabel("Descri\u00E7\u00E3o: ");
		lblNewLabel.setBounds(10, 67, 65, 14);
		contentPanel.add(lblNewLabel);
		
		tFDescricao = new JTextField();
		tFDescricao.setBounds(85, 64, 499, 20);
		contentPanel.add(tFDescricao);
		tFDescricao.setColumns(250);
		
		JTextArea tFObs = new JTextArea();
		tFObs.setEditable(false);
		tFObs.setBounds(10, 419, 574, 89);
		contentPanel.add(tFObs);
		
		JLabel lblObsprofessor = new JLabel("Obs: (Professor)");
		lblObsprofessor.setBounds(10, 397, 86, 14);
		contentPanel.add(lblObsprofessor);
		
		JLabel lblObjetivoscurtoPrazo = new JLabel("Objetivos (curto prazo): ");
		lblObjetivoscurtoPrazo.setBounds(10, 92, 128, 14);
		contentPanel.add(lblObjetivoscurtoPrazo);
		
		JLabel lblObjetivosmdioPrazo = new JLabel("Objetivos (m\u00E9dio prazo): ");
		lblObjetivosmdioPrazo.setBounds(10, 117, 128, 14);
		contentPanel.add(lblObjetivosmdioPrazo);
		
		JLabel lblObjetivoslongoPrazo = new JLabel("Objetivos (longo prazo): ");
		lblObjetivoslongoPrazo.setBounds(10, 142, 128, 14);
		contentPanel.add(lblObjetivoslongoPrazo);
		
		JLabel lblCondutacurtoPrazo = new JLabel("Conduta (curto prazo): ");
		lblCondutacurtoPrazo.setBounds(10, 173, 128, 14);
		contentPanel.add(lblCondutacurtoPrazo);
		
		JLabel lblCondutamedioPrazo = new JLabel("Conduta (medio prazo): ");
		lblCondutamedioPrazo.setBounds(10, 201, 128, 14);
		contentPanel.add(lblCondutamedioPrazo);
		
		JLabel lblCondutalongoPrazo = new JLabel("Conduta (longo prazo):");
		lblCondutalongoPrazo.setBounds(10, 230, 112, 14);
		contentPanel.add(lblCondutalongoPrazo);
		
		tFCondutaCurtoPrazo = new JTextField();
		tFCondutaCurtoPrazo.setBounds(125, 173, 459, 20);
		contentPanel.add(tFCondutaCurtoPrazo);
		tFCondutaCurtoPrazo.setColumns(250);
		
		tFCondutaMedioPrazo = new JTextField();
		tFCondutaMedioPrazo.setBounds(132, 198, 452, 20);
		contentPanel.add(tFCondutaMedioPrazo);
		tFCondutaMedioPrazo.setColumns(250);
		
		tFCondutaLongoPrazo = new JTextField();
		tFCondutaLongoPrazo.setBounds(142, 227, 442, 20);
		contentPanel.add(tFCondutaLongoPrazo);
		tFCondutaLongoPrazo.setColumns(250);
		MaskFormatter formatDate; 
		try {
			formatDate = new MaskFormatter("##/##/####");
			tFDataInicio = new JFormattedTextField(formatDate);
			tFDataInicio.setBounds(72, 36, 98, 20);
			contentPanel.add(tFDataInicio);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		MaskFormatter formatDateFim;
		try {
			formatDateFim = new MaskFormatter("##/##/####");
			tFDataFim = new JFormattedTextField(formatDateFim);
			tFDataFim.setBounds(256, 36, 103, 20);
			contentPanel.add(tFDataFim);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		
		rdbtnNewRadioButton = new JRadioButton("Aprovado");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(515, 389, 73, 23);
		contentPanel.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Verificar Corre\u00E7\u00F5es");
		rdbtnNewRadioButton_1.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(364, 389, 128, 23);
		contentPanel.add(rdbtnNewRadioButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 384, 574, 2);
		contentPanel.add(separator);
		
		tFObjetivosCurtoPrazo = new JTextField();
		tFObjetivosCurtoPrazo.setBounds(133, 89, 451, 20);
		contentPanel.add(tFObjetivosCurtoPrazo);
		tFObjetivosCurtoPrazo.setColumns(250);
		
		tFObjetivosMedioPrazo = new JTextField();
		tFObjetivosMedioPrazo.setBounds(143, 117, 441, 20);
		contentPanel.add(tFObjetivosMedioPrazo);
		tFObjetivosMedioPrazo.setColumns(250);
		
		tFObjetivosLongoPrazo = new JTextField();
		tFObjetivosLongoPrazo.setBounds(132, 142, 452, 20);
		contentPanel.add(tFObjetivosLongoPrazo);
		tFObjetivosLongoPrazo.setColumns(250);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 280, 574, 61);
		contentPanel.add(scrollPane);
		
		JLabel lblAvaliaes = new JLabel("Avalia\u00E7\u00F5es: ");
		lblAvaliaes.setBounds(10, 255, 65, 14);
		contentPanel.add(lblAvaliaes);
		
		JButton btnNewButton = new JButton("Nova");
		btnNewButton.setBounds(109, 350, 89, 23);
		contentPanel.add(btnNewButton);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(396, 352, 89, 23);
		contentPanel.add(btnEditar);
		
		JButton btnAbrir = new JButton("Abrir");
		btnAbrir.setBounds(10, 350, 89, 23);
		contentPanel.add(btnAbrir);
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.setBounds(495, 352, 89, 23);
		contentPanel.add(btnApagar);
		
		JLabel lblPaciente = new JLabel("Paciente: ");
		lblPaciente.setBounds(148, 11, 58, 14);
		contentPanel.add(lblPaciente);
		
		tFPaciente = new JTextField();
		tFPaciente.setEditable(false);
		tFPaciente.setBounds(216, 8, 86, 20);
		contentPanel.add(tFPaciente);
		tFPaciente.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(312, 11, 42, 14);
		contentPanel.add(lblNewLabel_1);
		
		tFUsuario = new JTextField();
		tFUsuario.setEditable(false);
		tFUsuario.setBounds(364, 8, 86, 20);
		contentPanel.add(tFUsuario);
		tFUsuario.setColumns(10);
		
		JButton btnAnamnese = new JButton("Anamnese");
		btnAnamnese.setBounds(495, 35, 89, 23);
		contentPanel.add(btnAnamnese);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			JButton btnCancelar = new JButton("Cancelar");
			buttonPane.add(btnCancelar);
			
			JButton btnLimpar = new JButton("Limpar");
			buttonPane.add(btnLimpar);
			
			JButton btnSalvar = new JButton("Salvar");
			btnSalvar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					salvar();
				}
			});
			buttonPane.add(btnSalvar);
		}
	}
	void clearTextFields(){
		tFDescricao.setText("");
		tFDataInicio.setText("");
		tFDataFim.setText("");
		tFObjetivosCurtoPrazo.setText("");
		tFObjetivosMedioPrazo.setText("");
		tFObjetivosLongoPrazo.setText("");
		tFCondutaCurtoPrazo.setText("");
		tFCondutaMedioPrazo.setText("");
		tFCondutaLongoPrazo.setText("");
		tFObs.setText("");
	}
	void abrir(){
		tFDescricao.setText(t.getDescricao());
		tFDataInicio.setText(sCalendar(t.getDataInicio()));
		tFDataFim.setText(sCalendar(t.getDataFim()));
		tFObjetivosCurtoPrazo.setText(t.getObjetivoCurtoPrazo());
		tFObjetivosMedioPrazo.setText(t.getObjetivoMedioPrazo());
		tFObjetivosLongoPrazo.setText(t.getObjetivoLongoPrazo());
		tFCondutaCurtoPrazo.setText(t.getCondutaCurtoPrazo());
		tFCondutaMedioPrazo.setText(t.getCondutaMedioPrazo());
		tFCondutaLongoPrazo.setText(t.getCondutaLongoPrazo());
		tFObs.setText(t.getObsProfessor());
		tFId.setText(t.getId().toString());
		tFPaciente.setText(p.getNome());
		if(t.getStatus().equals("verificar")){
			rdbtnNewRadioButton.setSelected(true);
		}
		if(t.getStatus().equals("aprovado")){
			rdbtnNewRadioButton_1.setSelected(true);
		}
	}
	
	void editableTextFields(){
		tFDataInicio.setEditable(true);
		tFDataFim.setEditable(true);
		tFDescricao.setEditable(true);
		tFObjetivosCurtoPrazo.setEditable(true);
		tFObjetivosMedioPrazo.setEditable(true);
		tFObjetivosLongoPrazo.setEditable(true);
		tFCondutaCurtoPrazo.setEditable(true);
		tFCondutaMedioPrazo.setEditable(true);
		tFCondutaLongoPrazo.setEditable(true);
	}
	private void salvar() {
		if("novo".equals(tipo)){
			salvarNovo();
		}
		if("editar".equals(tipo)){
			salvarEditar();
		}
		
	}
	
	void salvarEditar(){
		
	}
	void salvarNovo(){
		Tratamento t = new Tratamento(); 
		Usuario u = Sessao.getInstance().getUsuario();
		List<Tratamento> tratamentos = p.getTratamentos();
		if(tratamentos == null){
			tratamentos = new ArrayList<Tratamento>();
		}else {
			PacienteService pacienteService = new PacienteService();
			p.setTratamentos(tratamentos);
			pacienteService.atualizaPaciente(p);
			
			
			
			rdbtnNewRadioButton.setSelected(true);
			rdbtnNewRadioButton.setEnabled(false);
			rdbtnNewRadioButton_1.setEnabled(false);
			tFUsuario.setText(u.getNome());
			tFPaciente.setText(p.getNome());
			t.setDescricao(tFDescricao.getText());
			t.setObjetivoCurtoPrazo(tFObjetivosCurtoPrazo.getText());
			t.setObjetivoMedioPrazo(tFObjetivosMedioPrazo.getText());
			t.setObjetivoLongoPrazo(tFObjetivosLongoPrazo.getText());
			t.setCondutaCurtoPrazo(tFCondutaCurtoPrazo.getText());
			t.setCondutaMedioPrazo(tFCondutaMedioPrazo.getText());
			t.setCondutaLongoPrazo(tFCondutaLongoPrazo.getText());
			t.setDataInicio(cString(tFDataInicio.getText()));
			t.setDataFim(cString(tFDataFim.getText()));
			t.setUsuario(u);
			t.setPaciente(p);
			tratamentos.add(t);
			TratamentoService tratamentoService = new TratamentoService();
			tratamentoService.adicionarTratamento(t);
			
			
			
		}
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
	
}
