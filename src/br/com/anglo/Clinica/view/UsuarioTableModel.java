package br.com.anglo.Clinica.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.anglo.Clinica.model.Usuario;

public class UsuarioTableModel extends AbstractTableModel {
	private static final long serialVersionUID = 1L;

	private List<Usuario> linhas;

	private String[] colunas = new String[] { "Id", "Nome", "Usuario",
			"Tipo" };

	public UsuarioTableModel() {
		linhas = new ArrayList<Usuario>();
	}

	public UsuarioTableModel(List<Usuario> usuarios) {
		linhas = new ArrayList<Usuario>(usuarios);
	}

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

				Usuario usuario = linhas.get(rowIndex);

				switch (columnIndex) {
				case 0: 
					return usuario.getId();
				case 1: 
					return usuario.getNome();
				case 2: 
					return usuario.getUsuario();
				case 3: 
					return usuario.getTipo();
				default:
					throw new IndexOutOfBoundsException("columnIndex out of bounds");
				}
	}

	@Override
	public String getColumnName(int columnIndex) {
		return colunas[columnIndex];
	}

	@Override
	public Class<?> getColumnClass(int columnIndex){
		switch(columnIndex){
		case 0:
			return Long.class;
		case 1:
			return String.class;
		case 2:
			return String.class;
		case 3:
			return String.class;
		default:
			throw new IndexOutOfBoundsException("columnIndex out of bounds");
		}
	
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
	
	public Usuario getUsuario(int indiceLinha){
		return linhas.get(indiceLinha);
	}
	
	public void addUsuario(Usuario usuario){
		linhas.add(usuario);
		int ultimoIndice = getRowCount() - 1;
		
		fireTableRowsInserted(ultimoIndice, ultimoIndice);
	}
	public void removePaciente(int indiceLinha){
		linhas.remove(indiceLinha);
		fireTableRowsDeleted(indiceLinha, indiceLinha);
	}
}
