package br.inatel.labrest.myrestclient;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;

public class WebClientDeleteCurso {

	public static void main(String[] args) {

		ResponseEntity<Void> responseEntity = WebClient.create(Constant.BASE_URI)
		.delete()
		.uri("/curso/1074281684462700")
		.retrieve()
		.toBodilessEntity()
		.block();
		
		HttpStatus statusCode = responseEntity.getStatusCode();
		System.out.println("Curso Deletado. Status: " + statusCode);
		
		
	}

}
