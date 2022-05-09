package br.inatel.idplabs.jpa.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.inatel.idplabs.jpa.entity.Fornecedor;

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
		return em.createQuery("Select f from Fornecedor f", Fornecedor.class)
				.getResultList();
	}
	
	public void remover(Fornecedor fornecedor) {
		fornecedor = em.find(Fornecedor.class, fornecedor.getId());
		em.remove(fornecedor);
	}
}