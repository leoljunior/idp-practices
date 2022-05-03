package br.inatel.idplabs;

import java.util.ArrayList;
import java.util.List;

public class SobreList_2 {

	public static void main(String[] args) {

		List<Animal> listaDeAnimais = new ArrayList<>();
		
		listaDeAnimais.add(new Animal(1L, "Tubarão"));
		listaDeAnimais.add(new Animal(2L, "Caracol"));
		listaDeAnimais.add(new Animal(3L, "Camelo"));
		listaDeAnimais.add(new Animal(4L, "Gato"));
		listaDeAnimais.add(new Animal(5L, "Ganso"));
		listaDeAnimais.add(new Animal(6L, "Gato"));
		
		System.out.println(listaDeAnimais);
		
	}

}
