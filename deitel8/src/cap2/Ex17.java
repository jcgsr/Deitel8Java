package cap2;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// 15.11.2020

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um inteiro: ");
		int n1 = sc.nextInt();

		System.out.print("Digite outro inteiro: ");
		int n2 = sc.nextInt();

		System.out.print("Digite outro inteiro: ");
		int n3 = sc.nextInt();

		int sum = n1 + n2 + n3;
		int avg = (n1 + n2 + n3) / 3;
		int mul = n1 * n2 * n3;

		System.out.println("A soma é: " + sum);
		System.out.println("A média é: " + avg);
		System.out.println("A multiplacação é: " + mul);

		if (n1 > n2 && n1 > n3) {
			System.out.printf("O maior número é %d\n", n1);			
		}
		if (n2 > n1 && n2 > n3) {
			System.out.printf("O maior número é %d\n", n2);			
		}
		if (n3 > n1 && n3 > n2) {
			System.out.printf("O maior número é %d\n", n3);
		}		
		if (n1 < n2 && n1 < n3) {
			System.out.printf("O menor número é %d\n", n1);			
		}
		if (n2 < n1 && n2 < n3) {
			System.out.printf("O menor número é %d\n", n2);			
		}
		if (n3 < n1 && n3 < n2) {
			System.out.printf("O menor número é %d\n", n3);
		}

		sc.close();
	}
}
