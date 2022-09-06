package ExercicioDois;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);

		System.out.println("SISTEMA CALCULAR AREA DE UM CIRCULO  ....");
		System.out.println("INFORME O RAIO DO CIRCULO ....");
		double valorUm = entradaDados.nextDouble();
		System.out.printf("AREA DO CIRCULO E %.2f", Math.PI * (valorUm * valorUm));
		
		entradaDados.close();
	}
}
