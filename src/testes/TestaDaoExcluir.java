package testes;

import dao.ContatoDao;

public class TestaDaoExcluir {
	public static void main(String[] args) {
		try {
			ContatoDao contatoDao;
			contatoDao = new ContatoDao();
			contatoDao.deletar(1L);
			System.out.println("ok, deletado");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}