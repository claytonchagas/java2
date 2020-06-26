package aulasjavaavc;

import java.util.ArrayList;
import java.util.List;

//API Collection de java.util: serve para tratar as limitações do Array
//algumabiblioteca.jar
//Interface Raiz da API Collection de Java: Collection
//Interfaces filha de Collection: Set e List
//Filhas concretas de Set: HashSet, TreeSet
//Filhas concretas de List: ArrayList, LinkedList
//Set: coleção não ordenada e sem duplicidade
//List: coleção ordenada e que permite duplicidade
//Set: {0, 0, 1, 3, 1} => #3 =>Ordene: N/A
//List: {0, 0, 1, 3, 1} => #5 =>Ordene: {0, 0, 1, 1, 3}
//Detalhes mais profundos: https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html

public class TestaLista {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List alunos = new ArrayList();
		alunos.add("Marcelo");
		alunos.add("Robert");
		alunos.add("Kamila");
		System.out.println(alunos.size());
		
//		for (int i = 0; i < alunos.size(); i++) {
//			System.out.println();
//		}
		
//		for (Object object : alunos) {
//			System.out.println(object);
//		}
		
//		Métodos importantes de ArrayList: add, size, get
//		remove, contains
		for (Object aluno : alunos) {
			System.out.println(aluno);
		}
		
//		Busca cega
		System.out.println(alunos.contains("Clayton"));
		
//		Remoção
		alunos.remove("Marcelo");
		for (Object aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println(alunos.size());
		
		alunos.removeAll(alunos);
		System.out.println(alunos.size());
		for (Object aluno : alunos) {
			System.out.println(aluno);
		}
		
//		Generics: estrutura complementar de Collection
//		Para restringir um tipo que será associado a um
//		coleção
	}
}