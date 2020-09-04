package br.com.designpatterns;

public class DescontoPorCintoItens implements Desconto {
	
	private Desconto proximoDesconto;

	public double calcula(Orcamento orcamento) {
		if(orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.10;
		}		
		return proximoDesconto.calcula(orcamento);
	}

	public void proximoDesconto(Desconto desconto) {
		this.proximoDesconto = desconto;
		
	}

}
