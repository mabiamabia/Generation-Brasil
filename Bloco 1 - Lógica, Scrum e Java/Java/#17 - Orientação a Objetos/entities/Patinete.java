package entities;

public class Patinete {

	public String marca;
	public Double preco;
	public Integer quantidade; //quantidade em estoque
	
	
	public Patinete(String marca, Double preco, Integer quantidade) {
		super();
		this.marca = marca;
		this.preco = preco;
		this.quantidade = quantidade;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
}

