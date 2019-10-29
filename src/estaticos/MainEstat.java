package estaticos;

import java.util.Scanner;

import util.Converção;

public class MainEstat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Dolar hoje:US$ %.2f\n", Converção.DOLARVALOR);
		System.out.printf("Valor IOF:%s\n", Converção.IOF);
		
		System.out.println("Digite o valor a ser comprado em dolares:"); 
		
		double valor = input.nextDouble();
		
		
		double pagar = Converção.conver(valor);
		double total = Converção.taxa(pagar);
		
		System.out.printf("Valor a pagar em real: R$ %.2f\n", pagar);
		System.out.printf("Taxa a pagar: R$%.2f\n", Converção.taxa(pagar));
		System.out.printf("Valor Total: R$%.2f",Converção.total(pagar, total));
		
		}

}
