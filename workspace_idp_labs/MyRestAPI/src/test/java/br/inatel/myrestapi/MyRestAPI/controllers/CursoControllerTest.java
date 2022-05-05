package br.inatel.myrestapi.MyRestAPI.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import br.inatel.myrestapi.MyRestAPI.models.Curso;
import reactor.core.publisher.Mono;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CursoControllerTest {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void deveListarCursos() {
		webTestClient
		.get()
		.uri("/curso")
		.exchange()
		.expectStatus().isOk()
		.expectBody()
		.returnResult();
	}

	@Test
	void dadoCursoIDValido_quandoGetCursoId_entãoRespondeComCursoValido() {
		Long idValido = 1L;

		Curso cursoRespondido = webTestClient
				.get()
				.uri("/curso/" + idValido)
				.exchange()
				.expectStatus().isOk()
				.expectBody(Curso.class)
				.returnResult()
				.getResponseBody();

		assertEquals(cursoRespondido.getId(), idValido);
	}

	@Test
	void dadoCursoIDInvalido_quandoGetCursoID_entaoRespondeComStatusNotFound​() {
		Long idInvalido = 14654L;

		webTestClient
		.get()
		.uri("/curso/" + idInvalido)
		.exchange()
		.expectStatus().isNotFound();
	}
	
	@Test
	void dadoCurso_quandoPostCurso_entaoRespondeComStatusCreated() {
		
		Curso curso = new Curso(1L, "Curso Teste", 80);
		
		webTestClient
		.post()
		.uri("/curso")
		.body(Mono.just(curso), Curso.class)
		.exchange()
		.expectStatus().isCreated()
		.returnResult(Void.class);
	}
	
	@Test
	void dadoCursoExistente_quandoPutCurso_entaoAtulizaCurso() {
		
		Curso curso = new Curso(1456L, "Teste PUT", 80);
		
		webTestClient
		.put()
		.uri("/curso")
		.body(Mono.just(curso), Curso.class)
		.exchange()
		.expectStatus().isOk();
	}
	
	@Test
	void dadoCursoExistente_quandoDeleteCurso_entaoRemoveCurso() {
		webTestClient
		.delete()
		.uri("/curso/0")
		.exchange()
		.expectStatus().isOk();
	}
	

}

//	A bliblioteca Spring WebFlux oferece a classe WebTestClient para testar a API REST.
//	A classe contem métodos para checar status da resposta, header, body

//.expectStatus().isOk() - Status é 200?
//
//.expectStatus().isNotFound() - Status é 404?​
//
//.expectHeader().contentType(MediaType.APPLICATION_JSON) - Cabeçalho tem contentType JSON?​
//
//.expectBody().returnResult() - Corpo tem algum resultado?​
//
//.expectBody().isEmpty() - Corpo está vazio?​
//
//.expectBody().jsonPath("$.descricao").isNotEmpty() - O JSON do corpo tem atributo ‘descricao’?​