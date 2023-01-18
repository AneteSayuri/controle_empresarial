package br.com.controle_empresarial.repository;

import br.com.controle_empresarial.model.Veiculo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VeiculoRepository extends CrudRepository<Veiculo, Long> {
    List<Veiculo> findByAnoModelo(String ano);
}
