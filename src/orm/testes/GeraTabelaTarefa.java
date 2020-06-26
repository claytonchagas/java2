package orm.testes;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraTabelaTarefa {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		factory.close();
	}
}