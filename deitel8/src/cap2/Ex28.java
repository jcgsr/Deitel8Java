package cap2;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		// 15.11.2020
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o raio: ");
		int raio = sc.nextInt();
		
		System.out.printf("O diâmetro é %d.\n", 2 * raio);
		System.out.printf("A circunferência é %f.\n", 2 * Math.PI * raio);
		System.out.printf("A área é %f", Math.PI * Math.pow(raio, 2));

		sc.close();

	}

}
