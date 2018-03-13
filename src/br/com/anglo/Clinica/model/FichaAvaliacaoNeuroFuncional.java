package br.com.anglo.Clinica.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class FichaAvaliacaoNeuroFuncional {
	@Id
	@GeneratedValue
	private Long id;
	@Temporal(TemporalType.DATE)
	private Calendar dataDoTratamento; 
	private String obsProfessor;
	@OneToOne
	private Usuario usuario; 
	private String status;
	
	/**Exame Fisico
	 * 
	 */
	
	private String fc;
	private String fr;
	private String pa; 
	private String auscultaPulmonar; 
	private String inspecao; 
	private String geralAtitude; 
	private String nivelDeConsciencia; 
	private String capacidadeDeExpressaoVerval; 
	private String presencaDeClonus; 
	private String deformidades; 
	private String presencaDeEscaras; 
	private String perimetria; 
	private String goniometria; 
	private String tonus; 
	
	/**
	 * Movimentos Passivo (Tônus)
	 */
	private String passivoMmss; 
	private String passivoMmii;
	
	/**
	 * Movimento Voluntario 
	 */
	private String voluntarioMmss;
	private String voluntarioMmii;
	
	/**
	 * Reflexos Superficiais ou Proprioceptivos (Patológicos)
	 */
	private String babinskiDireito; 
	private String babinskiEsquerdo; 
	private String cutaneoAbdominalDireito;
	private String cutaneoAbdominalEsquerdo; 
	private String outrosDireito; 
	private String outrosEsquerdo; 
	
	/**
	 * Reflexos Profundos ou Exteroceptivos
	 */
	
	private String biciptal;
	private String estiloradial; 
	private String triciptal; 
	private String aquileu; 
	private String patelar; 
	
	/**
	 * Equilibrio Olhos fechados e Abertos
	 */
	
	private String decubitoVentral; 
	private String decubitoDorsal; 
	private String decuBitoLateral; 
	private String sentado;
	private String deGato; 
	private String emPe; 
	
	
	/**
	 * Reflexos Posturais e Mudanças de Decúbito
	 */
	private String ddParaDle; 
	private String dleParaDv; 
	private String ddParaDld;
	private String dldParadv;
	private String reflexSentado;
	private String reflexAjoelhadoParaSemiAdoelhado;
	private String reflexRolar;
	private String reflexSentadoParaEmPe; 
	private String reflexApoios;
	private String reflexApoiosParaJoelho;
	private String reflexSemiAjoelhadoParaEmPe;
	private String reflexArrastar;
	private String reflexEngatinhar;
	
	
	/**
	 * Coordenação
	 */
	
	private String indexIndex;
	private String indexNarizIndex;
	private String indexNariz;
	private String indexIndexTerapeuta;
	private String calcanharJoelho;
	private String batidaDoPe;
	
	
	/**
	 * Incapacidades
	 */
	
	private String incaMmss;
	private String incaMmii;
	
	/**
	 * Sensibilidades
	 */
	
	private String superficial;
	private String tatil;
	private String termica;
	private String dolorosa;
	private String profunda; 
	private String grafestesia;
	private String proprioceptiva;
	
	private String descricaoDaMarca; 
	private String nervosCranianos;
	private String linguagem;
	private String comportamento;
	private String memoria;
	private String recente;
	private String remota; 
	
	private String tratamento;
	private String frequencia;
	private String hora;
	private String dias;
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
	public String getAuscultaPulmonar() {
		return auscultaPulmonar;
	}
	public void setAuscultaPulmonar(String auscultaPulmonar) {
		this.auscultaPulmonar = auscultaPulmonar;
	}
	public String getInspecao() {
		return inspecao;
	}
	public void setInspecao(String inspecao) {
		this.inspecao = inspecao;
	}
	public String getGeralAtitude() {
		return geralAtitude;
	}
	public void setGeralAtitude(String geralAtitude) {
		this.geralAtitude = geralAtitude;
	}
	public String getNivelDeConsciencia() {
		return nivelDeConsciencia;
	}
	public void setNivelDeConsciencia(String nivelDeConsciencia) {
		this.nivelDeConsciencia = nivelDeConsciencia;
	}
	public String getCapacidadeDeExpressaoVerval() {
		return capacidadeDeExpressaoVerval;
	}
	public void setCapacidadeDeExpressaoVerval(String capacidadeDeExpressaoVerval) {
		this.capacidadeDeExpressaoVerval = capacidadeDeExpressaoVerval;
	}
	public String getPresencaDeClonus() {
		return presencaDeClonus;
	}
	public void setPresencaDeClonus(String presencaDeClonus) {
		this.presencaDeClonus = presencaDeClonus;
	}
	public String getDeformidades() {
		return deformidades;
	}
	public void setDeformidades(String deformidades) {
		this.deformidades = deformidades;
	}
	public String getPresencaDeEscaras() {
		return presencaDeEscaras;
	}
	public void setPresencaDeEscaras(String presencaDeEscaras) {
		this.presencaDeEscaras = presencaDeEscaras;
	}
	public String getPerimetria() {
		return perimetria;
	}
	public void setPerimetria(String perimetria) {
		this.perimetria = perimetria;
	}
	public String getGoniometria() {
		return goniometria;
	}
	public void setGoniometria(String goniometria) {
		this.goniometria = goniometria;
	}
	public String getTonus() {
		return tonus;
	}
	public void setTonus(String tonus) {
		this.tonus = tonus;
	}
	public String getPassivoMmss() {
		return passivoMmss;
	}
	public void setPassivoMmss(String passivoMmss) {
		this.passivoMmss = passivoMmss;
	}
	public String getPassivoMmii() {
		return passivoMmii;
	}
	public void setPassivoMmii(String passivoMmii) {
		this.passivoMmii = passivoMmii;
	}
	public String getVoluntarioMmss() {
		return voluntarioMmss;
	}
	public void setVoluntarioMmss(String voluntarioMmss) {
		this.voluntarioMmss = voluntarioMmss;
	}
	public String getVoluntarioMmii() {
		return voluntarioMmii;
	}
	public void setVoluntarioMmii(String voluntarioMmii) {
		this.voluntarioMmii = voluntarioMmii;
	}
	public String getBabinskiDireito() {
		return babinskiDireito;
	}
	public void setBabinskiDireito(String babinskiDireito) {
		this.babinskiDireito = babinskiDireito;
	}
	public String getBabinskiEsquerdo() {
		return babinskiEsquerdo;
	}
	public void setBabinskiEsquerdo(String babinskiEsquerdo) {
		this.babinskiEsquerdo = babinskiEsquerdo;
	}
	public String getCutaneoAbdominalDireito() {
		return cutaneoAbdominalDireito;
	}
	public void setCutaneoAbdominalDireito(String cutaneoAbdominalDireito) {
		this.cutaneoAbdominalDireito = cutaneoAbdominalDireito;
	}
	public String getCutaneoAbdominalEsquerdo() {
		return cutaneoAbdominalEsquerdo;
	}
	public void setCutaneoAbdominalEsquerdo(String cutaneoAbdominalEsquerdo) {
		this.cutaneoAbdominalEsquerdo = cutaneoAbdominalEsquerdo;
	}
	public String getOutrosDireito() {
		return outrosDireito;
	}
	public void setOutrosDireito(String outrosDireito) {
		this.outrosDireito = outrosDireito;
	}
	public String getOutrosEsquerdo() {
		return outrosEsquerdo;
	}
	public void setOutrosEsquerdo(String outrosEsquerdo) {
		this.outrosEsquerdo = outrosEsquerdo;
	}
	public String getBiciptal() {
		return biciptal;
	}
	public void setBiciptal(String biciptal) {
		this.biciptal = biciptal;
	}
	public String getEstiloradial() {
		return estiloradial;
	}
	public void setEstiloradial(String estiloradial) {
		this.estiloradial = estiloradial;
	}
	public String getTriciptal() {
		return triciptal;
	}
	public void setTriciptal(String triciptal) {
		this.triciptal = triciptal;
	}
	public String getAquileu() {
		return aquileu;
	}
	public void setAquileu(String aquileu) {
		this.aquileu = aquileu;
	}
	public String getPatelar() {
		return patelar;
	}
	public void setPatelar(String patelar) {
		this.patelar = patelar;
	}
	public String getDecubitoVentral() {
		return decubitoVentral;
	}
	public void setDecubitoVentral(String decubitoVentral) {
		this.decubitoVentral = decubitoVentral;
	}
	public String getDecubitoDorsal() {
		return decubitoDorsal;
	}
	public void setDecubitoDorsal(String decubitoDorsal) {
		this.decubitoDorsal = decubitoDorsal;
	}
	public String getDecuBitoLateral() {
		return decuBitoLateral;
	}
	public void setDecuBitoLateral(String decuBitoLateral) {
		this.decuBitoLateral = decuBitoLateral;
	}
	public String getSentado() {
		return sentado;
	}
	public void setSentado(String sentado) {
		this.sentado = sentado;
	}
	public String getDeGato() {
		return deGato;
	}
	public void setDeGato(String deGato) {
		this.deGato = deGato;
	}
	public String getEmPe() {
		return emPe;
	}
	public void setEmPe(String emPe) {
		this.emPe = emPe;
	}
	public String getDdParaDle() {
		return ddParaDle;
	}
	public void setDdParaDle(String ddParaDle) {
		this.ddParaDle = ddParaDle;
	}
	public String getDleParaDv() {
		return dleParaDv;
	}
	public void setDleParaDv(String dleParaDv) {
		this.dleParaDv = dleParaDv;
	}
	public String getDdParaDld() {
		return ddParaDld;
	}
	public void setDdParaDld(String ddParaDld) {
		this.ddParaDld = ddParaDld;
	}
	public String getDldParadv() {
		return dldParadv;
	}
	public void setDldParadv(String dldParadv) {
		this.dldParadv = dldParadv;
	}
	public String getReflexSentado() {
		return reflexSentado;
	}
	public void setReflexSentado(String reflexSentado) {
		this.reflexSentado = reflexSentado;
	}
	public String getReflexAjoelhadoParaSemiAdoelhado() {
		return reflexAjoelhadoParaSemiAdoelhado;
	}
	public void setReflexAjoelhadoParaSemiAdoelhado(
			String reflexAjoelhadoParaSemiAdoelhado) {
		this.reflexAjoelhadoParaSemiAdoelhado = reflexAjoelhadoParaSemiAdoelhado;
	}
	public String getReflexRolar() {
		return reflexRolar;
	}
	public void setReflexRolar(String reflexRolar) {
		this.reflexRolar = reflexRolar;
	}
	public String getReflexSentadoParaEmPe() {
		return reflexSentadoParaEmPe;
	}
	public void setReflexSentadoParaEmPe(String reflexSentadoParaEmPe) {
		this.reflexSentadoParaEmPe = reflexSentadoParaEmPe;
	}
	public String getReflexApoios() {
		return reflexApoios;
	}
	public void setReflexApoios(String reflexApoios) {
		this.reflexApoios = reflexApoios;
	}
	public String getReflexApoiosParaJoelho() {
		return reflexApoiosParaJoelho;
	}
	public void setReflexApoiosParaJoelho(String reflexApoiosParaJoelho) {
		this.reflexApoiosParaJoelho = reflexApoiosParaJoelho;
	}
	public String getReflexSemiAjoelhadoParaEmPe() {
		return reflexSemiAjoelhadoParaEmPe;
	}
	public void setReflexSemiAjoelhadoParaEmPe(String reflexSemiAjoelhadoParaEmPe) {
		this.reflexSemiAjoelhadoParaEmPe = reflexSemiAjoelhadoParaEmPe;
	}
	public String getReflexArrastar() {
		return reflexArrastar;
	}
	public void setReflexArrastar(String reflexArrastar) {
		this.reflexArrastar = reflexArrastar;
	}
	public String getReflexEngatinhar() {
		return reflexEngatinhar;
	}
	public void setReflexEngatinhar(String reflexEngatinhar) {
		this.reflexEngatinhar = reflexEngatinhar;
	}
	public String getIndexIndex() {
		return indexIndex;
	}
	public void setIndexIndex(String indexIndex) {
		this.indexIndex = indexIndex;
	}
	public String getIndexNarizIndex() {
		return indexNarizIndex;
	}
	public void setIndexNarizIndex(String indexNarizIndex) {
		this.indexNarizIndex = indexNarizIndex;
	}
	public String getIndexNariz() {
		return indexNariz;
	}
	public void setIndexNariz(String indexNariz) {
		this.indexNariz = indexNariz;
	}
	public String getIndexIndexTerapeuta() {
		return indexIndexTerapeuta;
	}
	public void setIndexIndexTerapeuta(String indexIndexTerapeuta) {
		this.indexIndexTerapeuta = indexIndexTerapeuta;
	}
	public String getCalcanharJoelho() {
		return calcanharJoelho;
	}
	public void setCalcanharJoelho(String calcanharJoelho) {
		this.calcanharJoelho = calcanharJoelho;
	}
	public String getBatidaDoPe() {
		return batidaDoPe;
	}
	public void setBatidaDoPe(String batidaDoPe) {
		this.batidaDoPe = batidaDoPe;
	}
	public String getIncaMmss() {
		return incaMmss;
	}
	public void setIncaMmss(String incaMmss) {
		this.incaMmss = incaMmss;
	}
	public String getIncaMmii() {
		return incaMmii;
	}
	public void setIncaMmii(String incaMmii) {
		this.incaMmii = incaMmii;
	}
	public String getSuperficial() {
		return superficial;
	}
	public void setSuperficial(String superficial) {
		this.superficial = superficial;
	}
	public String getTatil() {
		return tatil;
	}
	public void setTatil(String tatil) {
		this.tatil = tatil;
	}
	public String getTermica() {
		return termica;
	}
	public void setTermica(String termica) {
		this.termica = termica;
	}
	public String getDolorosa() {
		return dolorosa;
	}
	public void setDolorosa(String dolorosa) {
		this.dolorosa = dolorosa;
	}
	public String getProfunda() {
		return profunda;
	}
	public void setProfunda(String profunda) {
		this.profunda = profunda;
	}
	public String getGrafestesia() {
		return grafestesia;
	}
	public void setGrafestesia(String grafestesia) {
		this.grafestesia = grafestesia;
	}
	public String getProprioceptiva() {
		return proprioceptiva;
	}
	public void setProprioceptiva(String proprioceptiva) {
		this.proprioceptiva = proprioceptiva;
	}
	public String getDescricaoDaMarca() {
		return descricaoDaMarca;
	}
	public void setDescricaoDaMarca(String descricaoDaMarca) {
		this.descricaoDaMarca = descricaoDaMarca;
	}
	public String getNervosCranianos() {
		return nervosCranianos;
	}
	public void setNervosCranianos(String nervosCranianos) {
		this.nervosCranianos = nervosCranianos;
	}
	public String getLinguagem() {
		return linguagem;
	}
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	public String getComportamento() {
		return comportamento;
	}
	public void setComportamento(String comportamento) {
		this.comportamento = comportamento;
	}
	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	public String getRecente() {
		return recente;
	}
	public void setRecente(String recente) {
		this.recente = recente;
	}
	public String getRemota() {
		return remota;
	}
	public void setRemota(String remota) {
		this.remota = remota;
	}
	public String getTratamento() {
		return tratamento;
	}
	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}
	public String getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getDias() {
		return dias;
	}
	public void setDias(String dias) {
		this.dias = dias;
	} 
	
	
	
	
	
}
