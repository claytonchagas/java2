package aulasjavaavc.threadsjavaavc;

public class Contador implements Runnable{
	
	private int cont;

	public void setCont(int cont) {
		this.cont = cont;
	}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Thread "+cont+", valor:"+i);
		}	
	}
}