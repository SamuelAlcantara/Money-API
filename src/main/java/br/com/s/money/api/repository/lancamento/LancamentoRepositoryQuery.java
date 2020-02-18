package br.com.s.money.api.repository.lancamento;

import java.util.List;

import br.com.s.money.api.model.Lancamento;
import br.com.s.money.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
	

}
