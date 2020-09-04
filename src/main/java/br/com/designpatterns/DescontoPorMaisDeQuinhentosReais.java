package br.com.designpatterns;

public class DescontoPorMaisDeQuinhentosReais implements Desconto{
	
	private Desconto proximoDesconto;

	public double calcula(Orcamento orcamento) {
		if(orcamento.getListaItens().size() > 5) {
			return orcamento.getValor() * 0.10;
		}
		return proximoDesconto.calcula(orcamento);
	}

	public void proximoDesconto(Desconto desconto) {
		this.proximoDesconto = desconto;
	}

}
