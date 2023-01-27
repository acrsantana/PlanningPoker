package br.com.acrtech.planningpoker.frontend.controller;

import br.com.acrtech.planningpoker.frontend.dto.UsuarioDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @GetMapping("/")
    public String welcome(){
        return "welcome";
    }
    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastroUsuario";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String autenticar(UsuarioDto usuarioDto) {
        System.out.println(usuarioDto);
        return "redirect:/";
    }

    @PostMapping("/cadastro")
    public String cadastrar(UsuarioDto usuarioDto) {
        System.out.println(usuarioDto);
        return "redirect:/";
    }
}
