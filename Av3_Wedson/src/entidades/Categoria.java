package entidades;

public class Categoria {
	private Integer id;
	private String nome;
	private Produto produto;
	
	public Categoria() {
	}

	public Categoria(Integer id, String nome, Produto produto) {
		this.id = id;
		this.nome = nome;
		this.produto = produto;
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

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
	
}
