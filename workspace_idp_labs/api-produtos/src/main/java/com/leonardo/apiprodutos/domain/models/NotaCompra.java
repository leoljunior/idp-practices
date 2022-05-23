package com.leonardo.apiprodutos.domain.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class NotaCompra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy = "notaCompra", fetch = FetchType.EAGER) //neste caso o lado "forte" é o many, logo aqui tem que ser anotado com mappedBy
	private List<NotaCompraItem> listaNotaCompraItem; //o fetch EAGER diz que quando o lado oposto for many é para trazer tudo, não recomendado
	
	@ManyToOne
	private Fornecedor fornecedor;
	
	private LocalDate dataEmissao;	

	public NotaCompra() {
	}
	
	public NotaCompra(Fornecedor fornecedor, LocalDate dataEmissao) {
		this.fornecedor = fornecedor;
		this.dataEmissao = dataEmissao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<NotaCompraItem> getListaNotaCompraItem() {
		return listaNotaCompraItem;
	}

	public void setListaNotaCompraItem(List<NotaCompraItem> listaNotaCompraItem) {
		this.listaNotaCompraItem = listaNotaCompraItem;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public LocalDate getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(LocalDate dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public BigDecimal getCalculoTotalNota() {

		return listaNotaCompraItem.stream()
				.map(item -> item.getCalculoTotalItem())
				.reduce(BigDecimal.ZERO, BigDecimal::add);
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
		NotaCompra other = (NotaCompra) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "NotaCompra [id=" + id + ", fornecedor=" + fornecedor + ", dataEmissao=" + dataEmissao + "]";
	}
	
	
}
