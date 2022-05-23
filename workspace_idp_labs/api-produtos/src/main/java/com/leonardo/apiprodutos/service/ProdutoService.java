package com.leonardo.apiprodutos.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.leonardo.apiprodutos.domain.models.Produto;

@Service
@Transactional
public class ProdutoService {

	@PersistenceContext
	private EntityManager em;
	
	public Produto salvar(Produto p) {
		p = em.merge(p);
		return p;
	}
	
	public Produto buscarPeloId(Long id) {
		return em.find(Produto.class, id);
	}
	
	public List<Produto> listar() {
		String jpql = "select p from Produto p";
		return em.createQuery(jpql, Produto.class).getResultList();
	}
	
	public void remover(Produto p) {
		p = em.merge(p);
		em.remove(p);
	}
	
	
	
}
