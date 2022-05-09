package br.inatel.idplabs.jpa.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.inatel.idplabs.jpa.entity.Produto;

@Service
@Transactional
public class ProdutoService {

	@PersistenceContext //anotação de injeção de dependencia do jpa
	private EntityManager em;

	public Produto salvar(Produto produto) {
		produto = em.merge(produto); //salva e já devolve uma instacia do produto. Pode receber um objeto que já existe ou um novo objeto
		return produto;
	}
	
	public Produto buscarPeloId(Long id) {
		Produto produto = em.find(Produto.class, id); //jpa usar reflection para montar a query, por isso usar o .class
		return produto;
	}
	
	public List<Produto> listar() {
		String JPQL = "select p from Produto p";
		List<Produto> lista = em.createQuery(JPQL, Produto.class).getResultList();
		return lista;
	}
	
	public void deletar(Produto produto) {
		produto = em.merge(produto); //esta linha é para deixar o objeto em estado Managed
		em.remove(produto);
	}
}
