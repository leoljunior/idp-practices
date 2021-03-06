package br.inatel.idplabs;

import java.util.ArrayList;
import java.util.Collection;

public class SobreCollection_2 {

	public static void main(String[] args) {

		Collection<String> engenhariasAtuais = new ArrayList<>();
		engenhariasAtuais.add("Telecom");
		engenhariasAtuais.add("Biomédica");
		engenhariasAtuais.add("Computação");
		engenhariasAtuais.add("Software");
		engenhariasAtuais.add("Produção");
		System.out.println("Engenharias Atuais: " + engenhariasAtuais);

		Collection<String> engenhariasFuturas = new ArrayList<>();
		engenhariasFuturas.add("Mecânica");
		engenhariasFuturas.add("Mecatrônica");
		engenhariasFuturas.add("Robótica");
		System.out.println("Engenharias Atuais: " + engenhariasFuturas);

		Collection<String> todasEngenharias = new ArrayList<>();
		todasEngenharias.addAll(engenhariasAtuais);
		todasEngenharias.addAll(engenhariasFuturas);
		System.out.println("Todas Engenharias: " + todasEngenharias);

//		O metodo addAll() não é thread-safe. Ele manipula dados internos o que demanda tempo
//		se outra thread assumir o controle quando a primeira ainda está em execução os dados
//		podem se tornar inconsistentes.

		System.out.println("");
		System.out.println(">> Entendendo o isEmpty() & size() <<");

//		Construtor sobrecarregado que recebe outra coleção
		Collection<String> engenharias = new ArrayList<>(todasEngenharias);
		System.out.println("Engenharias futuras está vazia? " + engenhariasFuturas.isEmpty());
		System.out.println("Engenarias futuras tem quantos elementos? " + engenhariasFuturas.size());


		System.out.println("");
		System.out.println(">> Entendendo o clear() <<");
		
		imprimirStatusDaColecao(engenharias);

		System.out.println("....invocando clear()");
		engenharias.clear();
		imprimirStatusDaColecao(engenharias);
		
		

	}

//	Metodo refatorado que testa o tamanho
	private static void imprimirStatusDaColecao(Collection<String> engenharias) {
		if (engenharias.isEmpty()) {
			System.out.println("Vazio");
		} else {
			System.out.println("Tem elementos");
		}
	}

}
