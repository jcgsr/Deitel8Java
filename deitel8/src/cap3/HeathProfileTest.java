package cap3;

import java.util.Scanner;

public class HeathProfileTest {

	public static void main(String[] args) {
		// 18.11.2020
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome: ");
		String n1 = sc.next();
		System.out.print("Sobrenome: ");
		String s1 = sc.next();
		System.out.print("Sexo: ");
		String sexo = sc.next();
		System.out.print("Dia do nascimento: ");
		int d1 = sc.nextInt();
		System.out.print("Mês do nascimento: ");
		int m1 = sc.nextInt();
		System.out.print("Ano do nascimento: ");
		int a1 = sc.nextInt();
		System.out.print("Altura: ");
		double altura = sc.nextDouble();
		System.out.print("peso: ");
		double peso = sc.nextDouble();
		
		HealthProfile p1 = new HealthProfile(n1, s1, sexo, d1, m1, a1, altura, peso);
		
		System.out.println(p1);

		sc.close();

	}

}
