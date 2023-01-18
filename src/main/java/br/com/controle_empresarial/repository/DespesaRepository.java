package br.com.controle_empresarial.repository;

import br.com.controle_empresarial.model.Despesa;
import org.springframework.data.repository.CrudRepository;

public interface DespesaRepository extends CrudRepository<Despesa, Long> {
}
