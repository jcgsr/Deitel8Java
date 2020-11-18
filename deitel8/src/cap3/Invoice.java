package cap3;

public class Invoice {
	// 17.11.2020

	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;

	public Invoice(String numero, String descricao, int quantidade, double preco) {

		this.numero = numero;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	double getInvoiceAmount() {
		double fatura;
		if (quantidade < 0) {
			quantidade = 0;
		}
		if (preco < 0) {
			preco = 0;
		}
		fatura = quantidade * preco;
		return fatura;
	}
	
	public String toString() {
		return String.format("Produto: " + descricao + "\n" + 
				"Preço: R$" + getPreco() + "\nQuantidade: " + quantidade +
				"\nValor total: R$" + getInvoiceAmount() + "\n******\n");
	}

}
