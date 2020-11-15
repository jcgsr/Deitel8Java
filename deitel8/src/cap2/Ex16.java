package cap2;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		// 15.11.2020
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um inteiro: ");
		int n1 = sc.nextInt();
		
		System.out.print("Digite outro inteiro: ");
		int n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.printf("%d is larger\n", n1);
		} else if (n1 < n2) {
			System.out.printf("%d is larger\n", n2);
		} else if (n1 == n2) {
			System.out.printf("%d and %d are equals.", n1, n2);
		}
		
		sc.close();
	}
}
