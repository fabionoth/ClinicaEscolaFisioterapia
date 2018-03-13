package br.com.anglo.Clinica.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class FichaOrtopedicaAvaliacaoOmbro {
	@Id
	@GeneratedValue
	private Long id;
	@Temporal(TemporalType.DATE)
	private Calendar dataDoTratamento; 
	private String obsProfessor;
	@OneToOne
	private Usuario usuario; 
	private String status;

	
	private String contornosAnatomicos;
	private String avaliacaoPostural;
	private String ritmoDoMenbroSuperior;
	private String alteracoesCutaneas;
	private String outros; 
	
	/**
	 * 4 - PALPAÇÃO
	 * Estrutura Anatômica
	 */
	
	private String incisuraSupraEsternalDireito;
	private String incisuraSupraEsternalEsquerdo;
	private String claviculaDireito;
	private String claviculaEsquerda; 
	private String articulacaoAcromioClavicularDireito;
	private String articulacaoAcromioClavicularEsquerdo;
	private String articulacaoAcromioDireito;
	private String articulacaoAcromioEsquerdo;
	private String acromioEsquerdo;
	private String acromioDireito;
	private String processoCoracoideDireito;
	private String processoCoracoideEsquerdo;
	private String tuberculoMaiordoUmeroDireito;
	private String tuberculoMaiordoUmeroEsquerdo;
	private String tuberculoMenordoUmeroDireito;
	private String tuberculoMenordoUmeroEsquerdo;
	private String incisuraBiciptalDireito;
	private String incisuraBiciptalEsquerdo;
	private String espinhaDaEscapulaDireito;
	private String espinhaDaEscapulaEsquerdo;
	private String bordaMedialDaEscapulaDireito;
	private String bordaMedialDaEscapulaEsquerdo;
	private String musculoEsternocleiDireito;
	private String musculoEsternocleiEsquerdo;
	private String musculoEscalenoDireito;
	private String musculoEscalenoEsquerdo;
	private String musculoTrapezioSuperiorDireito;
	private String musculoTrapezioSuperiorEsquerdo;
	private String musucloTrapezioMedioDireito;
	private String musculoTrapezioMedioEsquerdo;
	private String musculoTrapezioInferiorDireito;
	private String musculoTrapezioInferiorEsquerdo; 
	private String musculoRomboidesDireito;
	private String musculoRomboidesEsquerdo;
	private String musculoSupraEspinhosoDireito;
	private String musculoSupraEspinhosoEsquerdo;
	private String musculoInfraEspinhoDireito;
	private String musculoInfraEspinhoEsquerdo;
	private String redondoMenorDireito;
	private String dedondoMenorEsquerdo;
	private String musculoRedondoMaiorDireito;
	private String musucloRedondoMaiorEsquerdo;
	private String musculoDeltoideDireito;
	private String musculoDeltoideEsquerdo;
	private String bolsaSubcromialDireito;
	private String bolsaSubcromialEsquerdo;
	private String musucloPeitoralMaiorDireito;
	private String musculoPeitoralMaiorEsquerdo;
	private String musculoBicepsCabecaLongaDireita;
	private String musculoBicepsCabecaLongaEsquerda;
	private String musculoBicepsCabecaCurtaDireita;
	private String musculoBicepsCabecaCurtaEsquerda;
	private String tendaoDaCabecaLongaDireita;
	private String tendaoDaCabecaLongaEsquerda; 
	private String musculoTricepsDireito;
	private String musculoTricepsEsquerdo; 
	
	/**
	 * MOBILIDADE
	 */
	private String rotacaoExternaAbducaoCervicaoDireita;
	private String rotacaoExternaAbducaoCervicaoEsquerda;
	
	private String rotacaoExternaAbducaoAnguloSuperiorDaEscapulaDireito;
	private String rotacaoExternaAbducaoAnguloSuperiorDaEscapulaEsquerdo;
	
	private String rotacaoInternaAbducaoAcronimoContralateralDireito;
	private String rotacaoInternaAbducaoAcronimoContralateralEsquerdo;
	
	private String rotacaoInternaAducaoAnguloInferiorDireito;
	private String rotacaoInternaAducaoAnguloInferiorEsquerdo;
	
	/**
	 * AMPLIUDE DE MOVIMENTO
	 */
	private String goniometriaAtivaDireitoAbducao;
	private String goniometriaAtivaDireitoAducao;
	private String goniometriaAtivaDireitoFlexao;
	private String goniometriaAtivaDireitoExtensao;
	private String goniometriaAtivaDireitoRotacaoInterna;
	private String goniometriaAtivaDireitoRotacaoExterna;
	private String goniometriaAtivaDireitoAbducaoHorizontal;
	private String goniometriaAtivaDireitoAducaoHorizontal;
	
	private String goniometriaAtivaEsquerdaAbducao;
	private String goniometriaAtivaEsquerdaAducao;
	private String goniometriaAtivaEsquerdaFlexao;
	private String goniometriaAtivaEsquerdaExtensao;
	private String goniometriaAtivaEsquerdaRotacaoInterna;
	private String goniometriaAtivaEsquerdaRotacaoExterna;
	private String goniometriaAtivaEsquerdaAbudacaoExterna;
	private String goniometriaAtivaEsquerdaAducaoExterna;
	
	private String goniometriaPassivaDireitoAbducao;
	private String goniometriaPassivaDireitoAducao;
	private String goniometriaPassivaDireitoFlexao;
	private String goniometriaPassivaDireitoExtensao;
	private String goniometriaPassivaDireitoRotacaoInterna;
	private String goniometriaPassivaDireitoRotacaoExterna;
	private String goniometriaPassivaDireitoAbudaoHorizontal;
	private String goniometriaPassivaDireitoAducaoHorizontal;
	
	private String goniometriaPassivaEsquerdaAbducao;
	private String goniometriaPassivaEsquerdaAducao;
	private String goniometriaPassivaEsquerdaFlexao;
	private String goniometriaPassivaEsquerdaExtensao;
	private String goniometriaPassivaEsquerdaRotacaoInterna;
	private String goniometriaPassivaEsquerdaRotacaoExterna;
	private String goniometriaPassivaEsquerdaAbucaoHorizontal;
	private String goniometriaPassivaEsquerdaAducaoHorizontal;
	
	
	/**
	 *  Força Muscular
	 */
	
	private String muscularAbducaoDireito;
	private String muscularAbducaoEsquerdo;
	private String muscularAbucaoDireito;
	private String muscularAbucaoEsquerdo;
	private String muscularFlexaoDireito;
	private String muscularFlexaoEsquerdo;
	private String muscularExtencaoDireito;
	private String muscularExtencaoEsquerdo;
	private String muscularRotacaoInternaDireito;
	private String muscularRotacaoInternaEsquerdo;
	private String muscularRotacaoExternaDireito;
	private String muscularRotacaoExternaEsquerdo;
	private String muscularAbducaoHorizontalDireita;
	private String muscularAbducaoHorizontalEsquerda; 
	private String muscularAducaoHorizontalDireita;
	private String muscularAducaoHorizontalEsquerda; 
	private String muscularElevacaoHorizontal;
	private String muscularElevacaoDaEscapulaDireita;
	private String muscularElevacaoDaEscapulaEsquerda;
	private String muscularRetracaoDaEscapulaDireita;
	private String muscularRetracaoDaEscapulaEsquerda;
	private String muscularProtusaoDaEscapulaDireita;
	private String muscularProtusaoDaEscapulaEsquerda;
	
	
	/**
	 * Encurtamento Muscular
	 */
	private String encurtamentoTrapezioSuperiorDireito;
	private String encurtamentoTrapezioSuperiorEsquerdo;
	private String encurtamentoPeitoralMaiorDireito;
	private String encurtamentoPeitoralMaiorEsquerdo;
	private String encurtamentoPeitoralMenorDireito;
	private String encurtamentoPeitoralMenorEsquerdo;
	private String encurtamentoGrandeDorsalDireito;
	private String encurtamentoGrandeDorsalEsquerdo;
	
	
	/**
	 * Reflexos
	 */
	private String reflexoBiciptalDireito;
	private String reflexoBiciptalEsquerdo;
	private String reflexoTriciptalDireito;
	private String reflexoTriciptalEsquerdo;
	
	/**
	 * Teste de Sensibilidade
	 */
	private String sensC4Direito;
	private String sensC4Esquerdo;
	private String sensC5Direito;
	private String sensC5Esquerdo;
	private String sensC6Direito;
	private String sensC6Esquerdo;
	private String sensC7Direito;
	private String sensC7Esquerdo;
	private String sensC8Direito;
	private String sensC8Esquerdo;
	private String sensT1Direito;
	private String sensT1Esquerdo;
	private String sensT2Direito;
	private String sensT2Esquerdo;
	
	/**
	 * Testes Especiais
	 */
	
	private String impactoDeNeerDireito;
	private String impactoDeNeerEsquerdo;
	private String impactoDeHawkinsDireito;
	private String impactoDeHawkinsEsquerdo;
	private String impactoDeYokunDireito;
	private String impactoDeYokunEsquerdo;
	private String supraEspinhosoDireito;
	private String supraEspinhosoEsquerdo;
	private String jobeDireito;
	private String jobeEsquerdo;
	private String palmDireito;
	private String palmEsquerdo;
	private String infraDireito;
	private String infraEsquerdo;
	private String patteDireito;
	private String patteEsquerdo;
	private String rotacaoExternaDireito;
	private String rotacaoExternaEsquerda;
	private String quedaDoBracoDireita;
	private String quedaDoBracoEsquerda;
	private String gerberDireito;
	private String gerberEsquerdo;
	private String compressaoDireito;
	private String comprressadoEsquerdo;
	private String yeargassonDireito;
	private String yeargassonEsquerda;
	private String apreensaoDireito;
	private String apreensaoEsquerda;
	private String instabilidadePosteriorDireita;
	private String instabilidadePosteriorEsquerdo;
	private String gavetaAnteriorDireito;
	private String gavetaAnteriorEsquerdo;
	private String gavetaPosteriorDireito;
	private String gavetaPosteriorEsquerdo;
	private String sulcoOuSinalDeDragonaDireito;
	private String sulcoOuSinalDeDragonaEsquerdo;
	
	
	
	
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
	public String getContornosAnatomicos() {
		return contornosAnatomicos;
	}
	public void setContornosAnatomicos(String contornosAnatomicos) {
		this.contornosAnatomicos = contornosAnatomicos;
	}
	public String getAvaliacaoPostural() {
		return avaliacaoPostural;
	}
	public void setAvaliacaoPostural(String avaliacaoPostural) {
		this.avaliacaoPostural = avaliacaoPostural;
	}
	public String getRitmoDoMenbroSuperior() {
		return ritmoDoMenbroSuperior;
	}
	public void setRitmoDoMenbroSuperior(String ritmoDoMenbroSuperior) {
		this.ritmoDoMenbroSuperior = ritmoDoMenbroSuperior;
	}
	public String getAlteracoesCutaneas() {
		return alteracoesCutaneas;
	}
	public void setAlteracoesCutaneas(String alteracoesCutaneas) {
		this.alteracoesCutaneas = alteracoesCutaneas;
	}
	public String getOutros() {
		return outros;
	}
	public void setOutros(String outros) {
		this.outros = outros;
	}
	public String getIncisuraSupraEsternalDireito() {
		return incisuraSupraEsternalDireito;
	}
	public void setIncisuraSupraEsternalDireito(String incisuraSupraEsternalDireito) {
		this.incisuraSupraEsternalDireito = incisuraSupraEsternalDireito;
	}
	public String getIncisuraSupraEsternalEsquerdo() {
		return incisuraSupraEsternalEsquerdo;
	}
	public void setIncisuraSupraEsternalEsquerdo(
			String incisuraSupraEsternalEsquerdo) {
		this.incisuraSupraEsternalEsquerdo = incisuraSupraEsternalEsquerdo;
	}
	public String getClaviculaDireito() {
		return claviculaDireito;
	}
	public void setClaviculaDireito(String claviculaDireito) {
		this.claviculaDireito = claviculaDireito;
	}
	public String getClaviculaEsquerda() {
		return claviculaEsquerda;
	}
	public void setClaviculaEsquerda(String claviculaEsquerda) {
		this.claviculaEsquerda = claviculaEsquerda;
	}
	public String getArticulacaoAcromioClavicularDireito() {
		return articulacaoAcromioClavicularDireito;
	}
	public void setArticulacaoAcromioClavicularDireito(
			String articulacaoAcromioClavicularDireito) {
		this.articulacaoAcromioClavicularDireito = articulacaoAcromioClavicularDireito;
	}
	public String getArticulacaoAcromioClavicularEsquerdo() {
		return articulacaoAcromioClavicularEsquerdo;
	}
	public void setArticulacaoAcromioClavicularEsquerdo(
			String articulacaoAcromioClavicularEsquerdo) {
		this.articulacaoAcromioClavicularEsquerdo = articulacaoAcromioClavicularEsquerdo;
	}
	public String getArticulacaoAcromioDireito() {
		return articulacaoAcromioDireito;
	}
	public void setArticulacaoAcromioDireito(String articulacaoAcromioDireito) {
		this.articulacaoAcromioDireito = articulacaoAcromioDireito;
	}
	public String getArticulacaoAcromioEsquerdo() {
		return articulacaoAcromioEsquerdo;
	}
	public void setArticulacaoAcromioEsquerdo(String articulacaoAcromioEsquerdo) {
		this.articulacaoAcromioEsquerdo = articulacaoAcromioEsquerdo;
	}
	public String getAcromioEsquerdo() {
		return acromioEsquerdo;
	}
	public void setAcromioEsquerdo(String acromioEsquerdo) {
		this.acromioEsquerdo = acromioEsquerdo;
	}
	public String getAcromioDireito() {
		return acromioDireito;
	}
	public void setAcromioDireito(String acromioDireito) {
		this.acromioDireito = acromioDireito;
	}
	public String getProcessoCoracoideDireito() {
		return processoCoracoideDireito;
	}
	public void setProcessoCoracoideDireito(String processoCoracoideDireito) {
		this.processoCoracoideDireito = processoCoracoideDireito;
	}
	public String getProcessoCoracoideEsquerdo() {
		return processoCoracoideEsquerdo;
	}
	public void setProcessoCoracoideEsquerdo(String processoCoracoideEsquerdo) {
		this.processoCoracoideEsquerdo = processoCoracoideEsquerdo;
	}
	public String getTuberculoMaiordoUmeroDireito() {
		return tuberculoMaiordoUmeroDireito;
	}
	public void setTuberculoMaiordoUmeroDireito(String tuberculoMaiordoUmeroDireito) {
		this.tuberculoMaiordoUmeroDireito = tuberculoMaiordoUmeroDireito;
	}
	public String getTuberculoMaiordoUmeroEsquerdo() {
		return tuberculoMaiordoUmeroEsquerdo;
	}
	public void setTuberculoMaiordoUmeroEsquerdo(
			String tuberculoMaiordoUmeroEsquerdo) {
		this.tuberculoMaiordoUmeroEsquerdo = tuberculoMaiordoUmeroEsquerdo;
	}
	public String getTuberculoMenordoUmeroDireito() {
		return tuberculoMenordoUmeroDireito;
	}
	public void setTuberculoMenordoUmeroDireito(String tuberculoMenordoUmeroDireito) {
		this.tuberculoMenordoUmeroDireito = tuberculoMenordoUmeroDireito;
	}
	public String getTuberculoMenordoUmeroEsquerdo() {
		return tuberculoMenordoUmeroEsquerdo;
	}
	public void setTuberculoMenordoUmeroEsquerdo(
			String tuberculoMenordoUmeroEsquerdo) {
		this.tuberculoMenordoUmeroEsquerdo = tuberculoMenordoUmeroEsquerdo;
	}
	public String getIncisuraBiciptalDireito() {
		return incisuraBiciptalDireito;
	}
	public void setIncisuraBiciptalDireito(String incisuraBiciptalDireito) {
		this.incisuraBiciptalDireito = incisuraBiciptalDireito;
	}
	public String getIncisuraBiciptalEsquerdo() {
		return incisuraBiciptalEsquerdo;
	}
	public void setIncisuraBiciptalEsquerdo(String incisuraBiciptalEsquerdo) {
		this.incisuraBiciptalEsquerdo = incisuraBiciptalEsquerdo;
	}
	public String getEspinhaDaEscapulaDireito() {
		return espinhaDaEscapulaDireito;
	}
	public void setEspinhaDaEscapulaDireito(String espinhaDaEscapulaDireito) {
		this.espinhaDaEscapulaDireito = espinhaDaEscapulaDireito;
	}
	public String getEspinhaDaEscapulaEsquerdo() {
		return espinhaDaEscapulaEsquerdo;
	}
	public void setEspinhaDaEscapulaEsquerdo(String espinhaDaEscapulaEsquerdo) {
		this.espinhaDaEscapulaEsquerdo = espinhaDaEscapulaEsquerdo;
	}
	public String getBordaMedialDaEscapulaDireito() {
		return bordaMedialDaEscapulaDireito;
	}
	public void setBordaMedialDaEscapulaDireito(String bordaMedialDaEscapulaDireito) {
		this.bordaMedialDaEscapulaDireito = bordaMedialDaEscapulaDireito;
	}
	public String getBordaMedialDaEscapulaEsquerdo() {
		return bordaMedialDaEscapulaEsquerdo;
	}
	public void setBordaMedialDaEscapulaEsquerdo(
			String bordaMedialDaEscapulaEsquerdo) {
		this.bordaMedialDaEscapulaEsquerdo = bordaMedialDaEscapulaEsquerdo;
	}
	public String getMusculoEsternocleiDireito() {
		return musculoEsternocleiDireito;
	}
	public void setMusculoEsternocleiDireito(String musculoEsternocleiDireito) {
		this.musculoEsternocleiDireito = musculoEsternocleiDireito;
	}
	public String getMusculoEsternocleiEsquerdo() {
		return musculoEsternocleiEsquerdo;
	}
	public void setMusculoEsternocleiEsquerdo(String musculoEsternocleiEsquerdo) {
		this.musculoEsternocleiEsquerdo = musculoEsternocleiEsquerdo;
	}
	public String getMusculoEscalenoDireito() {
		return musculoEscalenoDireito;
	}
	public void setMusculoEscalenoDireito(String musculoEscalenoDireito) {
		this.musculoEscalenoDireito = musculoEscalenoDireito;
	}
	public String getMusculoEscalenoEsquerdo() {
		return musculoEscalenoEsquerdo;
	}
	public void setMusculoEscalenoEsquerdo(String musculoEscalenoEsquerdo) {
		this.musculoEscalenoEsquerdo = musculoEscalenoEsquerdo;
	}
	public String getMusculoTrapezioSuperiorDireito() {
		return musculoTrapezioSuperiorDireito;
	}
	public void setMusculoTrapezioSuperiorDireito(
			String musculoTrapezioSuperiorDireito) {
		this.musculoTrapezioSuperiorDireito = musculoTrapezioSuperiorDireito;
	}
	public String getMusculoTrapezioSuperiorEsquerdo() {
		return musculoTrapezioSuperiorEsquerdo;
	}
	public void setMusculoTrapezioSuperiorEsquerdo(
			String musculoTrapezioSuperiorEsquerdo) {
		this.musculoTrapezioSuperiorEsquerdo = musculoTrapezioSuperiorEsquerdo;
	}
	public String getMusucloTrapezioMedioDireito() {
		return musucloTrapezioMedioDireito;
	}
	public void setMusucloTrapezioMedioDireito(String musucloTrapezioMedioDireito) {
		this.musucloTrapezioMedioDireito = musucloTrapezioMedioDireito;
	}
	public String getMusculoTrapezioMedioEsquerdo() {
		return musculoTrapezioMedioEsquerdo;
	}
	public void setMusculoTrapezioMedioEsquerdo(String musculoTrapezioMedioEsquerdo) {
		this.musculoTrapezioMedioEsquerdo = musculoTrapezioMedioEsquerdo;
	}
	public String getMusculoTrapezioInferiorDireito() {
		return musculoTrapezioInferiorDireito;
	}
	public void setMusculoTrapezioInferiorDireito(
			String musculoTrapezioInferiorDireito) {
		this.musculoTrapezioInferiorDireito = musculoTrapezioInferiorDireito;
	}
	public String getMusculoTrapezioInferiorEsquerdo() {
		return musculoTrapezioInferiorEsquerdo;
	}
	public void setMusculoTrapezioInferiorEsquerdo(
			String musculoTrapezioInferiorEsquerdo) {
		this.musculoTrapezioInferiorEsquerdo = musculoTrapezioInferiorEsquerdo;
	}
	public String getMusculoRomboidesDireito() {
		return musculoRomboidesDireito;
	}
	public void setMusculoRomboidesDireito(String musculoRomboidesDireito) {
		this.musculoRomboidesDireito = musculoRomboidesDireito;
	}
	public String getMusculoRomboidesEsquerdo() {
		return musculoRomboidesEsquerdo;
	}
	public void setMusculoRomboidesEsquerdo(String musculoRomboidesEsquerdo) {
		this.musculoRomboidesEsquerdo = musculoRomboidesEsquerdo;
	}
	public String getMusculoSupraEspinhosoDireito() {
		return musculoSupraEspinhosoDireito;
	}
	public void setMusculoSupraEspinhosoDireito(String musculoSupraEspinhosoDireito) {
		this.musculoSupraEspinhosoDireito = musculoSupraEspinhosoDireito;
	}
	public String getMusculoSupraEspinhosoEsquerdo() {
		return musculoSupraEspinhosoEsquerdo;
	}
	public void setMusculoSupraEspinhosoEsquerdo(
			String musculoSupraEspinhosoEsquerdo) {
		this.musculoSupraEspinhosoEsquerdo = musculoSupraEspinhosoEsquerdo;
	}
	public String getMusculoInfraEspinhoDireito() {
		return musculoInfraEspinhoDireito;
	}
	public void setMusculoInfraEspinhoDireito(String musculoInfraEspinhoDireito) {
		this.musculoInfraEspinhoDireito = musculoInfraEspinhoDireito;
	}
	public String getMusculoInfraEspinhoEsquerdo() {
		return musculoInfraEspinhoEsquerdo;
	}
	public void setMusculoInfraEspinhoEsquerdo(String musculoInfraEspinhoEsquerdo) {
		this.musculoInfraEspinhoEsquerdo = musculoInfraEspinhoEsquerdo;
	}
	public String getRedondoMenorDireito() {
		return redondoMenorDireito;
	}
	public void setRedondoMenorDireito(String redondoMenorDireito) {
		this.redondoMenorDireito = redondoMenorDireito;
	}
	public String getDedondoMenorEsquerdo() {
		return dedondoMenorEsquerdo;
	}
	public void setDedondoMenorEsquerdo(String dedondoMenorEsquerdo) {
		this.dedondoMenorEsquerdo = dedondoMenorEsquerdo;
	}
	public String getMusculoRedondoMaiorDireito() {
		return musculoRedondoMaiorDireito;
	}
	public void setMusculoRedondoMaiorDireito(String musculoRedondoMaiorDireito) {
		this.musculoRedondoMaiorDireito = musculoRedondoMaiorDireito;
	}
	public String getMusucloRedondoMaiorEsquerdo() {
		return musucloRedondoMaiorEsquerdo;
	}
	public void setMusucloRedondoMaiorEsquerdo(String musucloRedondoMaiorEsquerdo) {
		this.musucloRedondoMaiorEsquerdo = musucloRedondoMaiorEsquerdo;
	}
	public String getMusculoDeltoideDireito() {
		return musculoDeltoideDireito;
	}
	public void setMusculoDeltoideDireito(String musculoDeltoideDireito) {
		this.musculoDeltoideDireito = musculoDeltoideDireito;
	}
	public String getMusculoDeltoideEsquerdo() {
		return musculoDeltoideEsquerdo;
	}
	public void setMusculoDeltoideEsquerdo(String musculoDeltoideEsquerdo) {
		this.musculoDeltoideEsquerdo = musculoDeltoideEsquerdo;
	}
	public String getBolsaSubcromialDireito() {
		return bolsaSubcromialDireito;
	}
	public void setBolsaSubcromialDireito(String bolsaSubcromialDireito) {
		this.bolsaSubcromialDireito = bolsaSubcromialDireito;
	}
	public String getBolsaSubcromialEsquerdo() {
		return bolsaSubcromialEsquerdo;
	}
	public void setBolsaSubcromialEsquerdo(String bolsaSubcromialEsquerdo) {
		this.bolsaSubcromialEsquerdo = bolsaSubcromialEsquerdo;
	}
	public String getMusucloPeitoralMaiorDireito() {
		return musucloPeitoralMaiorDireito;
	}
	public void setMusucloPeitoralMaiorDireito(String musucloPeitoralMaiorDireito) {
		this.musucloPeitoralMaiorDireito = musucloPeitoralMaiorDireito;
	}
	public String getMusculoPeitoralMaiorEsquerdo() {
		return musculoPeitoralMaiorEsquerdo;
	}
	public void setMusculoPeitoralMaiorEsquerdo(String musculoPeitoralMaiorEsquerdo) {
		this.musculoPeitoralMaiorEsquerdo = musculoPeitoralMaiorEsquerdo;
	}
	public String getMusculoBicepsCabecaLongaDireita() {
		return musculoBicepsCabecaLongaDireita;
	}
	public void setMusculoBicepsCabecaLongaDireita(
			String musculoBicepsCabecaLongaDireita) {
		this.musculoBicepsCabecaLongaDireita = musculoBicepsCabecaLongaDireita;
	}
	public String getMusculoBicepsCabecaLongaEsquerda() {
		return musculoBicepsCabecaLongaEsquerda;
	}
	public void setMusculoBicepsCabecaLongaEsquerda(
			String musculoBicepsCabecaLongaEsquerda) {
		this.musculoBicepsCabecaLongaEsquerda = musculoBicepsCabecaLongaEsquerda;
	}
	public String getMusculoBicepsCabecaCurtaDireita() {
		return musculoBicepsCabecaCurtaDireita;
	}
	public void setMusculoBicepsCabecaCurtaDireita(
			String musculoBicepsCabecaCurtaDireita) {
		this.musculoBicepsCabecaCurtaDireita = musculoBicepsCabecaCurtaDireita;
	}
	public String getMusculoBicepsCabecaCurtaEsquerda() {
		return musculoBicepsCabecaCurtaEsquerda;
	}
	public void setMusculoBicepsCabecaCurtaEsquerda(
			String musculoBicepsCabecaCurtaEsquerda) {
		this.musculoBicepsCabecaCurtaEsquerda = musculoBicepsCabecaCurtaEsquerda;
	}
	public String getTendaoDaCabecaLongaDireita() {
		return tendaoDaCabecaLongaDireita;
	}
	public void setTendaoDaCabecaLongaDireita(String tendaoDaCabecaLongaDireita) {
		this.tendaoDaCabecaLongaDireita = tendaoDaCabecaLongaDireita;
	}
	public String getTendaoDaCabecaLongaEsquerda() {
		return tendaoDaCabecaLongaEsquerda;
	}
	public void setTendaoDaCabecaLongaEsquerda(String tendaoDaCabecaLongaEsquerda) {
		this.tendaoDaCabecaLongaEsquerda = tendaoDaCabecaLongaEsquerda;
	}
	public String getMusculoTricepsDireito() {
		return musculoTricepsDireito;
	}
	public void setMusculoTricepsDireito(String musculoTricepsDireito) {
		this.musculoTricepsDireito = musculoTricepsDireito;
	}
	public String getMusculoTricepsEsquerdo() {
		return musculoTricepsEsquerdo;
	}
	public void setMusculoTricepsEsquerdo(String musculoTricepsEsquerdo) {
		this.musculoTricepsEsquerdo = musculoTricepsEsquerdo;
	}
	public String getRotacaoExternaAbducaoCervicaoDireita() {
		return rotacaoExternaAbducaoCervicaoDireita;
	}
	public void setRotacaoExternaAbducaoCervicaoDireita(
			String rotacaoExternaAbducaoCervicaoDireita) {
		this.rotacaoExternaAbducaoCervicaoDireita = rotacaoExternaAbducaoCervicaoDireita;
	}
	public String getRotacaoExternaAbducaoCervicaoEsquerda() {
		return rotacaoExternaAbducaoCervicaoEsquerda;
	}
	public void setRotacaoExternaAbducaoCervicaoEsquerda(
			String rotacaoExternaAbducaoCervicaoEsquerda) {
		this.rotacaoExternaAbducaoCervicaoEsquerda = rotacaoExternaAbducaoCervicaoEsquerda;
	}
	public String getRotacaoExternaAbducaoAnguloSuperiorDaEscapulaDireito() {
		return rotacaoExternaAbducaoAnguloSuperiorDaEscapulaDireito;
	}
	public void setRotacaoExternaAbducaoAnguloSuperiorDaEscapulaDireito(
			String rotacaoExternaAbducaoAnguloSuperiorDaEscapulaDireito) {
		this.rotacaoExternaAbducaoAnguloSuperiorDaEscapulaDireito = rotacaoExternaAbducaoAnguloSuperiorDaEscapulaDireito;
	}
	public String getRotacaoExternaAbducaoAnguloSuperiorDaEscapulaEsquerdo() {
		return rotacaoExternaAbducaoAnguloSuperiorDaEscapulaEsquerdo;
	}
	public void setRotacaoExternaAbducaoAnguloSuperiorDaEscapulaEsquerdo(
			String rotacaoExternaAbducaoAnguloSuperiorDaEscapulaEsquerdo) {
		this.rotacaoExternaAbducaoAnguloSuperiorDaEscapulaEsquerdo = rotacaoExternaAbducaoAnguloSuperiorDaEscapulaEsquerdo;
	}
	public String getRotacaoInternaAbducaoAcronimoContralateralDireito() {
		return rotacaoInternaAbducaoAcronimoContralateralDireito;
	}
	public void setRotacaoInternaAbducaoAcronimoContralateralDireito(
			String rotacaoInternaAbducaoAcronimoContralateralDireito) {
		this.rotacaoInternaAbducaoAcronimoContralateralDireito = rotacaoInternaAbducaoAcronimoContralateralDireito;
	}
	public String getRotacaoInternaAbducaoAcronimoContralateralEsquerdo() {
		return rotacaoInternaAbducaoAcronimoContralateralEsquerdo;
	}
	public void setRotacaoInternaAbducaoAcronimoContralateralEsquerdo(
			String rotacaoInternaAbducaoAcronimoContralateralEsquerdo) {
		this.rotacaoInternaAbducaoAcronimoContralateralEsquerdo = rotacaoInternaAbducaoAcronimoContralateralEsquerdo;
	}
	public String getRotacaoInternaAducaoAnguloInferiorDireito() {
		return rotacaoInternaAducaoAnguloInferiorDireito;
	}
	public void setRotacaoInternaAducaoAnguloInferiorDireito(
			String rotacaoInternaAducaoAnguloInferiorDireito) {
		this.rotacaoInternaAducaoAnguloInferiorDireito = rotacaoInternaAducaoAnguloInferiorDireito;
	}
	public String getRotacaoInternaAducaoAnguloInferiorEsquerdo() {
		return rotacaoInternaAducaoAnguloInferiorEsquerdo;
	}
	public void setRotacaoInternaAducaoAnguloInferiorEsquerdo(
			String rotacaoInternaAducaoAnguloInferiorEsquerdo) {
		this.rotacaoInternaAducaoAnguloInferiorEsquerdo = rotacaoInternaAducaoAnguloInferiorEsquerdo;
	}
	public String getGoniometriaAtivaDireitoAbducao() {
		return goniometriaAtivaDireitoAbducao;
	}
	public void setGoniometriaAtivaDireitoAbducao(
			String goniometriaAtivaDireitoAbducao) {
		this.goniometriaAtivaDireitoAbducao = goniometriaAtivaDireitoAbducao;
	}
	public String getGoniometriaAtivaDireitoAducao() {
		return goniometriaAtivaDireitoAducao;
	}
	public void setGoniometriaAtivaDireitoAducao(
			String goniometriaAtivaDireitoAducao) {
		this.goniometriaAtivaDireitoAducao = goniometriaAtivaDireitoAducao;
	}
	public String getGoniometriaAtivaDireitoFlexao() {
		return goniometriaAtivaDireitoFlexao;
	}
	public void setGoniometriaAtivaDireitoFlexao(
			String goniometriaAtivaDireitoFlexao) {
		this.goniometriaAtivaDireitoFlexao = goniometriaAtivaDireitoFlexao;
	}
	public String getGoniometriaAtivaDireitoExtensao() {
		return goniometriaAtivaDireitoExtensao;
	}
	public void setGoniometriaAtivaDireitoExtensao(
			String goniometriaAtivaDireitoExtensao) {
		this.goniometriaAtivaDireitoExtensao = goniometriaAtivaDireitoExtensao;
	}
	public String getGoniometriaAtivaDireitoRotacaoInterna() {
		return goniometriaAtivaDireitoRotacaoInterna;
	}
	public void setGoniometriaAtivaDireitoRotacaoInterna(
			String goniometriaAtivaDireitoRotacaoInterna) {
		this.goniometriaAtivaDireitoRotacaoInterna = goniometriaAtivaDireitoRotacaoInterna;
	}
	public String getGoniometriaAtivaDireitoRotacaoExterna() {
		return goniometriaAtivaDireitoRotacaoExterna;
	}
	public void setGoniometriaAtivaDireitoRotacaoExterna(
			String goniometriaAtivaDireitoRotacaoExterna) {
		this.goniometriaAtivaDireitoRotacaoExterna = goniometriaAtivaDireitoRotacaoExterna;
	}
	public String getGoniometriaAtivaDireitoAbducaoHorizontal() {
		return goniometriaAtivaDireitoAbducaoHorizontal;
	}
	public void setGoniometriaAtivaDireitoAbducaoHorizontal(
			String goniometriaAtivaDireitoAbducaoHorizontal) {
		this.goniometriaAtivaDireitoAbducaoHorizontal = goniometriaAtivaDireitoAbducaoHorizontal;
	}
	public String getGoniometriaAtivaDireitoAducaoHorizontal() {
		return goniometriaAtivaDireitoAducaoHorizontal;
	}
	public void setGoniometriaAtivaDireitoAducaoHorizontal(
			String goniometriaAtivaDireitoAducaoHorizontal) {
		this.goniometriaAtivaDireitoAducaoHorizontal = goniometriaAtivaDireitoAducaoHorizontal;
	}
	public String getGoniometriaAtivaEsquerdaAbducao() {
		return goniometriaAtivaEsquerdaAbducao;
	}
	public void setGoniometriaAtivaEsquerdaAbducao(
			String goniometriaAtivaEsquerdaAbducao) {
		this.goniometriaAtivaEsquerdaAbducao = goniometriaAtivaEsquerdaAbducao;
	}
	public String getGoniometriaAtivaEsquerdaAducao() {
		return goniometriaAtivaEsquerdaAducao;
	}
	public void setGoniometriaAtivaEsquerdaAducao(
			String goniometriaAtivaEsquerdaAducao) {
		this.goniometriaAtivaEsquerdaAducao = goniometriaAtivaEsquerdaAducao;
	}
	public String getGoniometriaAtivaEsquerdaFlexao() {
		return goniometriaAtivaEsquerdaFlexao;
	}
	public void setGoniometriaAtivaEsquerdaFlexao(
			String goniometriaAtivaEsquerdaFlexao) {
		this.goniometriaAtivaEsquerdaFlexao = goniometriaAtivaEsquerdaFlexao;
	}
	public String getGoniometriaAtivaEsquerdaExtensao() {
		return goniometriaAtivaEsquerdaExtensao;
	}
	public void setGoniometriaAtivaEsquerdaExtensao(
			String goniometriaAtivaEsquerdaExtensao) {
		this.goniometriaAtivaEsquerdaExtensao = goniometriaAtivaEsquerdaExtensao;
	}
	public String getGoniometriaAtivaEsquerdaRotacaoInterna() {
		return goniometriaAtivaEsquerdaRotacaoInterna;
	}
	public void setGoniometriaAtivaEsquerdaRotacaoInterna(
			String goniometriaAtivaEsquerdaRotacaoInterna) {
		this.goniometriaAtivaEsquerdaRotacaoInterna = goniometriaAtivaEsquerdaRotacaoInterna;
	}
	public String getGoniometriaAtivaEsquerdaRotacaoExterna() {
		return goniometriaAtivaEsquerdaRotacaoExterna;
	}
	public void setGoniometriaAtivaEsquerdaRotacaoExterna(
			String goniometriaAtivaEsquerdaRotacaoExterna) {
		this.goniometriaAtivaEsquerdaRotacaoExterna = goniometriaAtivaEsquerdaRotacaoExterna;
	}
	public String getGoniometriaAtivaEsquerdaAbudacaoExterna() {
		return goniometriaAtivaEsquerdaAbudacaoExterna;
	}
	public void setGoniometriaAtivaEsquerdaAbudacaoExterna(
			String goniometriaAtivaEsquerdaAbudacaoExterna) {
		this.goniometriaAtivaEsquerdaAbudacaoExterna = goniometriaAtivaEsquerdaAbudacaoExterna;
	}
	public String getGoniometriaAtivaEsquerdaAducaoExterna() {
		return goniometriaAtivaEsquerdaAducaoExterna;
	}
	public void setGoniometriaAtivaEsquerdaAducaoExterna(
			String goniometriaAtivaEsquerdaAducaoExterna) {
		this.goniometriaAtivaEsquerdaAducaoExterna = goniometriaAtivaEsquerdaAducaoExterna;
	}
	public String getGoniometriaPassivaDireitoAbducao() {
		return goniometriaPassivaDireitoAbducao;
	}
	public void setGoniometriaPassivaDireitoAbducao(
			String goniometriaPassivaDireitoAbducao) {
		this.goniometriaPassivaDireitoAbducao = goniometriaPassivaDireitoAbducao;
	}
	public String getGoniometriaPassivaDireitoAducao() {
		return goniometriaPassivaDireitoAducao;
	}
	public void setGoniometriaPassivaDireitoAducao(
			String goniometriaPassivaDireitoAducao) {
		this.goniometriaPassivaDireitoAducao = goniometriaPassivaDireitoAducao;
	}
	public String getGoniometriaPassivaDireitoFlexao() {
		return goniometriaPassivaDireitoFlexao;
	}
	public void setGoniometriaPassivaDireitoFlexao(
			String goniometriaPassivaDireitoFlexao) {
		this.goniometriaPassivaDireitoFlexao = goniometriaPassivaDireitoFlexao;
	}
	public String getGoniometriaPassivaDireitoExtensao() {
		return goniometriaPassivaDireitoExtensao;
	}
	public void setGoniometriaPassivaDireitoExtensao(
			String goniometriaPassivaDireitoExtensao) {
		this.goniometriaPassivaDireitoExtensao = goniometriaPassivaDireitoExtensao;
	}
	public String getGoniometriaPassivaDireitoRotacaoInterna() {
		return goniometriaPassivaDireitoRotacaoInterna;
	}
	public void setGoniometriaPassivaDireitoRotacaoInterna(
			String goniometriaPassivaDireitoRotacaoInterna) {
		this.goniometriaPassivaDireitoRotacaoInterna = goniometriaPassivaDireitoRotacaoInterna;
	}
	public String getGoniometriaPassivaDireitoRotacaoExterna() {
		return goniometriaPassivaDireitoRotacaoExterna;
	}
	public void setGoniometriaPassivaDireitoRotacaoExterna(
			String goniometriaPassivaDireitoRotacaoExterna) {
		this.goniometriaPassivaDireitoRotacaoExterna = goniometriaPassivaDireitoRotacaoExterna;
	}
	public String getGoniometriaPassivaDireitoAbudaoHorizontal() {
		return goniometriaPassivaDireitoAbudaoHorizontal;
	}
	public void setGoniometriaPassivaDireitoAbudaoHorizontal(
			String goniometriaPassivaDireitoAbudaoHorizontal) {
		this.goniometriaPassivaDireitoAbudaoHorizontal = goniometriaPassivaDireitoAbudaoHorizontal;
	}
	public String getGoniometriaPassivaDireitoAducaoHorizontal() {
		return goniometriaPassivaDireitoAducaoHorizontal;
	}
	public void setGoniometriaPassivaDireitoAducaoHorizontal(
			String goniometriaPassivaDireitoAducaoHorizontal) {
		this.goniometriaPassivaDireitoAducaoHorizontal = goniometriaPassivaDireitoAducaoHorizontal;
	}
	public String getGoniometriaPassivaEsquerdaAbducao() {
		return goniometriaPassivaEsquerdaAbducao;
	}
	public void setGoniometriaPassivaEsquerdaAbducao(
			String goniometriaPassivaEsquerdaAbducao) {
		this.goniometriaPassivaEsquerdaAbducao = goniometriaPassivaEsquerdaAbducao;
	}
	public String getGoniometriaPassivaEsquerdaAducao() {
		return goniometriaPassivaEsquerdaAducao;
	}
	public void setGoniometriaPassivaEsquerdaAducao(
			String goniometriaPassivaEsquerdaAducao) {
		this.goniometriaPassivaEsquerdaAducao = goniometriaPassivaEsquerdaAducao;
	}
	public String getGoniometriaPassivaEsquerdaFlexao() {
		return goniometriaPassivaEsquerdaFlexao;
	}
	public void setGoniometriaPassivaEsquerdaFlexao(
			String goniometriaPassivaEsquerdaFlexao) {
		this.goniometriaPassivaEsquerdaFlexao = goniometriaPassivaEsquerdaFlexao;
	}
	public String getGoniometriaPassivaEsquerdaExtensao() {
		return goniometriaPassivaEsquerdaExtensao;
	}
	public void setGoniometriaPassivaEsquerdaExtensao(
			String goniometriaPassivaEsquerdaExtensao) {
		this.goniometriaPassivaEsquerdaExtensao = goniometriaPassivaEsquerdaExtensao;
	}
	public String getGoniometriaPassivaEsquerdaRotacaoInterna() {
		return goniometriaPassivaEsquerdaRotacaoInterna;
	}
	public void setGoniometriaPassivaEsquerdaRotacaoInterna(
			String goniometriaPassivaEsquerdaRotacaoInterna) {
		this.goniometriaPassivaEsquerdaRotacaoInterna = goniometriaPassivaEsquerdaRotacaoInterna;
	}
	public String getGoniometriaPassivaEsquerdaRotacaoExterna() {
		return goniometriaPassivaEsquerdaRotacaoExterna;
	}
	public void setGoniometriaPassivaEsquerdaRotacaoExterna(
			String goniometriaPassivaEsquerdaRotacaoExterna) {
		this.goniometriaPassivaEsquerdaRotacaoExterna = goniometriaPassivaEsquerdaRotacaoExterna;
	}
	public String getGoniometriaPassivaEsquerdaAbucaoHorizontal() {
		return goniometriaPassivaEsquerdaAbucaoHorizontal;
	}
	public void setGoniometriaPassivaEsquerdaAbucaoHorizontal(
			String goniometriaPassivaEsquerdaAbucaoHorizontal) {
		this.goniometriaPassivaEsquerdaAbucaoHorizontal = goniometriaPassivaEsquerdaAbucaoHorizontal;
	}
	public String getGoniometriaPassivaEsquerdaAducaoHorizontal() {
		return goniometriaPassivaEsquerdaAducaoHorizontal;
	}
	public void setGoniometriaPassivaEsquerdaAducaoHorizontal(
			String goniometriaPassivaEsquerdaAducaoHorizontal) {
		this.goniometriaPassivaEsquerdaAducaoHorizontal = goniometriaPassivaEsquerdaAducaoHorizontal;
	}
	public String getMuscularAbducaoDireito() {
		return muscularAbducaoDireito;
	}
	public void setMuscularAbducaoDireito(String muscularAbducaoDireito) {
		this.muscularAbducaoDireito = muscularAbducaoDireito;
	}
	public String getMuscularAbducaoEsquerdo() {
		return muscularAbducaoEsquerdo;
	}
	public void setMuscularAbducaoEsquerdo(String muscularAbducaoEsquerdo) {
		this.muscularAbducaoEsquerdo = muscularAbducaoEsquerdo;
	}
	public String getMuscularAbucaoDireito() {
		return muscularAbucaoDireito;
	}
	public void setMuscularAbucaoDireito(String muscularAbucaoDireito) {
		this.muscularAbucaoDireito = muscularAbucaoDireito;
	}
	public String getMuscularAbucaoEsquerdo() {
		return muscularAbucaoEsquerdo;
	}
	public void setMuscularAbucaoEsquerdo(String muscularAbucaoEsquerdo) {
		this.muscularAbucaoEsquerdo = muscularAbucaoEsquerdo;
	}
	public String getMuscularFlexaoDireito() {
		return muscularFlexaoDireito;
	}
	public void setMuscularFlexaoDireito(String muscularFlexaoDireito) {
		this.muscularFlexaoDireito = muscularFlexaoDireito;
	}
	public String getMuscularFlexaoEsquerdo() {
		return muscularFlexaoEsquerdo;
	}
	public void setMuscularFlexaoEsquerdo(String muscularFlexaoEsquerdo) {
		this.muscularFlexaoEsquerdo = muscularFlexaoEsquerdo;
	}
	public String getMuscularExtencaoDireito() {
		return muscularExtencaoDireito;
	}
	public void setMuscularExtencaoDireito(String muscularExtencaoDireito) {
		this.muscularExtencaoDireito = muscularExtencaoDireito;
	}
	public String getMuscularExtencaoEsquerdo() {
		return muscularExtencaoEsquerdo;
	}
	public void setMuscularExtencaoEsquerdo(String muscularExtencaoEsquerdo) {
		this.muscularExtencaoEsquerdo = muscularExtencaoEsquerdo;
	}
	public String getMuscularRotacaoInternaDireito() {
		return muscularRotacaoInternaDireito;
	}
	public void setMuscularRotacaoInternaDireito(
			String muscularRotacaoInternaDireito) {
		this.muscularRotacaoInternaDireito = muscularRotacaoInternaDireito;
	}
	public String getMuscularRotacaoInternaEsquerdo() {
		return muscularRotacaoInternaEsquerdo;
	}
	public void setMuscularRotacaoInternaEsquerdo(
			String muscularRotacaoInternaEsquerdo) {
		this.muscularRotacaoInternaEsquerdo = muscularRotacaoInternaEsquerdo;
	}
	public String getMuscularRotacaoExternaDireito() {
		return muscularRotacaoExternaDireito;
	}
	public void setMuscularRotacaoExternaDireito(
			String muscularRotacaoExternaDireito) {
		this.muscularRotacaoExternaDireito = muscularRotacaoExternaDireito;
	}
	public String getMuscularRotacaoExternaEsquerdo() {
		return muscularRotacaoExternaEsquerdo;
	}
	public void setMuscularRotacaoExternaEsquerdo(
			String muscularRotacaoExternaEsquerdo) {
		this.muscularRotacaoExternaEsquerdo = muscularRotacaoExternaEsquerdo;
	}
	public String getMuscularAbducaoHorizontalDireita() {
		return muscularAbducaoHorizontalDireita;
	}
	public void setMuscularAbducaoHorizontalDireita(
			String muscularAbducaoHorizontalDireita) {
		this.muscularAbducaoHorizontalDireita = muscularAbducaoHorizontalDireita;
	}
	public String getMuscularAbducaoHorizontalEsquerda() {
		return muscularAbducaoHorizontalEsquerda;
	}
	public void setMuscularAbducaoHorizontalEsquerda(
			String muscularAbducaoHorizontalEsquerda) {
		this.muscularAbducaoHorizontalEsquerda = muscularAbducaoHorizontalEsquerda;
	}
	public String getMuscularAducaoHorizontalDireita() {
		return muscularAducaoHorizontalDireita;
	}
	public void setMuscularAducaoHorizontalDireita(
			String muscularAducaoHorizontalDireita) {
		this.muscularAducaoHorizontalDireita = muscularAducaoHorizontalDireita;
	}
	public String getMuscularAducaoHorizontalEsquerda() {
		return muscularAducaoHorizontalEsquerda;
	}
	public void setMuscularAducaoHorizontalEsquerda(
			String muscularAducaoHorizontalEsquerda) {
		this.muscularAducaoHorizontalEsquerda = muscularAducaoHorizontalEsquerda;
	}
	public String getMuscularElevacaoHorizontal() {
		return muscularElevacaoHorizontal;
	}
	public void setMuscularElevacaoHorizontal(String muscularElevacaoHorizontal) {
		this.muscularElevacaoHorizontal = muscularElevacaoHorizontal;
	}
	public String getMuscularElevacaoDaEscapulaDireita() {
		return muscularElevacaoDaEscapulaDireita;
	}
	public void setMuscularElevacaoDaEscapulaDireita(
			String muscularElevacaoDaEscapulaDireita) {
		this.muscularElevacaoDaEscapulaDireita = muscularElevacaoDaEscapulaDireita;
	}
	public String getMuscularElevacaoDaEscapulaEsquerda() {
		return muscularElevacaoDaEscapulaEsquerda;
	}
	public void setMuscularElevacaoDaEscapulaEsquerda(
			String muscularElevacaoDaEscapulaEsquerda) {
		this.muscularElevacaoDaEscapulaEsquerda = muscularElevacaoDaEscapulaEsquerda;
	}
	public String getMuscularRetracaoDaEscapulaDireita() {
		return muscularRetracaoDaEscapulaDireita;
	}
	public void setMuscularRetracaoDaEscapulaDireita(
			String muscularRetracaoDaEscapulaDireita) {
		this.muscularRetracaoDaEscapulaDireita = muscularRetracaoDaEscapulaDireita;
	}
	public String getMuscularRetracaoDaEscapulaEsquerda() {
		return muscularRetracaoDaEscapulaEsquerda;
	}
	public void setMuscularRetracaoDaEscapulaEsquerda(
			String muscularRetracaoDaEscapulaEsquerda) {
		this.muscularRetracaoDaEscapulaEsquerda = muscularRetracaoDaEscapulaEsquerda;
	}
	public String getMuscularProtusaoDaEscapulaDireita() {
		return muscularProtusaoDaEscapulaDireita;
	}
	public void setMuscularProtusaoDaEscapulaDireita(
			String muscularProtusaoDaEscapulaDireita) {
		this.muscularProtusaoDaEscapulaDireita = muscularProtusaoDaEscapulaDireita;
	}
	public String getMuscularProtusaoDaEscapulaEsquerda() {
		return muscularProtusaoDaEscapulaEsquerda;
	}
	public void setMuscularProtusaoDaEscapulaEsquerda(
			String muscularProtusaoDaEscapulaEsquerda) {
		this.muscularProtusaoDaEscapulaEsquerda = muscularProtusaoDaEscapulaEsquerda;
	}
	public String getEncurtamentoTrapezioSuperiorDireito() {
		return encurtamentoTrapezioSuperiorDireito;
	}
	public void setEncurtamentoTrapezioSuperiorDireito(
			String encurtamentoTrapezioSuperiorDireito) {
		this.encurtamentoTrapezioSuperiorDireito = encurtamentoTrapezioSuperiorDireito;
	}
	public String getEncurtamentoTrapezioSuperiorEsquerdo() {
		return encurtamentoTrapezioSuperiorEsquerdo;
	}
	public void setEncurtamentoTrapezioSuperiorEsquerdo(
			String encurtamentoTrapezioSuperiorEsquerdo) {
		this.encurtamentoTrapezioSuperiorEsquerdo = encurtamentoTrapezioSuperiorEsquerdo;
	}
	public String getEncurtamentoPeitoralMaiorDireito() {
		return encurtamentoPeitoralMaiorDireito;
	}
	public void setEncurtamentoPeitoralMaiorDireito(
			String encurtamentoPeitoralMaiorDireito) {
		this.encurtamentoPeitoralMaiorDireito = encurtamentoPeitoralMaiorDireito;
	}
	public String getEncurtamentoPeitoralMaiorEsquerdo() {
		return encurtamentoPeitoralMaiorEsquerdo;
	}
	public void setEncurtamentoPeitoralMaiorEsquerdo(
			String encurtamentoPeitoralMaiorEsquerdo) {
		this.encurtamentoPeitoralMaiorEsquerdo = encurtamentoPeitoralMaiorEsquerdo;
	}
	public String getEncurtamentoPeitoralMenorDireito() {
		return encurtamentoPeitoralMenorDireito;
	}
	public void setEncurtamentoPeitoralMenorDireito(
			String encurtamentoPeitoralMenorDireito) {
		this.encurtamentoPeitoralMenorDireito = encurtamentoPeitoralMenorDireito;
	}
	public String getEncurtamentoPeitoralMenorEsquerdo() {
		return encurtamentoPeitoralMenorEsquerdo;
	}
	public void setEncurtamentoPeitoralMenorEsquerdo(
			String encurtamentoPeitoralMenorEsquerdo) {
		this.encurtamentoPeitoralMenorEsquerdo = encurtamentoPeitoralMenorEsquerdo;
	}
	public String getEncurtamentoGrandeDorsalDireito() {
		return encurtamentoGrandeDorsalDireito;
	}
	public void setEncurtamentoGrandeDorsalDireito(
			String encurtamentoGrandeDorsalDireito) {
		this.encurtamentoGrandeDorsalDireito = encurtamentoGrandeDorsalDireito;
	}
	public String getEncurtamentoGrandeDorsalEsquerdo() {
		return encurtamentoGrandeDorsalEsquerdo;
	}
	public void setEncurtamentoGrandeDorsalEsquerdo(
			String encurtamentoGrandeDorsalEsquerdo) {
		this.encurtamentoGrandeDorsalEsquerdo = encurtamentoGrandeDorsalEsquerdo;
	}
	public String getReflexoBiciptalDireito() {
		return reflexoBiciptalDireito;
	}
	public void setReflexoBiciptalDireito(String reflexoBiciptalDireito) {
		this.reflexoBiciptalDireito = reflexoBiciptalDireito;
	}
	public String getReflexoBiciptalEsquerdo() {
		return reflexoBiciptalEsquerdo;
	}
	public void setReflexoBiciptalEsquerdo(String reflexoBiciptalEsquerdo) {
		this.reflexoBiciptalEsquerdo = reflexoBiciptalEsquerdo;
	}
	public String getReflexoTriciptalDireito() {
		return reflexoTriciptalDireito;
	}
	public void setReflexoTriciptalDireito(String reflexoTriciptalDireito) {
		this.reflexoTriciptalDireito = reflexoTriciptalDireito;
	}
	public String getReflexoTriciptalEsquerdo() {
		return reflexoTriciptalEsquerdo;
	}
	public void setReflexoTriciptalEsquerdo(String reflexoTriciptalEsquerdo) {
		this.reflexoTriciptalEsquerdo = reflexoTriciptalEsquerdo;
	}
	public String getSensC4Direito() {
		return sensC4Direito;
	}
	public void setSensC4Direito(String sensC4Direito) {
		this.sensC4Direito = sensC4Direito;
	}
	public String getSensC4Esquerdo() {
		return sensC4Esquerdo;
	}
	public void setSensC4Esquerdo(String sensC4Esquerdo) {
		this.sensC4Esquerdo = sensC4Esquerdo;
	}
	public String getSensC5Direito() {
		return sensC5Direito;
	}
	public void setSensC5Direito(String sensC5Direito) {
		this.sensC5Direito = sensC5Direito;
	}
	public String getSensC5Esquerdo() {
		return sensC5Esquerdo;
	}
	public void setSensC5Esquerdo(String sensC5Esquerdo) {
		this.sensC5Esquerdo = sensC5Esquerdo;
	}
	public String getSensC6Direito() {
		return sensC6Direito;
	}
	public void setSensC6Direito(String sensC6Direito) {
		this.sensC6Direito = sensC6Direito;
	}
	public String getSensC6Esquerdo() {
		return sensC6Esquerdo;
	}
	public void setSensC6Esquerdo(String sensC6Esquerdo) {
		this.sensC6Esquerdo = sensC6Esquerdo;
	}
	public String getSensC7Direito() {
		return sensC7Direito;
	}
	public void setSensC7Direito(String sensC7Direito) {
		this.sensC7Direito = sensC7Direito;
	}
	public String getSensC7Esquerdo() {
		return sensC7Esquerdo;
	}
	public void setSensC7Esquerdo(String sensC7Esquerdo) {
		this.sensC7Esquerdo = sensC7Esquerdo;
	}
	public String getSensC8Direito() {
		return sensC8Direito;
	}
	public void setSensC8Direito(String sensC8Direito) {
		this.sensC8Direito = sensC8Direito;
	}
	public String getSensC8Esquerdo() {
		return sensC8Esquerdo;
	}
	public void setSensC8Esquerdo(String sensC8Esquerdo) {
		this.sensC8Esquerdo = sensC8Esquerdo;
	}
	public String getSensT1Direito() {
		return sensT1Direito;
	}
	public void setSensT1Direito(String sensT1Direito) {
		this.sensT1Direito = sensT1Direito;
	}
	public String getSensT1Esquerdo() {
		return sensT1Esquerdo;
	}
	public void setSensT1Esquerdo(String sensT1Esquerdo) {
		this.sensT1Esquerdo = sensT1Esquerdo;
	}
	public String getSensT2Direito() {
		return sensT2Direito;
	}
	public void setSensT2Direito(String sensT2Direito) {
		this.sensT2Direito = sensT2Direito;
	}
	public String getSensT2Esquerdo() {
		return sensT2Esquerdo;
	}
	public void setSensT2Esquerdo(String sensT2Esquerdo) {
		this.sensT2Esquerdo = sensT2Esquerdo;
	}
	public String getImpactoDeNeerDireito() {
		return impactoDeNeerDireito;
	}
	public void setImpactoDeNeerDireito(String impactoDeNeerDireito) {
		this.impactoDeNeerDireito = impactoDeNeerDireito;
	}
	public String getImpactoDeNeerEsquerdo() {
		return impactoDeNeerEsquerdo;
	}
	public void setImpactoDeNeerEsquerdo(String impactoDeNeerEsquerdo) {
		this.impactoDeNeerEsquerdo = impactoDeNeerEsquerdo;
	}
	public String getImpactoDeHawkinsDireito() {
		return impactoDeHawkinsDireito;
	}
	public void setImpactoDeHawkinsDireito(String impactoDeHawkinsDireito) {
		this.impactoDeHawkinsDireito = impactoDeHawkinsDireito;
	}
	public String getImpactoDeHawkinsEsquerdo() {
		return impactoDeHawkinsEsquerdo;
	}
	public void setImpactoDeHawkinsEsquerdo(String impactoDeHawkinsEsquerdo) {
		this.impactoDeHawkinsEsquerdo = impactoDeHawkinsEsquerdo;
	}
	public String getImpactoDeYokunDireito() {
		return impactoDeYokunDireito;
	}
	public void setImpactoDeYokunDireito(String impactoDeYokunDireito) {
		this.impactoDeYokunDireito = impactoDeYokunDireito;
	}
	public String getImpactoDeYokunEsquerdo() {
		return impactoDeYokunEsquerdo;
	}
	public void setImpactoDeYokunEsquerdo(String impactoDeYokunEsquerdo) {
		this.impactoDeYokunEsquerdo = impactoDeYokunEsquerdo;
	}
	public String getSupraEspinhosoDireito() {
		return supraEspinhosoDireito;
	}
	public void setSupraEspinhosoDireito(String supraEspinhosoDireito) {
		this.supraEspinhosoDireito = supraEspinhosoDireito;
	}
	public String getSupraEspinhosoEsquerdo() {
		return supraEspinhosoEsquerdo;
	}
	public void setSupraEspinhosoEsquerdo(String supraEspinhosoEsquerdo) {
		this.supraEspinhosoEsquerdo = supraEspinhosoEsquerdo;
	}
	public String getJobeDireito() {
		return jobeDireito;
	}
	public void setJobeDireito(String jobeDireito) {
		this.jobeDireito = jobeDireito;
	}
	public String getJobeEsquerdo() {
		return jobeEsquerdo;
	}
	public void setJobeEsquerdo(String jobeEsquerdo) {
		this.jobeEsquerdo = jobeEsquerdo;
	}
	public String getPalmDireito() {
		return palmDireito;
	}
	public void setPalmDireito(String palmDireito) {
		this.palmDireito = palmDireito;
	}
	public String getPalmEsquerdo() {
		return palmEsquerdo;
	}
	public void setPalmEsquerdo(String palmEsquerdo) {
		this.palmEsquerdo = palmEsquerdo;
	}
	public String getInfraDireito() {
		return infraDireito;
	}
	public void setInfraDireito(String infraDireito) {
		this.infraDireito = infraDireito;
	}
	public String getInfraEsquerdo() {
		return infraEsquerdo;
	}
	public void setInfraEsquerdo(String infraEsquerdo) {
		this.infraEsquerdo = infraEsquerdo;
	}
	public String getPatteDireito() {
		return patteDireito;
	}
	public void setPatteDireito(String patteDireito) {
		this.patteDireito = patteDireito;
	}
	public String getPatteEsquerdo() {
		return patteEsquerdo;
	}
	public void setPatteEsquerdo(String patteEsquerdo) {
		this.patteEsquerdo = patteEsquerdo;
	}
	public String getRotacaoExternaDireito() {
		return rotacaoExternaDireito;
	}
	public void setRotacaoExternaDireito(String rotacaoExternaDireito) {
		this.rotacaoExternaDireito = rotacaoExternaDireito;
	}
	public String getRotacaoExternaEsquerda() {
		return rotacaoExternaEsquerda;
	}
	public void setRotacaoExternaEsquerda(String rotacaoExternaEsquerda) {
		this.rotacaoExternaEsquerda = rotacaoExternaEsquerda;
	}
	public String getQuedaDoBracoDireita() {
		return quedaDoBracoDireita;
	}
	public void setQuedaDoBracoDireita(String quedaDoBracoDireita) {
		this.quedaDoBracoDireita = quedaDoBracoDireita;
	}
	public String getQuedaDoBracoEsquerda() {
		return quedaDoBracoEsquerda;
	}
	public void setQuedaDoBracoEsquerda(String quedaDoBracoEsquerda) {
		this.quedaDoBracoEsquerda = quedaDoBracoEsquerda;
	}
	public String getGerberDireito() {
		return gerberDireito;
	}
	public void setGerberDireito(String gerberDireito) {
		this.gerberDireito = gerberDireito;
	}
	public String getGerberEsquerdo() {
		return gerberEsquerdo;
	}
	public void setGerberEsquerdo(String gerberEsquerdo) {
		this.gerberEsquerdo = gerberEsquerdo;
	}
	public String getCompressaoDireito() {
		return compressaoDireito;
	}
	public void setCompressaoDireito(String compressaoDireito) {
		this.compressaoDireito = compressaoDireito;
	}
	public String getComprressadoEsquerdo() {
		return comprressadoEsquerdo;
	}
	public void setComprressadoEsquerdo(String comprressadoEsquerdo) {
		this.comprressadoEsquerdo = comprressadoEsquerdo;
	}
	public String getYeargassonDireito() {
		return yeargassonDireito;
	}
	public void setYeargassonDireito(String yeargassonDireito) {
		this.yeargassonDireito = yeargassonDireito;
	}
	public String getYeargassonEsquerda() {
		return yeargassonEsquerda;
	}
	public void setYeargassonEsquerda(String yeargassonEsquerda) {
		this.yeargassonEsquerda = yeargassonEsquerda;
	}
	public String getApreensaoDireito() {
		return apreensaoDireito;
	}
	public void setApreensaoDireito(String apreensaoDireito) {
		this.apreensaoDireito = apreensaoDireito;
	}
	public String getApreensaoEsquerda() {
		return apreensaoEsquerda;
	}
	public void setApreensaoEsquerda(String apreensaoEsquerda) {
		this.apreensaoEsquerda = apreensaoEsquerda;
	}
	public String getInstabilidadePosteriorDireita() {
		return instabilidadePosteriorDireita;
	}
	public void setInstabilidadePosteriorDireita(
			String instabilidadePosteriorDireita) {
		this.instabilidadePosteriorDireita = instabilidadePosteriorDireita;
	}
	public String getInstabilidadePosteriorEsquerdo() {
		return instabilidadePosteriorEsquerdo;
	}
	public void setInstabilidadePosteriorEsquerdo(
			String instabilidadePosteriorEsquerdo) {
		this.instabilidadePosteriorEsquerdo = instabilidadePosteriorEsquerdo;
	}
	public String getGavetaAnteriorDireito() {
		return gavetaAnteriorDireito;
	}
	public void setGavetaAnteriorDireito(String gavetaAnteriorDireito) {
		this.gavetaAnteriorDireito = gavetaAnteriorDireito;
	}
	public String getGavetaAnteriorEsquerdo() {
		return gavetaAnteriorEsquerdo;
	}
	public void setGavetaAnteriorEsquerdo(String gavetaAnteriorEsquerdo) {
		this.gavetaAnteriorEsquerdo = gavetaAnteriorEsquerdo;
	}
	public String getGavetaPosteriorDireito() {
		return gavetaPosteriorDireito;
	}
	public void setGavetaPosteriorDireito(String gavetaPosteriorDireito) {
		this.gavetaPosteriorDireito = gavetaPosteriorDireito;
	}
	public String getGavetaPosteriorEsquerdo() {
		return gavetaPosteriorEsquerdo;
	}
	public void setGavetaPosteriorEsquerdo(String gavetaPosteriorEsquerdo) {
		this.gavetaPosteriorEsquerdo = gavetaPosteriorEsquerdo;
	}
	public String getSulcoOuSinalDeDragonaDireito() {
		return sulcoOuSinalDeDragonaDireito;
	}
	public void setSulcoOuSinalDeDragonaDireito(String sulcoOuSinalDeDragonaDireito) {
		this.sulcoOuSinalDeDragonaDireito = sulcoOuSinalDeDragonaDireito;
	}
	public String getSulcoOuSinalDeDragonaEsquerdo() {
		return sulcoOuSinalDeDragonaEsquerdo;
	}
	public void setSulcoOuSinalDeDragonaEsquerdo(
			String sulcoOuSinalDeDragonaEsquerdo) {
		this.sulcoOuSinalDeDragonaEsquerdo = sulcoOuSinalDeDragonaEsquerdo;
	}
	
	
	
}
