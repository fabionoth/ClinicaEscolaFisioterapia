package br.com.anglo.Clinica.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Tratamento {
	@Id
	@GeneratedValue
	private Long id;
	@Temporal(TemporalType.DATE)
	private Calendar dataInicio;
	@Temporal(TemporalType.DATE)
	private Calendar dataFim; 
	@Column
	private String descricao;
	@OneToOne
	private Anamnese anamnese;
	@OneToOne
	private Paciente paciente;
	@OneToOne
	private Usuario usuario;
	@Column
	private String status; 
	@Column
	private String obsProfessor; 
	
	
	
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public String getObsProfessor() {
		return obsProfessor;
	}
	public void setObsProfessor(String obsProfessor) {
		this.obsProfessor = obsProfessor;
	}
	/**
	 * EXAMES COMPLEMENTARES
	 */
	@Lob
	private String examesComplementares; 
	/**
	 * Objetivos do Tratamento
	 */
	//Textos Longos
	
	@Lob
	private String objetivoCurtoPrazo;
	@Lob
	private String objetivoMedioPrazo;
	@Lob
	private String objetivoLongoPrazo;
	
	/**
	 * Conduta Proposta
	 */
	@Lob
	private String condutaCurtoPrazo;
	@Lob
	private String condutaMedioPrazo;
	@Lob
	private String condutaLongoPrazo;
	
	@OneToMany
	private List<FichaAvaliacaoFibromialgia> fichaFibromialgia;
	@OneToMany
	private List<FichaAvaliacaoNeuroFuncional> fichaNeuroFuncional;
	@OneToMany
	private List<FichaAvaliacaoNeuroPediatra> fichaNeuroPediatria;
	@OneToMany
	private List<FichaAvaliacaoRespiratoriaAdulto> fichaRespiratoriaAdulto;
	@OneToMany
	private List<FichaAvaliacaoRespiratoriaPediatria> fichaRespiratoriaPediatra;
	@OneToMany
	private List<FichaHidroterapia> fichaHidroterapia;
	@OneToMany
	private List<FichaOrtopediaAlteracaoPostural> fichaOrtopediaAlteracaoPostural;
	@OneToMany
	private List<FichaOrtopedicaAvaliacaoOmbro> fichaOrtopediaAlteracaoOmbro;

	
	
	public List<FichaAvaliacaoFibromialgia> getFichaFibromialgia() {
		return fichaFibromialgia;
	}
	public void setFichaFibromialgia(
			List<FichaAvaliacaoFibromialgia> fichaFibromialgia) {
		this.fichaFibromialgia = fichaFibromialgia;
	}
	public List<FichaAvaliacaoNeuroFuncional> getFichaNeuroFuncional() {
		return fichaNeuroFuncional;
	}
	public void setFichaNeuroFuncional(
			List<FichaAvaliacaoNeuroFuncional> fichaNeuroFuncional) {
		this.fichaNeuroFuncional = fichaNeuroFuncional;
	}
	public List<FichaAvaliacaoNeuroPediatra> getFichaNeuroPediatria() {
		return fichaNeuroPediatria;
	}
	public void setFichaNeuroPediatria(
			List<FichaAvaliacaoNeuroPediatra> fichaNeuroPediatria) {
		this.fichaNeuroPediatria = fichaNeuroPediatria;
	}
	public List<FichaAvaliacaoRespiratoriaAdulto> getFichaRespiratoriaAdulto() {
		return fichaRespiratoriaAdulto;
	}
	public void setFichaRespiratoriaAdulto(
			List<FichaAvaliacaoRespiratoriaAdulto> fichaRespiratoriaAdulto) {
		this.fichaRespiratoriaAdulto = fichaRespiratoriaAdulto;
	}
	public List<FichaAvaliacaoRespiratoriaPediatria> getFichaRespiratoriaPediatra() {
		return fichaRespiratoriaPediatra;
	}
	public void setFichaRespiratoriaPediatra(
			List<FichaAvaliacaoRespiratoriaPediatria> fichaRespiratoriaPediatra) {
		this.fichaRespiratoriaPediatra = fichaRespiratoriaPediatra;
	}
	public List<FichaHidroterapia> getFichaHidroterapia() {
		return fichaHidroterapia;
	}
	public void setFichaHidroterapia(List<FichaHidroterapia> fichaHidroterapia) {
		this.fichaHidroterapia = fichaHidroterapia;
	}
	public List<FichaOrtopediaAlteracaoPostural> getFichaOrtopediaAlteracaoPostural() {
		return fichaOrtopediaAlteracaoPostural;
	}
	public void setFichaOrtopediaAlteracaoPostural(
			List<FichaOrtopediaAlteracaoPostural> fichaOrtopediaAlteracaoPostural) {
		this.fichaOrtopediaAlteracaoPostural = fichaOrtopediaAlteracaoPostural;
	}
	public List<FichaOrtopedicaAvaliacaoOmbro> getFichaOrtopediaAlteracaoOmbro() {
		return fichaOrtopediaAlteracaoOmbro;
	}
	public void setFichaOrtopediaAlteracaoOmbro(
			List<FichaOrtopedicaAvaliacaoOmbro> fichaOrtopediaAlteracaoOmbro) {
		this.fichaOrtopediaAlteracaoOmbro = fichaOrtopediaAlteracaoOmbro;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Calendar getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Calendar getDataFim() {
		return dataFim;
	}
	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Anamnese getAnamnese() {
		return anamnese;
	}
	public void setAnamnese(Anamnese anamnese) {
		this.anamnese = anamnese;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getExamesComplementares() {
		return examesComplementares;
	}
	public void setExamesComplementares(String examesComplementares) {
		this.examesComplementares = examesComplementares;
	}
	public String getObjetivoCurtoPrazo() {
		return objetivoCurtoPrazo;
	}
	public void setObjetivoCurtoPrazo(String objetivoCurtoPrazo) {
		this.objetivoCurtoPrazo = objetivoCurtoPrazo;
	}
	public String getObjetivoMedioPrazo() {
		return objetivoMedioPrazo;
	}
	public void setObjetivoMedioPrazo(String objetivoMedioPrazo) {
		this.objetivoMedioPrazo = objetivoMedioPrazo;
	}
	public String getObjetivoLongoPrazo() {
		return objetivoLongoPrazo;
	}
	public void setObjetivoLongoPrazo(String objetivoLongoPrazo) {
		this.objetivoLongoPrazo = objetivoLongoPrazo;
	}
	public String getCondutaCurtoPrazo() {
		return condutaCurtoPrazo;
	}
	public void setCondutaCurtoPrazo(String condutaCurtoPrazo) {
		this.condutaCurtoPrazo = condutaCurtoPrazo;
	}
	public String getCondutaMedioPrazo() {
		return condutaMedioPrazo;
	}
	public void setCondutaMedioPrazo(String condutaMedioPrazo) {
		this.condutaMedioPrazo = condutaMedioPrazo;
	}
	public String getCondutaLongoPrazo() {
		return condutaLongoPrazo;
	}
	public void setCondutaLongoPrazo(String condutaLongoPrazo) {
		this.condutaLongoPrazo = condutaLongoPrazo;
	}
	
	
}
