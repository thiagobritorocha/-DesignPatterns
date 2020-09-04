package br.com.designpatterns;

public class CalculaDesconto {
	
	double calculaDesconto(Orcamento orcamento) {
		Desconto  d1 = new DescontoPorCintoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new SemDesconto();
		d1.proximoDesconto(d2);
		d2.proximoDesconto(d3);
		
		return d1.calcula(orcamento);
	}

}
