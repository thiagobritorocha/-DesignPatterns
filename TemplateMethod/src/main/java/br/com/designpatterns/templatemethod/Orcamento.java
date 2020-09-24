package br.com.designpatterns.templatemethod;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {
		
	public Orcamento() {
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
		valor = 0;
		for (Item item : listaItens) {
			valor += item.getValor();
		}
		return valor;
	}

}
