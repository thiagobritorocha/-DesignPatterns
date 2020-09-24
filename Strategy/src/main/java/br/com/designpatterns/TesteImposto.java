package br.com.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class TesteImposto {

	public static void main(String[] args) {

		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		List<Imposto> lista = new ArrayList<>();

		lista.add(iss);
		lista.add(icms);

		Orcamento orcamento = new Orcamento(1000.0);

		CalculadorDeImpostos calculadora = new CalculadorDeImpostos();

		lista.forEach(i -> calculadora.realizaCalculo(i, orcamento));
		
	}
}
