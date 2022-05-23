package com.leonardo.apiprodutos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.leonardo.apiprodutos.domain.models.Fornecedor;
import com.leonardo.apiprodutos.domain.models.NotaCompra;
import com.leonardo.apiprodutos.domain.models.NotaCompraItem;
import com.leonardo.apiprodutos.domain.models.Produto;
import com.leonardo.apiprodutos.service.FornecedorService;
import com.leonardo.apiprodutos.service.NotaCompraService;
import com.leonardo.apiprodutos.service.ProdutoService;

@SpringBootTest
class ApiProdutosApplicationTests {

	@Autowired
	private ProdutoService produtoService;
	
	@Autowired
	private FornecedorService fornecedorService;
	
	@Autowired
	private NotaCompraService notaCompraService;
	
	@Test
	void contextLoads() {
		
		//PRODUTO
		Produto produto1 = new Produto("Furadeira");
		Produto produto2 = new Produto("Serrote");
		Produto produto3 = new Produto("Plaina");
		Produto produto4 = new Produto("Arco de Pua");
		Produto produto5 = new Produto("Enxó");
		
		produto1 = produtoService.salvar(produto1);
		produto2 = produtoService.salvar(produto2);
		produto3 = produtoService.salvar(produto3);
		produto4 = produtoService.salvar(produto4);
		produto5 = produtoService.salvar(produto5);
		
		List<Produto> listaProduto = produtoService.listar();
		listaProduto.forEach(System.out::println);
		
		
		//FORNECEDOR
		Fornecedor fornecedor1 = new Fornecedor("Gasometro Madeiras");
		fornecedor1.getEndereco().setCidade("Pouso Alegre");
		
		Fornecedor fornecedor2 = new Fornecedor("Loja da Borracha");
		fornecedor2.getEndereco().setCidade("Campinas");
		
		fornecedor1 = fornecedorService.salvar(fornecedor1);
		fornecedor2 = fornecedorService.salvar(fornecedor2);
		
		List<Fornecedor> listaFornecedor = fornecedorService.listar();
		listaFornecedor.forEach(System.out::println);
		
		
		//NOTA COMPRA
		NotaCompra notaCompra1 = new NotaCompra(fornecedor1, LocalDate.now());
		notaCompra1 = notaCompraService.salvarNotaCompra(notaCompra1);
		
		NotaCompraItem notaCompra1Item1 = new NotaCompraItem(notaCompra1, produto1, new BigDecimal("300.00"), 2);
		NotaCompraItem notaCompra1Item2 = new NotaCompraItem(notaCompra1, produto1, new BigDecimal("3100.00"), 1);
		NotaCompraItem notaCompra1Item3 = new NotaCompraItem(notaCompra1, produto1, new BigDecimal("500.00"), 3);
		notaCompra1Item1 = notaCompraService.salvarNotaCompraItem(notaCompra1Item1);
		notaCompra1Item2 = notaCompraService.salvarNotaCompraItem(notaCompra1Item2);
		notaCompra1Item3 = notaCompraService.salvarNotaCompraItem(notaCompra1Item3);
		
		NotaCompra notaCompra2 = new NotaCompra(fornecedor2, LocalDate.now().plusDays(7));
		notaCompra2 = notaCompraService.salvarNotaCompra(notaCompra2);
		
		NotaCompraItem notaCompra2Item1 = new NotaCompraItem(notaCompra2, produto4, new BigDecimal("300.00"), 7);
		NotaCompraItem notaCompra2Item2 = new NotaCompraItem(notaCompra2, produto2, new BigDecimal("3100.00"), 2);
		NotaCompraItem notaCompra2Item3 = new NotaCompraItem(notaCompra2, produto5, new BigDecimal("500.00"), 1);
		notaCompra2Item1 = notaCompraService.salvarNotaCompraItem(notaCompra2Item1);
		notaCompra2Item2 = notaCompraService.salvarNotaCompraItem(notaCompra2Item2);
		notaCompra2Item3 = notaCompraService.salvarNotaCompraItem(notaCompra2Item3);
		
		notaCompraService.listarNotaCompra().forEach(System.out::println);
		notaCompraService.listarNotaCompraItem().forEach(System.out::println);
	}

}
