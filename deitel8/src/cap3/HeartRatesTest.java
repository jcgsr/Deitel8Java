package cap3;

import java.util.Scanner;

public class HeartRatesTest {

	public static void main(String[] args) {
		// 18.11.2020
		
		HeartRates p1 = new HeartRates("Josias", "Guerra", 13, 5, 1945);
		HeartRates p2 = new HeartRates("Ercilia", "Cabral", 8, 2, 1947);
		HeartRates p3 = new HeartRates("Josias", "Junior", 22, 1, 1969);
		HeartRates p4 = new HeartRates("Simone", "Cabral", 27, 3, 1973);
		HeartRates p5 = new HeartRates("Jovane", "Rocha", 28, 1, 1981);
		HeartRates p6 = new HeartRates("Susi", "Pessoa", 20, 7, 1983);
		HeartRates p7 = new HeartRates("Diana", "Rocha", 21, 11, 2017);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
		System.out.println(p7);
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome: ");
		String n1 = sc.next();
		System.out.print("Sobrenome:");
		String s1 = sc.next();
		System.out.print("Dia do nascimento: ");
		int d1 = sc.nextInt();
		System.out.print("Mês do nascimento:");
		int m1 = sc.nextInt();
		System.out.print("Ano do nascimento: ");
		int a1 = sc.nextInt();
		
		HeartRates p8 = new HeartRates(n1, s1, d1, m1, a1);
		System.out.println(p8);
		sc.close();

	}

}
