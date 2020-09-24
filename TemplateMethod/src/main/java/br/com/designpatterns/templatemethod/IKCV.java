package br.com.designpatterns.templatemethod;

public class IKCV extends TemplateDeImpostoCondicional{

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && itemMaiorQue100ReaisNo(orcamento);
	}
	
	private boolean itemMaiorQue100ReaisNo(Orcamento orcamento) {
		for(Item item : orcamento.getListaItens()) {
			if(item.getValor() > 100)return true;
		}			
		return false;			
	}

}
