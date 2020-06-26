package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Tarefa;

public class RemoverTarefa {
	public static void main(String[] args) {
		Tarefa tarefa3 = new Tarefa();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		tarefa3.setId(1L);
		tarefa3 = manager.find(Tarefa.class, tarefa3.getId());
		//ou tarefa3 = manager.find(Tarefa.class, 1L);
		
		manager.getTransaction().begin();
		manager.remove(tarefa3);
		manager.getTransaction().commit();
		
		System.out.println("Tarefa excluída!");
		
		manager.close();
		
	}
}