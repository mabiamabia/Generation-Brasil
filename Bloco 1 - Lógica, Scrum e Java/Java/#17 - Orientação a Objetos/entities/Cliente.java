package entities;

public class Cliente {

	public String name;
	public Double telefone;
	public Integer cpf;
	
	public Cliente(String name, Double telefone, Integer cpf) {
		super();
		this.name = name;
		this.telefone = telefone;
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getTelefone() {
		return telefone;
	}

	public void setTelefone(Double telefone) {
		this.telefone = telefone;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
}
