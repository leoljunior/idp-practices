package com.leonardo.apiprodutos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.leonardo.apiprodutos.domain.models.NotaCompra;
import com.leonardo.apiprodutos.service.NotaCompraService;

@SpringBootTest
public class DemoLazyLoading {

	@Autowired
	private NotaCompraService service;
	
	@Test
	public void test() {
		
		
		
		try {
			NotaCompra nota = service.buscarNotaCompraPeloIdComListaItem(1L);
			nota.getListaNotaCompraItem().forEach(System.out::println);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
