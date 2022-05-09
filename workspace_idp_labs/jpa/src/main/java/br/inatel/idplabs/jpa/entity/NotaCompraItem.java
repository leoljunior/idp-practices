package br.inatel.idplabs.jpa.entity;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class NotaCompraItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private BigDecimal valorCompraProduto;
	private Integer quantidade = 1;

	@ManyToOne
	private Produto produto;
	
	@ManyToOne
	private NotaCompra notaCompra;
	
	public BigDecimal getCalculoTotalItem() {
		return valorCompraProduto.multiply(BigDecimal.valueOf(quantidade));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public NotaCompra getNotaCompra() {
		return notaCompra;
	}

	public void setNotaCompra(NotaCompra notaCompra) {
		this.notaCompra = notaCompra;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public BigDecimal getValorCompraProduto() {
		return valorCompraProduto;
	}

	public void setValorCompraProduto(BigDecimal valorCompraProduto) {
		this.valorCompraProduto = valorCompraProduto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
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
		NotaCompraItem other = (NotaCompraItem) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
