package br.univille.novostalentos.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.novostalentos.entity.Cliente;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
    
    @GetMapping
    public ModelAndView index(){
        
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

        Cliente cliente1 = new Cliente();

        cliente1.setNome("zezinho");
        cliente1.setEndereco("rua leileilei");
        cliente1.setId(2);
        cliente1.setSexo("masculino");

    Cliente cliente2 = new Cliente();

        cliente2.setNome("mariazinha");
        cliente2.setEndereco("rua louloulou");
        cliente2.setId(3);
        cliente2.setSexo("feminino");

        Cliente cliente3 = new Cliente();

        cliente3.setNome("walterzinho");
        cliente3.setEndereco("rua luwluwluw");
        cliente3.setId(3);
        cliente3.setSexo("masculino");

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);

        return new ModelAndView("cliente/index", "lista", listaClientes);
    }
}
