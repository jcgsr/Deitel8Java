package cap2;

public class Ex34 {

	public static void main(String[] args) {
		// 15.11.2020
		
		System.out.println("Estimativa de crescimento populacional mundial (bilhões)\n");
		
		double pop = 79;
		double taxaCresc = 0.012;
		double aumentoPop = pop * taxaCresc;
		double pop21 = aumentoPop + pop;
		double pop22 = (pop21 * taxaCresc) + pop21;
		double pop23 = (pop22 * taxaCresc) + pop22;
		double pop24 = (pop23 * taxaCresc) + pop23;
		double pop25 = (pop24 * taxaCresc) + pop24;
		
		System.out.println("População em 2020: " + pop + " bi.");
		System.out.println("Taxa de crescimento 1,2%.");
		System.out.println("Estimativa em 2021: " + pop21 + " bi.");
		System.out.println("Estimativa em 2022: " + pop22 + " bi.");
		System.out.println("Estimativa em 2023: " + pop23 + " bi.");
		System.out.println("Estimativa em 2024: " + pop24 + " bi.");
		System.out.println("Estimativa em 2025: " + pop25 + " bi.");

	}

}
