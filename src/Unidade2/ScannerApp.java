package Unidade2;

import java.util.Formatter;
import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {
		//ler do teclado
		Scanner entrada = new Scanner(System.in);
		Formatter saida = new Formatter(System.out); // monitor
		
		System.out.println("Informe a Nota 1");
		float n1 = entrada.nextFloat(); // le nota
		System.out.println("Informe a Nota 2");
		float n2 = entrada.nextFloat();
		System.out.println("Informe a Nota 3");
		float n3 = entrada.nextFloat();
		System.out.println("Informe a Nota 4");
		float n4 = entrada.nextFloat();
		
		float media = (n1+n2+n3+n4)/4;
		saida.format("Media= %.2f", media);
		entrada.close();
		entrada.close();
	}

}
