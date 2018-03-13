package br.com.anglo.Clinica.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class FichaAvaliacaoRespiratoriaAdulto {
	@Id
	@GeneratedValue
	private Long id;
	@Temporal(TemporalType.DATE)
	private Calendar dataDoTratamento; 
	private String obsProfessor;
	@OneToOne
	private Usuario usuario; 
	private String status;
	
	/**
	 * Habitos de Vida
	 */
	private String tabagismoRadio;
	private String tabagismoDescr;
	private String etilistaRadio;
	private String estilistaDescr;
	private String atividadeFisicaRadio;
	private String atividadeFisicaDescri;
	
	/**
	 * Exame Fisico
	 */
	
	private String fc;
	private String fr;
	private String pa;
	private String sp02;
	private String ausculta;
	
	/**
	 * Cirtometria
	 */
	private String axilarEstaticaA;
	private String axilarEstaticaB;
	private String axilarEstaticaC;
	private String axilarEstaticaInspA;
	private String axilarEstaticainspB;
	private String axilarEstaticaInspC;
	private String axilarEstaticaExpcA;
	private String axilarEstaticaExpcB;
	private String axilarEstaticaExpcC;
	private String axilarEstaticaIndice; 
	private String xifoidianaEstaticaA;
	private String xifoidianaEstaticaB;
	private String xifoidianaEstaticaC;
	private String xifoidianaEstaticaInspA;
	private String xifoidianaEstaticaInspB;
	private String xifoidianaEstaticaInspC;
	private String xifoidianaEstaticaExpcA;
	private String xifoidianaEstaticaExpcB;
	private String xifoidianaEstaticaExpcC;
	private String xifoidianaEstaticaIndice;
	private String umbilicalEstaticaA;
	private String umbilicalEstaticaB;
	private String umbilicalEstaticaC;
	private String umbilicalEstaticaInspA;
	private String umbilicalEstaticaInspB;
	private String umbilicalEstaticaInspC;
	private String umbilicalEstaticaExpA;
	private String umbilicalEstaticaExpB;
	private String umbilicalEstaticaExpC;
	private String umbilicalEstaticaIndice;
	private String expansibilidade; 
	
	
	/**Inspeção
	 * 
	 */
	
	private String tipoDeTorax;
	private String tipoDeTosse;
	private String screcao;
	private String padraoRespiratorio;
	private String baqueteamentoDeDedo;
	//Sinais de Esforço Respiratorio
	private String ban;
	private String tiragtem;
	private String edema;
	private String deformidades;
	
	
	//TextoGrande
	private String examesComplementares;
	
	
	//Texto Gsrande
	private String observacoesGerais; 
	private String encurtamentoMuscular; 
	private String forcaMuscular; 
	private String testesEspecificos;
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
	public String getTabagismoRadio() {
		return tabagismoRadio;
	}
	public void setTabagismoRadio(String tabagismoRadio) {
		this.tabagismoRadio = tabagismoRadio;
	}
	public String getTabagismoDescr() {
		return tabagismoDescr;
	}
	public void setTabagismoDescr(String tabagismoDescr) {
		this.tabagismoDescr = tabagismoDescr;
	}
	public String getEtilistaRadio() {
		return etilistaRadio;
	}
	public void setEtilistaRadio(String etilistaRadio) {
		this.etilistaRadio = etilistaRadio;
	}
	public String getEstilistaDescr() {
		return estilistaDescr;
	}
	public void setEstilistaDescr(String estilistaDescr) {
		this.estilistaDescr = estilistaDescr;
	}
	public String getAtividadeFisicaRadio() {
		return atividadeFisicaRadio;
	}
	public void setAtividadeFisicaRadio(String atividadeFisicaRadio) {
		this.atividadeFisicaRadio = atividadeFisicaRadio;
	}
	public String getAtividadeFisicaDescri() {
		return atividadeFisicaDescri;
	}
	public void setAtividadeFisicaDescri(String atividadeFisicaDescri) {
		this.atividadeFisicaDescri = atividadeFisicaDescri;
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
	public String getPa() {
		return pa;
	}
	public void setPa(String pa) {
		this.pa = pa;
	}
	public String getSp02() {
		return sp02;
	}
	public void setSp02(String sp02) {
		this.sp02 = sp02;
	}
	public String getAusculta() {
		return ausculta;
	}
	public void setAusculta(String ausculta) {
		this.ausculta = ausculta;
	}
	public String getAxilarEstaticaA() {
		return axilarEstaticaA;
	}
	public void setAxilarEstaticaA(String axilarEstaticaA) {
		this.axilarEstaticaA = axilarEstaticaA;
	}
	public String getAxilarEstaticaB() {
		return axilarEstaticaB;
	}
	public void setAxilarEstaticaB(String axilarEstaticaB) {
		this.axilarEstaticaB = axilarEstaticaB;
	}
	public String getAxilarEstaticaC() {
		return axilarEstaticaC;
	}
	public void setAxilarEstaticaC(String axilarEstaticaC) {
		this.axilarEstaticaC = axilarEstaticaC;
	}
	public String getAxilarEstaticaInspA() {
		return axilarEstaticaInspA;
	}
	public void setAxilarEstaticaInspA(String axilarEstaticaInspA) {
		this.axilarEstaticaInspA = axilarEstaticaInspA;
	}
	public String getAxilarEstaticainspB() {
		return axilarEstaticainspB;
	}
	public void setAxilarEstaticainspB(String axilarEstaticainspB) {
		this.axilarEstaticainspB = axilarEstaticainspB;
	}
	public String getAxilarEstaticaInspC() {
		return axilarEstaticaInspC;
	}
	public void setAxilarEstaticaInspC(String axilarEstaticaInspC) {
		this.axilarEstaticaInspC = axilarEstaticaInspC;
	}
	public String getAxilarEstaticaExpcA() {
		return axilarEstaticaExpcA;
	}
	public void setAxilarEstaticaExpcA(String axilarEstaticaExpcA) {
		this.axilarEstaticaExpcA = axilarEstaticaExpcA;
	}
	public String getAxilarEstaticaExpcB() {
		return axilarEstaticaExpcB;
	}
	public void setAxilarEstaticaExpcB(String axilarEstaticaExpcB) {
		this.axilarEstaticaExpcB = axilarEstaticaExpcB;
	}
	public String getAxilarEstaticaExpcC() {
		return axilarEstaticaExpcC;
	}
	public void setAxilarEstaticaExpcC(String axilarEstaticaExpcC) {
		this.axilarEstaticaExpcC = axilarEstaticaExpcC;
	}
	public String getAxilarEstaticaIndice() {
		return axilarEstaticaIndice;
	}
	public void setAxilarEstaticaIndice(String axilarEstaticaIndice) {
		this.axilarEstaticaIndice = axilarEstaticaIndice;
	}
	public String getXifoidianaEstaticaA() {
		return xifoidianaEstaticaA;
	}
	public void setXifoidianaEstaticaA(String xifoidianaEstaticaA) {
		this.xifoidianaEstaticaA = xifoidianaEstaticaA;
	}
	public String getXifoidianaEstaticaB() {
		return xifoidianaEstaticaB;
	}
	public void setXifoidianaEstaticaB(String xifoidianaEstaticaB) {
		this.xifoidianaEstaticaB = xifoidianaEstaticaB;
	}
	public String getXifoidianaEstaticaC() {
		return xifoidianaEstaticaC;
	}
	public void setXifoidianaEstaticaC(String xifoidianaEstaticaC) {
		this.xifoidianaEstaticaC = xifoidianaEstaticaC;
	}
	public String getXifoidianaEstaticaInspA() {
		return xifoidianaEstaticaInspA;
	}
	public void setXifoidianaEstaticaInspA(String xifoidianaEstaticaInspA) {
		this.xifoidianaEstaticaInspA = xifoidianaEstaticaInspA;
	}
	public String getXifoidianaEstaticaInspB() {
		return xifoidianaEstaticaInspB;
	}
	public void setXifoidianaEstaticaInspB(String xifoidianaEstaticaInspB) {
		this.xifoidianaEstaticaInspB = xifoidianaEstaticaInspB;
	}
	public String getXifoidianaEstaticaInspC() {
		return xifoidianaEstaticaInspC;
	}
	public void setXifoidianaEstaticaInspC(String xifoidianaEstaticaInspC) {
		this.xifoidianaEstaticaInspC = xifoidianaEstaticaInspC;
	}
	public String getXifoidianaEstaticaExpcA() {
		return xifoidianaEstaticaExpcA;
	}
	public void setXifoidianaEstaticaExpcA(String xifoidianaEstaticaExpcA) {
		this.xifoidianaEstaticaExpcA = xifoidianaEstaticaExpcA;
	}
	public String getXifoidianaEstaticaExpcB() {
		return xifoidianaEstaticaExpcB;
	}
	public void setXifoidianaEstaticaExpcB(String xifoidianaEstaticaExpcB) {
		this.xifoidianaEstaticaExpcB = xifoidianaEstaticaExpcB;
	}
	public String getXifoidianaEstaticaExpcC() {
		return xifoidianaEstaticaExpcC;
	}
	public void setXifoidianaEstaticaExpcC(String xifoidianaEstaticaExpcC) {
		this.xifoidianaEstaticaExpcC = xifoidianaEstaticaExpcC;
	}
	public String getXifoidianaEstaticaIndice() {
		return xifoidianaEstaticaIndice;
	}
	public void setXifoidianaEstaticaIndice(String xifoidianaEstaticaIndice) {
		this.xifoidianaEstaticaIndice = xifoidianaEstaticaIndice;
	}
	public String getUmbilicalEstaticaA() {
		return umbilicalEstaticaA;
	}
	public void setUmbilicalEstaticaA(String umbilicalEstaticaA) {
		this.umbilicalEstaticaA = umbilicalEstaticaA;
	}
	public String getUmbilicalEstaticaB() {
		return umbilicalEstaticaB;
	}
	public void setUmbilicalEstaticaB(String umbilicalEstaticaB) {
		this.umbilicalEstaticaB = umbilicalEstaticaB;
	}
	public String getUmbilicalEstaticaC() {
		return umbilicalEstaticaC;
	}
	public void setUmbilicalEstaticaC(String umbilicalEstaticaC) {
		this.umbilicalEstaticaC = umbilicalEstaticaC;
	}
	public String getUmbilicalEstaticaInspA() {
		return umbilicalEstaticaInspA;
	}
	public void setUmbilicalEstaticaInspA(String umbilicalEstaticaInspA) {
		this.umbilicalEstaticaInspA = umbilicalEstaticaInspA;
	}
	public String getUmbilicalEstaticaInspB() {
		return umbilicalEstaticaInspB;
	}
	public void setUmbilicalEstaticaInspB(String umbilicalEstaticaInspB) {
		this.umbilicalEstaticaInspB = umbilicalEstaticaInspB;
	}
	public String getUmbilicalEstaticaInspC() {
		return umbilicalEstaticaInspC;
	}
	public void setUmbilicalEstaticaInspC(String umbilicalEstaticaInspC) {
		this.umbilicalEstaticaInspC = umbilicalEstaticaInspC;
	}
	public String getUmbilicalEstaticaExpA() {
		return umbilicalEstaticaExpA;
	}
	public void setUmbilicalEstaticaExpA(String umbilicalEstaticaExpA) {
		this.umbilicalEstaticaExpA = umbilicalEstaticaExpA;
	}
	public String getUmbilicalEstaticaExpB() {
		return umbilicalEstaticaExpB;
	}
	public void setUmbilicalEstaticaExpB(String umbilicalEstaticaExpB) {
		this.umbilicalEstaticaExpB = umbilicalEstaticaExpB;
	}
	public String getUmbilicalEstaticaExpC() {
		return umbilicalEstaticaExpC;
	}
	public void setUmbilicalEstaticaExpC(String umbilicalEstaticaExpC) {
		this.umbilicalEstaticaExpC = umbilicalEstaticaExpC;
	}
	public String getUmbilicalEstaticaIndice() {
		return umbilicalEstaticaIndice;
	}
	public void setUmbilicalEstaticaIndice(String umbilicalEstaticaIndice) {
		this.umbilicalEstaticaIndice = umbilicalEstaticaIndice;
	}
	public String getExpansibilidade() {
		return expansibilidade;
	}
	public void setExpansibilidade(String expansibilidade) {
		this.expansibilidade = expansibilidade;
	}
	public String getTipoDeTorax() {
		return tipoDeTorax;
	}
	public void setTipoDeTorax(String tipoDeTorax) {
		this.tipoDeTorax = tipoDeTorax;
	}
	public String getTipoDeTosse() {
		return tipoDeTosse;
	}
	public void setTipoDeTosse(String tipoDeTosse) {
		this.tipoDeTosse = tipoDeTosse;
	}
	public String getScrecao() {
		return screcao;
	}
	public void setScrecao(String screcao) {
		this.screcao = screcao;
	}
	public String getPadraoRespiratorio() {
		return padraoRespiratorio;
	}
	public void setPadraoRespiratorio(String padraoRespiratorio) {
		this.padraoRespiratorio = padraoRespiratorio;
	}
	public String getBaqueteamentoDeDedo() {
		return baqueteamentoDeDedo;
	}
	public void setBaqueteamentoDeDedo(String baqueteamentoDeDedo) {
		this.baqueteamentoDeDedo = baqueteamentoDeDedo;
	}
	public String getBan() {
		return ban;
	}
	public void setBan(String ban) {
		this.ban = ban;
	}
	public String getTiragtem() {
		return tiragtem;
	}
	public void setTiragtem(String tiragtem) {
		this.tiragtem = tiragtem;
	}
	public String getEdema() {
		return edema;
	}
	public void setEdema(String edema) {
		this.edema = edema;
	}
	public String getDeformidades() {
		return deformidades;
	}
	public void setDeformidades(String deformidades) {
		this.deformidades = deformidades;
	}
	public String getExamesComplementares() {
		return examesComplementares;
	}
	public void setExamesComplementares(String examesComplementares) {
		this.examesComplementares = examesComplementares;
	}
	public String getObservacoesGerais() {
		return observacoesGerais;
	}
	public void setObservacoesGerais(String observacoesGerais) {
		this.observacoesGerais = observacoesGerais;
	}
	public String getEncurtamentoMuscular() {
		return encurtamentoMuscular;
	}
	public void setEncurtamentoMuscular(String encurtamentoMuscular) {
		this.encurtamentoMuscular = encurtamentoMuscular;
	}
	public String getForcaMuscular() {
		return forcaMuscular;
	}
	public void setForcaMuscular(String forcaMuscular) {
		this.forcaMuscular = forcaMuscular;
	}
	public String getTestesEspecificos() {
		return testesEspecificos;
	}
	public void setTestesEspecificos(String testesEspecificos) {
		this.testesEspecificos = testesEspecificos;
	} 
	
	
	
	
}
