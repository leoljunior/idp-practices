package br.inatel.labrest.myrestclient;

import org.springframework.web.reactive.function.client.WebClient;

import br.inatel.labrest.models.Curso;

public class WebClientPostCurso {

	public static void main(String[] args) {

		Curso novoCurso = new Curso();
		novoCurso.setDescricao("Dominando Spring Webflux");
		novoCurso.setCargaHoraria(15);
		
		Curso cursoCriado = WebClient.create(Constant.BASE_URI)
		.post()
		.uri("/curso")
		.bodyValue(novoCurso)
		.retrieve()
		.bodyToMono(Curso.class)
		.block();
		
		System.out.println("Curso criado: ");
		System.out.println(cursoCriado);
		
	}

}
