package br.inatel.idplabs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SobreComparable_2 {
	public static void main(String[] args) {

		List<Animal> listaDeAnimais = new ArrayList<>();

		listaDeAnimais.add(new Animal(1L, "Tartaruga"));
		listaDeAnimais.add(new Animal(2L, "Coelho"));
		listaDeAnimais.add(new Animal(3L, "Cachorro"));
		listaDeAnimais.add(new Animal(4L, "Gato"));
		listaDeAnimais.add(new Animal(5L, "Girafa"));
		listaDeAnimais.add(new Animal(6L, "Gato"));

		System.out.println("Imprimindo pela ordem de inserção: ");
		System.out.println(listaDeAnimais);

		System.out.println("Imprimindo pela ordem alfabética pelo nome do animal: ");
		Collections.sort(listaDeAnimais);
		System.out.println(listaDeAnimais);

//		Metodo mais simples de implementar o comparable, ou é usado a ordem natural que as classes wrappers já implementam ou pode-se sobrescrever 
//		o compareTo na classe de domínio. Só pode ser implementar uma vez, ou seja só um tipo de comparação
		
	}
}
