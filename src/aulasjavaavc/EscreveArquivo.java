package aulasjavaavc;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
//java.io -> i: input, o: output
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class EscreveArquivo {
//Para tratar o fluxo de saída
//existe a classe abstrata
//OutputStream
//Para tratar o fluxo de entrada
//existe a classe abstrata
//InputStream
	public static void main(String[] args) throws IOException { 
		OutputStream os = new FileOutputStream("escrita.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("Java teste 123");
		bw.close();
		System.out.println("Escrita realizada com sucesso!!!");
	}
}