package entidades;

public enum TipoCliente {
	PESSOAFISICA(1), PESSOAJURIDICA(2);
	private int pessoa;
	
	TipoCliente(){
	}
	
	TipoCliente(int pessoa){
		this.pessoa = pessoa;
	}

	public int getPessoa() {
		return pessoa;
	}

	public void setPessoa(int pessoa) {
		this.pessoa = pessoa;
	}
	
}
