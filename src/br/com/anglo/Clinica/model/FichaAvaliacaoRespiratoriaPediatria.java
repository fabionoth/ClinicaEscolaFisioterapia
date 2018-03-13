package br.com.anglo.Clinica.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class FichaAvaliacaoRespiratoriaPediatria {
	@Id
	@GeneratedValue
	private Long id;
	@Temporal(TemporalType.DATE)
	private Calendar dataDoTratamento; 
	private String obsProfessor;
	@OneToOne
	private Usuario usuario;
	private String status;
	
	private String fc;
	private String fr;
	private String spo; 
	private String ausculta;
	
	/**Inspeção
	 * 
	 */
	
	private String tosse; 
	private String secrecao;
	private boolean baqueteamentoDeDedo; 
	private boolean ban;
	private boolean tiragemRadio;
	private String tiragemString; 
	private String usoMusculaturaAcessoriaRadio; 
	private String usoMusculaturaAcessoriaString; 
	private String observacoesGerais;
	
	
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
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
	public String getFc() {
		return fc;
	}
	public void setFc(String fc) {
		this.fc = fc;
	}
	public String getFr() {
		return fr;
	}
	public void setFr(String fr) {
		this.fr = fr;
	}
	public String getSpo() {
		return spo;
	}
	public void setSpo(String spo) {
		this.spo = spo;
	}
	public String getAusculta() {
		return ausculta;
	}
	public void setAusculta(String ausculta) {
		this.ausculta = ausculta;
	}
	public String getTosse() {
		return tosse;
	}
	public void setTosse(String tosse) {
		this.tosse = tosse;
	}
	public String getSecrecao() {
		return secrecao;
	}
	public void setSecrecao(String secrecao) {
		this.secrecao = secrecao;
	}
	public boolean isBaqueteamentoDeDedo() {
		return baqueteamentoDeDedo;
	}
	public void setBaqueteamentoDeDedo(boolean baqueteamentoDeDedo) {
		this.baqueteamentoDeDedo = baqueteamentoDeDedo;
	}
	public boolean isBan() {
		return ban;
	}
	public void setBan(boolean ban) {
		this.ban = ban;
	}
	public boolean isTiragemRadio() {
		return tiragemRadio;
	}
	public void setTiragemRadio(boolean tiragemRadio) {
		this.tiragemRadio = tiragemRadio;
	}
	public String getTiragemString() {
		return tiragemString;
	}
	public void setTiragemString(String tiragemString) {
		this.tiragemString = tiragemString;
	}
	public String getUsoMusculaturaAcessoriaRadio() {
		return usoMusculaturaAcessoriaRadio;
	}
	public void setUsoMusculaturaAcessoriaRadio(String usoMusculaturaAcessoriaRadio) {
		this.usoMusculaturaAcessoriaRadio = usoMusculaturaAcessoriaRadio;
	}
	public String getUsoMusculaturaAcessoriaString() {
		return usoMusculaturaAcessoriaString;
	}
	public void setUsoMusculaturaAcessoriaString(
			String usoMusculaturaAcessoriaString) {
		this.usoMusculaturaAcessoriaString = usoMusculaturaAcessoriaString;
	}
	public String getObservacoesGerais() {
		return observacoesGerais;
	}
	public void setObservacoesGerais(String observacoesGerais) {
		this.observacoesGerais = observacoesGerais;
	} 
}
