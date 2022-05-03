package br.inatel.idplabs;

import java.util.Set;
import java.util.TreeSet;

public class SobreSet_2 {
	public static void main(String[] args) {

//		O treeSet mantem a ordem natural dos elementos
		Set<String> setDeFrutas = new TreeSet<>();

		setDeFrutas.add("Uva");
		setDeFrutas.add("Laranja");
		setDeFrutas.add("Melão");
		setDeFrutas.add("Abacaxi");
		setDeFrutas.add("Pêssego");

		System.out.println(setDeFrutas);
	}
}
