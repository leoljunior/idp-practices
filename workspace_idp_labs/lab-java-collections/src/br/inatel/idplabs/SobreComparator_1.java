package br.inatel.idplabs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SobreComparator_1 {

	public static void main(String[] args) {

		List<Animal> listaDeAnimais = new ArrayList<>();
		
		listaDeAnimais.add(new Animal(4L, "Gato"));
		listaDeAnimais.add(new Animal(3L, "Cachorro"));
		listaDeAnimais.add(new Animal(2L, "Coelho"));
		listaDeAnimais.add(new Animal(6L, "Jacaré"));
		listaDeAnimais.add(new Animal(8L, "Zebra"));
		listaDeAnimais.add(new Animal(1L, "Tartaruga"));
		listaDeAnimais.add(new Animal(5L, "Girafa"));
		listaDeAnimais.add(new Animal(7L, "Alce"));
		
//		Aqui implentamos a sobrecarga do sorte que recebe uma lista e um comparator, e instanciamos o comparador que criamos, no caso o por nome
		System.out.println("Imprimindo pela ordem do nome: ");
		Collections.sort(listaDeAnimais, new ComparadorPorNome());
		System.out.println(listaDeAnimais);
		
		System.out.println("Imprimindo pela ordem da ID: ");
		Collections.sort(listaDeAnimais, new ComparadorPorId());
		System.out.println(listaDeAnimais);
		
		
	}

}
