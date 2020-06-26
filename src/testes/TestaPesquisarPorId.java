package testes;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.ContatoDao;
import modelo.Contato;

public class TestaPesquisarPorId {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Id?");
		Long ps = sc.nextLong();

		try {
			ContatoDao dao = new ContatoDao();
			List<Contato> contatos = dao.pesquisarPorId(ps);

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