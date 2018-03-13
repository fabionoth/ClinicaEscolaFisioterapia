package br.com.anglo.Clinica.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Anamnese {
	@Id
	@GeneratedValue
	private Long id;
	private Calendar dataDeCadastro;
	private String queixaPrincipal;
	private String diagnosticoClinico;
	private String diagnosticoFisioterapeutico;
	private String historiaFuncional;
	private String historiaDaPatologiaAtual;
	private String historiaDePatologiasPregressas;
	private String historiaFamiliar;
	private String habitosDeVida;
	private String medicacao;
	private String descricao;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQueixaPrincipal() {
		return queixaPrincipal;
	}
	public void setQueixaPrincipal(String queixaPrincipal) {
		this.queixaPrincipal = queixaPrincipal;
	}
	public String getDiagnosticoClinico() {
		return diagnosticoClinico;
	}
	public void setDiagnosticoClinico(String diagnosticoClinico) {
		this.diagnosticoClinico = diagnosticoClinico;
	}
	public String getDiagnosticoFisioterapeutico() {
		return diagnosticoFisioterapeutico;
	}
	public void setDiagnosticoFisioterapeutico(String diagnosticoFisioterapeutico) {
		this.diagnosticoFisioterapeutico = diagnosticoFisioterapeutico;
	}
	public String getHistoriaFuncional() {
		return historiaFuncional;
	}
	public void setHistoriaFuncional(String historiaFuncional) {
		this.historiaFuncional = historiaFuncional;
	}
	public String getHistoriaDaPatologiaAtual() {
		return historiaDaPatologiaAtual;
	}
	public void setHistoriaDaPatologiaAtual(String historiaDaPatologiaAtual) {
		this.historiaDaPatologiaAtual = historiaDaPatologiaAtual;
	}
	public String getHistoriaDePatologiasPregressas() {
		return historiaDePatologiasPregressas;
	}
	public void setHistoriaDePatologiasPregressas(
			String historiaDePatologiasPregressas) {
		this.historiaDePatologiasPregressas = historiaDePatologiasPregressas;
	}
	public String getHistoriaFamiliar() {
		return historiaFamiliar;
	}
	public void setHistoriaFamiliar(String historiaFamiliar) {
		this.historiaFamiliar = historiaFamiliar;
	}
	public String getHabitosDeVida() {
		return habitosDeVida;
	}
	public void setHabitosDeVida(String habitosDeVida) {
		this.habitosDeVida = habitosDeVida;
	}
	public String getMedicacao() {
		return medicacao;
	}
	public void setMedicacao(String medicacao) {
		this.medicacao = medicacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Calendar getDataDeCadastro() {
		return dataDeCadastro;
	}
	public void setDataDeCadastro(Calendar dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}
	
}
