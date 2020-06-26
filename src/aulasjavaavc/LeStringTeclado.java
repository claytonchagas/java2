package aulasjavaavc;

import java.io.BufferedReader;
import java.io.IOException;
//java.io -> i: input, o: output
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeStringTeclado {
//Para tratar o fluxo de saída
//existe a classe abstrata
//OutputStream
//Para tratar o fluxo de entrada
//existe a classe abstrata
//InputStream
	public static void main(String[] args) {
		//System.out.println("Digite uma tecla: ");
		System.out.println("Digite uma palavra: ");
		InputStream is = System.in;
		//IS é a classe que sabe capturar um byte
		//recebendo neste caso de System.in
		//que é a entrada padrão do sistema
		//que é o teclado
		InputStreamReader isr = new InputStreamReader(is);
		//ISR sabe receber um byte e transformá-lo em char
		BufferedReader bfr = new BufferedReader(isr);
		//BR sabe receber vários char e armazená-los num
		//buffer transformando-os em String
		//char c;
		String s;
		
		try {
			//c = (char) isr.read();
			s = bfr.readLine();
			//System.out.println("Você digitou a tecla "+c);
			System.out.println("Você digitou a palavra: "+s);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
				
	}
}