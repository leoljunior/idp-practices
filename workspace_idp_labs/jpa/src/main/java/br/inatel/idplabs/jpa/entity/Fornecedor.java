package br.inatel.idplabs.jpa.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Fornecedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String razaoSocial;

	@Embedded
	private Endereco endereço;
	
	@ManyToMany
	private List<Produto> listaProduto;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Endereco getEndereço() {
		return endereço;
	}
	public void setEndereço(Endereco endereço) {
		this.endereço = endereço;
	}
	public List<Produto> getListaProduto() {
		return listaProduto;
	}
	public void setListaProduto(List<Produto> listaProduto) {
		this.listaProduto = listaProduto;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
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
		Fornecedor other = (Fornecedor) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Fornecedor [id=" + id + ", razaoSocial=" + razaoSocial + ", endereço=" + endereço + ", listaProduto="
				+ listaProduto + "]";
	}
}
