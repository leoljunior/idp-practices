package br.inatel.idplabs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SobreList_4 {
	public static void main(String[] args) {

		List<String> listaDeMoveis = new ArrayList<>();
		listaDeMoveis.add("Cadeira");

//		Usando unmodifiableList da classe utilitária Collections
		List<String> listaDeMoveisBloqueada = Collections.unmodifiableList(listaDeMoveis);

		boolean flagMesmaInstancia = listaDeMoveis == listaDeMoveisBloqueada;

		System.out.println("São a mesma instância? " + flagMesmaInstancia);

		listaDeMoveis.add("Armário");
		listaDeMoveisBloqueada.add("Sofá"); //Aqui é lançada uma exception, pois é impossível setar um item em uma lista unmodifiable
	}
}
