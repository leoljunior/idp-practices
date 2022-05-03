package br.inatel.myrestapi.MyRestAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
