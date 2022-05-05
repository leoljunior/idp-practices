package br.inatel.labrest.myrestclient;

import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import reactor.core.publisher.Mono;

public class WebClientGetCursoPeloId {

	public static void main(String[] args) {

		try {
			Mono<CursoDTO> monoCurso = WebClient.create(Constant.BASE_URI)
			.get()
			.uri("/curso/11")
			.retrieve()
			.bodyToMono(CursoDTO.class);
			
			CursoDTO cursoDTO = monoCurso.block();
			
			System.out.println("Cursos Encontrado");
			System.out.println(cursoDTO);
		} catch (WebClientResponseException e) {
			System.out.println("Status Code: " + e.getStatusCode());
		}
	}

}
