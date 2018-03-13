package br.com.anglo.Clinica.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class FichaOrtopediaAlteracaoPostural {
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
	 * A - VISTA ANTERIOR: 
	 * A.1 - P�: 
	 * DIREITO>> 
	 */ 
	
	private boolean peDireitoHaluxValgo;
	private boolean peDireitoHaluxVaro;
	private boolean peDireitoRetropeValgo;
	private boolean peDireitoRetropeVaro;
	private boolean peDireitoAntepeValgo;
	private boolean peDireitoAntepeVaro;
	private boolean peDireitoArcoPlano;
	private boolean peDireitoArcoCavo;
	
	/**
	 * A - VISTA ANTERIOR: 
	 * A.1 - P�: 
	 * ESQUERDO>> 
	 */ 
	
	private boolean peEsquerdoHaluxValgo;
	private boolean peEsquerdoHaluxVaro;
	private boolean peEsquerdoRetropeValgo;
	private boolean peEsquerdoRetropeVaro;
	private boolean peEsquerdoAntepeValgo;
	private boolean peEsquerdoAntepeVaro;
	private boolean peEsquerdoArcoPlano;
	private boolean peEsquerdoArcoCavo;
	
	/**
	 * APOIO
	 * A.2 - APOIO
	 * DIREITO
	 */
	
	private boolean apoioDireitoApoioHarmonicoNoBordoMedialLateral;
	private boolean apoioDireitoMaiorApoioEmBordoMedial; 
	private boolean apoioDireitoMaiorApoioEmBordoLateral;
	
	/**
	 * APOIO
	 * A.2 - APOIO
	 * ESQUERDO
	 */
	
	private boolean apoioEsquerdoApoioHarmonicoNoBordoMedialLateral;
	private boolean apoioEsquerdoMaiorApoioEmBordoMedial; 
	private boolean apoioEsquerdoMaiorApoioEmBordoLateral;
	
	/**
	 * A.3 - JOELHO
	 * DIREITO: 
	 */
	private boolean joelhoDireitoValgo;
	private boolean joelhoDireitoVaro;
	private boolean joelhoDireitoRotacao;
	
	/**
	 * A.3 - JOELHO
	 * ESQUERDO: 
	 */
	private boolean joelhoEsquerdoValgo;
	private boolean joelhoEsquerdoVaro;
	private boolean joelhoEsquerdoRotacao;
	
	private String joelhoSeValgo;
	private String joelhoSeVaro;
	
	
	/**
	 * A.4 PALETAS: 
	 * DIREITO
	 */
	private boolean paletasDireitoAlinhadas;
	private boolean paletasDireitoAlta;
	private boolean paletasDireitoRodadaLateralmente;
	private boolean paletasDireitoRodadaMedialmente;
	
	/**
	 * A.4 PALETAS: 
	 * ESQUERDO
	 */
	
	private boolean paletasEsquerdoAlinhadas;
	private boolean paletasEsquerdoAlta;
	private boolean paletasEsquerdoRodadaLateralmente;
	private boolean paletasEsquerdoRodadaMedialmente;
	
	/**
	 * A.5 - QUADRIL
	 * DIREITO
	 */
	private boolean quadrilDireitoAlinhado;
	private boolean quadrilDireitoFletido;
	private boolean quadrilDireitoEstendido;
	
	/**
	 * A.5 - QUADRIL
	 * ESQUERDO
	 */
	private boolean quadrilEsquerdoAlinhado;
	private boolean quadrilEsquerdoFletido;
	private boolean quadrilEsquerdoEstendido;
	
	/**
	 * A.6 PELVE 
	 */
	private boolean pelveRetroversao;
	private boolean pelveAnteversao;
	private boolean pelveAssimetriaDeCristas;
	private boolean rotacao;
	
	/**
	 * A.7 - ESPINHAS EL�ACAS �NTERO-SUPERIORES (EIAS):
	 */
	private boolean eiasAlinhadas;
	private boolean eiasDesalinhadas;
	
	/**
	 * A.8 - CRISTAS AL�ACAS: 
	 */
	private boolean cristasAliacasAlinhadas;
	private boolean cristasAliacasDesalinhadas;
	/**
	 * A.9 - T�RAX: 
	 */
	private boolean toraxSimetrico;
	private boolean toraxAssimetrico;
	
	/**
	 * A.10 - OMBROS
	 */
	
	private boolean ombrosDireitoProtuso;
	private boolean ombrosDireitoRetruso;
	private boolean ombrosDireitoDeprimido;
	private boolean ombrosDireitoElevado;
	
	private boolean ombrosEsquerdoProtuso;
	private boolean ombrosEsquerdoRetruso;
	private boolean ombrosEsquerdoDeprimido;
	private boolean ombrosEsquerdoElevado;
	
	/**
	 * A.11 - CLAV�CULAS:
	 */
	private boolean claviculaDireitoVerticalizada;
	private boolean claviculaDireitoHorizontalizada;
	private boolean claviculaDireitoNormal;
	
	private boolean claviculaEsquerdoVerticalizada;
	private boolean claviculaEsquerdoHorizontalizada;
	private boolean claviculaEsquerdoNormal;
	
	
	/**
	 * A12 - CABE�A
	 */
	private boolean cabecaAnteriorizada;
	private boolean cabecaInclinada;
	private boolean cabecaPosteriorizada;
	private boolean cabecaRodada; 
	
	
	/**
	 * B - VISTA POSTERIOR
	 * B1 - TEND�ES DO CALC�NEO
	 */
	private boolean tendoesDoCalcaneoDireitoVerticais;
	private boolean tendoesDoCalcaneoDireitoValgos;
	private boolean tendoesDoCalcaneoDireitoVaros;
	private boolean tendoesDoCalcaneoDireitoAssimetricos;
	
	private boolean tendoesDoCalcaneoEsquerdoVerticais;
	private boolean tendoesDoCalcaneoEsquerdoValgos;
	private boolean tendoesDoCalcaneoEsquerdoVaros; 
	private boolean tendoesDoCalcaneoEsquerdoAssimetricos;
	
	/**
	 * B.2 - LOMBAR
	 */
	private boolean lombarLordose; 
	private boolean lombarHiperlordose;
	private boolean lombarRetificada;
	private boolean lombarGibosidade;
	
	/**
	 * B.3 - ESPINHAS IL�ACAS POSTERO-SUPERIORES (EIPS): 
	 */
	private boolean eipsAlinhadas;
	private boolean eipsDesalinhadas;
	
	/**
	 * B.4 - DORSAL
	 */
	private boolean dorsalHipercifose;
	private boolean dorsalLordoseInterescapular; 
	private boolean dorsalDiafragmatica;
	private boolean dorsalGibosidade; 
	
	/**
	 * B.5 - ENC�PULAS: 
	 */
	
	private boolean escapulasDireitoAduzida; 
	private boolean escapulasDireitoAbduzida;
	private boolean escapulasDireitoAlada; 
	private boolean escapulasDireitoElevada;
	private boolean escapulasDireitoDeprimida;
	private boolean escapulasDireitoBasculaLateral;
	private boolean escapulasDireitoBasculaMedial;
	
	private boolean escapulasEsquerdoAduzida;
	private boolean escapulasEsquerdoAbduzida;
	private boolean escapulasEsquerdoAlada;
	private boolean escapulasEsquerdoElevada;
	private boolean escapulasEsquerdoDeprimida;
	private boolean escapulasEsquerdoBasculaLateral;
	private boolean escapulasEsquerdoBasculaMedial;
	
	/**
	 * C - VISTA LATERAL
	 * C.1 - JOELHOS: 
	 */
	
	private boolean joelhoDireitoFlexo;
	private boolean joelhoDireitoRecurtavo;
	
	private boolean joelhoEsquerdoFlexo;
	private boolean joelhoEsquerdoRecurvato;
	
	
	/**
	 * C.2 - PELVE: 
	 */
	private boolean lateralPelveRetroversao;
	private boolean lateralPelvepelveAnteversao;
	
	/**
	 * C.3 - LOMBAR: 
	 */
	
	private boolean lateralLombarLordose; 
	private boolean lateralLombarHiberlordose;
	private boolean lateralLombarRetificada;
	private boolean lateralLombarGibosidade; 

	/**
	 * C.4 - ESPINHA ILIACAS P�STERO SUPERIORES: 
	 */
	
	private boolean lateralEipsAlinhadas;
	private boolean lateralEipsDesalinhadas;
	
	/**
	 * C.5 - DORSAL
	 */
	
	private boolean lateralDorsalHipercifose; 
	private boolean lateralDorsalGibosidade; 
	
	/**
	 * C.6 - CERVICAL
	 */
	private boolean lateralCervicalRetificada;
	private boolean lateralCervicalLordose;
	private boolean lateralCervicalHiberlordose;
	
	/**
	 * C.7 - OMBROS
	 */
	private boolean lateralOmbrosDireitoProtuso;
	private boolean lateralOmbrosDireitoRetruso;
	private boolean lateralOmbrosEsquerdoProtuso;
	private boolean lateralOmbrosEsquerdoRetruso;
	
	
	/**
	 * C.8 - CABE�A
	 */
	
	private boolean lateralCabecaAnteriorizada;
	private boolean lateralCabecaPosteriorizada;
	
	
	
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
	public boolean isPeDireitoHaluxValgo() {
		return peDireitoHaluxValgo;
	}
	public void setPeDireitoHaluxValgo(boolean peDireitoHaluxValgo) {
		this.peDireitoHaluxValgo = peDireitoHaluxValgo;
	}
	public boolean isPeDireitoHaluxVaro() {
		return peDireitoHaluxVaro;
	}
	public void setPeDireitoHaluxVaro(boolean peDireitoHaluxVaro) {
		this.peDireitoHaluxVaro = peDireitoHaluxVaro;
	}
	public boolean isPeDireitoRetropeValgo() {
		return peDireitoRetropeValgo;
	}
	public void setPeDireitoRetropeValgo(boolean peDireitoRetropeValgo) {
		this.peDireitoRetropeValgo = peDireitoRetropeValgo;
	}
	public boolean isPeDireitoRetropeVaro() {
		return peDireitoRetropeVaro;
	}
	public void setPeDireitoRetropeVaro(boolean peDireitoRetropeVaro) {
		this.peDireitoRetropeVaro = peDireitoRetropeVaro;
	}
	public boolean isPeDireitoAntepeValgo() {
		return peDireitoAntepeValgo;
	}
	public void setPeDireitoAntepeValgo(boolean peDireitoAntepeValgo) {
		this.peDireitoAntepeValgo = peDireitoAntepeValgo;
	}
	public boolean isPeDireitoAntepeVaro() {
		return peDireitoAntepeVaro;
	}
	public void setPeDireitoAntepeVaro(boolean peDireitoAntepeVaro) {
		this.peDireitoAntepeVaro = peDireitoAntepeVaro;
	}
	public boolean isPeDireitoArcoPlano() {
		return peDireitoArcoPlano;
	}
	public void setPeDireitoArcoPlano(boolean peDireitoArcoPlano) {
		this.peDireitoArcoPlano = peDireitoArcoPlano;
	}
	public boolean isPeDireitoArcoCavo() {
		return peDireitoArcoCavo;
	}
	public void setPeDireitoArcoCavo(boolean peDireitoArcoCavo) {
		this.peDireitoArcoCavo = peDireitoArcoCavo;
	}
	public boolean isPeEsquerdoHaluxValgo() {
		return peEsquerdoHaluxValgo;
	}
	public void setPeEsquerdoHaluxValgo(boolean peEsquerdoHaluxValgo) {
		this.peEsquerdoHaluxValgo = peEsquerdoHaluxValgo;
	}
	public boolean isPeEsquerdoHaluxVaro() {
		return peEsquerdoHaluxVaro;
	}
	public void setPeEsquerdoHaluxVaro(boolean peEsquerdoHaluxVaro) {
		this.peEsquerdoHaluxVaro = peEsquerdoHaluxVaro;
	}
	public boolean isPeEsquerdoRetropeValgo() {
		return peEsquerdoRetropeValgo;
	}
	public void setPeEsquerdoRetropeValgo(boolean peEsquerdoRetropeValgo) {
		this.peEsquerdoRetropeValgo = peEsquerdoRetropeValgo;
	}
	public boolean isPeEsquerdoRetropeVaro() {
		return peEsquerdoRetropeVaro;
	}
	public void setPeEsquerdoRetropeVaro(boolean peEsquerdoRetropeVaro) {
		this.peEsquerdoRetropeVaro = peEsquerdoRetropeVaro;
	}
	public boolean isPeEsquerdoAntepeValgo() {
		return peEsquerdoAntepeValgo;
	}
	public void setPeEsquerdoAntepeValgo(boolean peEsquerdoAntepeValgo) {
		this.peEsquerdoAntepeValgo = peEsquerdoAntepeValgo;
	}
	public boolean isPeEsquerdoAntepeVaro() {
		return peEsquerdoAntepeVaro;
	}
	public void setPeEsquerdoAntepeVaro(boolean peEsquerdoAntepeVaro) {
		this.peEsquerdoAntepeVaro = peEsquerdoAntepeVaro;
	}
	public boolean isPeEsquerdoArcoPlano() {
		return peEsquerdoArcoPlano;
	}
	public void setPeEsquerdoArcoPlano(boolean peEsquerdoArcoPlano) {
		this.peEsquerdoArcoPlano = peEsquerdoArcoPlano;
	}
	public boolean isPeEsquerdoArcoCavo() {
		return peEsquerdoArcoCavo;
	}
	public void setPeEsquerdoArcoCavo(boolean peEsquerdoArcoCavo) {
		this.peEsquerdoArcoCavo = peEsquerdoArcoCavo;
	}
	public boolean isApoioDireitoApoioHarmonicoNoBordoMedialLateral() {
		return apoioDireitoApoioHarmonicoNoBordoMedialLateral;
	}
	public void setApoioDireitoApoioHarmonicoNoBordoMedialLateral(
			boolean apoioDireitoApoioHarmonicoNoBordoMedialLateral) {
		this.apoioDireitoApoioHarmonicoNoBordoMedialLateral = apoioDireitoApoioHarmonicoNoBordoMedialLateral;
	}
	public boolean isApoioDireitoMaiorApoioEmBordoMedial() {
		return apoioDireitoMaiorApoioEmBordoMedial;
	}
	public void setApoioDireitoMaiorApoioEmBordoMedial(
			boolean apoioDireitoMaiorApoioEmBordoMedial) {
		this.apoioDireitoMaiorApoioEmBordoMedial = apoioDireitoMaiorApoioEmBordoMedial;
	}
	public boolean isApoioDireitoMaiorApoioEmBordoLateral() {
		return apoioDireitoMaiorApoioEmBordoLateral;
	}
	public void setApoioDireitoMaiorApoioEmBordoLateral(
			boolean apoioDireitoMaiorApoioEmBordoLateral) {
		this.apoioDireitoMaiorApoioEmBordoLateral = apoioDireitoMaiorApoioEmBordoLateral;
	}
	public boolean isApoioEsquerdoApoioHarmonicoNoBordoMedialLateral() {
		return apoioEsquerdoApoioHarmonicoNoBordoMedialLateral;
	}
	public void setApoioEsquerdoApoioHarmonicoNoBordoMedialLateral(
			boolean apoioEsquerdoApoioHarmonicoNoBordoMedialLateral) {
		this.apoioEsquerdoApoioHarmonicoNoBordoMedialLateral = apoioEsquerdoApoioHarmonicoNoBordoMedialLateral;
	}
	public boolean isApoioEsquerdoMaiorApoioEmBordoMedial() {
		return apoioEsquerdoMaiorApoioEmBordoMedial;
	}
	public void setApoioEsquerdoMaiorApoioEmBordoMedial(
			boolean apoioEsquerdoMaiorApoioEmBordoMedial) {
		this.apoioEsquerdoMaiorApoioEmBordoMedial = apoioEsquerdoMaiorApoioEmBordoMedial;
	}
	public boolean isApoioEsquerdoMaiorApoioEmBordoLateral() {
		return apoioEsquerdoMaiorApoioEmBordoLateral;
	}
	public void setApoioEsquerdoMaiorApoioEmBordoLateral(
			boolean apoioEsquerdoMaiorApoioEmBordoLateral) {
		this.apoioEsquerdoMaiorApoioEmBordoLateral = apoioEsquerdoMaiorApoioEmBordoLateral;
	}
	public boolean isJoelhoDireitoValgo() {
		return joelhoDireitoValgo;
	}
	public void setJoelhoDireitoValgo(boolean joelhoDireitoValgo) {
		this.joelhoDireitoValgo = joelhoDireitoValgo;
	}
	public boolean isJoelhoDireitoVaro() {
		return joelhoDireitoVaro;
	}
	public void setJoelhoDireitoVaro(boolean joelhoDireitoVaro) {
		this.joelhoDireitoVaro = joelhoDireitoVaro;
	}
	public boolean isJoelhoDireitoRotacao() {
		return joelhoDireitoRotacao;
	}
	public void setJoelhoDireitoRotacao(boolean joelhoDireitoRotacao) {
		this.joelhoDireitoRotacao = joelhoDireitoRotacao;
	}
	public boolean isJoelhoEsquerdoValgo() {
		return joelhoEsquerdoValgo;
	}
	public void setJoelhoEsquerdoValgo(boolean joelhoEsquerdoValgo) {
		this.joelhoEsquerdoValgo = joelhoEsquerdoValgo;
	}
	public boolean isJoelhoEsquerdoVaro() {
		return joelhoEsquerdoVaro;
	}
	public void setJoelhoEsquerdoVaro(boolean joelhoEsquerdoVaro) {
		this.joelhoEsquerdoVaro = joelhoEsquerdoVaro;
	}
	public boolean isJoelhoEsquerdoRotacao() {
		return joelhoEsquerdoRotacao;
	}
	public void setJoelhoEsquerdoRotacao(boolean joelhoEsquerdoRotacao) {
		this.joelhoEsquerdoRotacao = joelhoEsquerdoRotacao;
	}
	public String getJoelhoSeValgo() {
		return joelhoSeValgo;
	}
	public void setJoelhoSeValgo(String joelhoSeValgo) {
		this.joelhoSeValgo = joelhoSeValgo;
	}
	public String getJoelhoSeVaro() {
		return joelhoSeVaro;
	}
	public void setJoelhoSeVaro(String joelhoSeVaro) {
		this.joelhoSeVaro = joelhoSeVaro;
	}
	public boolean isPaletasDireitoAlinhadas() {
		return paletasDireitoAlinhadas;
	}
	public void setPaletasDireitoAlinhadas(boolean paletasDireitoAlinhadas) {
		this.paletasDireitoAlinhadas = paletasDireitoAlinhadas;
	}
	public boolean isPaletasDireitoAlta() {
		return paletasDireitoAlta;
	}
	public void setPaletasDireitoAlta(boolean paletasDireitoAlta) {
		this.paletasDireitoAlta = paletasDireitoAlta;
	}
	public boolean isPaletasDireitoRodadaLateralmente() {
		return paletasDireitoRodadaLateralmente;
	}
	public void setPaletasDireitoRodadaLateralmente(
			boolean paletasDireitoRodadaLateralmente) {
		this.paletasDireitoRodadaLateralmente = paletasDireitoRodadaLateralmente;
	}
	public boolean isPaletasDireitoRodadaMedialmente() {
		return paletasDireitoRodadaMedialmente;
	}
	public void setPaletasDireitoRodadaMedialmente(
			boolean paletasDireitoRodadaMedialmente) {
		this.paletasDireitoRodadaMedialmente = paletasDireitoRodadaMedialmente;
	}
	public boolean isPaletasEsquerdoAlinhadas() {
		return paletasEsquerdoAlinhadas;
	}
	public void setPaletasEsquerdoAlinhadas(boolean paletasEsquerdoAlinhadas) {
		this.paletasEsquerdoAlinhadas = paletasEsquerdoAlinhadas;
	}
	public boolean isPaletasEsquerdoAlta() {
		return paletasEsquerdoAlta;
	}
	public void setPaletasEsquerdoAlta(boolean paletasEsquerdoAlta) {
		this.paletasEsquerdoAlta = paletasEsquerdoAlta;
	}
	public boolean isPaletasEsquerdoRodadaLateralmente() {
		return paletasEsquerdoRodadaLateralmente;
	}
	public void setPaletasEsquerdoRodadaLateralmente(
			boolean paletasEsquerdoRodadaLateralmente) {
		this.paletasEsquerdoRodadaLateralmente = paletasEsquerdoRodadaLateralmente;
	}
	public boolean isPaletasEsquerdoRodadaMedialmente() {
		return paletasEsquerdoRodadaMedialmente;
	}
	public void setPaletasEsquerdoRodadaMedialmente(
			boolean paletasEsquerdoRodadaMedialmente) {
		this.paletasEsquerdoRodadaMedialmente = paletasEsquerdoRodadaMedialmente;
	}
	public boolean isQuadrilDireitoAlinhado() {
		return quadrilDireitoAlinhado;
	}
	public void setQuadrilDireitoAlinhado(boolean quadrilDireitoAlinhado) {
		this.quadrilDireitoAlinhado = quadrilDireitoAlinhado;
	}
	public boolean isQuadrilDireitoFletido() {
		return quadrilDireitoFletido;
	}
	public void setQuadrilDireitoFletido(boolean quadrilDireitoFletido) {
		this.quadrilDireitoFletido = quadrilDireitoFletido;
	}
	public boolean isQuadrilDireitoEstendido() {
		return quadrilDireitoEstendido;
	}
	public void setQuadrilDireitoEstendido(boolean quadrilDireitoEstendido) {
		this.quadrilDireitoEstendido = quadrilDireitoEstendido;
	}
	public boolean isQuadrilEsquerdoAlinhado() {
		return quadrilEsquerdoAlinhado;
	}
	public void setQuadrilEsquerdoAlinhado(boolean quadrilEsquerdoAlinhado) {
		this.quadrilEsquerdoAlinhado = quadrilEsquerdoAlinhado;
	}
	public boolean isQuadrilEsquerdoFletido() {
		return quadrilEsquerdoFletido;
	}
	public void setQuadrilEsquerdoFletido(boolean quadrilEsquerdoFletido) {
		this.quadrilEsquerdoFletido = quadrilEsquerdoFletido;
	}
	public boolean isQuadrilEsquerdoEstendido() {
		return quadrilEsquerdoEstendido;
	}
	public void setQuadrilEsquerdoEstendido(boolean quadrilEsquerdoEstendido) {
		this.quadrilEsquerdoEstendido = quadrilEsquerdoEstendido;
	}
	public boolean isPelveRetroversao() {
		return pelveRetroversao;
	}
	public void setPelveRetroversao(boolean pelveRetroversao) {
		this.pelveRetroversao = pelveRetroversao;
	}
	public boolean isPelveAnteversao() {
		return pelveAnteversao;
	}
	public void setPelveAnteversao(boolean pelveAnteversao) {
		this.pelveAnteversao = pelveAnteversao;
	}
	public boolean isPelveAssimetriaDeCristas() {
		return pelveAssimetriaDeCristas;
	}
	public void setPelveAssimetriaDeCristas(boolean pelveAssimetriaDeCristas) {
		this.pelveAssimetriaDeCristas = pelveAssimetriaDeCristas;
	}
	public boolean isRotacao() {
		return rotacao;
	}
	public void setRotacao(boolean rotacao) {
		this.rotacao = rotacao;
	}
	public boolean isEiasAlinhadas() {
		return eiasAlinhadas;
	}
	public void setEiasAlinhadas(boolean eiasAlinhadas) {
		this.eiasAlinhadas = eiasAlinhadas;
	}
	public boolean isEiasDesalinhadas() {
		return eiasDesalinhadas;
	}
	public void setEiasDesalinhadas(boolean eiasDesalinhadas) {
		this.eiasDesalinhadas = eiasDesalinhadas;
	}
	public boolean isCristasAliacasAlinhadas() {
		return cristasAliacasAlinhadas;
	}
	public void setCristasAliacasAlinhadas(boolean cristasAliacasAlinhadas) {
		this.cristasAliacasAlinhadas = cristasAliacasAlinhadas;
	}
	public boolean isCristasAliacasDesalinhadas() {
		return cristasAliacasDesalinhadas;
	}
	public void setCristasAliacasDesalinhadas(boolean cristasAliacasDesalinhadas) {
		this.cristasAliacasDesalinhadas = cristasAliacasDesalinhadas;
	}
	public boolean isToraxSimetrico() {
		return toraxSimetrico;
	}
	public void setToraxSimetrico(boolean toraxSimetrico) {
		this.toraxSimetrico = toraxSimetrico;
	}
	public boolean isToraxAssimetrico() {
		return toraxAssimetrico;
	}
	public void setToraxAssimetrico(boolean toraxAssimetrico) {
		this.toraxAssimetrico = toraxAssimetrico;
	}
	public boolean isOmbrosDireitoProtuso() {
		return ombrosDireitoProtuso;
	}
	public void setOmbrosDireitoProtuso(boolean ombrosDireitoProtuso) {
		this.ombrosDireitoProtuso = ombrosDireitoProtuso;
	}
	public boolean isOmbrosDireitoRetruso() {
		return ombrosDireitoRetruso;
	}
	public void setOmbrosDireitoRetruso(boolean ombrosDireitoRetruso) {
		this.ombrosDireitoRetruso = ombrosDireitoRetruso;
	}
	public boolean isOmbrosDireitoDeprimido() {
		return ombrosDireitoDeprimido;
	}
	public void setOmbrosDireitoDeprimido(boolean ombrosDireitoDeprimido) {
		this.ombrosDireitoDeprimido = ombrosDireitoDeprimido;
	}
	public boolean isOmbrosDireitoElevado() {
		return ombrosDireitoElevado;
	}
	public void setOmbrosDireitoElevado(boolean ombrosDireitoElevado) {
		this.ombrosDireitoElevado = ombrosDireitoElevado;
	}
	public boolean isOmbrosEsquerdoProtuso() {
		return ombrosEsquerdoProtuso;
	}
	public void setOmbrosEsquerdoProtuso(boolean ombrosEsquerdoProtuso) {
		this.ombrosEsquerdoProtuso = ombrosEsquerdoProtuso;
	}
	public boolean isOmbrosEsquerdoRetruso() {
		return ombrosEsquerdoRetruso;
	}
	public void setOmbrosEsquerdoRetruso(boolean ombrosEsquerdoRetruso) {
		this.ombrosEsquerdoRetruso = ombrosEsquerdoRetruso;
	}
	public boolean isOmbrosEsquerdoDeprimido() {
		return ombrosEsquerdoDeprimido;
	}
	public void setOmbrosEsquerdoDeprimido(boolean ombrosEsquerdoDeprimido) {
		this.ombrosEsquerdoDeprimido = ombrosEsquerdoDeprimido;
	}
	public boolean isOmbrosEsquerdoElevado() {
		return ombrosEsquerdoElevado;
	}
	public void setOmbrosEsquerdoElevado(boolean ombrosEsquerdoElevado) {
		this.ombrosEsquerdoElevado = ombrosEsquerdoElevado;
	}
	public boolean isClaviculaDireitoVerticalizada() {
		return claviculaDireitoVerticalizada;
	}
	public void setClaviculaDireitoVerticalizada(
			boolean claviculaDireitoVerticalizada) {
		this.claviculaDireitoVerticalizada = claviculaDireitoVerticalizada;
	}
	public boolean isClaviculaDireitoHorizontalizada() {
		return claviculaDireitoHorizontalizada;
	}
	public void setClaviculaDireitoHorizontalizada(
			boolean claviculaDireitoHorizontalizada) {
		this.claviculaDireitoHorizontalizada = claviculaDireitoHorizontalizada;
	}
	public boolean isClaviculaDireitoNormal() {
		return claviculaDireitoNormal;
	}
	public void setClaviculaDireitoNormal(boolean claviculaDireitoNormal) {
		this.claviculaDireitoNormal = claviculaDireitoNormal;
	}
	public boolean isClaviculaEsquerdoVerticalizada() {
		return claviculaEsquerdoVerticalizada;
	}
	public void setClaviculaEsquerdoVerticalizada(
			boolean claviculaEsquerdoVerticalizada) {
		this.claviculaEsquerdoVerticalizada = claviculaEsquerdoVerticalizada;
	}
	public boolean isClaviculaEsquerdoHorizontalizada() {
		return claviculaEsquerdoHorizontalizada;
	}
	public void setClaviculaEsquerdoHorizontalizada(
			boolean claviculaEsquerdoHorizontalizada) {
		this.claviculaEsquerdoHorizontalizada = claviculaEsquerdoHorizontalizada;
	}
	public boolean isClaviculaEsquerdoNormal() {
		return claviculaEsquerdoNormal;
	}
	public void setClaviculaEsquerdoNormal(boolean claviculaEsquerdoNormal) {
		this.claviculaEsquerdoNormal = claviculaEsquerdoNormal;
	}
	public boolean isCabecaAnteriorizada() {
		return cabecaAnteriorizada;
	}
	public void setCabecaAnteriorizada(boolean cabecaAnteriorizada) {
		this.cabecaAnteriorizada = cabecaAnteriorizada;
	}
	public boolean isCabecaInclinada() {
		return cabecaInclinada;
	}
	public void setCabecaInclinada(boolean cabecaInclinada) {
		this.cabecaInclinada = cabecaInclinada;
	}
	public boolean isCabecaPosteriorizada() {
		return cabecaPosteriorizada;
	}
	public void setCabecaPosteriorizada(boolean cabecaPosteriorizada) {
		this.cabecaPosteriorizada = cabecaPosteriorizada;
	}
	public boolean isCabecaRodada() {
		return cabecaRodada;
	}
	public void setCabecaRodada(boolean cabecaRodada) {
		this.cabecaRodada = cabecaRodada;
	}
	public boolean isTendoesDoCalcaneoDireitoVerticais() {
		return tendoesDoCalcaneoDireitoVerticais;
	}
	public void setTendoesDoCalcaneoDireitoVerticais(
			boolean tendoesDoCalcaneoDireitoVerticais) {
		this.tendoesDoCalcaneoDireitoVerticais = tendoesDoCalcaneoDireitoVerticais;
	}
	public boolean isTendoesDoCalcaneoDireitoValgos() {
		return tendoesDoCalcaneoDireitoValgos;
	}
	public void setTendoesDoCalcaneoDireitoValgos(
			boolean tendoesDoCalcaneoDireitoValgos) {
		this.tendoesDoCalcaneoDireitoValgos = tendoesDoCalcaneoDireitoValgos;
	}
	public boolean isTendoesDoCalcaneoDireitoVaros() {
		return tendoesDoCalcaneoDireitoVaros;
	}
	public void setTendoesDoCalcaneoDireitoVaros(
			boolean tendoesDoCalcaneoDireitoVaros) {
		this.tendoesDoCalcaneoDireitoVaros = tendoesDoCalcaneoDireitoVaros;
	}
	public boolean isTendoesDoCalcaneoDireitoAssimetricos() {
		return tendoesDoCalcaneoDireitoAssimetricos;
	}
	public void setTendoesDoCalcaneoDireitoAssimetricos(
			boolean tendoesDoCalcaneoDireitoAssimetricos) {
		this.tendoesDoCalcaneoDireitoAssimetricos = tendoesDoCalcaneoDireitoAssimetricos;
	}
	public boolean isTendoesDoCalcaneoEsquerdoVerticais() {
		return tendoesDoCalcaneoEsquerdoVerticais;
	}
	public void setTendoesDoCalcaneoEsquerdoVerticais(
			boolean tendoesDoCalcaneoEsquerdoVerticais) {
		this.tendoesDoCalcaneoEsquerdoVerticais = tendoesDoCalcaneoEsquerdoVerticais;
	}
	public boolean isTendoesDoCalcaneoEsquerdoValgos() {
		return tendoesDoCalcaneoEsquerdoValgos;
	}
	public void setTendoesDoCalcaneoEsquerdoValgos(
			boolean tendoesDoCalcaneoEsquerdoValgos) {
		this.tendoesDoCalcaneoEsquerdoValgos = tendoesDoCalcaneoEsquerdoValgos;
	}
	public boolean isTendoesDoCalcaneoEsquerdoVaros() {
		return tendoesDoCalcaneoEsquerdoVaros;
	}
	public void setTendoesDoCalcaneoEsquerdoVaros(
			boolean tendoesDoCalcaneoEsquerdoVaros) {
		this.tendoesDoCalcaneoEsquerdoVaros = tendoesDoCalcaneoEsquerdoVaros;
	}
	public boolean isTendoesDoCalcaneoEsquerdoAssimetricos() {
		return tendoesDoCalcaneoEsquerdoAssimetricos;
	}
	public void setTendoesDoCalcaneoEsquerdoAssimetricos(
			boolean tendoesDoCalcaneoEsquerdoAssimetricos) {
		this.tendoesDoCalcaneoEsquerdoAssimetricos = tendoesDoCalcaneoEsquerdoAssimetricos;
	}
	public boolean isLombarLordose() {
		return lombarLordose;
	}
	public void setLombarLordose(boolean lombarLordose) {
		this.lombarLordose = lombarLordose;
	}
	public boolean isLombarHiperlordose() {
		return lombarHiperlordose;
	}
	public void setLombarHiperlordose(boolean lombarHiperlordose) {
		this.lombarHiperlordose = lombarHiperlordose;
	}
	public boolean isLombarRetificada() {
		return lombarRetificada;
	}
	public void setLombarRetificada(boolean lombarRetificada) {
		this.lombarRetificada = lombarRetificada;
	}
	public boolean isLombarGibosidade() {
		return lombarGibosidade;
	}
	public void setLombarGibosidade(boolean lombarGibosidade) {
		this.lombarGibosidade = lombarGibosidade;
	}
	public boolean isEipsAlinhadas() {
		return eipsAlinhadas;
	}
	public void setEipsAlinhadas(boolean eipsAlinhadas) {
		this.eipsAlinhadas = eipsAlinhadas;
	}
	public boolean isEipsDesalinhadas() {
		return eipsDesalinhadas;
	}
	public void setEipsDesalinhadas(boolean eipsDesalinhadas) {
		this.eipsDesalinhadas = eipsDesalinhadas;
	}
	public boolean isDorsalHipercifose() {
		return dorsalHipercifose;
	}
	public void setDorsalHipercifose(boolean dorsalHipercifose) {
		this.dorsalHipercifose = dorsalHipercifose;
	}
	public boolean isDorsalLordoseInterescapular() {
		return dorsalLordoseInterescapular;
	}
	public void setDorsalLordoseInterescapular(boolean dorsalLordoseInterescapular) {
		this.dorsalLordoseInterescapular = dorsalLordoseInterescapular;
	}
	public boolean isDorsalDiafragmatica() {
		return dorsalDiafragmatica;
	}
	public void setDorsalDiafragmatica(boolean dorsalDiafragmatica) {
		this.dorsalDiafragmatica = dorsalDiafragmatica;
	}
	public boolean isDorsalGibosidade() {
		return dorsalGibosidade;
	}
	public void setDorsalGibosidade(boolean dorsalGibosidade) {
		this.dorsalGibosidade = dorsalGibosidade;
	}
	public boolean isEscapulasDireitoAduzida() {
		return escapulasDireitoAduzida;
	}
	public void setEscapulasDireitoAduzida(boolean escapulasDireitoAduzida) {
		this.escapulasDireitoAduzida = escapulasDireitoAduzida;
	}
	public boolean isEscapulasDireitoAbduzida() {
		return escapulasDireitoAbduzida;
	}
	public void setEscapulasDireitoAbduzida(boolean escapulasDireitoAbduzida) {
		this.escapulasDireitoAbduzida = escapulasDireitoAbduzida;
	}
	public boolean isEscapulasDireitoAlada() {
		return escapulasDireitoAlada;
	}
	public void setEscapulasDireitoAlada(boolean escapulasDireitoAlada) {
		this.escapulasDireitoAlada = escapulasDireitoAlada;
	}
	public boolean isEscapulasDireitoElevada() {
		return escapulasDireitoElevada;
	}
	public void setEscapulasDireitoElevada(boolean escapulasDireitoElevada) {
		this.escapulasDireitoElevada = escapulasDireitoElevada;
	}
	public boolean isEscapulasDireitoDeprimida() {
		return escapulasDireitoDeprimida;
	}
	public void setEscapulasDireitoDeprimida(boolean escapulasDireitoDeprimida) {
		this.escapulasDireitoDeprimida = escapulasDireitoDeprimida;
	}
	public boolean isEscapulasDireitoBasculaLateral() {
		return escapulasDireitoBasculaLateral;
	}
	public void setEscapulasDireitoBasculaLateral(
			boolean escapulasDireitoBasculaLateral) {
		this.escapulasDireitoBasculaLateral = escapulasDireitoBasculaLateral;
	}

	
	public boolean isEscapulasDireitoBasculaMedial() {
		return escapulasDireitoBasculaMedial;
	}
	public void setEscapulasDireitoBasculaMedial(boolean escapulasDireitoBasculaMedial) {
		this.escapulasDireitoBasculaMedial = escapulasDireitoBasculaMedial;
	}
	public boolean isEscapulasEsquerdoAduzida() {
		return escapulasEsquerdoAduzida;
	}
	public void setEscapulasEsquerdoAduzida(boolean escapulasEsquerdoAduzida) {
		this.escapulasEsquerdoAduzida = escapulasEsquerdoAduzida;
	}
	public boolean isEscapulasEsquerdoAbduzida() {
		return escapulasEsquerdoAbduzida;
	}
	public void setEscapulasEsquerdoAbduzida(boolean escapulasEsquerdoAbduzida) {
		this.escapulasEsquerdoAbduzida = escapulasEsquerdoAbduzida;
	}
	public boolean isEscapulasEsquerdoAlada() {
		return escapulasEsquerdoAlada;
	}
	public void setEscapulasEsquerdoAlada(boolean escapulasEsquerdoAlada) {
		this.escapulasEsquerdoAlada = escapulasEsquerdoAlada;
	}
	public boolean isEscapulasEsquerdoElevada() {
		return escapulasEsquerdoElevada;
	}
	public void setEscapulasEsquerdoElevada(boolean escapulasEsquerdoElevada) {
		this.escapulasEsquerdoElevada = escapulasEsquerdoElevada;
	}
	public boolean isEscapulasEsquerdoDeprimida() {
		return escapulasEsquerdoDeprimida;
	}
	public void setEscapulasEsquerdoDeprimida(boolean escapulasEsquerdoDeprimida) {
		this.escapulasEsquerdoDeprimida = escapulasEsquerdoDeprimida;
	}
	public boolean isEscapulasEsquerdoBasculaLateral() {
		return escapulasEsquerdoBasculaLateral;
	}
	public void setEscapulasEsquerdoBasculaLateral(
			boolean escapulasEsquerdoBasculaLateral) {
		this.escapulasEsquerdoBasculaLateral = escapulasEsquerdoBasculaLateral;
	}
	public boolean isEscapulasEsquerdoBasculaMedial() {
		return escapulasEsquerdoBasculaMedial;
	}
	public void setEscapulasEsquerdoBasculaMedial(
			boolean escapulasEsquerdoBasculaMedial) {
		this.escapulasEsquerdoBasculaMedial = escapulasEsquerdoBasculaMedial;
	}
	public boolean isJoelhoDireitoFlexo() {
		return joelhoDireitoFlexo;
	}
	public void setJoelhoDireitoFlexo(boolean joelhoDireitoFlexo) {
		this.joelhoDireitoFlexo = joelhoDireitoFlexo;
	}
	public boolean isJoelhoDireitoRecurtavo() {
		return joelhoDireitoRecurtavo;
	}
	public void setJoelhoDireitoRecurtavo(boolean joelhoDireitoRecurtavo) {
		this.joelhoDireitoRecurtavo = joelhoDireitoRecurtavo;
	}
	public boolean isJoelhoEsquerdoFlexo() {
		return joelhoEsquerdoFlexo;
	}
	public void setJoelhoEsquerdoFlexo(boolean joelhoEsquerdoFlexo) {
		this.joelhoEsquerdoFlexo = joelhoEsquerdoFlexo;
	}
	public boolean isJoelhoEsquerdoRecurvato() {
		return joelhoEsquerdoRecurvato;
	}
	public void setJoelhoEsquerdoRecurvato(boolean joelhoEsquerdoRecurvato) {
		this.joelhoEsquerdoRecurvato = joelhoEsquerdoRecurvato;
	}
	public boolean isLateralPelveRetroversao() {
		return lateralPelveRetroversao;
	}
	public void setLateralPelveRetroversao(boolean lateralPelveRetroversao) {
		this.lateralPelveRetroversao = lateralPelveRetroversao;
	}
	public boolean isLateralPelvepelveAnteversao() {
		return lateralPelvepelveAnteversao;
	}
	public void setLateralPelvepelveAnteversao(boolean lateralPelvepelveAnteversao) {
		this.lateralPelvepelveAnteversao = lateralPelvepelveAnteversao;
	}
	public boolean isLateralLombarLordose() {
		return lateralLombarLordose;
	}
	public void setLateralLombarLordose(boolean lateralLombarLordose) {
		this.lateralLombarLordose = lateralLombarLordose;
	}
	public boolean isLateralLombarHiberlordose() {
		return lateralLombarHiberlordose;
	}
	public void setLateralLombarHiberlordose(boolean lateralLombarHiberlordose) {
		this.lateralLombarHiberlordose = lateralLombarHiberlordose;
	}
	public boolean isLateralLombarRetificada() {
		return lateralLombarRetificada;
	}
	public void setLateralLombarRetificada(boolean lateralLombarRetificada) {
		this.lateralLombarRetificada = lateralLombarRetificada;
	}
	public boolean isLateralLombarGibosidade() {
		return lateralLombarGibosidade;
	}
	public void setLateralLombarGibosidade(boolean lateralLombarGibosidade) {
		this.lateralLombarGibosidade = lateralLombarGibosidade;
	}
	public boolean isLateralEipsAlinhadas() {
		return lateralEipsAlinhadas;
	}
	public void setLateralEipsAlinhadas(boolean lateralEipsAlinhadas) {
		this.lateralEipsAlinhadas = lateralEipsAlinhadas;
	}
	public boolean isLateralEipsDesalinhadas() {
		return lateralEipsDesalinhadas;
	}
	public void setLateralEipsDesalinhadas(boolean lateralEipsDesalinhadas) {
		this.lateralEipsDesalinhadas = lateralEipsDesalinhadas;
	}
	public boolean isLateralDorsalHipercifose() {
		return lateralDorsalHipercifose;
	}
	public void setLateralDorsalHipercifose(boolean lateralDorsalHipercifose) {
		this.lateralDorsalHipercifose = lateralDorsalHipercifose;
	}
	public boolean isLateralDorsalGibosidade() {
		return lateralDorsalGibosidade;
	}
	public void setLateralDorsalGibosidade(boolean lateralDorsalGibosidade) {
		this.lateralDorsalGibosidade = lateralDorsalGibosidade;
	}
	public boolean isLateralCervicalRetificada() {
		return lateralCervicalRetificada;
	}
	public void setLateralCervicalRetificada(boolean lateralCervicalRetificada) {
		this.lateralCervicalRetificada = lateralCervicalRetificada;
	}
	public boolean isLateralCervicalLordose() {
		return lateralCervicalLordose;
	}
	public void setLateralCervicalLordose(boolean lateralCervicalLordose) {
		this.lateralCervicalLordose = lateralCervicalLordose;
	}
	public boolean isLateralCervicalHiberlordose() {
		return lateralCervicalHiberlordose;
	}
	public void setLateralCervicalHiberlordose(boolean lateralCervicalHiberlordose) {
		this.lateralCervicalHiberlordose = lateralCervicalHiberlordose;
	}
	public boolean isLateralOmbrosDireitoProtuso() {
		return lateralOmbrosDireitoProtuso;
	}
	public void setLateralOmbrosDireitoProtuso(boolean lateralOmbrosDireitoProtuso) {
		this.lateralOmbrosDireitoProtuso = lateralOmbrosDireitoProtuso;
	}
	public boolean isLateralOmbrosDireitoRetruso() {
		return lateralOmbrosDireitoRetruso;
	}
	public void setLateralOmbrosDireitoRetruso(boolean lateralOmbrosDireitoRetruso) {
		this.lateralOmbrosDireitoRetruso = lateralOmbrosDireitoRetruso;
	}
	public boolean isLateralOmbrosEsquerdoProtuso() {
		return lateralOmbrosEsquerdoProtuso;
	}
	public void setLateralOmbrosEsquerdoProtuso(boolean lateralOmbrosEsquerdoProtuso) {
		this.lateralOmbrosEsquerdoProtuso = lateralOmbrosEsquerdoProtuso;
	}
	public boolean isLateralOmbrosEsquerdoRetruso() {
		return lateralOmbrosEsquerdoRetruso;
	}
	public void setLateralOmbrosEsquerdoRetruso(boolean lateralOmbrosEsquerdoRetruso) {
		this.lateralOmbrosEsquerdoRetruso = lateralOmbrosEsquerdoRetruso;
	}
	public boolean isLateralCabecaAnteriorizada() {
		return lateralCabecaAnteriorizada;
	}
	public void setLateralCabecaAnteriorizada(boolean lateralCabecaAnteriorizada) {
		this.lateralCabecaAnteriorizada = lateralCabecaAnteriorizada;
	}
	public boolean isLateralCabecaPosteriorizada() {
		return lateralCabecaPosteriorizada;
	}
	public void setLateralCabecaPosteriorizada(boolean lateralCabecaPosteriorizada) {
		this.lateralCabecaPosteriorizada = lateralCabecaPosteriorizada;
	}	
}
