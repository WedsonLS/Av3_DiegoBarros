package entidades;

public enum StatusPagamento {
	
	PENDENTE(1), QUITADO(2), CANCELADO(3);
	
	private int status;
	
	StatusPagamento(){
	}
	
	StatusPagamento(int status){
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}

