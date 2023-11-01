package com.company.APIPizzaria.pedidos.repository;

import com.company.APIPizzaria.pedidos.dto.PedidoDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoDTO, Long> {
}