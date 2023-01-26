package br.com.acrtech.planningpoker.frontend.service;

import br.com.acrtech.planningpoker.frontend.dto.UsuarioDto;
import br.com.acrtech.planningpoker.frontend.http.UsuarioClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UsuarioService {

    private final UsuarioClient usuarioClient;

    public UsuarioService(UsuarioClient usuarioClient) {
        this.usuarioClient = usuarioClient;
    }

    public UsuarioDto save(UsuarioDto usuarioDto){
        ResponseEntity<UsuarioDto> usuario = usuarioClient.save(usuarioDto);
        if (usuario.getStatusCode().isError())
            throw new RuntimeException("Erro ao salvar usuario " + usuarioDto.getNome());
        return usuario.getBody();
    }

    public List<UsuarioDto> findAll(){
        ResponseEntity<List<UsuarioDto>> usuarioList = usuarioClient.findAll();
        if (usuarioList.getStatusCode().isError())
            throw new RuntimeException("Erro ao buscar lista de usuarios");
        return usuarioList.getBody();
    }

    public UsuarioDto findById(UUID id) {
        ResponseEntity<UsuarioDto> usuario = usuarioClient.findById(id);
        if (usuario.getStatusCode().isError())
            throw new RuntimeException("Erro ao buscar usuario " + id);
        return usuario.getBody();
    }

    public void deleteById(UUID id) {
        usuarioClient.deleteById(id);
    }

}
