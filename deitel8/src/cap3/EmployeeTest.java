package cap3;

public class EmployeeTest {

	public static void main(String[] args) {
		// 18.11.2020
		
		Employee e1 = new Employee("Josias", "Guerra", 5000);
		Employee e2 = new Employee("Ercilia", "Cabral", 5000);
		Employee e3 = new Employee("Steve", "Jobs", 1000);
		
		System.out.println(e1);
		System.out.println("Aumento de 10% no salário ");		
		System.out.println("Salário mensal: R$ " + e1.aumentoMensal());		
		System.out.println("Salário anual: R$ " + e1.aumentoAnual() + "\n***\n");
		
		System.out.println(e2);
		System.out.println("Aumento de 10% no salário");		
		System.out.println("Salário mensal: R$ " + e2.aumentoMensal());		
		System.out.println("Salário anual: R$ " + e2.aumentoAnual() + "\n***\n");
		
		System.out.println(e3);
		System.out.println("Aumento de 10% no salário:");		
		System.out.println("Salário mensal: R$ " + e3.aumentoMensal());		
		System.out.println("Salário anual: R$ " + e3.aumentoAnual() + "\n***\n");
		
		
	}

}
