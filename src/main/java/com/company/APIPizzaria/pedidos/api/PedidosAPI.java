package com.company.APIPizzaria.pedidos.api;

import com.company.APIPizzaria.pedidos.dto.PedidoDTO;
import com.company.APIPizzaria.pedidos.facade.PedidosFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bing.annotation.PostMapping;
import org.springframework.web.bing.annotation.GetMapping;
import org.springframework.web.bing.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bing.annotation.RequestBody;
import org.springframework.web.bing.annotation.RequestMapping;
import org.springframework.web.bing.annotation.ResponseBody;

@Controller
@RequestMapping(values = "/pedidos", produces = MediaType.APPLICATION_JSON_VALUE)
public class PedidosAPI {
    @Autowired
    private PedidosFacade pedidosFacade;

    @PostMapping
    @ResponseBody
    public PedidoDTO criar(@RequestBody PedidoDTO pedidoDTO) {
      return pedidosFacade.criar(pedidosFacade);
    }

    @GetMapping
    @ResponseBody
    public List<PedidoDTO> getlAll(@RequestBody PedidoDTO pedidoDTO) {
      return pedidosFacade.getAll();
    }

    @DeleteMapping("/{pedidoId}")
    @ResponseBody
    public String deletar(@PathVariable("pedidoId") Long pedidoId) {
      return pedidosFacade.delete(pedidoId);
    }
}