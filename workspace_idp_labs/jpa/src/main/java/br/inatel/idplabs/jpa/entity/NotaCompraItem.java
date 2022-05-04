package br.inatel.idplabs.jpa.entity;

import java.math.BigDecimal;

public class NotaCompraItem {

	private Long id;
	private NotaCompra notaCompra;
	private Produto produto;
	private BigDecimal valorCompraProduto;
	private Integer quantidade = 1;
	
	
	public BigDecimal getCalculoTotalItem() {
		return valorCompraProduto.multiply()
	}
}
