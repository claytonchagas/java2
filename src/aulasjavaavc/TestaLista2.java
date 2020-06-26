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

//Generics: estrutura complementar de Collection
//Para restringir um tipo que será associado a um
//coleção -> List< tipo que quero restringir >

public class TestaLista2 {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();
//		alunos.add("Marcelo");
//		alunos.add("Robert");
//		alunos.add("Kamila");
		Aluno a1 = new Aluno();
		a1.setNome("Marcelo");
		alunos.add(a1);
		
		Aluno a2 = new Aluno();
		a2.setNome("Robert");
		alunos.add(a2);
		
		System.out.println(alunos.size());
		
//		for (int i = 0; i < alunos.size(); i++) {
//			System.out.println();
//		}
		
//		for (Object object : alunos) {
//			System.out.println(object);
//		}
		
//		Métodos importantes de ArrayList: add, size, get
//		remove, contains
		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNome());
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
	}
}