package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "produto")
public class Produto {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	    @NotNull
	    public String descricao;
	
}
