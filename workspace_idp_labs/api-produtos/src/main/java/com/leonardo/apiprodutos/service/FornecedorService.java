package com.leonardo.apiprodutos.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.leonardo.apiprodutos.domain.models.Fornecedor;

@Service
@Transactional
public class FornecedorService {

	@PersistenceContext
	private EntityManager em;
	
	public Fornecedor salvar(Fornecedor fornecedor) {
		return em.merge(fornecedor);
	}
	
	public Fornecedor buscarPeloId(Long id) {
		return em.find(Fornecedor.class, id);
	}
	
	public List<Fornecedor> listar() {
		return em.createQuery("select f from Fornecedor f", Fornecedor.class).getResultList();
	}
	
	public void remover(Fornecedor fornecedor) {
		fornecedor = em.merge(fornecedor);
		em.remove(fornecedor);
	}
	
}
