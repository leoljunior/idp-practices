package com.leonardo.apiprodutos.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.leonardo.apiprodutos.domain.models.NotaCompra;
import com.leonardo.apiprodutos.domain.models.NotaCompraItem;

@Service
@Transactional
public class NotaCompraService {

	@PersistenceContext
	private EntityManager em;
	
	//NOTA COMPRA
	public NotaCompra salvarNotaCompra(NotaCompra notaCompra) {
		return em.merge(notaCompra);
	}
	
	public NotaCompra buscarNotaCompraPeloId(Long id) {
		return em.find(NotaCompra.class, id);
	}
	
//	RESOLVENDO O PROBLEMA NO LAZY LOADING NÃO TRAZER LISTA QUANDO OPOSTO DO RELACIONAMENTO É MANY
	public NotaCompra buscarNotaCompraPeloIdComListaItem(Long id) {
		NotaCompra notaCompra = em.find(NotaCompra.class, id);
		notaCompra.getListaNotaCompraItem().size(); //força o carregamento da lista, deixando em estado Managed
		return notaCompra;
	}
	
	public List<NotaCompra> listarNotaCompra() {
		return em.createQuery("select nc from NotaCompra nc", NotaCompra.class).getResultList();
	}
	
	//NOTA COMPRA ITEM
	public NotaCompraItem salvarNotaCompraItem(NotaCompraItem notaCompraItem) {
		return em.merge(notaCompraItem);
	}
	
	public NotaCompraItem buscarNotaCompraItemPeloId(Long id) {
		return em.find(NotaCompraItem.class, id);
	}
	
	public List<NotaCompraItem> listarNotaCompraItem() {
		return em.createQuery("select nci from NotaCompraItem nci", NotaCompraItem.class).getResultList();
	}
	
}
