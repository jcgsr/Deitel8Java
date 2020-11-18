package cap3;

import java.time.Year;

public class HealthProfile {
	// 18.11.2020
	
	private String nome;
	private String sobrenome;
	private String sexo;
	
	private int dia;
	private int mes;
	private int ano;
	
	private double altura;
	private double peso;
	public HealthProfile(String nome, String sobrenome, String sexo, int dia, int mes, int ano, double altura,
			double peso) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.altura = altura;
		this.peso = peso;
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
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
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
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
	
	double imc() {
		return this.peso / (this.altura * this.altura);
	}
	
	public String toString() {
		return String.format("Nome completo: " + getNome() + " " + getSobrenome()
		+ "\nSexo: " + getSexo() + "\nData de nascimento: " +  this.dia + "/" + this.mes + "/" + this.ano
		+ "\nAltura: " + getAltura() + "m" + "\nPeso: " + getPeso() + "kg"
		+ "\nIdade: " + idade() + "\nIMC: " + imc()
		+ "\nFrequência Cardíaca Máxima por Minuto: " + freqCardMaxMinuto()
		+ "\nFrequência Cardíaca Alvo: " + freqCardAlvo50() + " - " + freqCardAlvo85() 
		+ "\nVALORES IMC\n"
		+ "Abaixo: menos do que 18.5\n"
		+ "Normal: entre 18.5 e 24.9\n"
		+ "Acima: entre 25 e 29.9\n"
		+ "Obeso: 30 ou mais\n***\n");
	}
	
}
