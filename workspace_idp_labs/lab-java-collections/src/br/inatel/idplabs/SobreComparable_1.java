package br.inatel.idplabs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SobreComparable_1 {
	public static void main(String[] args) {

		List<String> listaDeAlimentos = new ArrayList<>();
			
		listaDeAlimentos.add("Damasco");
		listaDeAlimentos.add("Arroz");
		listaDeAlimentos.add("Rabanete");
		listaDeAlimentos.add("Cenoura");
		listaDeAlimentos.add("Batata");
		listaDeAlimentos.add("Pepino");
		
		System.out.println("Imprimindo pela ordem de inserção: ");
		System.out.println(listaDeAlimentos);
		
		System.out.println("Imprimindo pela ordem alfabética: ");
		Collections.sort(listaDeAlimentos);
		System.out.println(listaDeAlimentos);
		
		
	}
}
