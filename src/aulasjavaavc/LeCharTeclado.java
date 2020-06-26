package aulasjavaavc;

import java.io.IOException;
//java.io -> i: input, o: output
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeCharTeclado {
//Para tratar o fluxo de saída
//existe a classe abstrata
//OutputStream
//Para tratar o fluxo de entrada
//existe a classe abstrata
//InputStream
	public static void main(String[] args) {
		System.out.println("Digite uma tecla: ");
		InputStream is = System.in;
		//IS é a classe que sabe capturar um byte
		//recebendo neste caso de System.in
		//que é a entrada padrão do sistema
		//que é o teclado
		InputStreamReader isr = new InputStreamReader(is);
		//ISR sabe receber um byte e transformá-lo em char
		char c;
		try {
			c = (char) isr.read();
			System.out.println("Você digitou a tecla "+c);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
				
	}
}