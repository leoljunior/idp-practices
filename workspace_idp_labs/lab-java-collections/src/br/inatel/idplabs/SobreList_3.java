package br.inatel.idplabs;

import java.util.Collections;
import java.util.List;

public class SobreList_3 {

	public static void main(String[] args) {

		List<String> lista = Collections.emptyList();
				
		try {
			lista.add("Deve lançar um exception");
		} catch (Exception e) {
			System.out.println("Impossível colocar elemento em uma emptyList");
		}
		
		System.out.println(lista);
		
	}
}
