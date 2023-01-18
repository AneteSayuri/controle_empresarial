package br.com.controle_empresarial.controller;

import br.com.controle_empresarial.model.Veiculo;
import br.com.controle_empresarial.service.VeiculoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
    private final VeiculoService veiculoService;

    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    @PostMapping
    public Veiculo salvar(@RequestBody Veiculo veiculo) {
        return veiculoService.salvar(veiculo);
    }

    @GetMapping
    public List<Veiculo> listar() {
        return veiculoService.listar();
    }

    @GetMapping("/{id}")
    public Veiculo buscarPorId(@PathVariable Long id) {
        return veiculoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Long id) {
         veiculoService.deletarPorId(id);
    }

    @GetMapping("/ano/{ano}")
    public List<Veiculo> buscarPorAno(@PathVariable String ano) {
        return veiculoService.buscarPorAno(ano);
    }

}
