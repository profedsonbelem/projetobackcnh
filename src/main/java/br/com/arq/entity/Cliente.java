package br.com.arq.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

	@JsonIgnore
	@Transient
	private static transient SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcliente")
	private Long idCliente;

	@JsonProperty("nome")
	@Column(name = "nome")
	private String nome;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@JsonProperty("datacadastro")
	@Column(name = "data_cadastro")
	private java.util.Date dataCadastro;

	@JsonProperty("status")
	@Column(name = "status")
	private String status;
	
	
	@Column(unique = true,length=50)
	private String emailCliente;

	@JsonProperty("sexo")
	@Column(columnDefinition = " enum ('m','f')")
	private String sexo;

	@JsonProperty("cnh")
	@Column(unique = true)
	private String cnh;

	@JsonProperty("cpf")
	@Column(unique = true)
	private String cpf;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@JsonProperty("dataNascimento")
	@Column(name = "data_nascimento")
	private java.util.Date dataNascimento;

	@Column(name = "descricaoConversa")
	private String descricaoConversa;

	@Column(name = "celular")
	private String celular;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@JsonProperty("dataAgendamento")
	@Column(name = "data_agendamento")
	private java.util.Date dataAgendamento;

	@Column(length = 255)
	private String logradouro;

	@Column(length = 255)
	private String complemento;

	@Column(length = 255)
	private String bairro;

	@Column(length = 255)
	private String cidade;

	@Column(length = 255)
	private String estado;

	@Column(length = 10)
	private String cep;
	
	@Column(length = 255)
	private String senha;
	
	@Column(length = 255)
	private String confirmaSenha;
	
	@Column(length = 255)
	private String pix;

	{
		this.status = "ativo";
		this.dataCadastro = new Date();
	}

	public Cliente() {

	}

	public Cliente(Long idCliente, String nome, Date dataCadastro, String status, String emailCliente, String sexo,
			String cnh, String cpf, Date dataNascimento, String descricaoConversa, String celular, Date dataAgendamento,
			String logradouro, String complemento, String bairro, String cidade, String estado, String cep,
			String senha, String confirmaSenha, String pix) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.dataCadastro = dataCadastro;
		this.status = status;
		this.emailCliente = emailCliente;
		this.sexo = sexo;
		this.cnh = cnh;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.descricaoConversa = descricaoConversa;
		this.celular = celular;
		this.dataAgendamento = dataAgendamento;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.senha = senha;
		this.confirmaSenha = confirmaSenha;
		this.pix = pix;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", dataCadastro=" + dataCadastro + ", status="
				+ status + ", emailCliente=" + emailCliente + ", sexo=" + sexo + ", cnh=" + cnh + ", cpf=" + cpf
				+ ", dataNascimento=" + dataNascimento + ", descricaoConversa=" + descricaoConversa + ", celular="
				+ celular + ", dataAgendamento=" + dataAgendamento + ", logradouro=" + logradouro + ", complemento="
				+ complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep
				+ ", senha=" + senha + ", confirmaSenha=" + confirmaSenha + ", pix=" + pix + "]";
	}



	public Cliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Cliente(String emailCliente) {
		super();
		this.emailCliente = emailCliente;
	}

	public static SimpleDateFormat getSdf() {
		return sdf;
	}

	public static void setSdf(SimpleDateFormat sdf) {
		Cliente.sdf = sdf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public java.util.Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(java.util.Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public java.util.Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(java.util.Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDescricaoConversa() {
		return descricaoConversa;
	}

	public void setDescricaoConversa(String descricaoConversa) {
		this.descricaoConversa = descricaoConversa;
	}

	public java.util.Date getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(java.util.Date dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}

	public String getPix() {
		return pix;
	}

	public void setPix(String pix) {
		this.pix = pix;
	}

}
