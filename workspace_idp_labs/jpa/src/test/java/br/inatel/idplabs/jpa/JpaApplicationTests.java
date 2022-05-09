package br.inatel.idplabs.jpa;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.inatel.idplabs.jpa.entity.Produto;
import br.inatel.idplabs.jpa.services.ProdutoService;

@SpringBootTest
class JpaApplicationTests {

	@Autowired
	private ProdutoService prodService;

	@Test
	void contextLoads() {
		
		Produto p1 = new Produto("Furadeira");
		Produto p2 = new Produto("Serra");
		Produto p3 = new Produto("Lixadeira");
		Produto p4 = new Produto("Tupia");
		Produto p5 = new Produto("Plaina");
		
		p1 = prodService.salvar(p1);
		p2 = prodService.salvar(p2);
		p3 = prodService.salvar(p3);
		p4 = prodService.salvar(p4);
		p5 = prodService.salvar(p5);
		
		List<Produto> listaProduto = prodService.listar();
		listaProduto.forEach(System.out::println);
	}

}
