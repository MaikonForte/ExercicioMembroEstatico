package estaticos;

import java.util.Scanner;

import util.Conver��o;

public class MainEstat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Dolar hoje:US$ %.2f\n", Conver��o.DOLARVALOR);
		System.out.printf("Valor IOF:%s\n", Conver��o.IOF);
		
		System.out.println("Digite o valor a ser comprado em dolares:"); 
		
		double valor = input.nextDouble();
		
		
		double pagar = Conver��o.conver(valor);
		double total = Conver��o.taxa(pagar);
		
		System.out.printf("Valor a pagar em real: R$ %.2f\n", pagar);
		System.out.printf("Taxa a pagar: R$%.2f\n", Conver��o.taxa(pagar));
		System.out.printf("Valor Total: R$%.2f",Conver��o.total(pagar, total));
		
		}

}
