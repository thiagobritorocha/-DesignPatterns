package br.com.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {
		
	public Orcamento(double valor) {
		this.valor = valor;
		this.listaItens = new ArrayList<Item>();
	}

	private double valor;
	
	private List<Item> listaItens;
	
	public void addItem(Item item) {
		listaItens.add(item);
	}

	public List<Item> getListaItens() {
		return listaItens;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
