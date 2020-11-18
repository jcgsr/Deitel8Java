package cap3;

public class Date {
	// 18.11.2020
	
	private int mes;
	private int dia;
	private int ano;
	
	public Date(int dia, int mes, int ano) {
		super();
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String displayDate() {
		return String.format(this.dia + "/" + this.mes + "/" + this.ano);
	}
}
