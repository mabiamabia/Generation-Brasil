package com.game.gengame.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "produto")
public class Produto {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	    @NotNull
	    @Size(min = 3, max = 100)
	    public String nome;
	    
	    @NotNull
	    @Size(min = 3, max = 100)
	    public String descricao;
	
	    @NotNull
	    public long preco;
	    
	    @NotNull
	    public long quantidade;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public long getPreco() {
			return preco;
		}

		public void setPreco(long preco) {
			this.preco = preco;
		}

		public long getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(long quantidade) {
			this.quantidade = quantidade;
		}
	    
	    
}
