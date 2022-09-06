package ExercicioCinco;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		
		System.out.println("SISTEMA PARA CALCULAR PEDIDO DE PEÇAS ....");
	    System.out.println("1 - EIXO MOTOR      R$ 500.00 ....");	
	    System.out.println("2 - BATERIA         R$ 340.00 ....");	
	    System.out.println("3 - BOMBA GASOLINA  R$ 750.00 .....");	
	    System.out.println("4 - PNEU 175 70 13  R$ 278.00 .....");	
		
	    System.out.println("INFORME O CODIGO DO PRODUTO .....");
		int codigoProduto = entradaDados.nextInt();
		System.out.println("INFORME A QUANTIDADE DO PRODUTO");
		int quantidadeProduto = entradaDados.nextInt();
		
		double valorPedido = 0.0;
		switch(codigoProduto){
		case 1:
			valorPedido = quantidadeProduto * 500.00;
			break;
		case 2:
			valorPedido = quantidadeProduto * 340.00;
			break;
		case 3:
			valorPedido = quantidadeProduto * 750.00;
			break;
		case 4:
			valorPedido = quantidadeProduto * 278.00;
		default:
			System.out.println("QUANTIDADE E CODIGO DO PRODUTOS INFORMADOS ESTÃO INCORRETOS ....");
			break;
		}
		
		System.out.printf("VALOR TOTAL DO PEDITO E : %.2f", valorPedido);
		
		entradaDados.close();
	}
}
