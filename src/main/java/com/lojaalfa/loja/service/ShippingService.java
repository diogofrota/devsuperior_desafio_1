package com.lojaalfa.loja.service;

import com.lojaalfa.loja.entidades.Order;

public class ShippingService {

    private Order order;

    public ShippingService(Order order) {
        this.order = order;
    }

    public double shipment() {
        if ( order.getBasic() < 100) {
            return 20;
        }else if ( order.getBasic() <= 200) {
            return 12;
        }else {
            return 0;
        }
    };


}
