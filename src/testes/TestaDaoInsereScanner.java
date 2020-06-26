package testes;

import java.util.Scanner;

import dao.ContatoDao;
import modelo.Contato;

public class TestaDaoInsereScanner {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Contato c1 = new Contato();
		System.out.println("Insira o nome: \n");
		c1.setNome(ler.nextLine());
		System.out.println("Insira o email: \n");
		c1.setEmail(ler.nextLine());
		System.out.println("Insira o endereço: \n");
		ler.close();

		ContatoDao cdao;
		try {
			cdao = new ContatoDao();
			cdao.adiciona(c1);
			System.out.println("Gravação feita com sucesso!");
		} catch (Exception e) {
			// TODO: handle exception
		}	
	}
}