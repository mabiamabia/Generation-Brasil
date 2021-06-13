package entities;

public class ContaBancaria {

	public String nome;
	public Integer conta;
	public Double valor;
	
	public ContaBancaria(String nome, Integer conta, Double valor) {
		super();
		this.nome = nome;
		this.conta = conta;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	} 
}
	