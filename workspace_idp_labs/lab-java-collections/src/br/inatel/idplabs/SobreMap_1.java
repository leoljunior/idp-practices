package br.inatel.idplabs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SobreMap_1 {
	public static void main(String[] args) {

		Animal animal1 = new Animal(1L, "Tarântula");
		Animal animal2 = new Animal(2L, "Camaleão");
		Animal animal3 = new Animal(3L, "Camelo");
		Animal animal4 = new Animal(4L, "Gafanhoto");
		Animal animal5 = new Animal(5L, "Golfinho");
		Animal animal6 = new Animal(6L, "Rinoceronte");
		
		Map<String, Animal> mapDeAnimais = new HashMap<>();
		mapDeAnimais.put("SPID", animal1);
		mapDeAnimais.put("CHAM", animal2);
		mapDeAnimais.put("CAM", animal3);
		mapDeAnimais.put("LOC", animal4);
		mapDeAnimais.put("DOLP", animal5);
		mapDeAnimais.put("RHIN", animal6);
		
		System.out.println(mapDeAnimais);
		System.out.println();
		
		System.out.println(">>>Usando keySet para pegar as chaves<<<");
		Set<String> keySet = mapDeAnimais.keySet();
		System.out.println(keySet);
		System.out.println();
		
		System.out.println(">>>Usando values para pegar os valores<<<");
		Collection<Animal> values = mapDeAnimais.values();
		System.out.println(values);
		System.out.println();
		
		System.out.println(">>>Usando entrySet para pegar as entradas<<<");
		Set<Entry<String, Animal>> entrySet = mapDeAnimais.entrySet();
		for (Entry<String, Animal> e : entrySet) {
			System.out.print("Key: " + e.getKey());
			System.out.println(" - Value: " + e.getValue());
		}
	}
}
