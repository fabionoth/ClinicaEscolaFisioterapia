package br.com.anglo.Clinica.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class FichaAvaliacaoNeuroPediatra {
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
	 * História da Gravidez
	 */
	
	private String primeiraGravidezRadio;
	private String idadeDaMae;
	private String estadoEmocional;
	private String obs; 
	
	/**
	 * Durante a gravidez
	 */
	
	private String fezUsoDeRemedios;
	private String depressao;
	private String infeccoes; 
	private String perdaDeLiquidoOuSangue;
	private String realizouPreNatal;
	private String BoaMovimentacaoDoBebe;
	private String PrimeiraVezQueOBebeMexeuMes;
	
	/**
	 * Historia do Parto
	 */
	private String tipoDeParto;
	private String partoATermo;
	private String chorouLogoQueNasceu;
	private String precisouDeOxigenio;
	private String entubado;
	private String foiParaEncubadora;
	private String intercorrenciasAposOparto;
	private String usoDeForceps;
	
	private String desenvolvimentoDaCrianca;
	private String sustentouACabeca;
	private String rolouPelaPrimeiraVez;
	private String sentouSozinha;
	private String engatinhou;
	private String comecouFicarDePe;
	private String andou;
	private String comecouATerControleDeEsfi;
	private String comesouAFalar;
	private String passouPorAlgumaCirurgia;
	private String estadoDeSaudeGeral;
	private String patologiasAssociadas;
	private String deficienciaAssociada;
	private String convulsao;
	private String alimentacao;
	private String sono;
	private String usoDeOrteses;
	private String aCriancaJaRealizouFisioterapia;
	private String sQuantoTempo;
	private String comoACriancaFicaEmCasa;
	private String fazUsoDoAndador;
	private String oQueACriancaConseugueRealizarSozinha;
	private String oQueACriancaRealizaComPoucaAjuda;
	private String avds;
	private String maiorDificuldadeDaMaeComOFilho;
	
	
	/**
	 * Historia Pregressa
	 */
	private String abortos;
	private String antecedentes;
	private String familiares;
	private String medicamentos;
	private String examesCompletos;
	
	/**
	 * ExameFisico
	 */
	
	private String apresentaMovimentosAtivos;
	private String qualidadeDosMovimentos;
	//TonusDeBase
	private String distonia;
	private String hipertonia;
	private String hipotonia;
	private String normotonia;
	
	/**
	 * Reflexos Presentes
	 */
	private boolean rtl;
	private boolean rtca;
	private boolean rtcs;
	private boolean reacoesAssociadas;
	private boolean reacaoPositivaDeSuporte;
	private boolean reacaoNegativaDeSuporte;
	private boolean reacaoCervicalDeRetificacao;
	private boolean reacaoCorAgindoSobreCorpo;
	private boolean reacaoLabirinticaDeRetificacao;
	private boolean reacaoRetificAgindoSobreAcabeca;
	private boolean reacaoDeAnfibio;
	private boolean reflexoDeMoro;
	private boolean recaoDeLandau;
	private boolean reacaoProtetoraOuParaQuedas;
	private boolean quatroPontosCardeais;
	private boolean reflexoDeSuccao;
	private boolean reflexoDeMordida;
	private boolean reflexoDeGalant;
	private boolean reflexoCutaneoPlantar;
	private boolean reacaoDeColocacao;
	private boolean marcaAutomatica;
	private boolean reflDePressaoPalmarEPlantar;
	
	/**
	 * Deficiencia Associadas
	 */
	
	private boolean fala;
	private boolean audicao;
	private boolean cognitivo;
	private boolean visao;
	private boolean emocional;
	private boolean outros;
	private String deformidades;
	private String criancaPrefere;
	
	/**
	 * Analise da postura da crianca
	 * Sulpino
	 */
	private boolean cabecaMedia;
	private boolean movAntiGravitacionais;
	private boolean acompanhaObjetoComOsOlhos;
	private boolean rolaEmBlogo;
	private boolean acompanhaObjetoComAsMaos;
	private boolean levaObjetoABoca;
	private boolean preensao;
	private boolean rolaComDisssociacaoDeCinturas;
	private String padraoDeMembrosSuperiores;
	private String padraoDeMembrosInferiores;
	//prono
	
	private boolean aceitaAPosicao;
	private boolean endireitaACabaca;
	private boolean puppyI;
	private boolean pyppyII;
	private boolean liberaUmBraco;
	private boolean fazTransferenciaLateral;
	private boolean temElevacaoDaCabecaTronco;
	private boolean pegaObjetos;
	private String padraoMMSS;
	private String padraoMMII;
	//Decubito Lateral
	private boolean seMantemNsPostura;
	private boolean decubitoPegaObjetos;
	//Sentado(puxadoParaSentar)
	private boolean alcancaAPosicaoSozinho;
	private boolean sentaComApoio;
	private boolean sentaComApoioComBomEquilibro;
	private boolean projetaCorpoParaFrente;
	private boolean boaExtensaoDeColuna;
	private boolean CabecaLinhaMedia;
	private boolean pernasAjudamParaSentar;
	private boolean apoioParaProtecao;
	private boolean transferenciaDePeso;
	private boolean sentadoPegaObjetos;
	//Engatinhar
	private String quatroApoios;
	private String tresApoios;
	private boolean urso;
	//Em pé
	private boolean alcancaAPosiocaoSozinho;
	private boolean precisaDeApoio;
	private boolean cabecaNaLinhaMedia;
	private boolean emPePegaObjetos;
	private boolean equilibro;
	private boolean alinhamentoEApoioDeTodoPe;
	//Marca
	private String consegueRealizarMarcha;
	private String marchaEquilibro;
	private String Assimetrica;
	private String descargaDePEso;
	private String dissociacaoDeCinturas;
	private String apoioDePe;
	private String andaEmLinhaReta;
	private String deLado;
	private String paraTraz;
	private String sobeEDesceEscada;
	private String padraoDeMebrosSuperiores;
	private String posturaDoPasso;
	//OutrosProblemas
	private boolean cardiaco;
	private boolean respiratorio;
	private String outrosProblemas;
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
	public String getPrimeiraGravidezRadio() {
		return primeiraGravidezRadio;
	}
	public void setPrimeiraGravidezRadio(String primeiraGravidezRadio) {
		this.primeiraGravidezRadio = primeiraGravidezRadio;
	}
	public String getIdadeDaMae() {
		return idadeDaMae;
	}
	public void setIdadeDaMae(String idadeDaMae) {
		this.idadeDaMae = idadeDaMae;
	}
	public String getEstadoEmocional() {
		return estadoEmocional;
	}
	public void setEstadoEmocional(String estadoEmocional) {
		this.estadoEmocional = estadoEmocional;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public String getFezUsoDeRemedios() {
		return fezUsoDeRemedios;
	}
	public void setFezUsoDeRemedios(String fezUsoDeRemedios) {
		this.fezUsoDeRemedios = fezUsoDeRemedios;
	}
	public String getDepressao() {
		return depressao;
	}
	public void setDepressao(String depressao) {
		this.depressao = depressao;
	}
	public String getInfeccoes() {
		return infeccoes;
	}
	public void setInfeccoes(String infeccoes) {
		this.infeccoes = infeccoes;
	}
	public String getPerdaDeLiquidoOuSangue() {
		return perdaDeLiquidoOuSangue;
	}
	public void setPerdaDeLiquidoOuSangue(String perdaDeLiquidoOuSangue) {
		this.perdaDeLiquidoOuSangue = perdaDeLiquidoOuSangue;
	}
	public String getRealizouPreNatal() {
		return realizouPreNatal;
	}
	public void setRealizouPreNatal(String realizouPreNatal) {
		this.realizouPreNatal = realizouPreNatal;
	}
	public String getBoaMovimentacaoDoBebe() {
		return BoaMovimentacaoDoBebe;
	}
	public void setBoaMovimentacaoDoBebe(String boaMovimentacaoDoBebe) {
		BoaMovimentacaoDoBebe = boaMovimentacaoDoBebe;
	}
	public String getPrimeiraVezQueOBebeMexeuMes() {
		return PrimeiraVezQueOBebeMexeuMes;
	}
	public void setPrimeiraVezQueOBebeMexeuMes(String primeiraVezQueOBebeMexeuMes) {
		PrimeiraVezQueOBebeMexeuMes = primeiraVezQueOBebeMexeuMes;
	}
	public String getTipoDeParto() {
		return tipoDeParto;
	}
	public void setTipoDeParto(String tipoDeParto) {
		this.tipoDeParto = tipoDeParto;
	}
	public String getPartoATermo() {
		return partoATermo;
	}
	public void setPartoATermo(String partoATermo) {
		this.partoATermo = partoATermo;
	}
	public String getChorouLogoQueNasceu() {
		return chorouLogoQueNasceu;
	}
	public void setChorouLogoQueNasceu(String chorouLogoQueNasceu) {
		this.chorouLogoQueNasceu = chorouLogoQueNasceu;
	}
	public String getPrecisouDeOxigenio() {
		return precisouDeOxigenio;
	}
	public void setPrecisouDeOxigenio(String precisouDeOxigenio) {
		this.precisouDeOxigenio = precisouDeOxigenio;
	}
	public String getEntubado() {
		return entubado;
	}
	public void setEntubado(String entubado) {
		this.entubado = entubado;
	}
	public String getFoiParaEncubadora() {
		return foiParaEncubadora;
	}
	public void setFoiParaEncubadora(String foiParaEncubadora) {
		this.foiParaEncubadora = foiParaEncubadora;
	}
	public String getIntercorrenciasAposOparto() {
		return intercorrenciasAposOparto;
	}
	public void setIntercorrenciasAposOparto(String intercorrenciasAposOparto) {
		this.intercorrenciasAposOparto = intercorrenciasAposOparto;
	}
	public String getUsoDeForceps() {
		return usoDeForceps;
	}
	public void setUsoDeForceps(String usoDeForceps) {
		this.usoDeForceps = usoDeForceps;
	}
	public String getDesenvolvimentoDaCrianca() {
		return desenvolvimentoDaCrianca;
	}
	public void setDesenvolvimentoDaCrianca(String desenvolvimentoDaCrianca) {
		this.desenvolvimentoDaCrianca = desenvolvimentoDaCrianca;
	}
	public String getSustentouACabeca() {
		return sustentouACabeca;
	}
	public void setSustentouACabeca(String sustentouACabeca) {
		this.sustentouACabeca = sustentouACabeca;
	}
	public String getRolouPelaPrimeiraVez() {
		return rolouPelaPrimeiraVez;
	}
	public void setRolouPelaPrimeiraVez(String rolouPelaPrimeiraVez) {
		this.rolouPelaPrimeiraVez = rolouPelaPrimeiraVez;
	}
	public String getSentouSozinha() {
		return sentouSozinha;
	}
	public void setSentouSozinha(String sentouSozinha) {
		this.sentouSozinha = sentouSozinha;
	}
	public String getEngatinhou() {
		return engatinhou;
	}
	public void setEngatinhou(String engatinhou) {
		this.engatinhou = engatinhou;
	}
	public String getComecouFicarDePe() {
		return comecouFicarDePe;
	}
	public void setComecouFicarDePe(String comecouFicarDePe) {
		this.comecouFicarDePe = comecouFicarDePe;
	}
	public String getAndou() {
		return andou;
	}
	public void setAndou(String andou) {
		this.andou = andou;
	}
	public String getComecouATerControleDeEsfi() {
		return comecouATerControleDeEsfi;
	}
	public void setComecouATerControleDeEsfi(String comecouATerControleDeEsfi) {
		this.comecouATerControleDeEsfi = comecouATerControleDeEsfi;
	}
	public String getComesouAFalar() {
		return comesouAFalar;
	}
	public void setComesouAFalar(String comesouAFalar) {
		this.comesouAFalar = comesouAFalar;
	}
	public String getPassouPorAlgumaCirurgia() {
		return passouPorAlgumaCirurgia;
	}
	public void setPassouPorAlgumaCirurgia(String passouPorAlgumaCirurgia) {
		this.passouPorAlgumaCirurgia = passouPorAlgumaCirurgia;
	}
	public String getEstadoDeSaudeGeral() {
		return estadoDeSaudeGeral;
	}
	public void setEstadoDeSaudeGeral(String estadoDeSaudeGeral) {
		this.estadoDeSaudeGeral = estadoDeSaudeGeral;
	}
	public String getPatologiasAssociadas() {
		return patologiasAssociadas;
	}
	public void setPatologiasAssociadas(String patologiasAssociadas) {
		this.patologiasAssociadas = patologiasAssociadas;
	}
	public String getDeficienciaAssociada() {
		return deficienciaAssociada;
	}
	public void setDeficienciaAssociada(String deficienciaAssociada) {
		this.deficienciaAssociada = deficienciaAssociada;
	}
	public String getConvulsao() {
		return convulsao;
	}
	public void setConvulsao(String convulsao) {
		this.convulsao = convulsao;
	}
	public String getAlimentacao() {
		return alimentacao;
	}
	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	public String getSono() {
		return sono;
	}
	public void setSono(String sono) {
		this.sono = sono;
	}
	public String getUsoDeOrteses() {
		return usoDeOrteses;
	}
	public void setUsoDeOrteses(String usoDeOrteses) {
		this.usoDeOrteses = usoDeOrteses;
	}
	public String getaCriancaJaRealizouFisioterapia() {
		return aCriancaJaRealizouFisioterapia;
	}
	public void setaCriancaJaRealizouFisioterapia(
			String aCriancaJaRealizouFisioterapia) {
		this.aCriancaJaRealizouFisioterapia = aCriancaJaRealizouFisioterapia;
	}
	public String getsQuantoTempo() {
		return sQuantoTempo;
	}
	public void setsQuantoTempo(String sQuantoTempo) {
		this.sQuantoTempo = sQuantoTempo;
	}
	public String getComoACriancaFicaEmCasa() {
		return comoACriancaFicaEmCasa;
	}
	public void setComoACriancaFicaEmCasa(String comoACriancaFicaEmCasa) {
		this.comoACriancaFicaEmCasa = comoACriancaFicaEmCasa;
	}
	public String getFazUsoDoAndador() {
		return fazUsoDoAndador;
	}
	public void setFazUsoDoAndador(String fazUsoDoAndador) {
		this.fazUsoDoAndador = fazUsoDoAndador;
	}
	public String getoQueACriancaConseugueRealizarSozinha() {
		return oQueACriancaConseugueRealizarSozinha;
	}
	public void setoQueACriancaConseugueRealizarSozinha(
			String oQueACriancaConseugueRealizarSozinha) {
		this.oQueACriancaConseugueRealizarSozinha = oQueACriancaConseugueRealizarSozinha;
	}
	public String getoQueACriancaRealizaComPoucaAjuda() {
		return oQueACriancaRealizaComPoucaAjuda;
	}
	public void setoQueACriancaRealizaComPoucaAjuda(
			String oQueACriancaRealizaComPoucaAjuda) {
		this.oQueACriancaRealizaComPoucaAjuda = oQueACriancaRealizaComPoucaAjuda;
	}
	public String getAvds() {
		return avds;
	}
	public void setAvds(String avds) {
		this.avds = avds;
	}
	public String getMaiorDificuldadeDaMaeComOFilho() {
		return maiorDificuldadeDaMaeComOFilho;
	}
	public void setMaiorDificuldadeDaMaeComOFilho(
			String maiorDificuldadeDaMaeComOFilho) {
		this.maiorDificuldadeDaMaeComOFilho = maiorDificuldadeDaMaeComOFilho;
	}
	public String getAbortos() {
		return abortos;
	}
	public void setAbortos(String abortos) {
		this.abortos = abortos;
	}
	public String getAntecedentes() {
		return antecedentes;
	}
	public void setAntecedentes(String antecedentes) {
		this.antecedentes = antecedentes;
	}
	public String getFamiliares() {
		return familiares;
	}
	public void setFamiliares(String familiares) {
		this.familiares = familiares;
	}
	public String getMedicamentos() {
		return medicamentos;
	}
	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}
	public String getExamesCompletos() {
		return examesCompletos;
	}
	public void setExamesCompletos(String examesCompletos) {
		this.examesCompletos = examesCompletos;
	}
	public String getApresentaMovimentosAtivos() {
		return apresentaMovimentosAtivos;
	}
	public void setApresentaMovimentosAtivos(String apresentaMovimentosAtivos) {
		this.apresentaMovimentosAtivos = apresentaMovimentosAtivos;
	}
	public String getQualidadeDosMovimentos() {
		return qualidadeDosMovimentos;
	}
	public void setQualidadeDosMovimentos(String qualidadeDosMovimentos) {
		this.qualidadeDosMovimentos = qualidadeDosMovimentos;
	}
	public String getDistonia() {
		return distonia;
	}
	public void setDistonia(String distonia) {
		this.distonia = distonia;
	}
	public String getHipertonia() {
		return hipertonia;
	}
	public void setHipertonia(String hipertonia) {
		this.hipertonia = hipertonia;
	}
	public String getHipotonia() {
		return hipotonia;
	}
	public void setHipotonia(String hipotonia) {
		this.hipotonia = hipotonia;
	}
	public String getNormotonia() {
		return normotonia;
	}
	public void setNormotonia(String normotonia) {
		this.normotonia = normotonia;
	}
	public boolean isRtl() {
		return rtl;
	}
	public void setRtl(boolean rtl) {
		this.rtl = rtl;
	}
	public boolean isRtca() {
		return rtca;
	}
	public void setRtca(boolean rtca) {
		this.rtca = rtca;
	}
	public boolean isRtcs() {
		return rtcs;
	}
	public void setRtcs(boolean rtcs) {
		this.rtcs = rtcs;
	}
	public boolean isReacoesAssociadas() {
		return reacoesAssociadas;
	}
	public void setReacoesAssociadas(boolean reacoesAssociadas) {
		this.reacoesAssociadas = reacoesAssociadas;
	}
	public boolean isReacaoPositivaDeSuporte() {
		return reacaoPositivaDeSuporte;
	}
	public void setReacaoPositivaDeSuporte(boolean reacaoPositivaDeSuporte) {
		this.reacaoPositivaDeSuporte = reacaoPositivaDeSuporte;
	}
	public boolean isReacaoNegativaDeSuporte() {
		return reacaoNegativaDeSuporte;
	}
	public void setReacaoNegativaDeSuporte(boolean reacaoNegativaDeSuporte) {
		this.reacaoNegativaDeSuporte = reacaoNegativaDeSuporte;
	}
	public boolean isReacaoCervicalDeRetificacao() {
		return reacaoCervicalDeRetificacao;
	}
	public void setReacaoCervicalDeRetificacao(boolean reacaoCervicalDeRetificacao) {
		this.reacaoCervicalDeRetificacao = reacaoCervicalDeRetificacao;
	}
	public boolean isReacaoCorAgindoSobreCorpo() {
		return reacaoCorAgindoSobreCorpo;
	}
	public void setReacaoCorAgindoSobreCorpo(boolean reacaoCorAgindoSobreCorpo) {
		this.reacaoCorAgindoSobreCorpo = reacaoCorAgindoSobreCorpo;
	}
	public boolean isReacaoLabirinticaDeRetificacao() {
		return reacaoLabirinticaDeRetificacao;
	}
	public void setReacaoLabirinticaDeRetificacao(
			boolean reacaoLabirinticaDeRetificacao) {
		this.reacaoLabirinticaDeRetificacao = reacaoLabirinticaDeRetificacao;
	}
	public boolean isReacaoRetificAgindoSobreAcabeca() {
		return reacaoRetificAgindoSobreAcabeca;
	}
	public void setReacaoRetificAgindoSobreAcabeca(
			boolean reacaoRetificAgindoSobreAcabeca) {
		this.reacaoRetificAgindoSobreAcabeca = reacaoRetificAgindoSobreAcabeca;
	}
	public boolean isReacaoDeAnfibio() {
		return reacaoDeAnfibio;
	}
	public void setReacaoDeAnfibio(boolean reacaoDeAnfibio) {
		this.reacaoDeAnfibio = reacaoDeAnfibio;
	}
	public boolean isReflexoDeMoro() {
		return reflexoDeMoro;
	}
	public void setReflexoDeMoro(boolean reflexoDeMoro) {
		this.reflexoDeMoro = reflexoDeMoro;
	}
	public boolean isRecaoDeLandau() {
		return recaoDeLandau;
	}
	public void setRecaoDeLandau(boolean recaoDeLandau) {
		this.recaoDeLandau = recaoDeLandau;
	}
	public boolean isReacaoProtetoraOuParaQuedas() {
		return reacaoProtetoraOuParaQuedas;
	}
	public void setReacaoProtetoraOuParaQuedas(boolean reacaoProtetoraOuParaQuedas) {
		this.reacaoProtetoraOuParaQuedas = reacaoProtetoraOuParaQuedas;
	}
	public boolean isQuatroPontosCardeais() {
		return quatroPontosCardeais;
	}
	public void setQuatroPontosCardeais(boolean quatroPontosCardeais) {
		this.quatroPontosCardeais = quatroPontosCardeais;
	}
	public boolean isReflexoDeSuccao() {
		return reflexoDeSuccao;
	}
	public void setReflexoDeSuccao(boolean reflexoDeSuccao) {
		this.reflexoDeSuccao = reflexoDeSuccao;
	}
	public boolean isReflexoDeMordida() {
		return reflexoDeMordida;
	}
	public void setReflexoDeMordida(boolean reflexoDeMordida) {
		this.reflexoDeMordida = reflexoDeMordida;
	}
	public boolean isReflexoDeGalant() {
		return reflexoDeGalant;
	}
	public void setReflexoDeGalant(boolean reflexoDeGalant) {
		this.reflexoDeGalant = reflexoDeGalant;
	}
	public boolean isReflexoCutaneoPlantar() {
		return reflexoCutaneoPlantar;
	}
	public void setReflexoCutaneoPlantar(boolean reflexoCutaneoPlantar) {
		this.reflexoCutaneoPlantar = reflexoCutaneoPlantar;
	}
	public boolean isReacaoDeColocacao() {
		return reacaoDeColocacao;
	}
	public void setReacaoDeColocacao(boolean reacaoDeColocacao) {
		this.reacaoDeColocacao = reacaoDeColocacao;
	}
	public boolean isMarcaAutomatica() {
		return marcaAutomatica;
	}
	public void setMarcaAutomatica(boolean marcaAutomatica) {
		this.marcaAutomatica = marcaAutomatica;
	}
	public boolean isReflDePressaoPalmarEPlantar() {
		return reflDePressaoPalmarEPlantar;
	}
	public void setReflDePressaoPalmarEPlantar(boolean reflDePressaoPalmarEPlantar) {
		this.reflDePressaoPalmarEPlantar = reflDePressaoPalmarEPlantar;
	}
	public boolean isFala() {
		return fala;
	}
	public void setFala(boolean fala) {
		this.fala = fala;
	}
	public boolean isAudicao() {
		return audicao;
	}
	public void setAudicao(boolean audicao) {
		this.audicao = audicao;
	}
	public boolean isCognitivo() {
		return cognitivo;
	}
	public void setCognitivo(boolean cognitivo) {
		this.cognitivo = cognitivo;
	}
	public boolean isVisao() {
		return visao;
	}
	public void setVisao(boolean visao) {
		this.visao = visao;
	}
	public boolean isEmocional() {
		return emocional;
	}
	public void setEmocional(boolean emocional) {
		this.emocional = emocional;
	}
	public boolean isOutros() {
		return outros;
	}
	public void setOutros(boolean outros) {
		this.outros = outros;
	}
	public String getDeformidades() {
		return deformidades;
	}
	public void setDeformidades(String deformidades) {
		this.deformidades = deformidades;
	}
	public String getCriancaPrefere() {
		return criancaPrefere;
	}
	public void setCriancaPrefere(String criancaPrefere) {
		this.criancaPrefere = criancaPrefere;
	}
	public boolean isCabecaMedia() {
		return cabecaMedia;
	}
	public void setCabecaMedia(boolean cabecaMedia) {
		this.cabecaMedia = cabecaMedia;
	}
	public boolean isMovAntiGravitacionais() {
		return movAntiGravitacionais;
	}
	public void setMovAntiGravitacionais(boolean movAntiGravitacionais) {
		this.movAntiGravitacionais = movAntiGravitacionais;
	}
	public boolean isAcompanhaObjetoComOsOlhos() {
		return acompanhaObjetoComOsOlhos;
	}
	public void setAcompanhaObjetoComOsOlhos(boolean acompanhaObjetoComOsOlhos) {
		this.acompanhaObjetoComOsOlhos = acompanhaObjetoComOsOlhos;
	}
	public boolean isRolaEmBlogo() {
		return rolaEmBlogo;
	}
	public void setRolaEmBlogo(boolean rolaEmBlogo) {
		this.rolaEmBlogo = rolaEmBlogo;
	}
	public boolean isAcompanhaObjetoComAsMaos() {
		return acompanhaObjetoComAsMaos;
	}
	public void setAcompanhaObjetoComAsMaos(boolean acompanhaObjetoComAsMaos) {
		this.acompanhaObjetoComAsMaos = acompanhaObjetoComAsMaos;
	}
	public boolean isLevaObjetoABoca() {
		return levaObjetoABoca;
	}
	public void setLevaObjetoABoca(boolean levaObjetoABoca) {
		this.levaObjetoABoca = levaObjetoABoca;
	}
	public boolean isPreensao() {
		return preensao;
	}
	public void setPreensao(boolean preensao) {
		this.preensao = preensao;
	}
	public boolean isRolaComDisssociacaoDeCinturas() {
		return rolaComDisssociacaoDeCinturas;
	}
	public void setRolaComDisssociacaoDeCinturas(
			boolean rolaComDisssociacaoDeCinturas) {
		this.rolaComDisssociacaoDeCinturas = rolaComDisssociacaoDeCinturas;
	}
	public String getPadraoDeMembrosSuperiores() {
		return padraoDeMembrosSuperiores;
	}
	public void setPadraoDeMembrosSuperiores(String padraoDeMembrosSuperiores) {
		this.padraoDeMembrosSuperiores = padraoDeMembrosSuperiores;
	}
	public String getPadraoDeMembrosInferiores() {
		return padraoDeMembrosInferiores;
	}
	public void setPadraoDeMembrosInferiores(String padraoDeMembrosInferiores) {
		this.padraoDeMembrosInferiores = padraoDeMembrosInferiores;
	}
	public boolean isAceitaAPosicao() {
		return aceitaAPosicao;
	}
	public void setAceitaAPosicao(boolean aceitaAPosicao) {
		this.aceitaAPosicao = aceitaAPosicao;
	}
	public boolean isEndireitaACabaca() {
		return endireitaACabaca;
	}
	public void setEndireitaACabaca(boolean endireitaACabaca) {
		this.endireitaACabaca = endireitaACabaca;
	}
	public boolean isPuppyI() {
		return puppyI;
	}
	public void setPuppyI(boolean puppyI) {
		this.puppyI = puppyI;
	}
	public boolean isPyppyII() {
		return pyppyII;
	}
	public void setPyppyII(boolean pyppyII) {
		this.pyppyII = pyppyII;
	}
	public boolean isLiberaUmBraco() {
		return liberaUmBraco;
	}
	public void setLiberaUmBraco(boolean liberaUmBraco) {
		this.liberaUmBraco = liberaUmBraco;
	}
	public boolean isFazTransferenciaLateral() {
		return fazTransferenciaLateral;
	}
	public void setFazTransferenciaLateral(boolean fazTransferenciaLateral) {
		this.fazTransferenciaLateral = fazTransferenciaLateral;
	}
	public boolean isTemElevacaoDaCabecaTronco() {
		return temElevacaoDaCabecaTronco;
	}
	public void setTemElevacaoDaCabecaTronco(boolean temElevacaoDaCabecaTronco) {
		this.temElevacaoDaCabecaTronco = temElevacaoDaCabecaTronco;
	}
	public boolean isPegaObjetos() {
		return pegaObjetos;
	}
	public void setPegaObjetos(boolean pegaObjetos) {
		this.pegaObjetos = pegaObjetos;
	}
	public String getPadraoMMSS() {
		return padraoMMSS;
	}
	public void setPadraoMMSS(String padraoMMSS) {
		this.padraoMMSS = padraoMMSS;
	}
	public String getPadraoMMII() {
		return padraoMMII;
	}
	public void setPadraoMMII(String padraoMMII) {
		this.padraoMMII = padraoMMII;
	}
	public boolean isSeMantemNsPostura() {
		return seMantemNsPostura;
	}
	public void setSeMantemNsPostura(boolean seMantemNsPostura) {
		this.seMantemNsPostura = seMantemNsPostura;
	}
	public boolean isDecubitoPegaObjetos() {
		return decubitoPegaObjetos;
	}
	public void setDecubitoPegaObjetos(boolean decubitoPegaObjetos) {
		this.decubitoPegaObjetos = decubitoPegaObjetos;
	}
	public boolean isAlcancaAPosicaoSozinho() {
		return alcancaAPosicaoSozinho;
	}
	public void setAlcancaAPosicaoSozinho(boolean alcancaAPosicaoSozinho) {
		this.alcancaAPosicaoSozinho = alcancaAPosicaoSozinho;
	}
	public boolean isSentaComApoio() {
		return sentaComApoio;
	}
	public void setSentaComApoio(boolean sentaComApoio) {
		this.sentaComApoio = sentaComApoio;
	}
	public boolean isSentaComApoioComBomEquilibro() {
		return sentaComApoioComBomEquilibro;
	}
	public void setSentaComApoioComBomEquilibro(boolean sentaComApoioComBomEquilibro) {
		this.sentaComApoioComBomEquilibro = sentaComApoioComBomEquilibro;
	}
	public boolean isProjetaCorpoParaFrente() {
		return projetaCorpoParaFrente;
	}
	public void setProjetaCorpoParaFrente(boolean projetaCorpoParaFrente) {
		this.projetaCorpoParaFrente = projetaCorpoParaFrente;
	}
	public boolean isBoaExtensaoDeColuna() {
		return boaExtensaoDeColuna;
	}
	public void setBoaExtensaoDeColuna(boolean boaExtensaoDeColuna) {
		this.boaExtensaoDeColuna = boaExtensaoDeColuna;
	}
	public boolean isCabecaLinhaMedia() {
		return CabecaLinhaMedia;
	}
	public void setCabecaLinhaMedia(boolean cabecaLinhaMedia) {
		CabecaLinhaMedia = cabecaLinhaMedia;
	}
	public boolean isPernasAjudamParaSentar() {
		return pernasAjudamParaSentar;
	}
	public void setPernasAjudamParaSentar(boolean pernasAjudamParaSentar) {
		this.pernasAjudamParaSentar = pernasAjudamParaSentar;
	}
	public boolean isApoioParaProtecao() {
		return apoioParaProtecao;
	}
	public void setApoioParaProtecao(boolean apoioParaProtecao) {
		this.apoioParaProtecao = apoioParaProtecao;
	}
	public boolean isTransferenciaDePeso() {
		return transferenciaDePeso;
	}
	public void setTransferenciaDePeso(boolean transferenciaDePeso) {
		this.transferenciaDePeso = transferenciaDePeso;
	}
	public boolean isSentadoPegaObjetos() {
		return sentadoPegaObjetos;
	}
	public void setSentadoPegaObjetos(boolean sentadoPegaObjetos) {
		this.sentadoPegaObjetos = sentadoPegaObjetos;
	}
	public String getQuatroApoios() {
		return quatroApoios;
	}
	public void setQuatroApoios(String quatroApoios) {
		this.quatroApoios = quatroApoios;
	}
	public String getTresApoios() {
		return tresApoios;
	}
	public void setTresApoios(String tresApoios) {
		this.tresApoios = tresApoios;
	}
	public boolean isUrso() {
		return urso;
	}
	public void setUrso(boolean urso) {
		this.urso = urso;
	}
	public boolean isAlcancaAPosiocaoSozinho() {
		return alcancaAPosiocaoSozinho;
	}
	public void setAlcancaAPosiocaoSozinho(boolean alcancaAPosiocaoSozinho) {
		this.alcancaAPosiocaoSozinho = alcancaAPosiocaoSozinho;
	}
	public boolean isPrecisaDeApoio() {
		return precisaDeApoio;
	}
	public void setPrecisaDeApoio(boolean precisaDeApoio) {
		this.precisaDeApoio = precisaDeApoio;
	}
	public boolean isCabecaNaLinhaMedia() {
		return cabecaNaLinhaMedia;
	}
	public void setCabecaNaLinhaMedia(boolean cabecaNaLinhaMedia) {
		this.cabecaNaLinhaMedia = cabecaNaLinhaMedia;
	}
	public boolean isEmPePegaObjetos() {
		return emPePegaObjetos;
	}
	public void setEmPePegaObjetos(boolean emPePegaObjetos) {
		this.emPePegaObjetos = emPePegaObjetos;
	}
	public boolean isEquilibro() {
		return equilibro;
	}
	public void setEquilibro(boolean equilibro) {
		this.equilibro = equilibro;
	}
	public boolean isAlinhamentoEApoioDeTodoPe() {
		return alinhamentoEApoioDeTodoPe;
	}
	public void setAlinhamentoEApoioDeTodoPe(boolean alinhamentoEApoioDeTodoPe) {
		this.alinhamentoEApoioDeTodoPe = alinhamentoEApoioDeTodoPe;
	}
	public String getConsegueRealizarMarcha() {
		return consegueRealizarMarcha;
	}
	public void setConsegueRealizarMarcha(String consegueRealizarMarcha) {
		this.consegueRealizarMarcha = consegueRealizarMarcha;
	}
	public String getMarchaEquilibro() {
		return marchaEquilibro;
	}
	public void setMarchaEquilibro(String marchaEquilibro) {
		this.marchaEquilibro = marchaEquilibro;
	}
	public String getAssimetrica() {
		return Assimetrica;
	}
	public void setAssimetrica(String assimetrica) {
		Assimetrica = assimetrica;
	}
	public String getDescargaDePEso() {
		return descargaDePEso;
	}
	public void setDescargaDePEso(String descargaDePEso) {
		this.descargaDePEso = descargaDePEso;
	}
	public String getDissociacaoDeCinturas() {
		return dissociacaoDeCinturas;
	}
	public void setDissociacaoDeCinturas(String dissociacaoDeCinturas) {
		this.dissociacaoDeCinturas = dissociacaoDeCinturas;
	}
	public String getApoioDePe() {
		return apoioDePe;
	}
	public void setApoioDePe(String apoioDePe) {
		this.apoioDePe = apoioDePe;
	}
	public String getAndaEmLinhaReta() {
		return andaEmLinhaReta;
	}
	public void setAndaEmLinhaReta(String andaEmLinhaReta) {
		this.andaEmLinhaReta = andaEmLinhaReta;
	}
	public String getDeLado() {
		return deLado;
	}
	public void setDeLado(String deLado) {
		this.deLado = deLado;
	}
	public String getParaTraz() {
		return paraTraz;
	}
	public void setParaTraz(String paraTraz) {
		this.paraTraz = paraTraz;
	}
	public String getSobeEDesceEscada() {
		return sobeEDesceEscada;
	}
	public void setSobeEDesceEscada(String sobeEDesceEscada) {
		this.sobeEDesceEscada = sobeEDesceEscada;
	}
	public String getPadraoDeMebrosSuperiores() {
		return padraoDeMebrosSuperiores;
	}
	public void setPadraoDeMebrosSuperiores(String padraoDeMebrosSuperiores) {
		this.padraoDeMebrosSuperiores = padraoDeMebrosSuperiores;
	}
	public String getPosturaDoPasso() {
		return posturaDoPasso;
	}
	public void setPosturaDoPasso(String posturaDoPasso) {
		this.posturaDoPasso = posturaDoPasso;
	}
	public boolean isCardiaco() {
		return cardiaco;
	}
	public void setCardiaco(boolean cardiaco) {
		this.cardiaco = cardiaco;
	}
	public boolean isRespiratorio() {
		return respiratorio;
	}
	public void setRespiratorio(boolean respiratorio) {
		this.respiratorio = respiratorio;
	}
	public String getOutrosProblemas() {
		return outrosProblemas;
	}
	public void setOutrosProblemas(String outrosProblemas) {
		this.outrosProblemas = outrosProblemas;
	} 
}
