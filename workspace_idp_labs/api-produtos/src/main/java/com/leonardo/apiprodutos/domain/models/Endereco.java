package com.leonardo.apiprodutos.domain.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

@Embeddable
public class Endereco {

	@NotBlank
	@Column(name = "endereco_rua")
	private String rua;
	
	@NotBlank
	@Column(name = "endereco_numero")
	private String numero;
	
	@NotBlank
	@Column(name = "endereco_complemento")
	private String complemento;
	
	@NotBlank
	@Column(name = "endereco_bairro")
	private String bairro;
	
	@NotBlank
	@Column(name = "endereco_cidade")
	private String cidade;
	
	@NotBlank
	@Column(name = "endereco_uf")
	private String uf;
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
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
	
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
}
