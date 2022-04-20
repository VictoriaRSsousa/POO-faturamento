package com.Faturamento.domain;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
	@Entity
public class NotaFiscalVenda {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
	@ManyToOne (fetch = FetchType.LAZY)
	private Cliente cliente;
	
	private int codigo;
	
	private String data;
	
	private float ValorNota;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="ItemNotaFiscal")
	private List<ItemNotaFiscal> items;


	public NotaFiscalVenda(Cliente cliente, int codigo, String data, float valorNota,
			List<ItemNotaFiscal> items) {
	
		this.cliente = cliente;
		this.codigo = codigo;
		this.data = data;
		this.ValorNota = valorNota;
		this.items = items;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setItems(List<ItemNotaFiscal> items) {
		this.items = items;
	}

	public List<ItemNotaFiscal> getItems() {
		return items;
	}
	public void setItens(List<ItemNotaFiscal> items) {
		this.items = items;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public float getValorNota() {
		return ValorNota;
	}
	public void setValorNota(float valorNota) {
		ValorNota = valorNota;
	}
	public void criaritemNotaFiscal(ItemNotaFiscal item) {
		this.items.add(item);
	}
}


