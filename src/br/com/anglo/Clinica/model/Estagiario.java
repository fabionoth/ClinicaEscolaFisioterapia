package br.com.anglo.Clinica.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Estagiario extends Pessoa{
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String ra;
	@Column
	private String periodo;
	@Column
	private String nome;
	@Column
	private String endereco;
	@Column
	private String bairro;
	@Column
	private String cidade;
	@Column
	private String telefone;
	@Column
	private String celular;
	@Column
	private String rg;
	@Column
	private String cpf;
	@Column
	private String email;
	@Column
	private String nacionalidade;
	@Column
	private Calendar nascimento;
	@Column
	private Calendar dataCadastro;
	
	public Estagiario() {
		super();
		this.nome = super.nome;
		this.endereco = super.endereco;
		this.bairro = super.bairro;
		this.cidade = super.cidade;
		this.telefone = super.telefone;
		this.rg = super.rg;
		this.cpf = super.cpf;
		this.email = super.email;
		this.nacionalidade = super.nacionalidade;
		this.nascimento = super.nascimento;
		this.dataCadastro = super.dataCadastro;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getRa() {
		return ra;
	}


	public void setRa(String ra) {
		this.ra = ra;
	}


	public String getPeriodo() {
		return periodo;
	}


	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


	public Calendar getNascimento() {
		return nascimento;
	}


	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}


	public Calendar getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
}
