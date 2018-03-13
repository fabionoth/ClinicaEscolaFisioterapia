package br.com.anglo.Clinica.view;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;

public class PanelInicialSupervisor extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	/**
	 * Create the panel.
	 */
	public PanelInicialSupervisor() {
		setBorder(new TitledBorder(null, "Supervisor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setSize(782, 434);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane(getTablePaciente());
		scrollPane.setBounds(10, 52, 762, 337);
		add(scrollPane);
		
		JLabel lblTratamentosRecentes = new JLabel("Tratamentos Pendentes");
		lblTratamentosRecentes.setBounds(10, 27, 119, 14);
		add(lblTratamentosRecentes);
		
		JButton btnExibirTratamento = new JButton("Exibir Tratamento");
		btnExibirTratamento.setBounds(653, 400, 119, 23);
		add(btnExibirTratamento);
		setVisible(true);
	}
	
	private JTable getTablePaciente() {
		if (table == null) {
			table = new JTable();
			table.setModel(new InicialSupervisorTableModel());
		}
		return table;
	}

}
