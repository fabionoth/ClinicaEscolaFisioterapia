package br.com.anglo.Clinica.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class FichaAvaliacaoFibromialgia {
	@Id
	@GeneratedValue
	private Long id;
	@Temporal(TemporalType.DATE)
	private Calendar dataDoTratamento; 
	private String obsProfessor;
	@OneToOne
	private Usuario usuario; 
	private String status;
	
	private String inspecao; 
	private String postInsercaoDoMusculo; 
	private String postTrapezio; 
	private String postSupra;
	private String postGluteo; 
	
	private String antCervicalBaixo; 
	private String antEspacoCosto;
	
	private String epicon; 
	private String trocant; 
	private String joelho;
	
	
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
	public String getInspecao() {
		return inspecao;
	}
	public void setInspecao(String inspecao) {
		this.inspecao = inspecao;
	}
	public String getPostInsercaoDoMusculo() {
		return postInsercaoDoMusculo;
	}
	public void setPostInsercaoDoMusculo(String postInsercaoDoMusculo) {
		this.postInsercaoDoMusculo = postInsercaoDoMusculo;
	}
	public String getPostTrapezio() {
		return postTrapezio;
	}
	public void setPostTrapezio(String postTrapezio) {
		this.postTrapezio = postTrapezio;
	}
	public String getPostSupra() {
		return postSupra;
	}
	public void setPostSupra(String postSupra) {
		this.postSupra = postSupra;
	}
	public String getPostGluteo() {
		return postGluteo;
	}
	public void setPostGluteo(String postGluteo) {
		this.postGluteo = postGluteo;
	}
	public String getAntCervicalBaixo() {
		return antCervicalBaixo;
	}
	public void setAntCervicalBaixo(String antCervicalBaixo) {
		this.antCervicalBaixo = antCervicalBaixo;
	}
	public String getAntEspacoCosto() {
		return antEspacoCosto;
	}
	public void setAntEspacoCosto(String antEspacoCosto) {
		this.antEspacoCosto = antEspacoCosto;
	}
	public String getEpicon() {
		return epicon;
	}
	public void setEpicon(String epicon) {
		this.epicon = epicon;
	}
	public String getTrocant() {
		return trocant;
	}
	public void setTrocant(String trocant) {
		this.trocant = trocant;
	}
	public String getJoelho() {
		return joelho;
	}
	public void setJoelho(String joelho) {
		this.joelho = joelho;
	}
}
