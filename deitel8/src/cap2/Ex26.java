package cap2;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// 15.11.2020

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int n1 = sc.nextInt();

		System.out.print("Digite outro número: ");
		int n2 = sc.nextInt();

		if (n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.printf("%d e %d são múltiplos", n1, n2);
		} else {
			System.out.printf("%d e %d não são múltiplos", n1, n2);
		}

		sc.close();

	}

}
