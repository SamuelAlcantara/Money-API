package br.com.s.money.api.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.s.money.api.model.Lancamento;
import br.com.s.money.api.model.Pessoa;
import br.com.s.money.api.repository.LancamentoRepository;
import br.com.s.money.api.repository.PessoaRepository;
import br.com.s.money.api.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	@Autowired
	private PessoaRepository pessoaRespository;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public Lancamento salvar(@Valid Lancamento lancamento) throws PessoaInexistenteOuInativaException {
		Optional<Pessoa> pessoa = pessoaRespository.findById(lancamento.getPessoa().getId());
		if (pessoa == null || !pessoa.get().getAtivo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		return lancamentoRepository.save(lancamento);
	}
	
	
	
}
