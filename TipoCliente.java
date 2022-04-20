package com.Faturamento.domain;


public enum TipoCliente {
	PESSOAFISICA(1),PESSOAJURIDICA(2);
	int opcao;

	private TipoCliente(int opcao) {
		this.opcao = opcao;
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}
	
	
}
