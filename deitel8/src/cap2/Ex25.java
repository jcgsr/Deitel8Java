package cap2;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		// 15.11.2020
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.printf("%d é PAR", n);
		} else {
			System.out.printf("%d é ÍMPAR", n);
		}

		sc.close();

	}

}
