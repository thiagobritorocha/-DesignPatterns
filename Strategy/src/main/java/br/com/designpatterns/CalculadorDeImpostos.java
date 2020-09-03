package br.com.designpatterns;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double icms = imposto.calcula(orcamento);
		System.out.println(icms);
	}
	
}
