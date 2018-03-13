package br.com.anglo.Clinica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Triagem {
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String problema;
	@Column
	private String quandoAconteceu;
	@Column
	private String fezCirurgiaQuando;
	@Column
	private String estaCaminhando;
	@Column
	private String caminhandoUsaMuletaCadeiraRodas;
	@Column
	private String encaminhamento;
	@Column
	private String jaFezFisioterapiaAqui;
	@Column
	private String jaFezFisiotarapiaParaEsteProblema;
	@Column
	private String transporte;
	@Column
	private String obs;
	@Column
	private String area;
	@Column
	private String statusTriagem;
	@OneToOne
	private Usuario usuario;
	@OneToOne
	private Paciente paciente;
	@Column
	private String prioridade;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public String getQuandoAconteceu() {
		return quandoAconteceu;
	}

	public void setQuandoAconteceu(String quandoAconteceu) {
		this.quandoAconteceu = quandoAconteceu;
	}

	public String getFezCirurgiaQuando() {
		return fezCirurgiaQuando;
	}

	public void setFezCirurgiaQuando(String fezCirurgiaQuando) {
		this.fezCirurgiaQuando = fezCirurgiaQuando;
	}

	public String getEstaCaminhando() {
		return estaCaminhando;
	}

	public void setEstaCaminhando(String estaCaminhando) {
		this.estaCaminhando = estaCaminhando;
	}

	public String getCaminhandoUsaMuletaCadeiraRodas() {
		return caminhandoUsaMuletaCadeiraRodas;
	}

	public void setCaminhandoUsaMuletaCadeiraRodas(
			String caminhandoUsaMuletaCadeiraRodas) {
		this.caminhandoUsaMuletaCadeiraRodas = caminhandoUsaMuletaCadeiraRodas;
	}

	public String getEncaminhamento() {
		return encaminhamento;
	}

	public void setEncaminhamento(String encaminhamento) {
		this.encaminhamento = encaminhamento;
	}

	public String getJaFezFisioterapiaAqui() {
		return jaFezFisioterapiaAqui;
	}

	public void setJaFezFisioterapiaAqui(String jaFezFisioterapiaAqui) {
		this.jaFezFisioterapiaAqui = jaFezFisioterapiaAqui;
	}

	public String getJaFezFisiotarapiaParaEsteProblema() {
		return jaFezFisiotarapiaParaEsteProblema;
	}

	public void setJaFezFisiotarapiaParaEsteProblema(
			String jaFezFisiotarapiaParaEsteProblema) {
		this.jaFezFisiotarapiaParaEsteProblema = jaFezFisiotarapiaParaEsteProblema;
	}

	public String getTransporte() {
		return transporte;
	}

	public void setTransporte(String transporte) {
		this.transporte = transporte;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getStatusTriagem() {
		return statusTriagem;
	}

	public void setStatusTriagem(String statusTriagem) {
		this.statusTriagem = statusTriagem;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}
}
