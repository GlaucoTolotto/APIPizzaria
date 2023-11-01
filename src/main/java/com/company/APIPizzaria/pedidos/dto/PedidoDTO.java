package com.company.APIPizzaria.pedidos.dto;
import com.company.APIPizzaria.pedidos.dto.PedidoType;
import jakarta.persistence.*;

@Entity
@Table(name = "PEDIDO")
public class PedidoDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "PEDIDO", length = 50, nullable = false)
    private String pedido;
    public void setId(Long id) {
        this.id = id;
    }
}
