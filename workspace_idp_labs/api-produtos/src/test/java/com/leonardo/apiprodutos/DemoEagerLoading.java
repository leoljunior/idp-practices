package com.leonardo.apiprodutos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.leonardo.apiprodutos.domain.models.NotaCompraItem;
import com.leonardo.apiprodutos.service.NotaCompraService;

@SpringBootTest
public class DemoEagerLoading {

	@Autowired
	private NotaCompraService service;
	
	@Test
	public void test() {
		
		NotaCompraItem item = service.buscarNotaCompraItemPeloId(1L);
		System.out.println(item.getNotaCompra().getDataEmissao());
		
	}
	
}
