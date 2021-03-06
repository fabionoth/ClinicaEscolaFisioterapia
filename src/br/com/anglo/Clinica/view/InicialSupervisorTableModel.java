package br.com.anglo.Clinica.view;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.anglo.Clinica.model.Paciente;
import br.com.anglo.Clinica.service.PacienteService;

public class InicialSupervisorTableModel extends AbstractTableModel {
	private static final long serialVersionUID = 1L;

	private List<Paciente> linhas;

	private String[] colunas = new String[] { "Id", "Nome", "Telefone",
			"Status", "Problema", "Area de Atendimento", "Prioridade",
			"Acadêmico Responsável" };

	public InicialSupervisorTableModel() {
		PacienteService service = new PacienteService();
		linhas = service.getAllPacientes();
	}

	// public InicialEstagiarioTableModel(List<Paciente> pacientes) {
	// linhas = new ArrayList<Paciente>(pacientes);
	// }

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public int getRowCount() {
		return linhas.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		Paciente paciente = linhas.get(rowIndex);

		switch (columnIndex) {
		case 0:
			return paciente.getId();
		case 1:
			return paciente.getNome();
		case 2:
			return paciente.getTelefone();
		case 3:
			return paciente.getStatus();
		case 4:
			if (paciente.getTriagem() == null) {
				return "";
			} else {
				return paciente.getTriagem().getProblema();
			}
		case 5:
			if (paciente.getTriagem() == null) {
				return "";
			} else {
				return paciente.getTriagem().getArea();
			}
		case 6:
			if (paciente.getTriagem() == null){
				return "";
			}else {
				return paciente.getTriagem().getPrioridade();
			}
		case 7:
			if (paciente.getUsuario() == null){
				return "";
			} else {
				return paciente.getUsuario().getNome();
			}
		default:
			throw new IndexOutOfBoundsException("columnIndex out of bounds");
		}
	}

	@Override
	public String getColumnName(int columnIndex) {
		return colunas[columnIndex];
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case 0:
			return Long.class;
		case 1:
			return String.class;
		case 2:
			return String.class;
		case 3:
			return String.class;
		case 4:
			return String.class;
		case 5:
			return String.class;
		case 6:
			return String.class;
		case 7:
			return String.class;
		default:
			throw new IndexOutOfBoundsException("columnIndex out of bounds");
		}
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	public Paciente getPaciente(int indiceLinha) {
		return linhas.get(indiceLinha);
	}

	public void addPaciente(Paciente paciente) {
		linhas.add(paciente);
		int ultimoIndice = getRowCount() - 1;

		fireTableRowsInserted(ultimoIndice, ultimoIndice);
	}

	public void removePaciente(int indiceLinha) {
		linhas.remove(indiceLinha);
		fireTableRowsDeleted(indiceLinha, indiceLinha);
	}
}
