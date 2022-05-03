package br.inatel.idplabs;

import java.util.Collection;
import java.util.TreeSet;

public class SobreCollection_1 {

	public static void main(String[] args) {

		Collection<String> colecao = buildCollectionImplementation();
		
		colecao.add("Tubarão");
		colecao.add("Onça");
		colecao.add("Anta");
		colecao.add("Pantera");
		colecao.add("Camaleão");
		
		System.out.println(colecao);
		
	}
	
//	Implementações:
//		ArrayList - Ordem de inserção
//		HashSet - sem ordem definida
//		TreeSet - ordem natural dos elementos
		

	private static Collection<String> buildCollectionImplementation() {
		return new TreeSet<String>();
	}

}
