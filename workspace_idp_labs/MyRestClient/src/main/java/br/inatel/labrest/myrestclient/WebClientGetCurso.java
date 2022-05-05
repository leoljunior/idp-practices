package br.inatel.labrest.myrestclient;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.reactive.function.client.WebClient;

import br.inatel.labrest.models.Curso;
import reactor.core.publisher.Flux;

public class WebClientGetCurso {

	public static void main(String[] args) {

		List<CursoDTO> listaCurso = new ArrayList<>();

		Flux<CursoDTO> fluxCurso = WebClient.create(Constant.BASE_URI)
				.get()
				.uri("/curso")
				.retrieve()
				.bodyToFlux(CursoDTO.class);

		fluxCurso.subscribe(c -> listaCurso.add(c));

		fluxCurso.blockLast(); // BLoqueia até o ultimo elemento chegar...

		System.out.println("Lista de Cursos: ");
		System.out.println(listaCurso);
	}

}
