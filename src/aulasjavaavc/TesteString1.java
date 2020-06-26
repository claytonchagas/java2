package aulasjavaavc;

public class TesteString1 {
	public static void main(String[] args) {
//		Teste de igualdade com números (variáveis primitivas)
		int i = 1;
		int j = 1;
		
		if (i == j) {
			System.out.println("São iguais!!!");
		} else {
			System.out.println("São diferentes!!!");
		}
	
//		Teste de igualdade com String
		String a = new String("Teste Java");
		String b = new String("Teste Java");
		
		if (a == b) {
			System.out.println("São iguais!!!");
		} else {
			System.out.println("São diferentes!!!");
		}
		
		if (a.equals(b)) {
			System.out.println("a e b tem conteúdos  iguais!!!");
		} else {
			System.out.println("a e b tem conteúdos diferentes!!!");
		}
	}
}