package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Tarefa;

public class AtualizarTarefa {
	public static void main(String[] args) {
		Tarefa tarefa2 = new Tarefa();
		tarefa2.setId(1L);
		tarefa2.setDescricao("Estudar muito mais Java 2");
		tarefa2.setFinalizado(false);
		tarefa2.setDataFinalizacao(null);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.merge(tarefa2);
		manager.getTransaction().commit();
		
		System.out.println("Tarefa atualizada, ID: "+tarefa2.getId());
		
		manager.close();	
	}
}