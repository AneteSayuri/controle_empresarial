package br.com.controle_empresarial.service;

import br.com.controle_empresarial.model.Endereco;
import br.com.controle_empresarial.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {
    private EnderecoRepository enderecoRepository;

    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    public Endereco salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public List<Endereco> listar() {
        return (List<Endereco>) enderecoRepository.findAll();
    }

    public Endereco buscarPorId(Long id) {
        return enderecoRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public void deletarPorId(Long id) {
            enderecoRepository.deleteById(id);
    }

}
