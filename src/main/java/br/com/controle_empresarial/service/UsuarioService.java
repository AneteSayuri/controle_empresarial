package br.com.controle_empresarial.service;

import br.com.controle_empresarial.dto.UsuarioUpdateDTO;
import br.com.controle_empresarial.model.Usuario;
import br.com.controle_empresarial.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listar() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public void deletarPorId(Long id) {
            usuarioRepository.deleteById(id);
    }

    public Usuario atualizar(Long id, UsuarioUpdateDTO usuarioUpdateDTO){
        Optional<Usuario> usuarioEncontrado = usuarioRepository.findById(id);
        if (!usuarioEncontrado.isPresent()){
            throw new IllegalArgumentException("Usuário não encontrado.");
        }

        Usuario usuarioAtualizado = usuarioEncontrado.get();
        usuarioAtualizado.setNome(usuarioUpdateDTO.getNome());
        usuarioAtualizado.setTelefone(usuarioUpdateDTO.getTelefone());
        usuarioAtualizado.setCpf(usuarioUpdateDTO.getCpf());
        usuarioAtualizado.setEmail(usuarioUpdateDTO.getEmail());
        return usuarioRepository.save(usuarioAtualizado);
    }
}
