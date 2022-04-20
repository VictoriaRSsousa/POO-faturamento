package com.Faturamento.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

	@Entity
public class ItemNotaFiscal {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Produto produto;
	
	private NotaFiscalVenda notafiscal;
	
	private int numero;
	private int quantidade;
	private double valor;
	
	public ItemNotaFiscal(Produto produto, NotaFiscalVenda notafiscal, int numero, int quantidade, double valor) {
		super();
		this.produto = produto;
		this.notafiscal = notafiscal;
		this.numero = numero;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public NotaFiscalVenda getNotafiscal() {
		return notafiscal;
	}
	public void setNotafiscal(NotaFiscalVenda notafiscal) {
		this.notafiscal = notafiscal;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

}
