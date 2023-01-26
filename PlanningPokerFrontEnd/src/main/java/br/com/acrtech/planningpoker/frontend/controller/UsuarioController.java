package br.com.acrtech.planningpoker.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastroUsuario";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
