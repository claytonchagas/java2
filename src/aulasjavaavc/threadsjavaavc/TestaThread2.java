package aulasjavaavc.threadsjavaavc;

public class TestaThread2 {
	public static void main(String[] args) {
		DesenhaMapa2 dMapa = new DesenhaMapa2();
		Thread tMapa = new Thread(dMapa);
		tMapa.start();
		
		BarraProgresso2 bProg = new BarraProgresso2();
		Thread tProg = new Thread(bProg);
		tProg.start();
	}
}