package br.inatel.idplabs.jpa.entity;

import java.time.LocalDate;
import java.util.List;

public class NotaCompra {

	private Long id;
	private List<NotaCompraItem> listaNotaCompraItem;
	private Fornecedor fornecedor;
	private LocalDate dataEmissao;
	
}
