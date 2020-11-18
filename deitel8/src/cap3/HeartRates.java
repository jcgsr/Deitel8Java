package cap3;

import java.time.Year;

public class HeartRates {
	// 18.11.2020
	
	private String nome;
	private String sobrenome;
	
	private int dia;
	private int mes;
	private int ano;
	
	public HeartRates(String nome, String sobrenome, int dia, int mes, int ano) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
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

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	int idade() {
		int anoAtual = Year.now().getValue();
		return anoAtual - this.ano;
	}
	
	int freqCardMaxMinuto() {
		return 220 - idade();
	}
	
	double freqCardAlvo50() {			
		return freqCardMaxMinuto() * 0.5;		
	}
	
	double freqCardAlvo85() {   
		return freqCardMaxMinuto() * 0.85;
	}
	
	public String toString() {
		return String.format("Nome completo: " + getNome() + " " + getSobrenome() 
		+ "\nData de nascimento: " + this.dia + "/" + this.mes + "/" + this.ano
		+ "\nIdade: " + idade()
		+ "\nFrequência Cardíaca Máxima por Minuto: " + freqCardMaxMinuto()
		+ "\nFrequência Cardíaca Alvo: " + freqCardAlvo50() + " - " + freqCardAlvo85() + "\n***\n");
	}
}
