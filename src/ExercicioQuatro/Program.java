package ExercicioQuatro;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		System.out.println("SISTEMA CALCULA SALARIO POR HORAS TRABALHADAS ....");
		System.out.println("INFORME A QUANTIDADE DE HORAS .....");
		double horasTrabalhadas = entradaDados.nextDouble();
		System.out.println("INFORME O VALOR POR HORA .....");
		double valorPorHora = entradaDados.nextDouble();

		System.out.printf("VALOR TOTAL DO SALARIO E %.2f", horasTrabalhadas * valorPorHora);

		entradaDados.close();
	}
}
