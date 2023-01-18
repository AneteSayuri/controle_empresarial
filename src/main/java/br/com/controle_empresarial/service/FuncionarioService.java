package br.com.controle_empresarial.service;

import br.com.controle_empresarial.model.Funcionario;
import br.com.controle_empresarial.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FuncionarioService {
    private FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public Funcionario salvar(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> listar() {
        return (List<Funcionario>) funcionarioRepository.findAll();
    }

    public Funcionario buscarPorId(Long id) {
        return funcionarioRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public void deletarPorId(Long id) {
            funcionarioRepository.deleteById(id);
    }
}
