package com.company.APIPizzaria.pedidos.api;

import com.company.APIPizzaria.pedidos.dto.PedidoDTO;
import com.company.APIPizzaria.pedidos.facade.PedidosFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;

@Controller
@RequestMapping(value = "/pedidos", produces = MediaType.APPLICATION_JSON_VALUE)
public class PedidosAPI {
    @Autowired
    private PedidosFacade pedidosFacade;

    @PostMapping
    @ResponseBody
    public void criar(@RequestBody PedidoDTO pedidoDTO) {
       pedidosFacade.criar(pedidoDTO);
    }

    @GetMapping
    @ResponseBody
    public void getlAll(@RequestBody PedidoDTO pedidoDTO) {
       pedidosFacade.getAll();
    }

    @DeleteMapping("/{pedidoId}")
    @ResponseBody
    public void deletar(@PathVariable("pedidoId") Long pedidoId) {
        pedidosFacade.delete(pedidoId);
    }
}