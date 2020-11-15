package cap2;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// 15.11.2020
		// Tentando fazer todos os exercícios relevantes Deitel 8
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um inteiro: ");
		int n1 = sc.nextInt();
		
		System.out.print("Digite outro inteiro: ");
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
		int sub = n1 - n2;
		int mul = n1 * n2;
		int div = n1 / n2;
		
		System.out.println("A soma é: " + soma);
		System.out.println("A subtração é: " + sub);
		System.out.println("A multiplacação é: " + mul);
		System.out.println("A divisão é: " + div);
		
		
		sc.close();

	}

}
