package br.com.designpatterns;

public class TesteDesconto {
	
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.addItem(new Item("Caneta", 50));
		orcamento.addItem(new Item("Lapis", 20));
		orcamento.addItem(new Item("Lapis", 20));
		orcamento.addItem(new Item("Lapis", 50));
		orcamento.addItem(new Item("Lapis", 50));
		orcamento.addItem(new Item("Lapis", 50));
		
		CalculaDesconto calculadora = new CalculaDesconto();
		
		final double desconto = calculadora.calculaDesconto(orcamento);
		
		System.out.println(desconto);
		
	}

}
