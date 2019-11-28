package entidades;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	private Integer id;
	private String nome;
	private Double preco;
	private List<Pedido> pedido = new ArrayList<>();
	private Categoria categoria;
	
	public Produto() {
	}

	public Produto(Integer id, String nome, Double preco, List<Pedido> pedido, Categoria categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.pedido = pedido;
		this.categoria = categoria;
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public List<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
}
