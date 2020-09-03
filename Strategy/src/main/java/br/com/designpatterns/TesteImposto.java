package br.com.designpatterns;

public class TesteImposto {

	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(1000.0);
		
		CalculadorDeImpostos calculadora = new CalculadorDeImpostos();
		
		calculadora.realizaCalculo(orcamento, iss);
		calculadora.realizaCalculo(orcamento, icms);
	}
}
