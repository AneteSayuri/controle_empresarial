package br.com.controle_empresarial.repository;

import br.com.controle_empresarial.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
