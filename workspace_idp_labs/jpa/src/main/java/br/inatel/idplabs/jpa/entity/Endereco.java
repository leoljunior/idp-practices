package br.inatel.idplabs.jpa.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

	private String endereçoRua;
	private String enderecoNumero;
	private String enderecoComplemento;
	private String enderecoBairro;
	private String enderecoCidade;
	private String enderecoUF;
	
	public String getEndereçoRua() {
		return endereçoRua;
	}
	public void setEndereçoRua(String endereçoRua) {
		this.endereçoRua = endereçoRua;
	}
	public String getEnderecoNumero() {
		return enderecoNumero;
	}
	public void setEnderecoNumero(String enderecoNumero) {
		this.enderecoNumero = enderecoNumero;
	}
	public String getEnderecoComplemento() {
		return enderecoComplemento;
	}
	public void setEnderecoComplemento(String enderecoComplemento) {
		this.enderecoComplemento = enderecoComplemento;
	}
	public String getEnderecoBairro() {
		return enderecoBairro;
	}
	public void setEnderecoBairro(String enderecoBairro) {
		this.enderecoBairro = enderecoBairro;
	}
	public String getEnderecoCidade() {
		return enderecoCidade;
	}
	public void setEnderecoCidade(String enderecoCidade) {
		this.enderecoCidade = enderecoCidade;
	}
	public String getEnderecoUF() {
		return enderecoUF;
	}
	public void setEnderecoUF(String enderecoUF) {
		this.enderecoUF = enderecoUF;
	}
	
	
}
