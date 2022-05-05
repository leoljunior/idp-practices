package br.inatel.labrest.myrestclient;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;

import br.inatel.labrest.models.Curso;

public class WebClientePutCurso {

	public static void main(String[] args) {

		
		Curso cursoExistente = new Curso(1L, "API Rest com Spring e Spring WebFlux", 9);
		
		ResponseEntity<Void> responseEntity = WebClient.create(Constant.BASE_URI)
		.put()
		.uri("/curso")
		.bodyValue(cursoExistente)
		.retrieve()
		.toBodilessEntity() //nada é esperado no corpodo response
		.block();
		
		HttpStatus statusCode = responseEntity.getStatusCode();
		
		System.out.println("Curso Atualizado. Status da Resposta: " + statusCode);
	}

}
