package testes;

import java.sql.SQLException;

import dao.ContatoDao;
import modelo.Contato;

public class TestaDaoInsere {
	public static void main(String[] args) {
		Contato c1 = new Contato();
		String nome = "Maria";
		String email = "maria@gmail.com";
		String endereco = "Av. Brasil, nr 10000";
		
		c1.setNome(nome);
		c1.setEmail(email);
		c1.setEndereco(endereco);
		
		ContatoDao cdao;
		try {
			cdao = new ContatoDao();
			cdao.adiciona(c1);
			System.out.println("Gravação feita com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}