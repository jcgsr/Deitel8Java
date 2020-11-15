package cap2;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		// 15.11.2020
		
		System.out.println("\t\t\t****BMI***");
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your weight: ");
		double weight = sc.nextFloat();
		
		System.out.print("\nEnter your height (inches): ");
		double height = sc.nextFloat();
		
		double bmi = weight * 703 / Math.pow(height, 2);
		
		System.out.printf("Your BMI is %.2f", bmi);
		
		System.out.println("\nBMI VALUES\n"
				+ "Underweight: \tless than 18.5\n"
				+ "Normal: \tbetween 18.5 and 24.9\n"
				+ "Overweight: \tbetween 25 and 29.9\n"
				+ "Obese: \t\t30 or greater");

		sc.close();

	}

}
