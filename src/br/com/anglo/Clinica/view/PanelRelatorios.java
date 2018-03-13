package br.com.anglo.Clinica.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import br.com.anglo.Clinica.model.Paciente;
import br.com.anglo.Clinica.service.RelatorioService;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;

public class PanelRelatorios extends JPanel{
	/*
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JButton btnBuscar;
	public JTable table;
	private String busca;
	private JCheckBox chckbxNoDefinido;
	private JCheckBox chckbxPoliambulatrio;
	private JCheckBox chckbxCardiorrespiratrio;
	private JCheckBox chckbxNeurologia;
	private JCheckBox chckbxOrtopedia;
	private JCheckBox chckbxBaixa;
	private JCheckBox chckbxMedia;
	private JCheckBox chckbxAlta;

	/**
	 * Create the panel.
	 */
	public PanelRelatorios() {
		setBorder(new TitledBorder(null, "Relat\u00F3rios",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setSize(782, 434);
		setLayout(null);

		textField = new JTextField();
		textField.setBounds(10, 19, 329, 20);
		add(textField);
		textField.setColumns(50);
		busca = textField.getText();

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				busca();
			}
		});
		btnBuscar.setBounds(597, 19, 175, 46);
		add(btnBuscar);

		JLabel lblPrioridade = new JLabel("Prioridade: ");
		lblPrioridade.setBounds(345, 23, 62, 14);
		add(lblPrioridade);

		chckbxAlta = new JCheckBox("Alta");
		chckbxAlta.setBounds(413, 19, 50, 23);
		add(chckbxAlta);

		chckbxMedia = new JCheckBox("M\u00E9dia");
		chckbxMedia.setBounds(465, 19, 62, 23);
		add(chckbxMedia);

		chckbxBaixa = new JCheckBox("Baixa");
		chckbxBaixa.setBounds(529, 19, 62, 23);
		add(chckbxBaixa);

		JLabel lblArea = new JLabel("Area: ");
		lblArea.setBounds(10, 51, 50, 14);
		add(lblArea);

		chckbxOrtopedia = new JCheckBox("Ortopedia");
		chckbxOrtopedia.setBounds(97, 47, 83, 23);
		add(chckbxOrtopedia);

		chckbxNeurologia = new JCheckBox("Neurologia");
		chckbxNeurologia.setBounds(182, 47, 83, 23);
		add(chckbxNeurologia);

		chckbxCardiorrespiratrio = new JCheckBox("Cardiorrespirat\u00F3rio");
		chckbxCardiorrespiratrio.setBounds(267, 47, 115, 23);
		add(chckbxCardiorrespiratrio);

		chckbxPoliambulatrio = new JCheckBox("Poliambulat\u00F3rio");
		chckbxPoliambulatrio.setBounds(387, 47, 97, 23);
		add(chckbxPoliambulatrio);

		chckbxNoDefinido = new JCheckBox("N\u00E3o definido");
		chckbxNoDefinido.setBounds(487, 46, 89, 23);
		add(chckbxNoDefinido);

		JScrollPane scrollPane = new JScrollPane(getTablePaciente());
		scrollPane.setBounds(10, 81, 762, 308);
		add(scrollPane);

		JButton btnExibirRelatrios = new JButton("Exibir Tratamentos");
		btnExibirRelatrios.setBounds(630, 400, 142, 23);
		add(btnExibirRelatrios);

		JButton btnExibirTriagem = new JButton("Exibir Triagem");
		btnExibirTriagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				exibirTriagem();
			}
		});
		btnExibirTriagem.setBounds(515, 400, 105, 23);
		add(btnExibirTriagem);
		setVisible(true);
	}

	private JTable getTablePaciente() {
		RelatorioService service = new RelatorioService();
		if (table == null) {
			table = new JTable();
			table.setModel(new RelatorioTableModel(service.listRelatorio(busca,
					chckbxAlta.isSelected(), chckbxMedia.isSelected(),
					chckbxBaixa.isSelected(), chckbxOrtopedia.isSelected(),
					chckbxNeurologia.isSelected(),
					chckbxCardiorrespiratrio.isSelected(),
					chckbxPoliambulatrio.isSelected(),
					chckbxNoDefinido.isSelected())));
		}
		return table;
	}
	private void busca() {
		busca = textField.getText();
		RelatorioService service = new RelatorioService();
		table.setModel(new RelatorioTableModel(service.listRelatorio(busca,
					chckbxAlta.isSelected(), chckbxMedia.isSelected(),
					chckbxBaixa.isSelected(), chckbxOrtopedia.isSelected(),
					chckbxNeurologia.isSelected(),
					chckbxCardiorrespiratrio.isSelected(),
					chckbxPoliambulatrio.isSelected(),
					chckbxNoDefinido.isSelected())));
		this.repaint();
		
	}
	private void exibirTriagem() {
		int index = table.getSelectedRow();
		if(index == -1){
			JOptionPane.showMessageDialog(null,
					"Selecione um paciente na Tabela", "Erro",
					JOptionPane.ERROR_MESSAGE);
		}else {
			new DialogTriagem(null, getPaciente(index), "");
		}
	}
	public Paciente getPaciente(int index) {
		RelatorioService service = new RelatorioService();
		List<Paciente> pacientes = service.listRelatorio(busca,
				chckbxAlta.isSelected(), chckbxMedia.isSelected(),
				chckbxBaixa.isSelected(), chckbxOrtopedia.isSelected(),
				chckbxNeurologia.isSelected(),
				chckbxCardiorrespiratrio.isSelected(),
				chckbxPoliambulatrio.isSelected(),
				chckbxNoDefinido.isSelected());
		return pacientes.get(index);
	}

}
