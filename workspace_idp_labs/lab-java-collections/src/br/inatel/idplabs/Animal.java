package br.inatel.idplabs;

public class Animal {

	private Long id;
	private String nome;
		
	public Animal() {}

	public Animal(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return nome;
	}
}
