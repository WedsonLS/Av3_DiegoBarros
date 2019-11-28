package entidades;

public class PagamentoCredito extends Pagamento {
	private Integer parcelas;
		
	public PagamentoCredito() {
		super();
	}

	public PagamentoCredito(Integer parcelas) {
		super();
		this.parcelas = parcelas;
	}

	public Integer getParcelas() {
		return parcelas;
	}

	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}
	
}
