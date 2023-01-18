package br.com.controle_empresarial.service;

import br.com.controle_empresarial.model.Veiculo;
import br.com.controle_empresarial.repository.VeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VeiculoService {
    private VeiculoRepository veiculoRepository;

    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public Veiculo salvar(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public List<Veiculo> listar() {
        return (List<Veiculo>) veiculoRepository.findAll();
    }

    public Veiculo buscarPorId(Long id) {
        return veiculoRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public void deletarPorId(Long id) {
        veiculoRepository.deleteById(id);
    }

    public List<Veiculo> buscarPorAno(String ano) {
        return veiculoRepository.findByAnoModelo(ano);
    }
}
