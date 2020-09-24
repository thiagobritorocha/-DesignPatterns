package br.com.designpatterns;

public class CalculadorDeImpostos {

	public void realizaCalculo(Imposto imposto, Orcamento orcamento) {
		double valor = imposto.calcula(orcamento);
		System.out.println(valor);
	}
	
}
