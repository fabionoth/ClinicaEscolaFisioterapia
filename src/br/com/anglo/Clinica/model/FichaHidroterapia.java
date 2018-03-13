package br.com.anglo.Clinica.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class FichaHidroterapia {
	@Id
	@GeneratedValue
	private Long id;
	@Temporal(TemporalType.DATE)
	private Calendar dataDoTratamento;
	private String obsProfessor;
	@OneToOne
	private Usuario usuario;
	private String status;

	
	private String patologia;
	private String possuiMicoses;
	private String onde;
	private String problemasCardiacos;
	private String quais;
	private String jaEsteveEmContatoComAgua;
	private String possuiFeridasAbertas;
	private String frieiras;
	private String jaTeveAlgumaDisfuncaoUrinariaOuIntestinal;
	private String jaTeveProblemasNoLabirinto;
	private String jaTeveOuTemCriseConvulsivas;
	private String sabeNadarMergulhar;
	private String formaDeEntrarOuSairDaPiscina;

	private String observacoes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getDataDoTratamento() {
		return dataDoTratamento;
	}

	public void setDataDoTratamento(Calendar dataDoTratamento) {
		this.dataDoTratamento = dataDoTratamento;
	}

	public String getObsProfessor() {
		return obsProfessor;
	}

	public void setObsProfessor(String obsProfessor) {
		this.obsProfessor = obsProfessor;
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

	public String getPatologia() {
		return patologia;
	}

	public void setPatologia(String patologia) {
		this.patologia = patologia;
	}

	public String getPossuiMicoses() {
		return possuiMicoses;
	}

	public void setPossuiMicoses(String possuiMicoses) {
		this.possuiMicoses = possuiMicoses;
	}

	public String getOnde() {
		return onde;
	}

	public void setOnde(String onde) {
		this.onde = onde;
	}

	public String getProblemasCardiacos() {
		return problemasCardiacos;
	}

	public void setProblemasCardiacos(String problemasCardiacos) {
		this.problemasCardiacos = problemasCardiacos;
	}

	public String getQuais() {
		return quais;
	}

	public void setQuais(String quais) {
		this.quais = quais;
	}

	public String getJaEsteveEmContatoComAgua() {
		return jaEsteveEmContatoComAgua;
	}

	public void setJaEsteveEmContatoComAgua(String jaEsteveEmContatoComAgua) {
		this.jaEsteveEmContatoComAgua = jaEsteveEmContatoComAgua;
	}

	public String getPossuiFeridasAbertas() {
		return possuiFeridasAbertas;
	}

	public void setPossuiFeridasAbertas(String possuiFeridasAbertas) {
		this.possuiFeridasAbertas = possuiFeridasAbertas;
	}

	public String getFrieiras() {
		return frieiras;
	}

	public void setFrieiras(String frieiras) {
		this.frieiras = frieiras;
	}

	public String getJaTeveAlgumaDisfuncaoUrinariaOuIntestinal() {
		return jaTeveAlgumaDisfuncaoUrinariaOuIntestinal;
	}

	public void setJaTeveAlgumaDisfuncaoUrinariaOuIntestinal(
			String jaTeveAlgumaDisfuncaoUrinariaOuIntestinal) {
		this.jaTeveAlgumaDisfuncaoUrinariaOuIntestinal = jaTeveAlgumaDisfuncaoUrinariaOuIntestinal;
	}

	public String getJaTeveProblemasNoLabirinto() {
		return jaTeveProblemasNoLabirinto;
	}

	public void setJaTeveProblemasNoLabirinto(String jaTeveProblemasNoLabirinto) {
		this.jaTeveProblemasNoLabirinto = jaTeveProblemasNoLabirinto;
	}

	public String getJaTeveOuTemCriseConvulsivas() {
		return jaTeveOuTemCriseConvulsivas;
	}

	public void setJaTeveOuTemCriseConvulsivas(
			String jaTeveOuTemCriseConvulsivas) {
		this.jaTeveOuTemCriseConvulsivas = jaTeveOuTemCriseConvulsivas;
	}

	public String getSabeNadarMergulhar() {
		return sabeNadarMergulhar;
	}

	public void setSabeNadarMergulhar(String sabeNadarMergulhar) {
		this.sabeNadarMergulhar = sabeNadarMergulhar;
	}

	public String getFormaDeEntrarOuSairDaPiscina() {
		return formaDeEntrarOuSairDaPiscina;
	}

	public void setFormaDeEntrarOuSairDaPiscina(
			String formaDeEntrarOuSairDaPiscina) {
		this.formaDeEntrarOuSairDaPiscina = formaDeEntrarOuSairDaPiscina;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
}
