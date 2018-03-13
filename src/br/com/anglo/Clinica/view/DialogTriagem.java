package br.com.anglo.Clinica.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.anglo.Clinica.model.Paciente;
import br.com.anglo.Clinica.model.Sessao;
import br.com.anglo.Clinica.model.Triagem;
import br.com.anglo.Clinica.service.PacienteService;
import br.com.anglo.Clinica.service.TriagemService;

public class DialogTriagem extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tFPaciente;
	private JTextField tFProblema;
	private JTextField tFQuandoAconteceu;
	private JTextField tFFezCirurgia;
	private JTextField tFEstaCaminhando;
	private JTextField tFTemEncaminhamento;
	private JTextField tFazFisioterapia;
	private JTextField tFJaFezFisioterapiaAqui;
	private JTextField tFTransporte;
	private JTextField tFUsuarioResponsavel;
	private JTextField tFIdTriagem;
	private JRadioButton rdbtOrtopedia;
	private JRadioButton rdbtnNeurologia;
	private JRadioButton rdbtnCardiorespiratrio;
	private JRadioButton rdbtnPoliambulatrio;
	private JRadioButton rdbtnMedia;
	private JRadioButton rdbtnAlta;
	private JRadioButton rdbtnBaixa;
	private JRadioButton rdbtnNaoDefinido;
	private JTextArea tFObs;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JButton jBCancelar;
	private JButton btnLimpar;
	private JButton jBSalvar;
	
	private Paciente paciente;
	private String tipo;
	private PanelPacientes panel;


	public DialogTriagem(PanelPacientes panel, Paciente paciente, String tipo) {
		setSize(600, 580);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setLayout(null);

		this.paciente = paciente;
		this.panel = panel;
		this.tipo = tipo;
		
		
		
		getContentPane().add(contentPanel, BorderLayout.CENTER);

		{
			JLabel lblNome = new JLabel("Paciente: ");
			lblNome.setBounds(191, 11, 54, 14);
			contentPanel.add(lblNome);
		}
		{
			tFPaciente = new JTextField();
			tFPaciente.setEditable(false);
			tFPaciente.setBounds(241, 8, 86, 20);
			contentPanel.add(tFPaciente);
			tFPaciente.setColumns(10);
		}
		{
			JLabel lblNewLabel = new JLabel("Problema: ");
			lblNewLabel.setBounds(10, 38, 54, 14);
			contentPanel.add(lblNewLabel);
		}

		tFProblema = new JTextField();
		tFProblema.setBounds(70, 35, 504, 20);
		contentPanel.add(tFProblema);
		tFProblema.setColumns(10);

		JLabel lblQuandoAconteceu = new JLabel(
				"Quando aconteceu? | A quanto tempo esta com este problema? ");
		lblQuandoAconteceu.setBounds(10, 63, 317, 14);
		contentPanel.add(lblQuandoAconteceu);

		tFQuandoAconteceu = new JTextField();
		tFQuandoAconteceu.setBounds(10, 88, 564, 20);
		contentPanel.add(tFQuandoAconteceu);
		tFQuandoAconteceu.setColumns(10);
		{
			JLabel lblFezCirurgia = new JLabel("Fez cirurgia? | Quando? ");
			lblFezCirurgia.setBounds(10, 119, 127, 14);
			contentPanel.add(lblFezCirurgia);
		}
		{
			tFFezCirurgia = new JTextField();
			tFFezCirurgia.setBounds(141, 116, 433, 20);
			contentPanel.add(tFFezCirurgia);
			tFFezCirurgia.setColumns(10);
		}
		{
			JLabel lblEstaCaminhando = new JLabel(
					"Esta caminhando? | Usa muletas?");
			lblEstaCaminhando.setBounds(10, 144, 168, 14);
			contentPanel.add(lblEstaCaminhando);
		}
		{
			tFEstaCaminhando = new JTextField();
			tFEstaCaminhando.setBounds(10, 169, 564, 20);
			contentPanel.add(tFEstaCaminhando);
			tFEstaCaminhando.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Tem encaminhamento? | Do SUS?");
			lblNewLabel_1.setBounds(10, 200, 185, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			tFTemEncaminhamento = new JTextField();
			tFTemEncaminhamento.setBounds(195, 200, 379, 20);
			contentPanel.add(tFTemEncaminhamento);
			tFTemEncaminhamento.setColumns(10);
		}
		{
			JLabel lblFazFisioterapiaAtualmente = new JLabel(
					"Faz fisioterapia atualmente? | Ja fez fisioterapia para este problema? ");
			lblFazFisioterapiaAtualmente.setBounds(10, 225, 345, 14);
			contentPanel.add(lblFazFisioterapiaAtualmente);
		}
		{
			tFazFisioterapia = new JTextField();
			tFazFisioterapia.setBounds(10, 250, 564, 20);
			contentPanel.add(tFazFisioterapia);
			tFazFisioterapia.setColumns(10);
		}
		{
			JLabel lblJaFezFisioterapia = new JLabel(
					"Ja fez fisioterapia aqui? ");
			lblJaFezFisioterapia.setBounds(10, 281, 127, 14);
			contentPanel.add(lblJaFezFisioterapia);
		}
		{
			tFJaFezFisioterapiaAqui = new JTextField();
			tFJaFezFisioterapiaAqui.setBounds(10, 306, 564, 20);
			contentPanel.add(tFJaFezFisioterapiaAqui);
			tFJaFezFisioterapiaAqui.setColumns(10);
		}
		{
			JLabel lblTemProblememaDe = new JLabel(
					"Tem problemema de hor\u00E1rio? | Transporte?");
			lblTemProblememaDe.setBounds(10, 337, 220, 14);
			contentPanel.add(lblTemProblememaDe);
		}
		{
			tFTransporte = new JTextField();
			tFTransporte.setBounds(10, 362, 564, 20);
			contentPanel.add(tFTransporte);
			tFTransporte.setColumns(10);
		}
		{
			JLabel lblArea = new JLabel("Area: ");
			lblArea.setBounds(10, 393, 46, 14);
			contentPanel.add(lblArea);
		}

		rdbtOrtopedia = new JRadioButton("Ortopedia");
		buttonGroup_1.add(rdbtOrtopedia);
		rdbtOrtopedia.setSelected(true);
		rdbtOrtopedia.setBounds(60, 389, 79, 23);
		contentPanel.add(rdbtOrtopedia);

		rdbtnNeurologia = new JRadioButton("Neurologia");
		buttonGroup_1.add(rdbtnNeurologia);
		rdbtnNeurologia.setBounds(136, 389, 86, 23);
		contentPanel.add(rdbtnNeurologia);

		rdbtnCardiorespiratrio = new JRadioButton("Cardiorespirat\u00F3rio");
		buttonGroup_1.add(rdbtnCardiorespiratrio);
		rdbtnCardiorespiratrio.setBounds(224, 389, 121, 23);
		contentPanel.add(rdbtnCardiorespiratrio);

		rdbtnPoliambulatrio = new JRadioButton("Poliambulat\u00F3rio");
		buttonGroup_1.add(rdbtnPoliambulatrio);
		rdbtnPoliambulatrio.setBounds(347, 389, 109, 23);
		contentPanel.add(rdbtnPoliambulatrio);

		JLabel lblPrioridade = new JLabel("Prioridade: ");
		lblPrioridade.setBounds(10, 418, 64, 14);
		contentPanel.add(lblPrioridade);

		rdbtnAlta = new JRadioButton("Alta");
		buttonGroup_2.add(rdbtnAlta);
		rdbtnAlta.setSelected(true);
		rdbtnAlta.setBounds(80, 415, 64, 23);
		contentPanel.add(rdbtnAlta);

		rdbtnMedia = new JRadioButton("M\u00E9dia");
		buttonGroup_2.add(rdbtnMedia);
		rdbtnMedia.setBounds(141, 415, 64, 23);
		contentPanel.add(rdbtnMedia);

		rdbtnBaixa = new JRadioButton("Baixa");
		buttonGroup_2.add(rdbtnBaixa);
		rdbtnBaixa.setBounds(207, 415, 64, 23);
		contentPanel.add(rdbtnBaixa);

		JLabel lblUsuarioResponsvel = new JLabel("Usuario respons\u00E1vel: ");
		lblUsuarioResponsvel.setBounds(277, 419, 109, 14);
		contentPanel.add(lblUsuarioResponsvel);

		tFUsuarioResponsavel = new JTextField();
		tFUsuarioResponsavel.setEditable(false);
		tFUsuarioResponsavel.setBounds(396, 415, 178, 20);
		contentPanel.add(tFUsuarioResponsavel);
		tFUsuarioResponsavel.setColumns(10);

		JLabel lblObservao = new JLabel("Observa\u00E7\u00E3o: ");
		lblObservao.setBounds(10, 437, 79, 14);
		contentPanel.add(lblObservao);

		tFObs = new JTextArea();
		tFObs.setBounds(10, 453, 376, 45);
		contentPanel.add(tFObs);

		JLabel lblId = new JLabel("Id: ");
		lblId.setBounds(10, 14, 33, 14);
		contentPanel.add(lblId);

		tFIdTriagem = new JTextField();
		tFIdTriagem.setEditable(false);
		tFIdTriagem.setBounds(47, 8, 86, 20);
		contentPanel.add(tFIdTriagem);
		tFIdTriagem.setColumns(10);
		
		rdbtnNaoDefinido = new JRadioButton("Nao definido");
		buttonGroup_1.add(rdbtnNaoDefinido);
		rdbtnNaoDefinido.setBounds(458, 389, 109, 23);
		contentPanel.add(rdbtnNaoDefinido);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				jBCancelar = new JButton("Cancelar");
				jBCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						cancel();
					}


				});
				jBCancelar.setActionCommand("Cancel");
				buttonPane.add(jBCancelar);
			}
			
			btnLimpar = new JButton("Limpar");
			btnLimpar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					setClear();
				}
			});
			buttonPane.add(btnLimpar);
			{
				jBSalvar = new JButton("Salvar");
				jBSalvar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						salvar();
					}
				});
				jBSalvar.setActionCommand("OK");
				buttonPane.add(jBSalvar);
				getRootPane().setDefaultButton(jBSalvar);
			}
		}
		
		if(tipo.equals("novo")){
			setClear();
			setEditable();
			tFPaciente.setText(paciente.getNome());
			tFUsuarioResponsavel.setText(Sessao.getInstance().getUsuario().getNome());
		}
		else if(tipo.equals("editar")){
			setClear();
			setEditable();
			abrirEditado();
			tFPaciente.setText(paciente.getNome());
			tFUsuarioResponsavel.setText(paciente.getUsuario().getNome());
		}else {
			setClear();
			abrirEditado();
			setNotEditable();
			notVisibleButtons();
		}
	}

	public void setNotEditable() {
		boolean b = false;
		tFProblema.setEditable(b);
		tFQuandoAconteceu.setEditable(b);
		tFEstaCaminhando.setEditable(b);
		tFazFisioterapia.setEditable(b);
		tFFezCirurgia.setEditable(b);
		tFJaFezFisioterapiaAqui.setEditable(b);
		tFTemEncaminhamento.setEditable(b);
		tFTransporte.setEditable(b);
		rdbtOrtopedia.setEnabled(b);
		rdbtnNeurologia.setEnabled(b);
		rdbtnCardiorespiratrio.setEnabled(b);
		rdbtnPoliambulatrio.setEnabled(b);
		rdbtnAlta.setEnabled(b);
		rdbtnMedia.setEnabled(b);
		rdbtnBaixa.setEnabled(b);
		tFObs.setEditable(b);
	}

	public void setEditable() {
		boolean b = true;
		tFProblema.setEditable(b);
		tFQuandoAconteceu.setEditable(b);
		tFEstaCaminhando.setEditable(b);
		tFazFisioterapia.setEditable(b);
		tFFezCirurgia.setEditable(b);
		tFJaFezFisioterapiaAqui.setEditable(b);
		tFTemEncaminhamento.setEditable(b);
		tFTransporte.setEditable(b);
		rdbtOrtopedia.setEnabled(b);
		rdbtnNeurologia.setEnabled(b);
		rdbtnCardiorespiratrio.setEnabled(b);
		rdbtnPoliambulatrio.setEnabled(b);
		rdbtnAlta.setEnabled(b);
		rdbtnMedia.setEnabled(b);
		rdbtnBaixa.setEnabled(b);
		tFObs.setEditable(b);
	}
	public void setClear(){
		tFProblema.setText("");
		tFQuandoAconteceu.setText("");
		tFEstaCaminhando.setText("");
		tFazFisioterapia.setText("");
		tFFezCirurgia.setText("");
		tFJaFezFisioterapiaAqui.setText("");
		tFTemEncaminhamento.setText("");
		tFTransporte.setText("");
		rdbtOrtopedia.setText(rdbtOrtopedia.getText());
		rdbtnNeurologia.setText(rdbtnNeurologia.getText());
		rdbtnCardiorespiratrio.setText(rdbtnCardiorespiratrio.getText());
		rdbtnPoliambulatrio.setText(rdbtnPoliambulatrio.getText());
		rdbtnNaoDefinido.setText("Não definido");
		rdbtnAlta.setText(rdbtnAlta.getText());
		rdbtnMedia.setText(rdbtnMedia.getText());
		rdbtnBaixa.setText(rdbtnBaixa.getText());
		tFObs.setText("");
	}
	public void abrirEditado(){
		Triagem t = paciente.getTriagem();
		tFIdTriagem.setText(t.getId().toString());
		tFPaciente.setText(paciente.getNome());
		tFProblema.setText(t.getProblema());
		tFQuandoAconteceu.setText(t.getQuandoAconteceu());
		tFFezCirurgia.setText(t.getFezCirurgiaQuando());
		tFEstaCaminhando.setText(t.getCaminhandoUsaMuletaCadeiraRodas());
		tFTemEncaminhamento.setText(t.getEncaminhamento());
		tFazFisioterapia.setText(t.getJaFezFisiotarapiaParaEsteProblema());
		tFJaFezFisioterapiaAqui.setText(t.getJaFezFisioterapiaAqui());
		tFTransporte.setText(t.getTransporte());
		if(t.getArea().equals("ortopedia")){
			rdbtOrtopedia.setSelected(true);
		}else if(t.getArea().equals("neurologia")){
			rdbtnNeurologia.setSelected(true);
		}else if(t.getArea().equals("cardiorrespiratorio")){
			rdbtnCardiorespiratrio.setSelected(true);
		}else if(t.getArea().equals("poliambulatorio")){
			rdbtnPoliambulatrio.setSelected(true);
		}else if(t.getArea().equals("nao definido")){
			rdbtnNaoDefinido.setSelected(true);
		}
		else {
			rdbtOrtopedia.setSelected(true);
		}
		if(t.getPrioridade().equals("alta")){
			rdbtnAlta.setSelected(true);
		}else if(t.getPrioridade().equals("media")){
			rdbtnMedia.setSelected(true);
		}else if(t.getPrioridade().equals("baixa")){
			rdbtnBaixa.setSelected(true);
		}else {
			rdbtnAlta.setSelected(true);
		}
		tFObs.setText(t.getObs());
	}
	private void notVisibleButtons(){
		jBSalvar.setVisible(false);
		btnLimpar.setVisible(false);
	}
	private void salvar() {
		if(tipo.equals("novo")){
			Triagem t = new Triagem();
			t.setProblema(tFProblema.getText());
			t.setQuandoAconteceu(tFQuandoAconteceu.getText());
			t.setFezCirurgiaQuando(tFFezCirurgia.getText());
			t.setEncaminhamento(tFTemEncaminhamento.getText());
			t.setJaFezFisiotarapiaParaEsteProblema(tFazFisioterapia.getText());
			t.setJaFezFisioterapiaAqui(tFJaFezFisioterapiaAqui.getText());
			t.setCaminhandoUsaMuletaCadeiraRodas(tFEstaCaminhando.getText());
			t.setTransporte(tFTransporte.getText());
			if(rdbtOrtopedia.isSelected()){
				t.setArea("ortopedia");
			}else if(rdbtnNeurologia.isSelected()){
				t.setArea("neurologia");
			}else if(rdbtnCardiorespiratrio.isSelected()){
				t.setArea("cardiorrespiratorio");
			}else if(rdbtnPoliambulatrio.isSelected()){
				t.setArea("poliambulatorio");
			}else if(rdbtnNaoDefinido.isSelected()){
				t.setArea("nao definido");
			}else {
				t.setArea("ortopedia");
			}
			if(rdbtnAlta.isSelected()){
				t.setPrioridade("alta");
			}else if(rdbtnMedia.isSelected()){
				t.setPrioridade("media");
			}else if(rdbtnBaixa.isSelected()){
				t.setPrioridade("baixa");
			}else {
				t.setPrioridade("baixa");
			}
			t.setObs(tFObs.getText());
			t.setPaciente(paciente);
			t.setUsuario(Sessao.getInstance().getUsuario());
			
			paciente.setTriagem(t);
			TriagemService triagemService = new TriagemService();
			triagemService.addTriagem(t);
			
			PacienteService pacienteService = new PacienteService();
			pacienteService.editPaciente(paciente);
			
			JOptionPane.showMessageDialog(null,
					"Triagem adicionada com sucesso", "Completo",
					JOptionPane.INFORMATION_MESSAGE);
			dispose();
		}
		else if(tipo.equals("editar")){
			Triagem t = paciente.getTriagem();
			t.setProblema(tFProblema.getText());
			t.setQuandoAconteceu(tFQuandoAconteceu.getText());
			t.setFezCirurgiaQuando(tFFezCirurgia.getText());
			t.setEncaminhamento(tFTemEncaminhamento.getText());
			t.setJaFezFisiotarapiaParaEsteProblema(tFazFisioterapia.getText());
			t.setJaFezFisioterapiaAqui(tFJaFezFisioterapiaAqui.getText());
			t.setCaminhandoUsaMuletaCadeiraRodas(tFEstaCaminhando.getText());
			t.setTransporte(tFTransporte.getText());
			if(rdbtOrtopedia.isSelected()){
				t.setArea("ortopedia");
			}else if(rdbtnNeurologia.isSelected()){
				t.setArea("neurologia");
			}else if(rdbtnCardiorespiratrio.isSelected()){
				t.setArea("cardiorrespiratorio");
			}else if(rdbtnPoliambulatrio.isSelected()){
				t.setArea("poliambulatorio");
			}else if(rdbtnNaoDefinido.isSelected()){
				t.setArea("nao definido");
			}else {
				t.setArea("ortopedia");
			}
			if(rdbtnAlta.isSelected()){
				t.setPrioridade("alta");
			}else if(rdbtnMedia.isSelected()){
				t.setPrioridade("media");
			}else if(rdbtnBaixa.isSelected()){
				t.setPrioridade("baixa");
			}else {
				t.setPrioridade("baixa");
			}
			t.setObs(tFObs.getText());
			
			t.setPaciente(paciente);
			t.setUsuario(paciente.getTriagem().getUsuario());
			
			TriagemService triagemService = new TriagemService();
			triagemService.editTriagem(t);
			
			paciente.setTriagem(t);
			PacienteService pacienteService = new PacienteService();
			pacienteService.atualizaPaciente(paciente);
			
			JOptionPane.showMessageDialog(null,
					"Triagem alterada com sucesso", "Completo",
					JOptionPane.INFORMATION_MESSAGE);
			dispose();
		}
		
	}
	private void cancel() {
		dispose();
	}
}
