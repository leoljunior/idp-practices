package br.inatel.idplabs;

import java.util.HashSet;
import java.util.Set;

public class SobreSet_1 {

	public static void main(String[] args) {

//		Set não aceita valor igual, não garante ordem de inserção, usa equals e hashCode para diferenciar objetos
		Set<String> setDeFrutas = new HashSet<>();
		
		setDeFrutas.add("Uva");
		setDeFrutas.add("Laranja");
		setDeFrutas.add("Melão");
		setDeFrutas.add("Abacaxi");
		setDeFrutas.add("Uva"); //ignorado, set não aceita valores iguais
		setDeFrutas.add("uva");
		setDeFrutas.add("Pêssego");
		
		System.out.println(setDeFrutas);
		
	}

}
