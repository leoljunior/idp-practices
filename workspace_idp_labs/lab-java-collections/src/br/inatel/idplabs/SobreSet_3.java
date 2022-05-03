package br.inatel.idplabs;

import java.util.LinkedHashSet;
import java.util.Set;

public class SobreSet_3 {
	public static void main(String[] args) {
		
//		O LinkedHashSet mantem a ordem de inserção, msm caracteristica do List
		Set<String> setDeFrutas = new LinkedHashSet<>();

		setDeFrutas.add("Uva");
		setDeFrutas.add("Laranja");
		setDeFrutas.add("Melão");
		setDeFrutas.add("Abacaxi");
		setDeFrutas.add("Pêssego");
		
		System.out.println(setDeFrutas);

	}
}
