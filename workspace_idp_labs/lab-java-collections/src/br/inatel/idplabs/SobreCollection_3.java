package br.inatel.idplabs;

import java.util.ArrayList;
import java.util.Collection;

public class SobreCollection_3 {

	public static void main(String[] args) {

		//referenciandoColecao();
		instanciandoNovaColecao();
		
	}

//	Este metodo instancia um novo objeto outras que recebe a lista frutas
	private static void instanciandoNovaColecao() {
		Collection<String> frutas = new ArrayList<>();
		frutas.add("Laranja");
		frutas.add("Banana");
		frutas.add("Melância");
		
		Collection<String> outras = new ArrayList<>(frutas);
		
		System.out.println("Frutas: " + frutas);
		System.out.println("Outras: " + outras);
		
		System.out.println("Invocando clear no outras: ");
		outras.clear();
		
		System.out.println("Somente o outras foi limpo, pois apontam para objetos diferentes");
		System.out.println("Frutas: " + frutas);
		System.out.println("Outras: " + outras);
	}

//	Este metodo passa uma referencia do objeto frutas para o outras
	@SuppressWarnings("unused")
	private static void referenciandoColecao() {
		Collection<String> frutas = new ArrayList<>();
		frutas.add("Laranja");
		frutas.add("Banana");
		frutas.add("Melância");
		
		Collection<String> outras = frutas;
		
		System.out.println("Frutas: " + frutas);
		System.out.println("Outras: " + outras);
		
		System.out.println("Invocando clear no outras: ");
		outras.clear();
		
		System.out.println("As duas listas foram limpas, pois apontavam para o msm objeto em memoria");
		System.out.println("Frutas: " + frutas);
		System.out.println("Outras: " + outras);
	}
}
