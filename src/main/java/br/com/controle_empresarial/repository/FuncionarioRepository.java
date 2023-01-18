package br.com.controle_empresarial.repository;

import br.com.controle_empresarial.model.Funcionario;
import org.springframework.data.repository.CrudRepository;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {
}
