package entities;

public class Aviao {

	public String nome;
	public Double capacidade;
	public Float quantidadeVoo;
	
	
	public Aviao(String nome, Double capacidade, Float quantidadeVoo) {
		super();
		this.nome = nome;
		this.capacidade = capacidade;
		this.quantidadeVoo = quantidadeVoo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getCapacidade() {
		return capacidade;
	}


	public void setCapacidade(Double capacidade) {
		this.capacidade = capacidade;
	}


	public Float getQuantidadeVoo() {
		return quantidadeVoo;
	}


	public void setQuantidadeVoo(Float quantidadeVoo) {
		this.quantidadeVoo = quantidadeVoo;
	}
	
}
