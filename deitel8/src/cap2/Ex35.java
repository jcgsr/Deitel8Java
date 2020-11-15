package cap2;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		// 15.11.2020
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Faixa Solidária\n");

		System.out.print("Km dirigidos por dia: ");
		float km = sc.nextFloat();
		
		System.out.print("Preço gasolina/álcool: ");
		float gasAl = sc.nextFloat();
		
		System.out.print("Km por litro: ");
		float kmL = sc.nextFloat();
		
		float custoGas = (km / kmL) * gasAl;
		
		System.out.print("Estacionamento: ");
		float estacionamento = sc.nextFloat();
		
		System.out.print("Pedágio: ");
		float pedagio = sc.nextFloat();
		
		float custototal = custoGas + estacionamento + pedagio;
		
		System.out.println("Custo por dia:");
		
		System.out.println("R$" + custototal);
		
		

		sc.close();

	}

}
