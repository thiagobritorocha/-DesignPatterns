package br.com.designpatterns;

public interface Desconto {
	
	double calcula(Orcamento orcamento);
	void proximoDesconto(Desconto desconto);

}
