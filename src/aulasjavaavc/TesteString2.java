package aulasjavaavc;

public class TesteString2 {
	public static void main(String[] args) {
//		Vamos testar os principais métodos de String
		String a = " Teste com Java ";
		//Função split
		String b[] = a.split(" ");
		System.out.println(a);
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
//		System.out.println(b[3]);
		
		//Função compareTo
		String c = "teste com java";
		int i = a.compareTo(a);
		System.out.println(i);
		int j = a.compareTo(c);
		System.out.println(j);
		int k = a.compareToIgnoreCase(c);
		System.out.println(k);
		
		//Outras funções de String
		//Função charAt: zero base
		char d = a.charAt(3);
		System.out.println(d);
		//Função length: one base
		int m = a.length();
		System.out.println(m);
		//Função substring: zero base
		String f1 = a.substring(3);
		System.out.println(f1);
		String f2 = a.substring(3, 7);
		System.out.println(f2);
		//Função trim: remove espaços nas bordas da String
		String ss = a.trim();
		System.out.println(ss);
		
		//Função indexOf (somente 1a incidência): zero base
		int j2 = a.indexOf("e");
		System.out.println(j2);
		int j3 = a.lastIndexOf("e");
		System.out.println(j3);
		
		//Função isEmpty: afirmação
		boolean bol = a.isEmpty();
		System.out.println(bol);
		String a1 = "";
		boolean bol2 = a1.isEmpty();
		System.out.println(bol2);
		String a2 = " ";
		boolean bol3 = a2.isEmpty();
		System.out.println(bol3);
		
		boolean q = a.contains("Java");
		System.out.println(q);
		
		//Função replace: carct a ser subst, caract substituto
		a.replace("a", "o");
		System.out.println(a);
		String b1 = a.replace("a", "o");
		System.out.println(b1);
	}
}