package br.com.s.money.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.s.money.api.model.Lancamento;
import br.com.s.money.api.repository.filter.LancamentoFilter;
import br.com.s.money.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

	List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
	
}
