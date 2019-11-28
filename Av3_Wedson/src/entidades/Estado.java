package entidades;

import java.util.ArrayList;
import java.util.List;

public class Estado {
	private Integer id;
	private String nome;
	private List<Cidade> cidade = new ArrayList<>();
	
	public Estado() {
	}

	public Estado(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cidade> getCidade() {
		return cidade;
	}

	public void setCidade(List<Cidade> cidade) {
		this.cidade = cidade;
	}
	
	

}

