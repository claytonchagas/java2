package orm.testes;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraTarefa2 {
	public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
        factory.close();
    }
}