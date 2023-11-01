package com.company.APIPizzaria.pedidos.facade;

import com.company.APIPizzaria.pedidos.dto.PedidoDTO;
import com.company.APIPizzaria.pedidos.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PedidosFacade {
    private static final Map<Long, PedidoDTO> pedidos = new HashMap<>();
    private final PedidoRepository repository;

    public PedidosFacade(PedidoRepository repository) {
        this.repository = repository;
    }

    public void criar(PedidoDTO pedidosDto) {
        // Long proximoId = pedidos.keySet().size() + 1L;
        // pedidosDto.setId(proximoId);
        // pedidos.put(proximoId, pedidosDto);
        repository.save(pedidosDto);
    }

    public Optional<PedidoDTO> getById(Long pedidoId) {
        return repository.findById(pedidoId);
    }

    public List<PedidoDTO> getAll() {
        // new ArrayList<>(pedidos.values());
        return repository.findAll();
    }

    public void delete(Long pedidoId) {
        repository.deleteById(pedidoId);
    }
}