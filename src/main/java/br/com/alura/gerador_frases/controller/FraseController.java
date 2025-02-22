package br.com.alura.gerador_frases.controller;

import br.com.alura.gerador_frases.dto.FraseDTO;
import br.com.alura.gerador_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private FraseService service;

    @GetMapping("/series/frases")
    public FraseDTO obterFraseAleatoria() {
        return service.obterFraseAleatoria();
    }
}
