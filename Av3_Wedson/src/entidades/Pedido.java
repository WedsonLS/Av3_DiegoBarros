package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	private Integer id;
	private Date instante;
	private Cliente cliente;
	private Endereco endereco;
	private Pagamento pagamento;
	private List<Produto> produto = new ArrayList<>();
	
	public Pedido() {
	}

	public Pedido(Integer id, Date instante, Cliente cliente, Endereco endereco, Pagamento pagamento) {
		super();
		this.id = id;
		this.instante = instante;
		this.cliente = cliente;
		this.endereco = endereco;
		this.pagamento = pagamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getInstante() {
		return instante;
	}

	public void setInstante(Date instante) {
		this.instante = instante;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	
	
	
	
}
