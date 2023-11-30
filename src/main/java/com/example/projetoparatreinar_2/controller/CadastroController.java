package com.example.projetoparatreinar_2.controller;

import com.example.projetoparatreinar_2.dao.ClienteRepository;
import com.example.projetoparatreinar_2.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
    public class CadastroController {


        @Autowired
        ClienteRepository clienteRepository;

        @GetMapping("/cadastro")
        public String abrir(Cliente cliente)
        {return "cadastro";}

        @PostMapping("/cadastro_cliente")
    public String cadastro(Cliente cliente){
            clienteRepository.save(cliente);
            return "index";

        }


    }

