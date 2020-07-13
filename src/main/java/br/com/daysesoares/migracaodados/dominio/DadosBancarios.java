package br.com.daysesoares.migracaodados.dominio;

public class DadosBancarios {

	private Integer id;
	private Integer pessoa_id;
	private Integer agencia;
	private Integer conta;
	private Integer banco;
	
	public DadosBancarios() {
		
	}

	public DadosBancarios(Integer id, Integer pessoa_id, Integer agencia, Integer conta, Integer banco) {
		super();
		this.id = id;
		this.pessoa_id = pessoa_id;
		this.agencia = agencia;
		this.conta = conta;
		this.banco = banco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPessoa_id() {
		return pessoa_id;
	}

	public void setPessoa_id(Integer pessoa_id) {
		this.pessoa_id = pessoa_id;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public Integer getBanco() {
		return banco;
	}

	public void setBanco(Integer banco) {
		this.banco = banco;
	}
	
	
	
}
