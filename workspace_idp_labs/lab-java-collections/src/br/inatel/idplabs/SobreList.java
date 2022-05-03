package br.inatel.idplabs;

import java.util.ArrayList;
import java.util.List;

public class SobreList {

	public static void main(String[] args) {
		
//		List mantem a ordem de inserção, permite valores repetidos, aloca mais espaço na memoria de acordo com o que a lista aumenta
		List<String> listaDeAlimentos = new ArrayList<>();
		listaDeAlimentos.add("Cenoura");
		listaDeAlimentos.add("Arroz");
		listaDeAlimentos.add("Batata");
		listaDeAlimentos.add("Macarrão");
		
		System.out.println(listaDeAlimentos);
	}

}
