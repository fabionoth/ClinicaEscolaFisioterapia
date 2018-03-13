package br.com.anglo.Clinica.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelInicialEstagiario extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	/**
	 * Create the panel.
	 */
	public PanelInicialEstagiario() {
		setBorder(new TitledBorder(null, "Estagiario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setSize(782, 434);
		setLayout(null);
		setVisible(true);
		
		JScrollPane scrollPane = new JScrollPane(getTablePaciente());
		scrollPane.setBounds(10, 42, 525, 343);
		add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setColumns(27);
		textArea.setRows(50);
		textArea.setBounds(545, 42, 227, 381);
		add(textArea);
		
		JLabel lblPacientesPendentes = new JLabel("Meus Pacientes");
		lblPacientesPendentes.setBounds(10, 17, 116, 14);
		add(lblPacientesPendentes);
		
		JLabel lblAnotaes = new JLabel("Anota\u00E7\u00F5es");
		lblAnotaes.setBounds(545, 17, 61, 14);
		add(lblAnotaes);
		
		JButton btnExibirTratamento = new JButton("Abrir Tratamento");
		btnExibirTratamento.setBounds(404, 396, 131, 23);
		add(btnExibirTratamento);
		
		JButton btnNewButton = new JButton("Exibir Triagem");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(288, 396, 106, 23);
		add(btnNewButton);
	}
	private JTable getTablePaciente() {
		if (table == null) {
			table = new JTable();
			table.setModel(new InicialEstagiarioTableModel());
		}
		return table;
	}
}
