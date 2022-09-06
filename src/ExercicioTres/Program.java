package ExercicioTres;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
 		System.out.println("CALCULA DIFERENÇA DO PRODUTO A,B C e D ...");
 		
 		System.out.println("INFORME PRODUTO A ...");
 		double produtoA = entradaDados.nextDouble();
 		System.out.println("INFORME O PRODUTO B ...");
 		double produtoB = entradaDados.nextDouble();
 		System.out.println("INFORME O PRODUTO C ...");
 		double produtoC = entradaDados.nextDouble();
 		System.out.println("INFORME O PRODUTO D ...");
 		double produtoD = entradaDados.nextDouble();
		
 		double diferencaProdutos = produtoA * produtoB - produtoC * produtoD;
 		
		System.out.printf("DIFERENÇA ENTRE PRODUTO A,B C e D e %.2f", diferencaProdutos);
		entradaDados.close();
	}
}
