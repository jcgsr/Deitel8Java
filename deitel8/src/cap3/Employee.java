package cap3;

public class Employee {
	// 18.11.2020

	private String nome;
	private String sobrenome;
	private double salarioMensal;

	public Employee(String nome, String sobrenome, double salarioMensal) {

		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioMensal = salarioMensal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
		if (salarioMensal < 0) {
			salarioMensal = 0;
		}
	}

	double salarioAnual() {
		return this.salarioMensal * 12;
	}

	double aumentoMensal() {		
		double aumento; 
		aumento = this.salarioMensal * 0.1;
		return this.salarioMensal + aumento;
	}

	double aumentoAnual() {
		return aumentoMensal() * 12;
	}

	public String toString() {
		return String.format("Nome completo: " + getNome() + " " + getSobrenome() + "\nSalário mensal: R$ " + getSalarioMensal()
				+ "\nSalário anual: R$ " + salarioAnual() + "\n");
//				+ "\nSalário mensal com  aumento de 10%: " + this.aumentoMensal()
//				+ "\nSalário anual com aumento de 10%: " + aumentoAnual());
	}

}
