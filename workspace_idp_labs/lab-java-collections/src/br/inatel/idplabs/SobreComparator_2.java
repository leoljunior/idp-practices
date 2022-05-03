package br.inatel.idplabs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SobreComparator_2 {
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
		
		listaDeAnimais.sort((a1, a2) -> a1.getNome().compareTo(a2.getNome()));
		System.out.println("Sort pelo nome usando Lambda: ");
		System.out.println(listaDeAnimais);
		
		//listaDeAnimais.sort(Comparator.comparing(a -> a.getNome()));
		listaDeAnimais.sort(Comparator.comparing(Animal::getNome)); //mesmo resultado da linha anterior, porém usando method reference
		System.out.println("Sort pelo nome usando Factoring de Comparator, comparing: ");
		System.out.println(listaDeAnimais);
		
	}
}
