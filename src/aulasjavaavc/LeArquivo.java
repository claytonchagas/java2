package aulasjavaavc;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
//java.io -> i: input, o: output
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeArquivo {
//Para tratar o fluxo de saída
//existe a classe abstrata
//OutputStream
//Para tratar o fluxo de entrada
//existe a classe abstrata
//InputStream
	public static void main(String[] args) throws IOException {
		//System.out.println("Digite uma tecla: ");
		//InputStream is = System.in;
		//Quick fix: (i) cursor em cima do erro ou
		//(ii) Ctrl + 1 e seleciono uma das opções 
		InputStream is = new FileInputStream("teste.txt");
		//IS é a classe que sabe capturar um byte
		//recebendo neste caso de System.in
		//que é a entrada padrão do sistema
		//que é o teclado
		InputStreamReader isr = new InputStreamReader(is);
		//ISR sabe receber um byte e transformá-lo em char
		//char c;
		@SuppressWarnings("resource")
		BufferedReader brf = new BufferedReader(isr);
		String s = brf.readLine();
		System.out.println("Conteúdo do arquivo: "+s+"\n\n");
		
		while(s != null) {
			System.out.println(s);
			s = brf.readLine();
		}
	}
}