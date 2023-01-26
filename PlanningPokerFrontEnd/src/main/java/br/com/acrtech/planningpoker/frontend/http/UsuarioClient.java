package br.com.acrtech.planningpoker.frontend.http;

import br.com.acrtech.planningpoker.frontend.dto.UsuarioDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@FeignClient(name = "usuarios", url = "http://localhost:8080/cartas/planningpoker/api/v1/usuarios")
public interface UsuarioClient {
    @PostMapping
    public ResponseEntity<UsuarioDto> save(@RequestBody @Valid UsuarioDto usuario);

    @GetMapping
    public ResponseEntity<List<UsuarioDto>> findAll();

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDto> findById(@PathVariable UUID id);

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable UUID id);

}
