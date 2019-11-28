package entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private Integer id;
	private String nome;
	private String email;
	private String cpfOutCnpj;
	private TipoCliente tipo;
	private List<String> telefone = new ArrayList<>();
	private List<Endereco> endereço = new ArrayList<>();
	private List<Pedido> pedido = new ArrayList<>();
	
	public Cliente() {
	}

	public Cliente(Integer id, String nome, String email, String cpfOutCnpj, TipoCliente tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpfOutCnpj = cpfOutCnpj;
		this.tipo = tipo;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpfOutCnpj() {
		return cpfOutCnpj;
	}

	public void setCpfOutCnpj(String cpfOutCnpj) {
		this.cpfOutCnpj = cpfOutCnpj;
	}

	public TipoCliente getTipo() {
		return tipo;
	}

	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}

	public List<String> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<String> telefone) {
		this.telefone = telefone;
	}

	public List<Endereco> getEndereço() {
		return endereço;
	}

	public void setEndereço(List<Endereco> endereço) {
		this.endereço = endereço;
	}

	public List<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode id cliente");
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals id cliente");
		return id.equals(obj);
	}

	@Override
	public String toString() {
		return this.nome;
		
	}
	
	

	
	
	
}