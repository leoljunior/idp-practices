package br.inatel.myrestapi.MyRestAPI.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import br.inatel.myrestapi.MyRestAPI.models.Curso;

@Service
public class CursoService {
  
	private Map<Long, Curso> mapa = new HashMap<>();
	
	@PostConstruct
	private void setItens() {
		Curso curso1 = new Curso(1L, "Rest API", 30);
		Curso curso2 = new Curso(2L, "Mockito", 70);
		Curso curso3 = new Curso(3L, "Scrum", 10);
		
		mapa.put(curso1.getId(), curso1);
		mapa.put(curso2.getId(), curso2);
		mapa.put(curso3.getId(), curso3);
	}
	
	public List<Curso> listarCursos() {
		return mapa.entrySet().stream()
				.map(m -> m.getValue())
				.collect(Collectors.toList());
	}
	
}
