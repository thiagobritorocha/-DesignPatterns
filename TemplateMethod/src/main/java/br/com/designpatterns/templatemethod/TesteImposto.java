package br.com.designpatterns.templatemethod;

import java.util.ArrayList;
import java.util.List;

public class TesteImposto {

	public static void main(String[] args) {

		Imposto icpp = new ICPP();
		Imposto ikcv = new IKCV();
		
		List<Imposto> lista = new ArrayList<>();

		lista.add(icpp);
		lista.add(ikcv);

		Orcamento orcamento = new Orcamento();
		
		orcamento.addItem(new Item("Caneta", 50));
		orcamento.addItem(new Item("Lapis", 20));
		orcamento.addItem(new Item("Monitor", 200));
		orcamento.addItem(new Item("Mouse", 99));
		orcamento.addItem(new Item("Teclado", 150));
		orcamento.addItem(new Item("Lapis", 50));
		
		System.out.println(orcamento.getValor());
		
		System.out.println(orcamento.getValor());

		CalculadorDeImpostos calculadora = new CalculadorDeImpostos();

		lista.forEach(i -> calculadora.realizaCalculo(i, orcamento));
		
	}
}
