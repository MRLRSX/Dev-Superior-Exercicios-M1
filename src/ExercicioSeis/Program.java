package ExercicioSeis;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);

		System.out.println("SISTEMA PARA CALCULAR AREA TRIÂNGULO - TRAPÉZIO - QUADRADO - RETÂNGULO ");
		System.out.println(" área do triângulo que tem A por base C");
		System.out.println(" área do circulo  Raio C ");
		System.out.println(" área do trapézio que tem A e B por bases e C por Altura");
		System.out.println(" área do retângulo que tem lados A e B");
		System.out.println("INFORME A: ");
		double valorA = entradaDados.nextDouble();
		System.out.println("INFORME B: ");
		double valorB = entradaDados.nextDouble();
		System.out.println("INFORME C: ");
		double valorC = entradaDados.nextDouble();

		System.out.printf("AREA DO TRINGULO : %2.f", valorA * valorC / 2.0);
		System.out.printf("\nAREA DO CIRCULO : %2.f", Math.PI * (valorC * valorC));
		System.out.printf("\nAREA DO TRAPEZIO : %2.f", (valorA + valorC) / 2.0 * valorC);
		System.out.printf("\nAREA DO RETANGULO : %2.f", valorA * valorB);
		entradaDados.close();
	}
}
