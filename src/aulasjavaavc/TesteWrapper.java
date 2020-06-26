package aulasjavaavc;

public class TesteWrapper {
	public static void main(String[] args) {
		int i = 5;
		//conversão automática da var i
		//de int para String
		System.out.println("teste "+i);
		
		//conversão coercitiva: classes Wrapper
		//que possuem métodos de parse
		String s = "20";
		//A linha abaixo dá erro, pois não posso
		//somar int com String
		//int k = i + s;
		//A linha abaixo converte s de int p/ String
		int j = Integer.parseInt(s);
		int k = i + j;
		System.out.println(k);
		
//		Tipo Primitivo	Classe Wrapper
//		boolean			Boolean
//		byte			Byte
//		char			Character
//		float			Float
//		int				Integer
//		long			Long
//		short			Short
	}
}