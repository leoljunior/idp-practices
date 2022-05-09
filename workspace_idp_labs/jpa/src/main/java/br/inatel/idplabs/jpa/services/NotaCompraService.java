package br.inatel.idplabs.jpa.services;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.inatel.idplabs.jpa.entity.NotaCompra;
import br.inatel.idplabs.jpa.entity.NotaCompraItem;

@Service
@Transactional
public class NotaCompraService {

	private EntityManager em;
	
	public NotaCompra buscarNotaCompraPeloId(Long id) {
		return em.find(NotaCompra.class, id);
	}
	
	public NotaCompra salvar(NotaCompra nota) {
		return em.merge(nota);
	}
	
	public List<NotaCompra> listarNotaCompra() {
		return em.createQuery("Select n from NotaCompra n", NotaCompra.class)
				.getResultList();
	}
	
	public NotaCompraItem buscarNotaCompraItemPeloId(Long id) {
		return em.find(NotaCompraItem.class, id);
	}
	
	public NotaCompraItem salvar(NotaCompraItem notaCompraItem) {
		return em.merge(notaCompraItem);
	}
	
	public List<NotaCompraItem> listarNotaCompraItem() {
		return em.createQuery("Select i from NotaCompraItem i", NotaCompraItem.class)
				.getResultList();
	}
}
