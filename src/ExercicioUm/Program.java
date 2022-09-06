package ExercicioUm;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);

		System.out.println("SISTEMA SOMA DE DOIS NUMEROS  .....");
		System.out.println("INFORME O PRIMEIRO NUMERO DA SOMA ....");
		double valorUm = entradaDados.nextDouble();
		System.out.println("INFORME O SEGUNDO NUMERO  ....");
		double valorDois = entradaDados.nextDouble();

		System.out.printf("SOMA DOS NUMEROS E %.2f", valorUm + valorDois);

		entradaDados.close();
	}
}
