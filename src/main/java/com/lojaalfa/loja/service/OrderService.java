package com.lojaalfa.loja.service;

import com.lojaalfa.loja.entidades.Order;

public class OrderService {

    private Order order;


    public OrderService(Order order) {
        this.order = order;
    }

    public double total() {
        return order.getBasic() * (  1 - (order.getDiscount()/100)  );

    }
}
