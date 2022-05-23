package com.leonardo.apiprodutos.domain.models;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToMany(mappedBy = "listaProduto") //quando o relacionamento é bi-direcional temos que colocar mappedby no lado mais "fraco" do relacionamento
	private List<Fornecedor> listaFornecedor;
	
	@NotBlank
	@Size(max = 100)
	private String descricao;
	
	public Produto() {
	}
	
	public Produto(String descricao) {
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public List<Fornecedor> getListaFornecedor() {
		return listaFornecedor;
	}
	
	public void setListaFornecedor(List<Fornecedor> listaFornecedor) {
		this.listaFornecedor = listaFornecedor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + "]";
	}
}
