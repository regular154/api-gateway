package com.snowboard.apigateway.flow;

import com.snowboard.apigateway.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class OrderFlow {

    private final OrderService orderService;

    public OrderFlow(OrderService orderService) {
        this.orderService = orderService;
    }

    public Object getOrderById(String id) {
        return new Object();
    }
}
