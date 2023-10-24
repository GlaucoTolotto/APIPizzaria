package com.company.APIPizzaria.pedidos.dto;

public class PedidoDTO {
    private Long id;
    private PedidoType pedido;
    
}

public class PedidoType {
    private int valor;
    private ArrayList<PrudutoType> produtos;
}

public class PrudutoType {
    private String produtoName;
    private int qtd; 
} 