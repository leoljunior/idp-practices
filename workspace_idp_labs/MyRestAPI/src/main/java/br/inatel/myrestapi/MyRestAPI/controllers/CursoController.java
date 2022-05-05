package br.inatel.myrestapi.MyRestAPI.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.util.UriComponentsBuilder;

import br.inatel.myrestapi.MyRestAPI.models.Curso;
import br.inatel.myrestapi.MyRestAPI.services.CursoService;


@RestController
@RequestMapping("/curso")
public class CursoController {

	@Autowired
	private CursoService service;
	
	@GetMapping
	public List<Curso> listar() {
		List<Curso> listaCursos = service.listarCursos();
		return listaCursos;
	}
	
	@GetMapping("/{id}")
	public Curso buscar(@PathVariable("id") Long cursoId) {
		Curso cursoEncontrado = service.buscarCursoPelaId(cursoId);
		if (cursoEncontrado != null) {
			return cursoEncontrado;
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND);		
	}
	
	@PostMapping
	public ResponseEntity<Curso> criar(@RequestBody Curso novoCurso, UriComponentsBuilder uriBuilder) {
		Curso cursoCriado = service.criarCurso(novoCurso);
		URI uri = uriBuilder.path("/curso/{id}").buildAndExpand(cursoCriado.getId()).toUri();
		return ResponseEntity.created(uri).body(cursoCriado);
	}
	
	@PutMapping
	public void atualizar(@RequestBody Curso curso) {
		service.atualizarCurso(curso);
	}
	
	@DeleteMapping("/{id}")
	public void remover(@PathVariable("id") Long id) {
		service.removerCursoPelaId(id);
	}
	
	
}
