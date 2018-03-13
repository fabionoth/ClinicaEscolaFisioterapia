package br.com.anglo.Clinica.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.anglo.Clinica.model.Tratamento;

public class TratamentoTableModel extends AbstractTableModel  {
	private static final long serialVersionUID = 1L;

	private List<Tratamento> linhas;

	private String[] colunas = new String[] { "Id", "Descrição"};

	public TratamentoTableModel() {
		linhas = new ArrayList<Tratamento>();
	}

	public TratamentoTableModel(List<Tratamento> tratamentos) {
		linhas = new ArrayList<Tratamento>(tratamentos);
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

				Tratamento tratamento = linhas.get(rowIndex);

				switch (columnIndex) {
				case 0: 
					return tratamento.getId();
				case 1: 
					return tratamento.getDescricao();
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
		default:
			throw new IndexOutOfBoundsException("columnIndex out of bounds");
		}
	
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
	
	public Tratamento getTratamento(int indiceLinha){
		return linhas.get(indiceLinha);
	}
	
	public void addTratamento(Tratamento tratamento){
		linhas.add(tratamento);
		int ultimoIndice = getRowCount() - 1;
		fireTableRowsInserted(ultimoIndice, ultimoIndice);
	}
	public void removeTratamento(int indiceLinha){
		linhas.remove(indiceLinha);
		fireTableRowsDeleted(indiceLinha, indiceLinha);
	}
}
