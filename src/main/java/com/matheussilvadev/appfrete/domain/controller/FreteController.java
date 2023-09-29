package com.matheussilvadev.appfrete.domain.controller;

import com.matheussilvadev.appfrete.domain.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class FreteController {

        @GetMapping("/frete/lista")
        public String telaLista(Model model){

            Remetente remetente1 = new Remetente(1L, "Remetente 1", "Rua 11", "117654321", "113456789");
            Destinatario destinatario1 = new Destinatario(1L, "Destinatario 1", "Rua 12", "127654321", "123456789");
            Transportadora transportadora1 = new Transportadora(1L, "Transportadora 1", "Rua 13", "137654321", "133456789");

            Remetente remetente2 = new Remetente(2L, "Remetente 2", "Rua 21", "217654321", "213456789");
            Destinatario destinatario2 = new Destinatario(2L, "Destinatario 2", "Rua 22", "227654321", "223456789");
            Transportadora transportadora2 = new Transportadora(2L, "Transportadora 2", "Rua 23", "237654321", "233456789");

            Remetente remetente3 = new Remetente(3L, "Remetente 3", "Rua 31", "317654321", "313456789");
            Destinatario destinatario3 = new Destinatario(3L, "Destinatario 3", "Rua 32", "327654321", "323456789");
            Transportadora transportadora3 = new Transportadora(3L, "Transportadora 3", "Rua 33", "337654321", "333456789");

            Rota rota1 = new Rota(91.23F);
            Rota rota2 = new Rota(150.65F);
            Rota rota3 = new Rota(340.2F);

            // Na classe FreteTeste crie três variáveis, faça a inicialização e exiba uma mensagem com estas três informações separadas por ";".
            Frete frete1 = new Frete(1L, "Frete econômico", 100.0, LocalDate.now(), StatusFrete.PENDENTE, remetente1, destinatario1, transportadora1, rota1);
            Frete frete2 = new Frete(2L, "Frete rápido", 200.0, LocalDate.now(), StatusFrete.PENDENTE, remetente2, destinatario2, transportadora2, rota2);
            Frete frete3 = new Frete(3L, "Frete express", 300.0, LocalDate.now(), StatusFrete.PENDENTE, remetente3, destinatario3, transportadora3, rota3);

            List<Frete> listaFretes = List.of(frete1, frete2, frete3);
            model.addAttribute("listaFretes", listaFretes);

            return "/frete/lista";
        }
}
