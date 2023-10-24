package com.company.APIPizzaria.pedidos.facade;

import com.company.APIPizzaria.pedidos.dto.PedidoDTO;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PedidosFacade {
    private static final Map<Long, PedidoDTO> pedidos = new HashMap<>();

    public PedidoDTO criar(PedidoDTO pedidosDto){
        Long proximoId = pedidos.keySet().size() + 1L;
        pedidosDto.setId(proximoId);
        pedidos.put(proximoId, pedidosDto);
    }

    public PedidoDTO getById(Long pedidoId){
        return pedidos.get(pedidoId);
    }

    public List<PedidoDTO> getAll(){
        return new ArrayList<>(pedidos.values());
    }

    public String delete(Long pedidoId){
        pedidos.remove(pedidoId);
    }
}