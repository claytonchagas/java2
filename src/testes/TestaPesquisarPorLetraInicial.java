package testes;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.ContatoDao;
import modelo.Contato;

public class TestaPesquisarPorLetraInicial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Letra inicial");
		char ps = sc.next().charAt(0);

		try {
			ContatoDao dao = new ContatoDao();
			List<Contato> contatos = dao.pesquisarPorLetraInicialNome(ps);

			for (Contato contato : contatos) {
				System.out.println("Nome: "+contato.getNome());
				System.out.println("Nome: "+contato.getEmail());
				System.out.println("Nome: "+contato.getEndereco()+"\n");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}