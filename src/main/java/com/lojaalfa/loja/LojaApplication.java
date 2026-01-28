package com.lojaalfa.loja;

import com.lojaalfa.loja.entidades.Order;
import com.lojaalfa.loja.service.OrderService;
import com.lojaalfa.loja.service.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LojaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LojaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		Order orderN1 = new Order(1034,150,20);
		Order orderN2 = new Order(2282,800,10);
		Order orderN3 = new Order(1039,95.90,0.0);

		OrderService orderService = new OrderService(orderN1);
		ShippingService shippingService = new ShippingService(orderN1);

		System.out.println("-----------  Resultado - Exemplo 1 -----------------");
		System.out.println("Pedido código: R$ " + orderN1.getCode());
		System.out.println("Valor Total: R$ "+ (orderService.total() + shippingService.shipment()) );

		OrderService orderService2 = new OrderService(orderN2);
		ShippingService shippingService2 = new ShippingService(orderN2);

		System.out.println("-----------  Resultado - Exemplo 2 -----------------");
		System.out.println("Pedido código: R$ " + orderN2.getCode());
		System.out.println("Valor Total: R$ "+ (orderService2.total() + shippingService2.shipment()) );

		OrderService orderService3 = new OrderService(orderN3);
		ShippingService shippingService3 = new ShippingService(orderN3);

		System.out.println("-----------  Resultado - Exemplo 3 -----------------");
		System.out.println("Pedido código: R$ " + orderN3.getCode());
		System.out.println("Valor Total: R$ "+ (orderService3.total() + shippingService3.shipment()) );



	}
}
