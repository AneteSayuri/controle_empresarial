package br.com.controle_empresarial.service;

import br.com.controle_empresarial.model.Despesa;
import br.com.controle_empresarial.repository.DespesaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesaService {
    private DespesaRepository despesaRepository;

    public DespesaService(DespesaRepository despesaRepository) {
        this.despesaRepository = despesaRepository;
    }

    public Despesa salvar(Despesa despesa) {
        return despesaRepository.save(despesa);
    }

    public List<Despesa> listar() {
        return (List<Despesa>) despesaRepository.findAll();
    }

    public Despesa buscarPorId(Long id) {
        return despesaRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public void deletarPorId(Long id) {
        despesaRepository.deleteById(id);
    }

}
